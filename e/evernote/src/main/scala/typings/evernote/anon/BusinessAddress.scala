package typings.evernote.anon

import typings.evernote.mod.Types.ReminderEmailConfig
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessAddress extends js.Object {
  
  var businessAddress: js.UndefOr[String] = js.native
  
  var clipFullPage: js.UndefOr[Boolean] = js.native
  
  var comments: js.UndefOr[String] = js.native
  
  var dailyEmailLimit: js.UndefOr[Double] = js.native
  
  var dateAgreedToTermsOfService: js.UndefOr[Timestamp] = js.native
  
  var defaultLatitude: js.UndefOr[Double] = js.native
  
  var defaultLocationName: js.UndefOr[String] = js.native
  
  var defaultLongitude: js.UndefOr[Double] = js.native
  
  var educationalDiscount: js.UndefOr[Boolean] = js.native
  
  var emailAddressLastConfirmed: js.UndefOr[Timestamp] = js.native
  
  var emailOptOutDate: js.UndefOr[Timestamp] = js.native
  
  var groupName: js.UndefOr[String] = js.native
  
  var hideSponsorBilling: js.UndefOr[Boolean] = js.native
  
  var incomingEmailAddress: js.UndefOr[String] = js.native
  
  var maxReferrals: js.UndefOr[Double] = js.native
  
  var partnerEmailOptInDate: js.UndefOr[Timestamp] = js.native
  
  var passwordUpdated: js.UndefOr[Timestamp] = js.native
  
  var preactivation: js.UndefOr[Boolean] = js.native
  
  var preferredCountry: js.UndefOr[String] = js.native
  
  var preferredLanguage: js.UndefOr[String] = js.native
  
  var recentMailedAddresses: js.UndefOr[js.Array[String]] = js.native
  
  var recognitionLanguage: js.UndefOr[String] = js.native
  
  var refererCode: js.UndefOr[String] = js.native
  
  var referralCount: js.UndefOr[Double] = js.native
  
  var referralProof: js.UndefOr[String] = js.native
  
  var reminderEmailConfig: js.UndefOr[ReminderEmailConfig] = js.native
  
  var salesforcePushEnabled: js.UndefOr[Boolean] = js.native
  
  var sentEmailCount: js.UndefOr[Double] = js.native
  
  var sentEmailDate: js.UndefOr[Timestamp] = js.native
  
  var taxExempt: js.UndefOr[Boolean] = js.native
  
  var twitterId: js.UndefOr[String] = js.native
  
  var twitterUserName: js.UndefOr[String] = js.native
  
  var useEmailAutoFiling: js.UndefOr[Boolean] = js.native
  
  var viewedPromotions: js.UndefOr[js.Array[String]] = js.native
}
object BusinessAddress {
  
