package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEntryPoint extends js.Object {
  /**
    * The access code to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed. Optional.
    */
  var accessCode: js.UndefOr[String] = js.native
  /**
    * Features of the entry point, such as being toll or toll-free. One entry
    * point can have multiple features. However, toll and toll-free cannot be
    * both set on the same entry point.
    */
  var entryPointFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of the conference entry point. Possible values are:   -
    * &quot;video&quot; - joining a conference over HTTP. A conference can have
    * zero or one video entry point. - &quot;phone&quot; - joining a conference
    * by dialing a phone number. A conference can have zero or more phone entry
    * points. - &quot;sip&quot; - joining a conference over SIP. A conference
    * can have zero or one sip entry point. - &quot;more&quot; - further
    * conference joining instructions, for example additional phone numbers. A
    * conference can have zero or one more entry point. A conference with only
    * a more entry point is not a valid conference.
    */
  var entryPointType: js.UndefOr[String] = js.native
  /**
    * The label for the URI. Visible to end users. Not localized. The maximum
    * length is 512 characters. Examples:   - for video:
    * meet.google.com/aaa-bbbb-ccc - for phone: +1 123 268 2601 - for sip:
    * 12345678@altostrat.com - for more: should not be filled   Optional.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The meeting code to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed. Optional.
    */
  var meetingCode: js.UndefOr[String] = js.native
  /**
    * The passcode to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed.
    */
  var passcode: js.UndefOr[String] = js.native
  /**
    * The password to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed. Optional.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The PIN to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of
    * {meetingCode, accessCode, passcode, password, pin} fields that match the
    * terminology that the conference provider uses. Only the populated fields
    * should be displayed. Optional.
    */
  var pin: js.UndefOr[String] = js.native
  /**
    * The CLDR/ISO 3166 region code for the country associated with this phone
    * access. Example: &quot;SE&quot; for Sweden. Calendar backend will
    * populate this field only for EntryPointType.PHONE.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * The URI of the entry point. The maximum length is 1300 characters.
    * Format:   - for video, http: or https: schema is required. - for phone,
    * tel: schema is required. The URI should include the entire dial sequence
    * (e.g., tel:+12345678900,,,123456789;1234). - for sip, sip: schema is
    * required, e.g., sip:12345678@myprovider.com. - for more, http: or https:
    * schema is required.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaEntryPoint {
  @scala.inline
  def apply(
    accessCode: String = null,
    entryPointFeatures: js.Array[String] = null,
    entryPointType: String = null,
    label: String = null,
    meetingCode: String = null,
    passcode: String = null,
    password: String = null,
    pin: String = null,
    regionCode: String = null,
    uri: String = null
  ): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    if (accessCode != null) __obj.updateDynamic("accessCode")(accessCode.asInstanceOf[js.Any])
    if (entryPointFeatures != null) __obj.updateDynamic("entryPointFeatures")(entryPointFeatures.asInstanceOf[js.Any])
    if (entryPointType != null) __obj.updateDynamic("entryPointType")(entryPointType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (meetingCode != null) __obj.updateDynamic("meetingCode")(meetingCode.asInstanceOf[js.Any])
    if (passcode != null) __obj.updateDynamic("passcode")(passcode.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntryPoint]
  }
}

