package typings.googleLibphonenumber.libphonenumber

import typings.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
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
object PhoneNumber {
  
  inline def apply(
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
    sealed trait FROM_DEFAULT_COUNTRY
      extends StObject
         with CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITHOUT_PLUS_SIGN
      extends StObject
         with CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_IDD
      extends StObject
         with CountryCodeSource
    
    @js.native
    sealed trait FROM_NUMBER_WITH_PLUS_SIGN
      extends StObject
         with CountryCodeSource
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setClearCountryCode(value: () => Unit): Self = StObject.set(x, "clearCountryCode", js.Any.fromFunction0(value))
    
    inline def setClearCountryCodeSource(value: () => Unit): Self = StObject.set(x, "clearCountryCodeSource", js.Any.fromFunction0(value))
    
    inline def setClearExtension(value: () => Unit): Self = StObject.set(x, "clearExtension", js.Any.fromFunction0(value))
    
    inline def setClearItalianLeadingZero(value: () => Unit): Self = StObject.set(x, "clearItalianLeadingZero", js.Any.fromFunction0(value))
    
    inline def setClearNationalNumber(value: () => Unit): Self = StObject.set(x, "clearNationalNumber", js.Any.fromFunction0(value))
    
    inline def setClearNumberOfLeadingZeros(value: () => Unit): Self = StObject.set(x, "clearNumberOfLeadingZeros", js.Any.fromFunction0(value))
    
    inline def setClearPreferredDomesticCarrierCode(value: () => Unit): Self = StObject.set(x, "clearPreferredDomesticCarrierCode", js.Any.fromFunction0(value))
    
    inline def setClearRawInput(value: () => Unit): Self = StObject.set(x, "clearRawInput", js.Any.fromFunction0(value))
    
    inline def setCountryCodeCount(value: () => Double): Self = StObject.set(x, "countryCodeCount", js.Any.fromFunction0(value))
    
    inline def setCountryCodeSourceCount(value: () => Double): Self = StObject.set(x, "countryCodeSourceCount", js.Any.fromFunction0(value))
    
    inline def setExtensionCount(value: () => Double): Self = StObject.set(x, "extensionCount", js.Any.fromFunction0(value))
    
    inline def setGetCountryCode(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getCountryCode", js.Any.fromFunction0(value))
    
    inline def setGetCountryCodeOrDefault(value: () => Double): Self = StObject.set(x, "getCountryCodeOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetCountryCodeSource(value: () => js.UndefOr[CountryCodeSource]): Self = StObject.set(x, "getCountryCodeSource", js.Any.fromFunction0(value))
    
    inline def setGetCountryCodeSourceOrDefault(value: () => CountryCodeSource): Self = StObject.set(x, "getCountryCodeSourceOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetExtension(value: () => js.UndefOr[String]): Self = StObject.set(x, "getExtension", js.Any.fromFunction0(value))
    
    inline def setGetExtensionOrDefault(value: () => String): Self = StObject.set(x, "getExtensionOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetItalianLeadingZero(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "getItalianLeadingZero", js.Any.fromFunction0(value))
    
    inline def setGetItalianLeadingZeroOrDefault(value: () => Boolean): Self = StObject.set(x, "getItalianLeadingZeroOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetNationalNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getNationalNumber", js.Any.fromFunction0(value))
    
    inline def setGetNationalNumberOrDefault(value: () => Double): Self = StObject.set(x, "getNationalNumberOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetNumberOfLeadingZeros(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getNumberOfLeadingZeros", js.Any.fromFunction0(value))
    
    inline def setGetNumberOfLeadingZerosOrDefault(value: () => Double): Self = StObject.set(x, "getNumberOfLeadingZerosOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetPreferredDomesticCarrierCode(value: () => js.UndefOr[String]): Self = StObject.set(x, "getPreferredDomesticCarrierCode", js.Any.fromFunction0(value))
    
    inline def setGetPreferredDomesticCarrierCodeOrDefault(value: () => String): Self = StObject.set(x, "getPreferredDomesticCarrierCodeOrDefault", js.Any.fromFunction0(value))
    
    inline def setGetRawInput(value: () => js.UndefOr[String]): Self = StObject.set(x, "getRawInput", js.Any.fromFunction0(value))
    
    inline def setGetRawInputOrDefault(value: () => String): Self = StObject.set(x, "getRawInputOrDefault", js.Any.fromFunction0(value))
    
    inline def setHasCountryCode(value: () => Boolean): Self = StObject.set(x, "hasCountryCode", js.Any.fromFunction0(value))
    
    inline def setHasCountryCodeSource(value: () => Boolean): Self = StObject.set(x, "hasCountryCodeSource", js.Any.fromFunction0(value))
    
    inline def setHasExtension(value: () => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction0(value))
    
    inline def setHasItalianLeadingZero(value: () => Boolean): Self = StObject.set(x, "hasItalianLeadingZero", js.Any.fromFunction0(value))
    
    inline def setHasNationalNumber(value: () => Boolean): Self = StObject.set(x, "hasNationalNumber", js.Any.fromFunction0(value))
    
    inline def setHasNumberOfLeadingZeros(value: () => Boolean): Self = StObject.set(x, "hasNumberOfLeadingZeros", js.Any.fromFunction0(value))
    
    inline def setHasPreferredDomesticCarrierCode(value: () => Boolean): Self = StObject.set(x, "hasPreferredDomesticCarrierCode", js.Any.fromFunction0(value))
    
    inline def setHasRawInput(value: () => Boolean): Self = StObject.set(x, "hasRawInput", js.Any.fromFunction0(value))
    
    inline def setItalianLeadingZeroCount(value: () => Double): Self = StObject.set(x, "italianLeadingZeroCount", js.Any.fromFunction0(value))
    
    inline def setNationalNumberCount(value: () => Double): Self = StObject.set(x, "nationalNumberCount", js.Any.fromFunction0(value))
    
    inline def setNumberOfLeadingZerosCount(value: () => Double): Self = StObject.set(x, "numberOfLeadingZerosCount", js.Any.fromFunction0(value))
    
    inline def setPreferredDomesticCarrierCodeCount(value: () => Double): Self = StObject.set(x, "preferredDomesticCarrierCodeCount", js.Any.fromFunction0(value))
    
    inline def setRawInputCount(value: () => Double): Self = StObject.set(x, "rawInputCount", js.Any.fromFunction0(value))
    
    inline def setSetCountryCode(value: Double => Unit): Self = StObject.set(x, "setCountryCode", js.Any.fromFunction1(value))
    
    inline def setSetCountryCodeSource(value: CountryCodeSource => Unit): Self = StObject.set(x, "setCountryCodeSource", js.Any.fromFunction1(value))
    
    inline def setSetExtension(value: String => Unit): Self = StObject.set(x, "setExtension", js.Any.fromFunction1(value))
    
    inline def setSetItalianLeadingZero(value: Boolean => Unit): Self = StObject.set(x, "setItalianLeadingZero", js.Any.fromFunction1(value))
    
    inline def setSetNationalNumber(value: Double => Double): Self = StObject.set(x, "setNationalNumber", js.Any.fromFunction1(value))
    
    inline def setSetNumberOfLeadingZeros(value: Double => Unit): Self = StObject.set(x, "setNumberOfLeadingZeros", js.Any.fromFunction1(value))
    
    inline def setSetPreferredDomesticCarrierCode(value: String => Unit): Self = StObject.set(x, "setPreferredDomesticCarrierCode", js.Any.fromFunction1(value))
    
    inline def setSetRawInput(value: String => Unit): Self = StObject.set(x, "setRawInput", js.Any.fromFunction1(value))
  }
}
