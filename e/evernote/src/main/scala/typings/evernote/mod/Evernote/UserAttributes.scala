package typings.evernote.mod.Evernote

import typings.evernote.AnonBusinessAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    A structure holding the optional attributes that can be stored
  *    on a User.    These are generally less critical than the core User fields.
  *
  * <dl>
  *    <dt>defaultLocationName</dt>
  *        <dd>the location string that should be associated
  *        with the user in order to determine where notes are taken if not otherwise
  *        specified.<br/>
  *        Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *        </dd>
  *
  *    <dt>defaultLatitude</dt>
  *        <dd>if set, this is the latitude that should be
  *        assigned to any notes that have no other latitude information.
  *        </dd>
  *
  *    <dt>defaultLongitude</dt>
  *        <dd>if set, this is the longitude that should be
  *        assigned to any notes that have no other longitude information.
  *        </dd>
  *
  *    <dt>preactivation</dt>
  *        <dd>if set, the user account is not yet confirmed for
  *        login.    I.e. the account has been created, but we are still waiting for
  *        the user to complete the activation step.
  *        </dd>
  *
  *    <dt>viewedPromotions</dt>
  *        <dd>a list of promotions the user has seen.
  *         This list may occasionally be modified by the system when promotions are
  *         no longer available.<br/>
  *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *        </dd>
  *
  *    <dt>incomingEmailAddress</dt>
  *        <dd>if set, this is the email address that the
  *         user may send email to in order to add an email note directly into the
  *         account via the SMTP email gateway.    This is the part of the email
  *         address before the '@' symbol ... our domain is not included.
  *         If this is not set, the user may not add notes via the gateway.<br/>
  *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *        </dd>
  *
  *    <dt>recentMailedAddresses</dt>
  *        <dd>if set, this will contain a list of email
  *         addresses that have recently been used as recipients
  *         of outbound emails by the user.    This can be used to pre-populate a
  *         list of possible destinations when a user wishes to send a note via
  *         email.<br/>
  *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX each<br/>
  *         Max:    EDAM_USER_RECENT_MAILED_ADDRESSES_MAX entries
  *        </dd>
  *
  *    <dt>comments</dt>
  *        <dd>Free-form text field that may hold general support
  *         information, etc.<br/>
  *         Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *        </dd>
  *
  *    <dt>dateAgreedToTermsOfService</dt>
  *        <dd>The date/time when the user agreed to
  *         the terms of service.    This can be used as the effective "start date"
  *         for the account.
  *        </dd>
  *
  *    <dt>maxReferrals</dt>
  *        <dd>The number of referrals that the user is permitted
  *         to make.
  *        </dd>
  *
  *    <dt>referralCount</dt>
  *        <dd>The number of referrals sent from this account.
  *        </dd>
  *
  *    <dt>refererCode</dt>
  *        <dd>A code indicating where the user was sent from. AKA
  *         promotion code
  *        </dd>
  *
  *    <dt>sentEmailDate</dt>
  *        <dd>The most recent date when the user sent outbound
  *         emails from the service.    Used with sentEmailCount to limit the number
  *         of emails that can be sent per day.
  *        </dd>
  *
  *    <dt>sentEmailCount</dt>
  *        <dd>The number of emails that were sent from the user
  *         via the service on sentEmailDate.    Used to enforce a limit on the number
  *         of emails per user per day to prevent spamming.
  *        </dd>
  *
  *    <dt>dailyEmailLimit</dt>
  *        <dd>If set, this is the maximum number of emails that
  *         may be sent in a given day from this account.    If unset, the server will
  *         use the configured default limit.
  *        </dd>
  *
  *    <dt>emailOptOutDate</dt>
  *        <dd>If set, this is the date when the user asked
  *         to be excluded from offers and promotions sent by Evernote.    If not set,
  *         then the user currently agrees to receive these messages.
  *        </dd>
  *
  *    <dt>partnerEmailOptInDate</dt>
  *        <dd>If set, this is the date when the user asked
  *         to be included in offers and promotions sent by Evernote's partners.
  *         If not sent, then the user currently does not agree to receive these
  *         emails.
  *        </dd>
  *
  *    <dt>preferredLanguage</dt>
  *        <dd>a 2 character language codes based on:
  *                http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt used for
  *             localization purposes to determine what language to use for the web
  *             interface and for other direct communication (e.g. emails).
  *        </dd>
  *
  *    <dt>preferredCountry</dt>
  *        <dd>Preferred country code based on ISO 3166-1-alpha-2 indicating the
  *        users preferred country</dd>
  *
  *    <dt>clipFullPage</dt>
  *        <dd>Boolean flag set to true if the user wants to clip full pages by
  *        default when they use the web clipper without a selection.</dd>
  *
  *    <dt>twitterUserName</dt>
  *        <dd>The username of the account of someone who has chosen to enable
  *        Twittering into Evernote.    This value is subject to change, since users
  *        may change their Twitter user name.</dd>
  *
  *    <dt>twitterId</dt>
  *        <dd>The unique identifier of the user's Twitter account if that user
  *        has chosen to enable Twittering into Evernote.</dd>
  *
  *    <dt>groupName</dt>
  *        <dd>A name identifier used to identify a particular set of branding and
  *         light customization.</dd>
  *
  *    <dt>recognitionLanguage</dt>
  *        <dd>a 2 character language codes based on:
  *                http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt
  *                If set, this is used to determine the language that should be used
  *                when processing images and PDF files to find text.
  *                If not set, then the 'preferredLanguage' will be used.
  *        </dd>
  *
  *    <dt>educationalInstitution</dt>
  *        <dd>a flag indicating that the user is part of an educational institution which
  *        makes them eligible for discounts on bulk purchases
  *        </dd>
  *
  *    <dt>businessAddress</dt>
  *        <dd>A string recording the business address of a Sponsored Account user who has requested invoicing.
  *        </dd>
  *
  *    <dt>hideSponsorBilling</dt>
  *        <dd>A flag indicating whether to hide the billing information on a sponsored
  *                account owner's settings page
  *        </dd>
  *
  *    <dt>taxExempt</dt>
  *        <dd>A flag indicating the user's sponsored group is exempt from sale tax
  *        </dd>
  *
  *    <dt>useEmailAutoFiling</dt>
  *        <dd>A flag indicating whether the user chooses to allow Evernote to automatically
  *                file and tag emailed notes
  *        </dd>
  *
  *    <dt>reminderEmailConfig</dt>
  *        <dd>Configuration state for whether or not the user wishes to receive
  *                reminder e-mail.    This setting applies to both the reminder e-mail sent
  *                for personal reminder notes and for the reminder e-mail sent for reminder
  *                notes in the user's business notebooks that the user has configured for
  *                e-mail notifications.
  *        </dd>
  *    </dl>
  */
