package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactInts.`10`
import typings.fundamentalReact.fundamentalReactInts.`1`
import typings.fundamentalReact.fundamentalReactInts.`2`
import typings.fundamentalReact.fundamentalReactInts.`3`
import typings.fundamentalReact.fundamentalReactInts.`4`
import typings.fundamentalReact.fundamentalReactInts.`5`
import typings.fundamentalReact.fundamentalReactInts.`6`
import typings.fundamentalReact.fundamentalReactInts.`7`
import typings.fundamentalReact.fundamentalReactInts.`8`
import typings.fundamentalReact.fundamentalReactInts.`9`
import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoLabelMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/InfoLabel/InfoLabel", JSImport.Default)
  @js.native
  val default: FunctionComponent[InfoLabelProps] = js.native
  
  trait InfoLabelProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.undefined
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var glyph: js.UndefOr[IconGlyph] = js.undefined
    
    var numeric: js.UndefOr[Boolean] = js.undefined
  }
  object InfoLabelProps {
    
    inline def apply(): InfoLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoLabelProps]
    }
    
    extension [Self <: InfoLabelProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
      
      inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    }
  }
  
  type _To = FunctionComponent[InfoLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `infoLabelMod.foo` */
  override def _to: FunctionComponent[InfoLabelProps] = default
}
