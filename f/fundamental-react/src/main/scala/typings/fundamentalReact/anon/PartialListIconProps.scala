package typings.fundamentalReact.anon

import typings.fundamentalReact.iconMod.IconGlyph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/List/List.ListIconProps> */
@js.native
trait PartialListIconProps extends js.Object {
  
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
  implicit class PartialListIconPropsOps[Self <: PartialListIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setGlyph(value: IconGlyph): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
  }
}
