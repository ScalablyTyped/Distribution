package typings.evernote.mod.Types

import typings.evernote.anon.BusinessAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.UserAttributes")
@js.native
open class UserAttributes () extends StObject {
  def this(args: BusinessAddress) = this()
  
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