@JSImport("evernote", "Evernote.UserAttributes")
@js.native
class UserAttributes () extends js.Object {
  def this(args: AnonBusinessAddress) = this()
  var businessAddress: String = js.native
  var clipFullPage: Boolean = js.native
  var comments: String = js.native
  var dailyEmailLimit: Double = js.native
  var dateAgreedToTermsOfService: Double = js.native
  var defaultLatitude: Double = js.native
  var defaultLocationName: String = js.native
  var defaultLongitude: Double = js.native
  var educationalDiscount: Boolean = js.native
  var emailOptOutDate: Double = js.native
  var groupName: String = js.native
  var hideSponsorBilling: Boolean = js.native
  var incomingEmailAddress: String = js.native
  var maxReferrals: Double = js.native
  var partnerEmailOptInDate: Double = js.native
  var preactivation: Boolean = js.native
  var preferredCountry: String = js.native
  var preferredLanguage: String = js.native
  var recentMailedAddresses: js.Array[String] = js.native
  var recognitionLanguage: String = js.native
  var refererCode: String = js.native
  var referralCount: Double = js.native
  var referralProof: String = js.native
  var reminderEmailConfig: ReminderEmailConfig = js.native
  var sentEmailCount: Double = js.native
  var sentEmailDate: Double = js.native
  var taxExempt: Boolean = js.native
  var twitterId: String = js.native
  var twitterUserName: String = js.native
  var useEmailAutoFiling: Boolean = js.native
  var viewedPromotions: js.Array[String] = js.native
}

