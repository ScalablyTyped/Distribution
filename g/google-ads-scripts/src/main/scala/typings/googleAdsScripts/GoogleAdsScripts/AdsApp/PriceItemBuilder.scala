package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceItemBuilder
  extends StObject
     with Builder[PriceItemOperation] {
  
  def withAmount(amount: Double): this.type
  
  def withCurrencyCode(code: String): this.type
  
  def withDescription(description: String): this.type
  
  def withFinalUrl(finalUrl: String): this.type
  
  def withHeader(header: String): this.type
  
  def withMobileFinalUrl(mobileFinalUrl: String): this.type
  
  def withUnitType(unitType: String): this.type
}
object PriceItemBuilder {
  
  inline def apply(
    build: () => PriceItemOperation,
    withAmount: Double => PriceItemBuilder,
    withCurrencyCode: String => PriceItemBuilder,
    withDescription: String => PriceItemBuilder,
    withFinalUrl: String => PriceItemBuilder,
    withHeader: String => PriceItemBuilder,
    withMobileFinalUrl: String => PriceItemBuilder,
    withUnitType: String => PriceItemBuilder
  ): PriceItemBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAmount = js.Any.fromFunction1(withAmount), withCurrencyCode = js.Any.fromFunction1(withCurrencyCode), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withUnitType = js.Any.fromFunction1(withUnitType))
    __obj.asInstanceOf[PriceItemBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PriceItemBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithAmount(value: Double => PriceItemBuilder): Self = StObject.set(x, "withAmount", js.Any.fromFunction1(value))
    
    inline def setWithCurrencyCode(value: String => PriceItemBuilder): Self = StObject.set(x, "withCurrencyCode", js.Any.fromFunction1(value))
    
    inline def setWithDescription(value: String => PriceItemBuilder): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => PriceItemBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithHeader(value: String => PriceItemBuilder): Self = StObject.set(x, "withHeader", js.Any.fromFunction1(value))
    
    inline def setWithMobileFinalUrl(value: String => PriceItemBuilder): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithUnitType(value: String => PriceItemBuilder): Self = StObject.set(x, "withUnitType", js.Any.fromFunction1(value))
  }
}
