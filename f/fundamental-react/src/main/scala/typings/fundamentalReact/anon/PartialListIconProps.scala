package typings.fundamentalReact.anon

import typings.fundamentalReact.libIconIconMod.IconGlyph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
trait PartialListIconProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var glyph: js.UndefOr[IconGlyph] = js.undefined
}
object PartialListIconProps {
  
  inline def apply(): PartialListIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListIconProps]
  }
  
  extension [Self <: PartialListIconProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
  }
}
