package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import typings.fundamentalReact.fundamentalReactNumbers.`1`
import typings.fundamentalReact.fundamentalReactNumbers.`2`
import typings.fundamentalReact.fundamentalReactNumbers.`3`
import typings.fundamentalReact.fundamentalReactNumbers.`4`
import typings.fundamentalReact.fundamentalReactNumbers.`5`
import typings.fundamentalReact.fundamentalReactNumbers.`6`
import typings.fundamentalReact.fundamentalReactNumbers.`7`
import typings.fundamentalReact.fundamentalReactNumbers.`8`
import typings.fundamentalReact.fundamentalReactStrings.l
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectStatusMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/ObjectStatus/ObjectStatus", JSImport.Default)
  @js.native
  val default: FunctionComponent[ObjectStatusProps] = js.native
  
  trait ObjectStatusProps
    extends StObject
       with HTMLAttributes[HTMLAnchorElement | HTMLSpanElement] {
    
    var glyph: js.UndefOr[String] = js.undefined
    
    var indication: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[l] = js.undefined
    
    var status: js.UndefOr[ObjectStatusTypes] = js.undefined
  }
  object ObjectStatusProps {
    
    inline def apply(): ObjectStatusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectStatusProps]
    }
    
    extension [Self <: ObjectStatusProps](x: Self) {
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setIndication(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
      
      inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setSize(value: l): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: ObjectStatusTypes): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.negative
    - typings.fundamentalReact.fundamentalReactStrings.critical
    - typings.fundamentalReact.fundamentalReactStrings.positive
    - typings.fundamentalReact.fundamentalReactStrings.informative
  */
  trait ObjectStatusTypes extends StObject
  object ObjectStatusTypes {
    
    inline def critical: typings.fundamentalReact.fundamentalReactStrings.critical = "critical".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.critical]
    
    inline def informative: typings.fundamentalReact.fundamentalReactStrings.informative = "informative".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.informative]
    
    inline def negative: typings.fundamentalReact.fundamentalReactStrings.negative = "negative".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.negative]
    
    inline def positive: typings.fundamentalReact.fundamentalReactStrings.positive = "positive".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.positive]
  }
  
  type _To = FunctionComponent[ObjectStatusProps]
  
  /* This means you don't have to write `default`, but can instead just say `objectStatusMod.foo` */
  override def _to: FunctionComponent[ObjectStatusProps] = default
}
