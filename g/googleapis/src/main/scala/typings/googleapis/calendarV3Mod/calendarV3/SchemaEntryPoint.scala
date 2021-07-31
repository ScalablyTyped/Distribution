package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntryPoint extends StObject {
  
  /**
    * The access code to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed. Optional.
    */
  var accessCode: js.UndefOr[String] = js.undefined
  
  /**
    * Features of the entry point, such as being toll or toll-free. One entry
    * point can have multiple features. However, toll and toll-free cannot be
    * both set on the same entry point.
    */
  var entryPointFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var entryPointType: js.UndefOr[String] = js.undefined
  
  /**
    * The label for the URI. Visible to end users. Not localized. The maximum
    * length is 512 characters. Examples:   - for video:
    * meet.google.com/aaa-bbbb-ccc - for phone: +1 123 268 2601 - for sip:
    * 12345678@altostrat.com - for more: should not be filled   Optional.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The meeting code to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed. Optional.
    */
  var meetingCode: js.UndefOr[String] = js.undefined
  
  /**
    * The passcode to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed.
    */
  var passcode: js.UndefOr[String] = js.undefined
  
  /**
    * The password to access the conference. The maximum length is 128
    * characters. When creating new conference data, populate only the subset
    * of {meetingCode, accessCode, passcode, password, pin} fields that match
    * the terminology that the conference provider uses. Only the populated
    * fields should be displayed. Optional.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The PIN to access the conference. The maximum length is 128 characters.
    * When creating new conference data, populate only the subset of
    * {meetingCode, accessCode, passcode, password, pin} fields that match the
    * terminology that the conference provider uses. Only the populated fields
    * should be displayed. Optional.
    */
  var pin: js.UndefOr[String] = js.undefined
  
  /**
    * The CLDR/ISO 3166 region code for the country associated with this phone
    * access. Example: &quot;SE&quot; for Sweden. Calendar backend will
    * populate this field only for EntryPointType.PHONE.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the entry point. The maximum length is 1300 characters.
    * Format:   - for video, http: or https: schema is required. - for phone,
    * tel: schema is required. The URI should include the entire dial sequence
    * (e.g., tel:+12345678900,,,123456789;1234). - for sip, sip: schema is
    * required, e.g., sip:12345678@myprovider.com. - for more, http: or https:
    * schema is required.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object SchemaEntryPoint {
  
  @scala.inline
  def apply(): SchemaEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntryPoint]
  }
  
  @scala.inline
  implicit class SchemaEntryPointMutableBuilder[Self <: SchemaEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
    
    @scala.inline
    def setEntryPointFeatures(value: js.Array[String]): Self = StObject.set(x, "entryPointFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointFeaturesUndefined: Self = StObject.set(x, "entryPointFeatures", js.undefined)
    
    @scala.inline
    def setEntryPointFeaturesVarargs(value: String*): Self = StObject.set(x, "entryPointFeatures", js.Array(value :_*))
    
    @scala.inline
    def setEntryPointType(value: String): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointTypeUndefined: Self = StObject.set(x, "entryPointType", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMeetingCode(value: String): Self = StObject.set(x, "meetingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingCodeUndefined: Self = StObject.set(x, "meetingCode", js.undefined)
    
    @scala.inline
    def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