  @scala.inline
  def apply(): BusinessAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessAddress]
  }
  
  @scala.inline
  implicit class BusinessAddressOps[Self <: BusinessAddress] (val x: Self) extends AnyVal {
    
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
    def setBusinessAddress(value: String): Self = this.set("businessAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessAddress: Self = this.set("businessAddress", js.undefined)
    
    @scala.inline
    def setClipFullPage(value: Boolean): Self = this.set("clipFullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipFullPage: Self = this.set("clipFullPage", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setDailyEmailLimit(value: Double): Self = this.set("dailyEmailLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyEmailLimit: Self = this.set("dailyEmailLimit", js.undefined)
    
    @scala.inline
    def setDateAgreedToTermsOfService(value: Timestamp): Self = this.set("dateAgreedToTermsOfService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateAgreedToTermsOfService: Self = this.set("dateAgreedToTermsOfService", js.undefined)
    
    @scala.inline
    def setDefaultLatitude(value: Double): Self = this.set("defaultLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLatitude: Self = this.set("defaultLatitude", js.undefined)
    
    @scala.inline
    def setDefaultLocationName(value: String): Self = this.set("defaultLocationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocationName: Self = this.set("defaultLocationName", js.undefined)
    
    @scala.inline
    def setDefaultLongitude(value: Double): Self = this.set("defaultLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLongitude: Self = this.set("defaultLongitude", js.undefined)
    
    @scala.inline
    def setEducationalDiscount(value: Boolean): Self = this.set("educationalDiscount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEducationalDiscount: Self = this.set("educationalDiscount", js.undefined)
    
    @scala.inline
    def setEmailAddressLastConfirmed(value: Timestamp): Self = this.set("emailAddressLastConfirmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddressLastConfirmed: Self = this.set("emailAddressLastConfirmed", js.undefined)
    
    @scala.inline
    def setEmailOptOutDate(value: Timestamp): Self = this.set("emailOptOutDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailOptOutDate: Self = this.set("emailOptOutDate", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setHideSponsorBilling(value: Boolean): Self = this.set("hideSponsorBilling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSponsorBilling: Self = this.set("hideSponsorBilling", js.undefined)
    
    @scala.inline
    def setIncomingEmailAddress(value: String): Self = this.set("incomingEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingEmailAddress: Self = this.set("incomingEmailAddress", js.undefined)
    
    @scala.inline
    def setMaxReferrals(value: Double): Self = this.set("maxReferrals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReferrals: Self = this.set("maxReferrals", js.undefined)
    
    @scala.inline
    def setPartnerEmailOptInDate(value: Timestamp): Self = this.set("partnerEmailOptInDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerEmailOptInDate: Self = this.set("partnerEmailOptInDate", js.undefined)
    
    @scala.inline
    def setPasswordUpdated(value: Timestamp): Self = this.set("passwordUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordUpdated: Self = this.set("passwordUpdated", js.undefined)
    
    @scala.inline
    def setPreactivation(value: Boolean): Self = this.set("preactivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreactivation: Self = this.set("preactivation", js.undefined)
    
    @scala.inline
    def setPreferredCountry(value: String): Self = this.set("preferredCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredCountry: Self = this.set("preferredCountry", js.undefined)
    
    @scala.inline
    def setPreferredLanguage(value: String): Self = this.set("preferredLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredLanguage: Self = this.set("preferredLanguage", js.undefined)
    
    @scala.inline
    def setRecentMailedAddressesVarargs(value: String*): Self = this.set("recentMailedAddresses", js.Array(value :_*))
    
    @scala.inline
    def setRecentMailedAddresses(value: js.Array[String]): Self = this.set("recentMailedAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentMailedAddresses: Self = this.set("recentMailedAddresses", js.undefined)
    
    @scala.inline
    def setRecognitionLanguage(value: String): Self = this.set("recognitionLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognitionLanguage: Self = this.set("recognitionLanguage", js.undefined)
    
    @scala.inline
    def setRefererCode(value: String): Self = this.set("refererCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefererCode: Self = this.set("refererCode", js.undefined)
    
    @scala.inline
    def setReferralCount(value: Double): Self = this.set("referralCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferralCount: Self = this.set("referralCount", js.undefined)
    
    @scala.inline
    def setReferralProof(value: String): Self = this.set("referralProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferralProof: Self = this.set("referralProof", js.undefined)
    
    @scala.inline
    def setReminderEmailConfig(value: ReminderEmailConfig): Self = this.set("reminderEmailConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderEmailConfig: Self = this.set("reminderEmailConfig", js.undefined)
    
    @scala.inline
    def setSalesforcePushEnabled(value: Boolean): Self = this.set("salesforcePushEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforcePushEnabled: Self = this.set("salesforcePushEnabled", js.undefined)
    
    @scala.inline
    def setSentEmailCount(value: Double): Self = this.set("sentEmailCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentEmailCount: Self = this.set("sentEmailCount", js.undefined)
    
    @scala.inline
    def setSentEmailDate(value: Timestamp): Self = this.set("sentEmailDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentEmailDate: Self = this.set("sentEmailDate", js.undefined)
    
    @scala.inline
    def setTaxExempt(value: Boolean): Self = this.set("taxExempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxExempt: Self = this.set("taxExempt", js.undefined)
    
    @scala.inline
    def setTwitterId(value: String): Self = this.set("twitterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitterId: Self = this.set("twitterId", js.undefined)
    
    @scala.inline
    def setTwitterUserName(value: String): Self = this.set("twitterUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitterUserName: Self = this.set("twitterUserName", js.undefined)
    
    @scala.inline
    def setUseEmailAutoFiling(value: Boolean): Self = this.set("useEmailAutoFiling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEmailAutoFiling: Self = this.set("useEmailAutoFiling", js.undefined)
    
    @scala.inline
    def setViewedPromotionsVarargs(value: String*): Self = this.set("viewedPromotions", js.Array(value :_*))
    
    @scala.inline
    def setViewedPromotions(value: js.Array[String]): Self = this.set("viewedPromotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewedPromotions: Self = this.set("viewedPromotions", js.undefined)
  }
}
