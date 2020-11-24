package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountEmailDomain extends js.Object {
  
  var accountEmailDomain: js.UndefOr[String] = js.native
  
  var enableFacebookSharing: js.UndefOr[Boolean] = js.native
  
  var enableGiftSubscriptions: js.UndefOr[Boolean] = js.native
  
  var enableGoogle: js.UndefOr[Boolean] = js.native
  
  var enableLinkedInSharing: js.UndefOr[Boolean] = js.native
  
  var enablePublicNotebooks: js.UndefOr[Boolean] = js.native
  
  var enableSharedNotebooks: js.UndefOr[Boolean] = js.native
  
  var enableSingleNoteSharing: js.UndefOr[Boolean] = js.native
  
  var enableSponsoredAccounts: js.UndefOr[Boolean] = js.native
  
  var enableSupportTickets: js.UndefOr[Boolean] = js.native
  
  var enableTwitterSharing: js.UndefOr[Boolean] = js.native
  
  var marketingUrl: js.UndefOr[String] = js.native
  
  var serviceHost: js.UndefOr[String] = js.native
  
  var supportUrl: js.UndefOr[String] = js.native
}
object AccountEmailDomain {
  
  @scala.inline
  def apply(): AccountEmailDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountEmailDomain]
  }
  
  @scala.inline
  implicit class AccountEmailDomainOps[Self <: AccountEmailDomain] (val x: Self) extends AnyVal {
    
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
    def setAccountEmailDomain(value: String): Self = this.set("accountEmailDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountEmailDomain: Self = this.set("accountEmailDomain", js.undefined)
    
    @scala.inline
    def setEnableFacebookSharing(value: Boolean): Self = this.set("enableFacebookSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFacebookSharing: Self = this.set("enableFacebookSharing", js.undefined)
    
    @scala.inline
    def setEnableGiftSubscriptions(value: Boolean): Self = this.set("enableGiftSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGiftSubscriptions: Self = this.set("enableGiftSubscriptions", js.undefined)
    
    @scala.inline
    def setEnableGoogle(value: Boolean): Self = this.set("enableGoogle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGoogle: Self = this.set("enableGoogle", js.undefined)
    
    @scala.inline
    def setEnableLinkedInSharing(value: Boolean): Self = this.set("enableLinkedInSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLinkedInSharing: Self = this.set("enableLinkedInSharing", js.undefined)
    
    @scala.inline
    def setEnablePublicNotebooks(value: Boolean): Self = this.set("enablePublicNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePublicNotebooks: Self = this.set("enablePublicNotebooks", js.undefined)
    
    @scala.inline
    def setEnableSharedNotebooks(value: Boolean): Self = this.set("enableSharedNotebooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSharedNotebooks: Self = this.set("enableSharedNotebooks", js.undefined)
    
    @scala.inline
    def setEnableSingleNoteSharing(value: Boolean): Self = this.set("enableSingleNoteSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSingleNoteSharing: Self = this.set("enableSingleNoteSharing", js.undefined)
    
    @scala.inline
    def setEnableSponsoredAccounts(value: Boolean): Self = this.set("enableSponsoredAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSponsoredAccounts: Self = this.set("enableSponsoredAccounts", js.undefined)
    
    @scala.inline
    def setEnableSupportTickets(value: Boolean): Self = this.set("enableSupportTickets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSupportTickets: Self = this.set("enableSupportTickets", js.undefined)
    
    @scala.inline
    def setEnableTwitterSharing(value: Boolean): Self = this.set("enableTwitterSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTwitterSharing: Self = this.set("enableTwitterSharing", js.undefined)
    
    @scala.inline
    def setMarketingUrl(value: String): Self = this.set("marketingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketingUrl: Self = this.set("marketingUrl", js.undefined)
    
    @scala.inline
    def setServiceHost(value: String): Self = this.set("serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceHost: Self = this.set("serviceHost", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: String): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportUrl: Self = this.set("supportUrl", js.undefined)
  }
}
