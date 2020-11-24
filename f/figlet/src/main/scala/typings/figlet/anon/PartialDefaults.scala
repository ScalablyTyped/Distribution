package typings.figlet.anon

import typings.figlet.mod.Fonts_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<figlet.figlet.Defaults> */
@js.native
trait PartialDefaults extends js.Object {
  
  var font: js.UndefOr[Fonts_] = js.native
  
  var fontPath: js.UndefOr[String] = js.native
}
object PartialDefaults {
  
  @scala.inline
  def apply(): PartialDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDefaults]
  }
  
  @scala.inline
  implicit class PartialDefaultsOps[Self <: PartialDefaults] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Fonts_): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontPath(value: String): Self = this.set("fontPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontPath: Self = this.set("fontPath", js.undefined)
  }
}
