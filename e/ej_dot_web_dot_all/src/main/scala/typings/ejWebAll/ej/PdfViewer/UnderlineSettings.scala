package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderlineSettings extends js.Object {
  
  /** Gets/sets the author of the underline annotation.
    */
  var author: js.UndefOr[String] = js.native
  
  /** Gets/sets the color of the underline annotation.
    */
  var color: js.UndefOr[String] = js.native
  
  /** Gets/sets the locked property of the underline annotation.
    */
  var isLocked: js.UndefOr[Boolean] = js.native
  
  /** Gets/sets the modified Date of the underline annotation.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /** Gets/sets the opacity of the underline annotation.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Gets/sets the subject of the underline annotation.
    */
  var subject: js.UndefOr[String] = js.native
}
object UnderlineSettings {
  
  @scala.inline
  def apply(): UnderlineSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnderlineSettings]
  }
  
  @scala.inline
  implicit class UnderlineSettingsOps[Self <: UnderlineSettings] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
