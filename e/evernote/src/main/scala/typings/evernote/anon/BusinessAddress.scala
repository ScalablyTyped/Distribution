package typings.evernote.anon

import typings.evernote.mod.Types.ReminderEmailConfig
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessAddress extends js.Object {
  var businessAddress: js.UndefOr[String] = js.undefined
  var clipFullPage: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[String] = js.undefined
  var dailyEmailLimit: js.UndefOr[Double] = js.undefined
  var dateAgreedToTermsOfService: js.UndefOr[Timestamp] = js.undefined
  var defaultLatitude: js.UndefOr[Double] = js.undefined
  var defaultLocationName: js.UndefOr[String] = js.undefined
  var defaultLongitude: js.UndefOr[Double] = js.undefined
  var educationalDiscount: js.UndefOr[Boolean] = js.undefined
  var emailAddressLastConfirmed: js.UndefOr[Timestamp] = js.undefined
  var emailOptOutDate: js.UndefOr[Timestamp] = js.undefined
  var groupName: js.UndefOr[String] = js.undefined
  var hideSponsorBilling: js.UndefOr[Boolean] = js.undefined
  var incomingEmailAddress: js.UndefOr[String] = js.undefined
  var maxReferrals: js.UndefOr[Double] = js.undefined
  var partnerEmailOptInDate: js.UndefOr[Timestamp] = js.undefined
  var passwordUpdated: js.UndefOr[Timestamp] = js.undefined
  var preactivation: js.UndefOr[Boolean] = js.undefined
  var preferredCountry: js.UndefOr[String] = js.undefined
  var preferredLanguage: js.UndefOr[String] = js.undefined
  var recentMailedAddresses: js.UndefOr[js.Array[String]] = js.undefined
  var recognitionLanguage: js.UndefOr[String] = js.undefined
  var refererCode: js.UndefOr[String] = js.undefined
  var referralCount: js.UndefOr[Double] = js.undefined
  var referralProof: js.UndefOr[String] = js.undefined
  var reminderEmailConfig: js.UndefOr[ReminderEmailConfig] = js.undefined
  var salesforcePushEnabled: js.UndefOr[Boolean] = js.undefined
  var sentEmailCount: js.UndefOr[Double] = js.undefined
  var sentEmailDate: js.UndefOr[Timestamp] = js.undefined
  var taxExempt: js.UndefOr[Boolean] = js.undefined
  var twitterId: js.UndefOr[String] = js.undefined
  var twitterUserName: js.UndefOr[String] = js.undefined
  var useEmailAutoFiling: js.UndefOr[Boolean] = js.undefined
  var viewedPromotions: js.UndefOr[js.Array[String]] = js.undefined
}

