package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.fundamentalReact.anon.Loading
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object busyIndicatorMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/BusyIndicator/BusyIndicator", JSImport.Default)
  @js.native
  val default: FunctionComponent[BusyIndicatorProps] = js.native
  
  trait BusyIndicatorProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var localizedText: js.UndefOr[Loading] = js.undefined
    
    var show: Boolean
    
    var size: js.UndefOr[BusyIndicatorSizes] = js.undefined
  }
  object BusyIndicatorProps {
    
    inline def apply(show: Boolean): BusyIndicatorProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[BusyIndicatorProps]
    }
    
    extension [Self <: BusyIndicatorProps](x: Self) {
      
      inline def setLocalizedText(value: Loading): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setSize(value: BusyIndicatorSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.s
    - typings.fundamentalReact.fundamentalReactStrings.m
    - typings.fundamentalReact.fundamentalReactStrings.l
  */
  trait BusyIndicatorSizes extends StObject
  object BusyIndicatorSizes {
    
    inline def l: typings.fundamentalReact.fundamentalReactStrings.l = "l".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.l]
    
    inline def m: typings.fundamentalReact.fundamentalReactStrings.m = "m".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.m]
    
    inline def s: typings.fundamentalReact.fundamentalReactStrings.s = "s".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.s]
  }
  
  type _To = FunctionComponent[BusyIndicatorProps]
  
  /* This means you don't have to write `default`, but can instead just say `busyIndicatorMod.foo` */
  override def _to: FunctionComponent[BusyIndicatorProps] = default
}
