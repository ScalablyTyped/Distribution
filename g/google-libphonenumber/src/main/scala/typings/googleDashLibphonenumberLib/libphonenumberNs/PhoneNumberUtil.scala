package typings
package googleDashLibphonenumberLib.libphonenumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("libphonenumber.PhoneNumberUtil")
@js.native
class PhoneNumberUtil () extends js.Object {
  def extractCountryCode(fullNumber: StringBuffer, nationalNumber: StringBuffer): scala.Double = js.native
  def format(phoneNumber: PhoneNumber, format: PhoneNumberFormat): java.lang.String = js.native
  def formatOutOfCountryCallingNumber(phoneNumber: PhoneNumber): java.lang.String = js.native
  def formatOutOfCountryCallingNumber(phoneNumber: PhoneNumber, regionDialingFrom: java.lang.String): java.lang.String = js.native
  def getCountryCodeForRegion(supportedRegion: java.lang.String): java.lang.String = js.native
  def getExampleNumber(regionCode: java.lang.String): PhoneNumber = js.native
  def getExampleNumberForType(regionCode: java.lang.String, `type`: PhoneNumberType): PhoneNumber = js.native
  def getNddPrefixForRegion(): js.UndefOr[java.lang.String] = js.native
  def getNddPrefixForRegion(regionCode: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getNddPrefixForRegion(regionCode: java.lang.String, stripNonDigits: scala.Boolean): js.UndefOr[java.lang.String] = js.native
  def getNumberType(phoneNumber: PhoneNumber): PhoneNumberType = js.native
  def getRegionCodeForCountryCode(countryCallingCode: scala.Double): java.lang.String = js.native
  def getRegionCodeForNumber(phoneNumber: PhoneNumber): js.UndefOr[java.lang.String] = js.native
  def getSupportedRegions(): js.Array[java.lang.String] = js.native
  def isAlphaNumber(number: java.lang.String): scala.Boolean = js.native
  def isLeadingZeroPossible(countryCallingCode: scala.Double): scala.Boolean = js.native
  def isNANPACountry(): scala.Boolean = js.native
  def isNANPACountry(regionCode: java.lang.String): scala.Boolean = js.native
  def isNumberMatch(firstNumber: PhoneNumber, secondNumber: PhoneNumber): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType = js.native
  def isNumberMatch(firstNumber: PhoneNumber, secondNumber: java.lang.String): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType = js.native
  def isNumberMatch(firstNumber: java.lang.String, secondNumber: PhoneNumber): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType = js.native
  def isNumberMatch(firstNumber: java.lang.String, secondNumber: java.lang.String): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.MatchType = js.native
  def isPossibleNumber(number: PhoneNumber): scala.Boolean = js.native
  def isPossibleNumberForType(number: PhoneNumber, `type`: PhoneNumberType): scala.Boolean = js.native
  def isPossibleNumberForTypeWithReason(number: PhoneNumber, `type`: PhoneNumberType): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult = js.native
  def isPossibleNumberString(number: java.lang.String, regionDialingFrom: java.lang.String): scala.Boolean = js.native
  def isPossibleNumberWithReason(number: PhoneNumber): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtilNs.ValidationResult = js.native
  def isValidNumber(phoneNumber: PhoneNumber): scala.Boolean = js.native
  def isValidNumberForRegion(phoneNumber: PhoneNumber): scala.Boolean = js.native
  def isValidNumberForRegion(phoneNumber: PhoneNumber, region: java.lang.String): scala.Boolean = js.native
  def parse(): PhoneNumber = js.native
  def parse(number: java.lang.String): PhoneNumber = js.native
  def parse(number: java.lang.String, region: java.lang.String): PhoneNumber = js.native
  def parseAndKeepRawInput(number: java.lang.String): PhoneNumber = js.native
  def parseAndKeepRawInput(number: java.lang.String, regionCode: java.lang.String): PhoneNumber = js.native
  def truncateTooLongNumber(number: PhoneNumber): scala.Boolean = js.native
}

@JSGlobal("libphonenumber.PhoneNumberUtil")
@js.native
object PhoneNumberUtil extends js.Object {
  def getInstance(): googleDashLibphonenumberLib.libphonenumberNs.PhoneNumberUtil = js.native
}

