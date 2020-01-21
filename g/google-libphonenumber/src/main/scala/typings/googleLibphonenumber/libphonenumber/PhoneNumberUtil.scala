package typings.googleLibphonenumber.libphonenumber

import org.scalablytyped.runtime.TopLevel
import typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType
import typings.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult
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
  @js.native
  sealed trait MatchType extends js.Object
  
  @js.native
  sealed trait ValidationResult extends js.Object
  
  def getInstance(): PhoneNumberUtil = js.native
  @js.native
  object MatchType extends js.Object {
    @js.native
    sealed trait EXACT_MATCH extends MatchType
    
    @js.native
    sealed trait NOT_A_NUMBER extends MatchType
    
    @js.native
    sealed trait NO_MATCH extends MatchType
    
    @js.native
    sealed trait NSN_MATCH extends MatchType
    
    @js.native
    sealed trait SHORT_NSN_MATCH extends MatchType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MatchType with Double] = js.native
    /* 0 */ @js.native
    object EXACT_MATCH extends TopLevel[EXACT_MATCH with Double]
    
    /* 2 */ @js.native
    object NOT_A_NUMBER extends TopLevel[NOT_A_NUMBER with Double]
    
    /* 1 */ @js.native
    object NO_MATCH extends TopLevel[NO_MATCH with Double]
    
    /* 3 */ @js.native
    object NSN_MATCH extends TopLevel[NSN_MATCH with Double]
    
    /* 4 */ @js.native
    object SHORT_NSN_MATCH extends TopLevel[SHORT_NSN_MATCH with Double]
    
  }
  
  @js.native
  object ValidationResult extends js.Object {
    @js.native
    sealed trait INVALID_COUNTRY_CODE extends ValidationResult
    
    @js.native
    sealed trait IS_POSSIBLE extends ValidationResult
    
    @js.native
    sealed trait TOO_LONG extends ValidationResult
    
    @js.native
    sealed trait TOO_SHORT extends ValidationResult
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValidationResult with Double] = js.native
    /* 1 */ @js.native
    object INVALID_COUNTRY_CODE extends TopLevel[INVALID_COUNTRY_CODE with Double]
    
    /* 0 */ @js.native
    object IS_POSSIBLE extends TopLevel[IS_POSSIBLE with Double]
    
    /* 3 */ @js.native
    object TOO_LONG extends TopLevel[TOO_LONG with Double]
    
    /* 2 */ @js.native
    object TOO_SHORT extends TopLevel[TOO_SHORT with Double]
    
  }
  
}

