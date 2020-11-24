package typings.fitfont.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * name of the generated font folder
    */
  var font: String = js.native
  
  /**
    * Horizontal alignment
    */
  var halign: js.UndefOr[HorizontalAlign] = js.native
  
  /**
    * Id fo the symbol or the Element to use
    */
  var id: String | js.Object = js.native
  
  /**
    * Letter spacing
    */
  var letterspacing: js.UndefOr[Double] = js.native
  
  /**
    * Vertical alignment
    */
  var valign: js.UndefOr[VerticalAlign] = js.native
}
object Options {
  
  @scala.inline
  def apply(font: String, id: String | js.Object): Options = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | js.Object): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalign(value: HorizontalAlign): Self = this.set("halign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalign: Self = this.set("halign", js.undefined)
    
    @scala.inline
    def setLetterspacing(value: Double): Self = this.set("letterspacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterspacing: Self = this.set("letterspacing", js.undefined)
    
    @scala.inline
    def setValign(value: VerticalAlign): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
  }
}
