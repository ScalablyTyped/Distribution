package typings.googleLibphonenumber.libphonenumber

import typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneNumber extends js.Object {
  def clearCountryCode(): Unit
  def clearCountryCodeSource(): Unit
  def clearExtension(): Unit
  def clearItalianLeadingZero(): Unit
  def clearNationalNumber(): Unit
  def clearNumberOfLeadingZeros(): Unit
  def clearPreferredDomesticCarrierCode(): Unit
  def clearRawInput(): Unit
  def countryCodeCount(): Double
  def countryCodeSourceCount(): Double
  def extensionCount(): Double
  def getCountryCode(): js.UndefOr[Double]
  def getCountryCodeOrDefault(): Double
  def getCountryCodeSource(): js.UndefOr[CountryCodeSource]
  def getCountryCodeSourceOrDefault(): CountryCodeSource
  def getExtension(): js.UndefOr[String]
  def getExtensionOrDefault(): String
  def getItalianLeadingZero(): js.UndefOr[Boolean]
  def getItalianLeadingZeroOrDefault(): Boolean
  def getNationalNumber(): js.UndefOr[Double]
  def getNationalNumberOrDefault(): Double
  def getNumberOfLeadingZeros(): js.UndefOr[Double]
  def getNumberOfLeadingZerosOrDefault(): Double
  def getPreferredDomesticCarrierCode(): js.UndefOr[String]
  def getPreferredDomesticCarrierCodeOrDefault(): String
  def getRawInput(): js.UndefOr[String]
  def getRawInputOrDefault(): String
  def hasCountryCode(): Boolean
  def hasCountryCodeSource(): Boolean
  def hasExtension(): Boolean
  def hasItalianLeadingZero(): Boolean
  def hasNationalNumber(): Boolean
  def hasNumberOfLeadingZeros(): Boolean
  def hasPreferredDomesticCarrierCode(): Boolean
  def hasRawInput(): Boolean
  def italianLeadingZeroCount(): Double
  def nationalNumberCount(): Double
  def numberOfLeadingZerosCount(): Double
  def preferredDomesticCarrierCodeCount(): Double
  def rawInputCount(): Double
  def setCountryCode(value: Double): Unit
  def setCountryCodeSource(value: CountryCodeSource): Unit
  def setExtension(value: String): Unit
  def setItalianLeadingZero(value: Boolean): Unit
  def setNationalNumber(value: Double): Double
  def setNumberOfLeadingZeros(value: Double): Unit
  def setPreferredDomesticCarrierCode(value: String): Unit
  def setRawInput(value: String): Unit
}

@JSGlobal("libphonenumber.PhoneNumber")
@js.native
object PhoneNumber extends js.Object {
  @js.native
  sealed trait CountryCodeSource extends js.Object
  
  @js.native
  object CountryCodeSource extends js.Object {
    @js.native
    sealed trait FROM_DEFAULT_COUNTRY extends CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITHOUT_PLUS_SIGN extends CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_IDD extends CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_PLUS_SIGN extends CountryCodeSource
    
  }
  
}

