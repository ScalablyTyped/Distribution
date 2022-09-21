package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a keyword under construction.
  *
  * Typical usage:
  *
  *      var keywordOperation = adGroup.newKeywordBuilder()
  *         .withText("text")
  *         .withCpc(1.5)
  *         .withFinalUrl("http://www.example.com")
  *         .build();
  *
  *      var keyword = keywordOperation.getResult();
  */
trait KeywordBuilder
  extends StObject
     with Builder[KeywordOperation] {
  
  /** Sets the max CPC bid of the new keyword to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new keyword to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the custom parameters of the new keyword to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the final URL of the new keyword to the specified value. */
  def withFinalUrl(finalUrl: String): this.type
  
  /** Sets the final URL suffix of the new keyword to the specified value. */
  def withFinalUrlSuffix(suffix: String): this.type
  
  /** Sets the mobile final URL of the new keyword to the specified value. */
  def withMobileFinalUrl(mobileFinalUrl: String): this.type
  
  /** Sets the text of the new keyword to the specified value. */
  def withText(text: String): this.type
  
  /** Sets the tracking template of the new keyword to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
}
object KeywordBuilder {
  
  inline def apply(
    build: () => KeywordOperation,
    withCpc: Double => KeywordBuilder,
    withCpm: Double => KeywordBuilder,
    withCustomParameters: Record[String, String] => KeywordBuilder,
    withFinalUrl: String => KeywordBuilder,
    withFinalUrlSuffix: String => KeywordBuilder,
    withMobileFinalUrl: String => KeywordBuilder,
    withText: String => KeywordBuilder,
    withTrackingTemplate: String => KeywordBuilder
  ): KeywordBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withFinalUrlSuffix = js.Any.fromFunction1(withFinalUrlSuffix), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withText = js.Any.fromFunction1(withText), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[KeywordBuilder]
  }
  
  extension [Self <: KeywordBuilder](x: Self) {
    
    inline def setWithCpc(value: Double => KeywordBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => KeywordBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithCustomParameters(value: Record[String, String] => KeywordBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => KeywordBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrlSuffix(value: String => KeywordBuilder): Self = StObject.set(x, "withFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setWithMobileFinalUrl(value: String => KeywordBuilder): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithText(value: String => KeywordBuilder): Self = StObject.set(x, "withText", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => KeywordBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
