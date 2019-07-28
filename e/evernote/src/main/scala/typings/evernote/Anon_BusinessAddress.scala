package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.ReminderEmailConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessAddress extends js.Object {
  var businessAddress: js.UndefOr[String] = js.undefined
  var clipFullPage: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[String] = js.undefined
  var dailyEmailLimit: js.UndefOr[Double] = js.undefined
  var dateAgreedToTermsOfService: js.UndefOr[Double] = js.undefined
  var defaultLatitude: js.UndefOr[Double] = js.undefined
  var defaultLocationName: js.UndefOr[String] = js.undefined
  var defaultLongitude: js.UndefOr[Double] = js.undefined
  var educationalDiscount: js.UndefOr[Boolean] = js.undefined
  var emailOptOutDate: js.UndefOr[Double] = js.undefined
  var groupName: js.UndefOr[String] = js.undefined
  var hideSponsorBilling: js.UndefOr[Boolean] = js.undefined
  var incomingEmailAddress: js.UndefOr[String] = js.undefined
  var maxReferrals: js.UndefOr[Double] = js.undefined
  var partnerEmailOptInDate: js.UndefOr[Double] = js.undefined
  var preactivation: js.UndefOr[Boolean] = js.undefined
  var preferredCountry: js.UndefOr[String] = js.undefined
  var preferredLanguage: js.UndefOr[String] = js.undefined
  var recentMailedAddresses: js.UndefOr[js.Array[String]] = js.undefined
  var recognitionLanguage: js.UndefOr[String] = js.undefined
  var refererCode: js.UndefOr[String] = js.undefined
  var referralCount: js.UndefOr[Double] = js.undefined
  var referralProof: js.UndefOr[String] = js.undefined
  var reminderEmailConfig: js.UndefOr[ReminderEmailConfig] = js.undefined
  var sentEmailCount: js.UndefOr[Double] = js.undefined
  var sentEmailDate: js.UndefOr[Double] = js.undefined
  var taxExempt: js.UndefOr[Boolean] = js.undefined
  var twitterId: js.UndefOr[String] = js.undefined
  var twitterUserName: js.UndefOr[String] = js.undefined
  var useEmailAutoFiling: js.UndefOr[Boolean] = js.undefined
  var viewedPromotions: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_BusinessAddress {
  @scala.inline
  def apply(
    businessAddress: String = null,
    clipFullPage: js.UndefOr[Boolean] = js.undefined,
    comments: String = null,
    dailyEmailLimit: Int | Double = null,
    dateAgreedToTermsOfService: Int | Double = null,
    defaultLatitude: Int | Double = null,
    defaultLocationName: String = null,
    defaultLongitude: Int | Double = null,
    educationalDiscount: js.UndefOr[Boolean] = js.undefined,
    emailOptOutDate: Int | Double = null,
    groupName: String = null,
    hideSponsorBilling: js.UndefOr[Boolean] = js.undefined,
    incomingEmailAddress: String = null,
    maxReferrals: Int | Double = null,
    partnerEmailOptInDate: Int | Double = null,
    preactivation: js.UndefOr[Boolean] = js.undefined,
    preferredCountry: String = null,
    preferredLanguage: String = null,
    recentMailedAddresses: js.Array[String] = null,
    recognitionLanguage: String = null,
    refererCode: String = null,
    referralCount: Int | Double = null,
    referralProof: String = null,
    reminderEmailConfig: ReminderEmailConfig = null,
    sentEmailCount: Int | Double = null,
    sentEmailDate: Int | Double = null,
    taxExempt: js.UndefOr[Boolean] = js.undefined,
    twitterId: String = null,
    twitterUserName: String = null,
    useEmailAutoFiling: js.UndefOr[Boolean] = js.undefined,
    viewedPromotions: js.Array[String] = null
  ): Anon_BusinessAddress = {
    val __obj = js.Dynamic.literal()
    if (businessAddress != null) __obj.updateDynamic("businessAddress")(businessAddress)
    if (!js.isUndefined(clipFullPage)) __obj.updateDynamic("clipFullPage")(clipFullPage)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (dailyEmailLimit != null) __obj.updateDynamic("dailyEmailLimit")(dailyEmailLimit.asInstanceOf[js.Any])
    if (dateAgreedToTermsOfService != null) __obj.updateDynamic("dateAgreedToTermsOfService")(dateAgreedToTermsOfService.asInstanceOf[js.Any])
    if (defaultLatitude != null) __obj.updateDynamic("defaultLatitude")(defaultLatitude.asInstanceOf[js.Any])
    if (defaultLocationName != null) __obj.updateDynamic("defaultLocationName")(defaultLocationName)
    if (defaultLongitude != null) __obj.updateDynamic("defaultLongitude")(defaultLongitude.asInstanceOf[js.Any])
    if (!js.isUndefined(educationalDiscount)) __obj.updateDynamic("educationalDiscount")(educationalDiscount)
    if (emailOptOutDate != null) __obj.updateDynamic("emailOptOutDate")(emailOptOutDate.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (!js.isUndefined(hideSponsorBilling)) __obj.updateDynamic("hideSponsorBilling")(hideSponsorBilling)
    if (incomingEmailAddress != null) __obj.updateDynamic("incomingEmailAddress")(incomingEmailAddress)
    if (maxReferrals != null) __obj.updateDynamic("maxReferrals")(maxReferrals.asInstanceOf[js.Any])
    if (partnerEmailOptInDate != null) __obj.updateDynamic("partnerEmailOptInDate")(partnerEmailOptInDate.asInstanceOf[js.Any])
    if (!js.isUndefined(preactivation)) __obj.updateDynamic("preactivation")(preactivation)
    if (preferredCountry != null) __obj.updateDynamic("preferredCountry")(preferredCountry)
    if (preferredLanguage != null) __obj.updateDynamic("preferredLanguage")(preferredLanguage)
    if (recentMailedAddresses != null) __obj.updateDynamic("recentMailedAddresses")(recentMailedAddresses)
    if (recognitionLanguage != null) __obj.updateDynamic("recognitionLanguage")(recognitionLanguage)
    if (refererCode != null) __obj.updateDynamic("refererCode")(refererCode)
    if (referralCount != null) __obj.updateDynamic("referralCount")(referralCount.asInstanceOf[js.Any])
    if (referralProof != null) __obj.updateDynamic("referralProof")(referralProof)
    if (reminderEmailConfig != null) __obj.updateDynamic("reminderEmailConfig")(reminderEmailConfig)
    if (sentEmailCount != null) __obj.updateDynamic("sentEmailCount")(sentEmailCount.asInstanceOf[js.Any])
    if (sentEmailDate != null) __obj.updateDynamic("sentEmailDate")(sentEmailDate.asInstanceOf[js.Any])
    if (!js.isUndefined(taxExempt)) __obj.updateDynamic("taxExempt")(taxExempt)
    if (twitterId != null) __obj.updateDynamic("twitterId")(twitterId)
    if (twitterUserName != null) __obj.updateDynamic("twitterUserName")(twitterUserName)
    if (!js.isUndefined(useEmailAutoFiling)) __obj.updateDynamic("useEmailAutoFiling")(useEmailAutoFiling)
    if (viewedPromotions != null) __obj.updateDynamic("viewedPromotions")(viewedPromotions)
    __obj.asInstanceOf[Anon_BusinessAddress]
  }
}

