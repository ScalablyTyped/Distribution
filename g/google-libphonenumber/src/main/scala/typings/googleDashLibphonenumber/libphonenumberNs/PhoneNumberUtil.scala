package typings.googleDashLibphonenumber.libphonenumberNs

import typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.MatchType
import typings.googleDashLibphonenumber.libphonenumberNs.PhoneNumberUtilNs.ValidationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("libphonenumber.PhoneNumberUtil")
@js.native
class PhoneNumberUtil () extends js.Object {
  def extractCountryCode(fullNumber: StringBuffer, nationalNumber: StringBuffer): Double = js.native
  def format(phoneNumber: PhoneNumber, format: PhoneNumberFormat): String = js.native
  def formatOutOfCountryCallingNumber(phoneNumber: PhoneNumber): String = js.native
  def formatOutOfCountryCallingNumber(phoneNumber: PhoneNumber, regionDialingFrom: String): String = js.native
  def getCountryCodeForRegion(supportedRegion: String): String = js.native
  def getExampleNumber(regionCode: String): PhoneNumber = js.native
  def getExampleNumberForType(regionCode: String, `type`: PhoneNumberType): PhoneNumber = js.native
  def getNddPrefixForRegion(): js.UndefOr[String] = js.native
  def getNddPrefixForRegion(regionCode: String): js.UndefOr[String] = js.native
  def getNddPrefixForRegion(regionCode: String, stripNonDigits: Boolean): js.UndefOr[String] = js.native
  def getNumberType(phoneNumber: PhoneNumber): PhoneNumberType = js.native
  def getRegionCodeForCountryCode(countryCallingCode: Double): String = js.native
  def getRegionCodeForNumber(phoneNumber: PhoneNumber): js.UndefOr[String] = js.native
  def getSupportedRegions(): js.Array[String] = js.native
  def isAlphaNumber(number: String): Boolean = js.native
  def isLeadingZeroPossible(countryCallingCode: Double): Boolean = js.native
  def isNANPACountry(): Boolean = js.native
  def isNANPACountry(regionCode: String): Boolean = js.native
  def isNumberMatch(firstNumber: String, secondNumber: String): MatchType = js.native
  def isNumberMatch(firstNumber: String, secondNumber: PhoneNumber): MatchType = js.native
  def isNumberMatch(firstNumber: PhoneNumber, secondNumber: String): MatchType = js.native
  def isNumberMatch(firstNumber: PhoneNumber, secondNumber: PhoneNumber): MatchType = js.native
  def isPossibleNumber(number: PhoneNumber): Boolean = js.native
  def isPossibleNumberForType(number: PhoneNumber, `type`: PhoneNumberType): Boolean = js.native
  def isPossibleNumberForTypeWithReason(number: PhoneNumber, `type`: PhoneNumberType): ValidationResult = js.native
  def isPossibleNumberString(number: String, regionDialingFrom: String): Boolean = js.native
  def isPossibleNumberWithReason(number: PhoneNumber): ValidationResult = js.native
  def isValidNumber(phoneNumber: PhoneNumber): Boolean = js.native
  def isValidNumberForRegion(phoneNumber: PhoneNumber): Boolean = js.native
  def isValidNumberForRegion(phoneNumber: PhoneNumber, region: String): Boolean = js.native
  def parse(): PhoneNumber = js.native
  def parse(number: String): PhoneNumber = js.native
  def parse(number: String, region: String): PhoneNumber = js.native
  def parseAndKeepRawInput(number: String): PhoneNumber = js.native
  def parseAndKeepRawInput(number: String, regionCode: String): PhoneNumber = js.native
  def truncateTooLongNumber(number: PhoneNumber): Boolean = js.native
}

/* static members */
@JSGlobal("libphonenumber.PhoneNumberUtil")
@js.native
object PhoneNumberUtil extends js.Object {
  def getInstance(): PhoneNumberUtil = js.native
}

