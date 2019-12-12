package typings.googleDashLibphonenumber.libphonenumber

import org.scalablytyped.runtime.TopLevel
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD
import typings.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("libphonenumber.PhoneNumber")
@js.native
class PhoneNumber () extends js.Object {
  def clearCountryCode(): Unit = js.native
  def clearCountryCodeSource(): Unit = js.native
  def clearExtension(): Unit = js.native
  def clearItalianLeadingZero(): Unit = js.native
  def clearNationalNumber(): Unit = js.native
  def clearNumberOfLeadingZeros(): Unit = js.native
  def clearPreferredDomesticCarrierCode(): Unit = js.native
  def clearRawInput(): Unit = js.native
  def countryCodeCount(): Double = js.native
  def countryCodeSourceCount(): Double = js.native
  def extensionCount(): Double = js.native
  def getCountryCode(): js.UndefOr[Double] = js.native
  def getCountryCodeOrDefault(): Double = js.native
  def getCountryCodeSource(): js.UndefOr[CountryCodeSource] = js.native
  def getCountryCodeSourceOrDefault(): CountryCodeSource = js.native
  def getExtension(): js.UndefOr[String] = js.native
  def getExtensionOrDefault(): String = js.native
  def getItalianLeadingZero(): js.UndefOr[Boolean] = js.native
  def getItalianLeadingZeroOrDefault(): Boolean = js.native
  def getNationalNumber(): js.UndefOr[Double] = js.native
  def getNationalNumberOrDefault(): Double = js.native
  def getNumberOfLeadingZeros(): js.UndefOr[Double] = js.native
  def getNumberOfLeadingZerosOrDefault(): Double = js.native
  def getPreferredDomesticCarrierCode(): js.UndefOr[String] = js.native
  def getPreferredDomesticCarrierCodeOrDefault(): String = js.native
  def getRawInput(): js.UndefOr[String] = js.native
  def getRawInputOrDefault(): String = js.native
  def hasCountryCode(): Boolean = js.native
  def hasCountryCodeSource(): Boolean = js.native
  def hasExtension(): Boolean = js.native
  def hasItalianLeadingZero(): Boolean = js.native
  def hasNationalNumber(): Boolean = js.native
  def hasNumberOfLeadingZeros(): Boolean = js.native
  def hasPreferredDomesticCarrierCode(): Boolean = js.native
  def hasRawInput(): Boolean = js.native
  def italianLeadingZeroCount(): Double = js.native
  def nationalNumberCount(): Double = js.native
  def numberOfLeadingZerosCount(): Double = js.native
  def preferredDomesticCarrierCodeCount(): Double = js.native
  def rawInputCount(): Double = js.native
  def setCountryCode(value: Double): Unit = js.native
  def setCountryCodeSource(value: CountryCodeSource): Unit = js.native
  def setExtension(value: String): Unit = js.native
  def setItalianLeadingZero(value: Boolean): Unit = js.native
  def setNationalNumber(value: Double): Double = js.native
  def setNumberOfLeadingZeros(value: Double): Unit = js.native
  def setPreferredDomesticCarrierCode(value: String): Unit = js.native
  def setRawInput(value: String): Unit = js.native
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CountryCodeSource with Double] = js.native
    /* 20 */ @js.native
    object FROM_DEFAULT_COUNTRY extends TopLevel[FROM_DEFAULT_COUNTRY with Double]
    
    /* 10 */ @js.native
    object FROM_NUMBER_WITHOUT_PLUS_SIGN extends TopLevel[FROM_NUMBER_WITHOUT_PLUS_SIGN with Double]
    
    /* 5 */ @js.native
    object FROM_NUMBER_WITH_IDD extends TopLevel[FROM_NUMBER_WITH_IDD with Double]
    
    /* 1 */ @js.native
    object FROM_NUMBER_WITH_PLUS_SIGN extends TopLevel[FROM_NUMBER_WITH_PLUS_SIGN with Double]
    
  }
  
}

