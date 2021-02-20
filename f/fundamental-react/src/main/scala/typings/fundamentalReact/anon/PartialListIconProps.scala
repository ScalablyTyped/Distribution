package typings.fundamentalReact.anon

import typings.fundamentalReact.iconMod.IconGlyph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
@js.native
trait PartialListIconProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var glyph: js.UndefOr[IconGlyph] = js.native
}
object PartialListIconProps {
  
  @scala.inline
  def apply(): PartialListIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListIconProps]
  }
  
  @scala.inline
  implicit class PartialListIconPropsMutableBuilder[Self <: PartialListIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setGlyph(value: IconGlyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
  }
}