object BusinessAddress {
  @scala.inline
  def apply(
    businessAddress: String = null,
    clipFullPage: js.UndefOr[Boolean] = js.undefined,
    comments: String = null,
    dailyEmailLimit: js.UndefOr[Double] = js.undefined,
    dateAgreedToTermsOfService: js.UndefOr[Timestamp] = js.undefined,
    defaultLatitude: js.UndefOr[Double] = js.undefined,
    defaultLocationName: String = null,
    defaultLongitude: js.UndefOr[Double] = js.undefined,
    educationalDiscount: js.UndefOr[Boolean] = js.undefined,
    emailAddressLastConfirmed: js.UndefOr[Timestamp] = js.undefined,
    emailOptOutDate: js.UndefOr[Timestamp] = js.undefined,
    groupName: String = null,
    hideSponsorBilling: js.UndefOr[Boolean] = js.undefined,
    incomingEmailAddress: String = null,
    maxReferrals: js.UndefOr[Double] = js.undefined,
    partnerEmailOptInDate: js.UndefOr[Timestamp] = js.undefined,
    passwordUpdated: js.UndefOr[Timestamp] = js.undefined,
    preactivation: js.UndefOr[Boolean] = js.undefined,
    preferredCountry: String = null,
    preferredLanguage: String = null,
    recentMailedAddresses: js.Array[String] = null,
    recognitionLanguage: String = null,
    refererCode: String = null,
    referralCount: js.UndefOr[Double] = js.undefined,
    referralProof: String = null,
    reminderEmailConfig: ReminderEmailConfig = null,
    salesforcePushEnabled: js.UndefOr[Boolean] = js.undefined,
    sentEmailCount: js.UndefOr[Double] = js.undefined,
    sentEmailDate: js.UndefOr[Timestamp] = js.undefined,
    taxExempt: js.UndefOr[Boolean] = js.undefined,
    twitterId: String = null,
    twitterUserName: String = null,
    useEmailAutoFiling: js.UndefOr[Boolean] = js.undefined,
    viewedPromotions: js.Array[String] = null
  ): BusinessAddress = {
    val __obj = js.Dynamic.literal()
    if (businessAddress != null) __obj.updateDynamic("businessAddress")(businessAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(clipFullPage)) __obj.updateDynamic("clipFullPage")(clipFullPage.get.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(dailyEmailLimit)) __obj.updateDynamic("dailyEmailLimit")(dailyEmailLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dateAgreedToTermsOfService)) __obj.updateDynamic("dateAgreedToTermsOfService")(dateAgreedToTermsOfService.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLatitude)) __obj.updateDynamic("defaultLatitude")(defaultLatitude.get.asInstanceOf[js.Any])
    if (defaultLocationName != null) __obj.updateDynamic("defaultLocationName")(defaultLocationName.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLongitude)) __obj.updateDynamic("defaultLongitude")(defaultLongitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(educationalDiscount)) __obj.updateDynamic("educationalDiscount")(educationalDiscount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emailAddressLastConfirmed)) __obj.updateDynamic("emailAddressLastConfirmed")(emailAddressLastConfirmed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emailOptOutDate)) __obj.updateDynamic("emailOptOutDate")(emailOptOutDate.get.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSponsorBilling)) __obj.updateDynamic("hideSponsorBilling")(hideSponsorBilling.get.asInstanceOf[js.Any])
    if (incomingEmailAddress != null) __obj.updateDynamic("incomingEmailAddress")(incomingEmailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReferrals)) __obj.updateDynamic("maxReferrals")(maxReferrals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partnerEmailOptInDate)) __obj.updateDynamic("partnerEmailOptInDate")(partnerEmailOptInDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordUpdated)) __obj.updateDynamic("passwordUpdated")(passwordUpdated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preactivation)) __obj.updateDynamic("preactivation")(preactivation.get.asInstanceOf[js.Any])
    if (preferredCountry != null) __obj.updateDynamic("preferredCountry")(preferredCountry.asInstanceOf[js.Any])
    if (preferredLanguage != null) __obj.updateDynamic("preferredLanguage")(preferredLanguage.asInstanceOf[js.Any])
    if (recentMailedAddresses != null) __obj.updateDynamic("recentMailedAddresses")(recentMailedAddresses.asInstanceOf[js.Any])
    if (recognitionLanguage != null) __obj.updateDynamic("recognitionLanguage")(recognitionLanguage.asInstanceOf[js.Any])
    if (refererCode != null) __obj.updateDynamic("refererCode")(refererCode.asInstanceOf[js.Any])
    if (!js.isUndefined(referralCount)) __obj.updateDynamic("referralCount")(referralCount.get.asInstanceOf[js.Any])
    if (referralProof != null) __obj.updateDynamic("referralProof")(referralProof.asInstanceOf[js.Any])
    if (reminderEmailConfig != null) __obj.updateDynamic("reminderEmailConfig")(reminderEmailConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(salesforcePushEnabled)) __obj.updateDynamic("salesforcePushEnabled")(salesforcePushEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sentEmailCount)) __obj.updateDynamic("sentEmailCount")(sentEmailCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sentEmailDate)) __obj.updateDynamic("sentEmailDate")(sentEmailDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(taxExempt)) __obj.updateDynamic("taxExempt")(taxExempt.get.asInstanceOf[js.Any])
    if (twitterId != null) __obj.updateDynamic("twitterId")(twitterId.asInstanceOf[js.Any])
    if (twitterUserName != null) __obj.updateDynamic("twitterUserName")(twitterUserName.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmailAutoFiling)) __obj.updateDynamic("useEmailAutoFiling")(useEmailAutoFiling.get.asInstanceOf[js.Any])
    if (viewedPromotions != null) __obj.updateDynamic("viewedPromotions")(viewedPromotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessAddress]
  }
}

