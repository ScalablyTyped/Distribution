package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntryPoint]
  }
  
  @scala.inline
  implicit class SchemaEntryPointOps[Self <: SchemaEntryPoint] (val x: Self) extends AnyVal {
    
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
    def setAccessCode(value: String): Self = this.set("accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCode: Self = this.set("accessCode", js.undefined)
    
    @scala.inline
    def setEntryPointFeaturesVarargs(value: String*): Self = this.set("entryPointFeatures", js.Array(value :_*))
    
    @scala.inline
    def setEntryPointFeatures(value: js.Array[String]): Self = this.set("entryPointFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPointFeatures: Self = this.set("entryPointFeatures", js.undefined)
    
    @scala.inline
    def setEntryPointType(value: String): Self = this.set("entryPointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPointType: Self = this.set("entryPointType", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMeetingCode(value: String): Self = this.set("meetingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingCode: Self = this.set("meetingCode", js.undefined)
    
    @scala.inline
    def setPasscode(value: String): Self = this.set("passcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasscode: Self = this.set("passcode", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPin(value: String): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
