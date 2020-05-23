package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a specific way to join a conference. Example usage:
  *
  *     var videoEntryPoint = ConferenceDataService.newEntryPoint()
  *         .setEntryPointType(ConferenceDataService.EntryPointType.VIDEO)
  *         .setUri('https://example.com/myroom');
  *         .setPasscode('12345');
  *
  *     var phoneEntryPoint = ConferenceDataService.newEntryPoint()
  *         .setEntryPointType(ConferenceDataService.EntryPointType.PHONE)
  *         .setUri('tel:+11234567890,,,112233445;9687')
  *         .addFeature(ConferenceDataService.EntryPointFeature.TOLL)
  *         setPin('9687');
  *
  *     var sipEntryPoint = ConferenceDataService.newEntryPoint()
  *         .setEntryPointType(ConferenceDataService.EntryPointType.SIP)
  *         .setUri('sip:joe@example.com')
  *         .setAccessCode('1234567');
  *
  *     var moreEntryPoint = ConferenceDataService.newEntryPoint()
  *         .setEntryPointType(ConferenceDataService.EntryPointType.MORE)
  *         .setUri('https://example.com/moreJoiningInfo');
  */
trait EntryPoint extends js.Object {
  /**
    * Adds the feature of the entry point, such as being toll or toll-free.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#addFeature(EntryPointFeature)
    * @param feature The feature to set.
    */
  def addFeature(feature: EntryPointFeature): EntryPoint
  /**
    * An access code for accessing the conference. Maximum length 128 characters. Optional.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setAccessCode(String)
    * @param accessCode The access code to set.
    */
  def setAccessCode(accessCode: String): EntryPoint
  /**
    * Sets the type of this entry point. Required.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setEntryPointType(EntryPointType)
    * @param entryPointType The entry point type to set.
    */
  def setEntryPointType(entryPointType: EntryPointType): EntryPoint
  /**
    * A meeting code for accessing the conference. Maximum length 128 characters. Optional.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setMeetingCode(String)
    * @param meetingCode The meeting code to set.
    */
  def setMeetingCode(meetingCode: String): EntryPoint
  /**
    * A passcode for accessing the conference. Maximum length 128 characters. Optional.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setPasscode(String)
    * @param passcode The passcode to set.
    */
  def setPasscode(passcode: String): EntryPoint
  /**
    * A password code for accessing the conference. Maximum length 128 characters. Optional.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setPassword(String)
    * @param password The password to set.
    */
  def setPassword(password: String): EntryPoint
  /**
    * A PIN code for accessing the conference. Maximum length 128 characters. Optional.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setPin(String)
    * @param pin The PIN code to set.
    */
  def setPin(pin: String): EntryPoint
  /**
    * The CLDR/ISO 3166 region code for the country associated with this entry point. Applicable only
    * to phone entry point types. Optional.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setRegionCode(String)
    * @param regionCode The regionCode to set.
    */
  def setRegionCode(regionCode: String): EntryPoint
  /**
    * Sets the URI for joining the conference through this entry point. For PHONE entry points, the prefix tel: is required. For SIP entry points, the prefix sip: is required. For VIDEO and MORE entry points, the prefixes
    * http: or https: are required. Maximum length 1300 characters. Required.
    * https://developers.google.com/apps-script/reference/conference-data/entry-point#setUri(String)
    * @param uri The URI to set.
    */
  def setUri(uri: String): EntryPoint
}

object EntryPoint {
  @scala.inline
  def apply(
    addFeature: EntryPointFeature => EntryPoint,
    setAccessCode: String => EntryPoint,
    setEntryPointType: EntryPointType => EntryPoint,
    setMeetingCode: String => EntryPoint,
    setPasscode: String => EntryPoint,
    setPassword: String => EntryPoint,
    setPin: String => EntryPoint,
    setRegionCode: String => EntryPoint,
    setUri: String => EntryPoint
  ): EntryPoint = {
    val __obj = js.Dynamic.literal(addFeature = js.Any.fromFunction1(addFeature), setAccessCode = js.Any.fromFunction1(setAccessCode), setEntryPointType = js.Any.fromFunction1(setEntryPointType), setMeetingCode = js.Any.fromFunction1(setMeetingCode), setPasscode = js.Any.fromFunction1(setPasscode), setPassword = js.Any.fromFunction1(setPassword), setPin = js.Any.fromFunction1(setPin), setRegionCode = js.Any.fromFunction1(setRegionCode), setUri = js.Any.fromFunction1(setUri))
    __obj.asInstanceOf[EntryPoint]
  }
}

