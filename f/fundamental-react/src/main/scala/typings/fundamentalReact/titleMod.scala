package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.fundamentalReact.anon.Loading
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Title/Title", JSImport.Default)
  @js.native
  val default: FunctionComponent[TitleProps] = js.native
  
  trait TitleProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var level: `1` | `2` | `3` | `4` | `5` | `6`
    
    var levelStyle: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var localizedText: js.UndefOr[Loading] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object TitleProps {
    
    inline def apply(level: `1` | `2` | `3` | `4` | `5` | `6`): TitleProps = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleProps]
    }
    
    extension [Self <: TitleProps](x: Self) {
      
      inline def setLevel(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelStyle(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "levelStyle", value.asInstanceOf[js.Any])
      
      inline def setLevelStyleUndefined: Self = StObject.set(x, "levelStyle", js.undefined)
      
      inline def setLocalizedText(value: Loading): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = FunctionComponent[TitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `titleMod.foo` */
  override def _to: FunctionComponent[TitleProps] = default
}
