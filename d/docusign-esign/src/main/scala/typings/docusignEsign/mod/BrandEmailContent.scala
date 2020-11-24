package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandEmailContent extends js.Object {
  
  /**
    * Deprecated.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var emailContentType: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var emailToLink: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var linkText: js.UndefOr[String] = js.native
}
object BrandEmailContent {
  
  @scala.inline
  def apply(): BrandEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandEmailContent]
  }
  
  @scala.inline
  implicit class BrandEmailContentOps[Self <: BrandEmailContent] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEmailContentType(value: String): Self = this.set("emailContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailContentType: Self = this.set("emailContentType", js.undefined)
    
    @scala.inline
    def setEmailToLink(value: String): Self = this.set("emailToLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailToLink: Self = this.set("emailToLink", js.undefined)
    
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
  }
}
