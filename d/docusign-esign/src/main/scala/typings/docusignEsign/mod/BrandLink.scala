package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandLink extends js.Object {
  
  /**
    * The text used for the link.
    */
  var linkText: js.UndefOr[String] = js.native
  
  /**
    * The type of link. Valid values include:
    *
    * - `aboutDocusign`
    * - `closeButton`
    */
  var linkType: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the link displays to the recipient.
    */
  var showLink: js.UndefOr[String] = js.native
  
  /**
    * The URL or mailto address of the link.
    */
  var urlOrMailTo: js.UndefOr[String] = js.native
}
object BrandLink {
  
  @scala.inline
  def apply(): BrandLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandLink]
  }
  
  @scala.inline
  implicit class BrandLinkOps[Self <: BrandLink] (val x: Self) extends AnyVal {
    
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
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkText: Self = this.set("linkText", js.undefined)
    
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkType: Self = this.set("linkType", js.undefined)
    
    @scala.inline
    def setShowLink(value: String): Self = this.set("showLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLink: Self = this.set("showLink", js.undefined)
    
    @scala.inline
    def setUrlOrMailTo(value: String): Self = this.set("urlOrMailTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlOrMailTo: Self = this.set("urlOrMailTo", js.undefined)
  }
}
