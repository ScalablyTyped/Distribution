package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientDomain extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var domainCode: js.UndefOr[String] = js.native
  
  var domainName: js.UndefOr[String] = js.native
  
  var recipientDomainId: js.UndefOr[String] = js.native
}
object RecipientDomain {
  
  @scala.inline
  def apply(): RecipientDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientDomain]
  }
  
  @scala.inline
  implicit class RecipientDomainOps[Self <: RecipientDomain] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setDomainCode(value: String): Self = this.set("domainCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainCode: Self = this.set("domainCode", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setRecipientDomainId(value: String): Self = this.set("recipientDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientDomainId: Self = this.set("recipientDomainId", js.undefined)
  }
}
