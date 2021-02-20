package typings.googleLibphonenumber.libphonenumber

import typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumber extends StObject {
  
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
object PhoneNumber {
  
  @scala.inline
  def apply(
    clearCountryCode: () => Unit,
    clearCountryCodeSource: () => Unit,
    clearExtension: () => Unit,
    clearItalianLeadingZero: () => Unit,
    clearNationalNumber: () => Unit,
    clearNumberOfLeadingZeros: () => Unit,
    clearPreferredDomesticCarrierCode: () => Unit,
    clearRawInput: () => Unit,
    countryCodeCount: () => Double,
    countryCodeSourceCount: () => Double,
    extensionCount: () => Double,
    getCountryCode: () => js.UndefOr[Double],
    getCountryCodeOrDefault: () => Double,
    getCountryCodeSource: () => js.UndefOr[CountryCodeSource],
    getCountryCodeSourceOrDefault: () => CountryCodeSource,
    getExtension: () => js.UndefOr[String],
    getExtensionOrDefault: () => String,
    getItalianLeadingZero: () => js.UndefOr[Boolean],
    getItalianLeadingZeroOrDefault: () => Boolean,
    getNationalNumber: () => js.UndefOr[Double],
    getNationalNumberOrDefault: () => Double,
    getNumberOfLeadingZeros: () => js.UndefOr[Double],
    getNumberOfLeadingZerosOrDefault: () => Double,
    getPreferredDomesticCarrierCode: () => js.UndefOr[String],
    getPreferredDomesticCarrierCodeOrDefault: () => String,
    getRawInput: () => js.UndefOr[String],
    getRawInputOrDefault: () => String,
    hasCountryCode: () => Boolean,
    hasCountryCodeSource: () => Boolean,
    hasExtension: () => Boolean,
    hasItalianLeadingZero: () => Boolean,
    hasNationalNumber: () => Boolean,
    hasNumberOfLeadingZeros: () => Boolean,
    hasPreferredDomesticCarrierCode: () => Boolean,
    hasRawInput: () => Boolean,
    italianLeadingZeroCount: () => Double,
    nationalNumberCount: () => Double,
    numberOfLeadingZerosCount: () => Double,
    preferredDomesticCarrierCodeCount: () => Double,
    rawInputCount: () => Double,
    setCountryCode: Double => Unit,
    setCountryCodeSource: CountryCodeSource => Unit,
    setExtension: String => Unit,
    setItalianLeadingZero: Boolean => Unit,
    setNationalNumber: Double => Double,
    setNumberOfLeadingZeros: Double => Unit,
    setPreferredDomesticCarrierCode: String => Unit,
    setRawInput: String => Unit
  ): PhoneNumber = {
    val __obj = js.Dynamic.literal(clearCountryCode = js.Any.fromFunction0(clearCountryCode), clearCountryCodeSource = js.Any.fromFunction0(clearCountryCodeSource), clearExtension = js.Any.fromFunction0(clearExtension), clearItalianLeadingZero = js.Any.fromFunction0(clearItalianLeadingZero), clearNationalNumber = js.Any.fromFunction0(clearNationalNumber), clearNumberOfLeadingZeros = js.Any.fromFunction0(clearNumberOfLeadingZeros), clearPreferredDomesticCarrierCode = js.Any.fromFunction0(clearPreferredDomesticCarrierCode), clearRawInput = js.Any.fromFunction0(clearRawInput), countryCodeCount = js.Any.fromFunction0(countryCodeCount), countryCodeSourceCount = js.Any.fromFunction0(countryCodeSourceCount), extensionCount = js.Any.fromFunction0(extensionCount), getCountryCode = js.Any.fromFunction0(getCountryCode), getCountryCodeOrDefault = js.Any.fromFunction0(getCountryCodeOrDefault), getCountryCodeSource = js.Any.fromFunction0(getCountryCodeSource), getCountryCodeSourceOrDefault = js.Any.fromFunction0(getCountryCodeSourceOrDefault), getExtension = js.Any.fromFunction0(getExtension), getExtensionOrDefault = js.Any.fromFunction0(getExtensionOrDefault), getItalianLeadingZero = js.Any.fromFunction0(getItalianLeadingZero), getItalianLeadingZeroOrDefault = js.Any.fromFunction0(getItalianLeadingZeroOrDefault), getNationalNumber = js.Any.fromFunction0(getNationalNumber), getNationalNumberOrDefault = js.Any.fromFunction0(getNationalNumberOrDefault), getNumberOfLeadingZeros = js.Any.fromFunction0(getNumberOfLeadingZeros), getNumberOfLeadingZerosOrDefault = js.Any.fromFunction0(getNumberOfLeadingZerosOrDefault), getPreferredDomesticCarrierCode = js.Any.fromFunction0(getPreferredDomesticCarrierCode), getPreferredDomesticCarrierCodeOrDefault = js.Any.fromFunction0(getPreferredDomesticCarrierCodeOrDefault), getRawInput = js.Any.fromFunction0(getRawInput), getRawInputOrDefault = js.Any.fromFunction0(getRawInputOrDefault), hasCountryCode = js.Any.fromFunction0(hasCountryCode), hasCountryCodeSource = js.Any.fromFunction0(hasCountryCodeSource), hasExtension = js.Any.fromFunction0(hasExtension), hasItalianLeadingZero = js.Any.fromFunction0(hasItalianLeadingZero), hasNationalNumber = js.Any.fromFunction0(hasNationalNumber), hasNumberOfLeadingZeros = js.Any.fromFunction0(hasNumberOfLeadingZeros), hasPreferredDomesticCarrierCode = js.Any.fromFunction0(hasPreferredDomesticCarrierCode), hasRawInput = js.Any.fromFunction0(hasRawInput), italianLeadingZeroCount = js.Any.fromFunction0(italianLeadingZeroCount), nationalNumberCount = js.Any.fromFunction0(nationalNumberCount), numberOfLeadingZerosCount = js.Any.fromFunction0(numberOfLeadingZerosCount), preferredDomesticCarrierCodeCount = js.Any.fromFunction0(preferredDomesticCarrierCodeCount), rawInputCount = js.Any.fromFunction0(rawInputCount), setCountryCode = js.Any.fromFunction1(setCountryCode), setCountryCodeSource = js.Any.fromFunction1(setCountryCodeSource), setExtension = js.Any.fromFunction1(setExtension), setItalianLeadingZero = js.Any.fromFunction1(setItalianLeadingZero), setNationalNumber = js.Any.fromFunction1(setNationalNumber), setNumberOfLeadingZeros = js.Any.fromFunction1(setNumberOfLeadingZeros), setPreferredDomesticCarrierCode = js.Any.fromFunction1(setPreferredDomesticCarrierCode), setRawInput = js.Any.fromFunction1(setRawInput))
    __obj.asInstanceOf[PhoneNumber]
  }
  
  @js.native
  sealed trait CountryCodeSource extends StObject
  @JSGlobal("libphonenumber.PhoneNumber.CountryCodeSource")
  @js.native
  object CountryCodeSource extends StObject {
    
    @js.native
    sealed trait FROM_DEFAULT_COUNTRY extends CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITHOUT_PLUS_SIGN extends CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_IDD extends CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_PLUS_SIGN extends CountryCodeSource
  }
  
  @scala.inline
  implicit class PhoneNumberMutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearCountryCode(value: () => Unit): Self = StObject.set(x, "clearCountryCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearCountryCodeSource(value: () => Unit): Self = StObject.set(x, "clearCountryCodeSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearExtension(value: () => Unit): Self = StObject.set(x, "clearExtension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearItalianLeadingZero(value: () => Unit): Self = StObject.set(x, "clearItalianLeadingZero", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearNationalNumber(value: () => Unit): Self = StObject.set(x, "clearNationalNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearNumberOfLeadingZeros(value: () => Unit): Self = StObject.set(x, "clearNumberOfLeadingZeros", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearPreferredDomesticCarrierCode(value: () => Unit): Self = StObject.set(x, "clearPreferredDomesticCarrierCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearRawInput(value: () => Unit): Self = StObject.set(x, "clearRawInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCountryCodeCount(value: () => Double): Self = StObject.set(x, "countryCodeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCountryCodeSourceCount(value: () => Double): Self = StObject.set(x, "countryCodeSourceCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtensionCount(value: () => Double): Self = StObject.set(x, "extensionCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountryCode(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getCountryCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountryCodeOrDefault(value: () => Double): Self = StObject.set(x, "getCountryCodeOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountryCodeSource(value: () => js.UndefOr[CountryCodeSource]): Self = StObject.set(x, "getCountryCodeSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountryCodeSourceOrDefault(value: () => CountryCodeSource): Self = StObject.set(x, "getCountryCodeSourceOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtension(value: () => js.UndefOr[String]): Self = StObject.set(x, "getExtension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtensionOrDefault(value: () => String): Self = StObject.set(x, "getExtensionOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItalianLeadingZero(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getItalianLeadingZero", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItalianLeadingZeroOrDefault(value: () => Boolean): Self = StObject.set(x, "getItalianLeadingZeroOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNationalNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getNationalNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNationalNumberOrDefault(value: () => Double): Self = StObject.set(x, "getNationalNumberOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumberOfLeadingZeros(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getNumberOfLeadingZeros", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumberOfLeadingZerosOrDefault(value: () => Double): Self = StObject.set(x, "getNumberOfLeadingZerosOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreferredDomesticCarrierCode(value: () => js.UndefOr[String]): Self = StObject.set(x, "getPreferredDomesticCarrierCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreferredDomesticCarrierCodeOrDefault(value: () => String): Self = StObject.set(x, "getPreferredDomesticCarrierCodeOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawInput(value: () => js.UndefOr[String]): Self = StObject.set(x, "getRawInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawInputOrDefault(value: () => String): Self = StObject.set(x, "getRawInputOrDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCountryCode(value: () => Boolean): Self = StObject.set(x, "hasCountryCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCountryCodeSource(value: () => Boolean): Self = StObject.set(x, "hasCountryCodeSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasExtension(value: () => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasItalianLeadingZero(value: () => Boolean): Self = StObject.set(x, "hasItalianLeadingZero", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasNationalNumber(value: () => Boolean): Self = StObject.set(x, "hasNationalNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasNumberOfLeadingZeros(value: () => Boolean): Self = StObject.set(x, "hasNumberOfLeadingZeros", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasPreferredDomesticCarrierCode(value: () => Boolean): Self = StObject.set(x, "hasPreferredDomesticCarrierCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasRawInput(value: () => Boolean): Self = StObject.set(x, "hasRawInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItalianLeadingZeroCount(value: () => Double): Self = StObject.set(x, "italianLeadingZeroCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNationalNumberCount(value: () => Double): Self = StObject.set(x, "nationalNumberCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumberOfLeadingZerosCount(value: () => Double): Self = StObject.set(x, "numberOfLeadingZerosCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreferredDomesticCarrierCodeCount(value: () => Double): Self = StObject.set(x, "preferredDomesticCarrierCodeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawInputCount(value: () => Double): Self = StObject.set(x, "rawInputCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCountryCode(value: Double => Unit): Self = StObject.set(x, "setCountryCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCountryCodeSource(value: CountryCodeSource => Unit): Self = StObject.set(x, "setCountryCodeSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExtension(value: String => Unit): Self = StObject.set(x, "setExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItalianLeadingZero(value: Boolean => Unit): Self = StObject.set(x, "setItalianLeadingZero", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNationalNumber(value: Double => Double): Self = StObject.set(x, "setNationalNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNumberOfLeadingZeros(value: Double => Unit): Self = StObject.set(x, "setNumberOfLeadingZeros", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPreferredDomesticCarrierCode(value: String => Unit): Self = StObject.set(x, "setPreferredDomesticCarrierCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRawInput(value: String => Unit): Self = StObject.set(x, "setRawInput", js.Any.fromFunction1(value))
  }
}
