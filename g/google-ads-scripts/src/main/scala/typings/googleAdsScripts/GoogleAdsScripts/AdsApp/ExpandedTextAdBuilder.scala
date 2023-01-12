package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for an expanded text ad under construction.
  *
  * Typical usage:
  *
  *      var adOperation = adGroup.newAd().expandedTextAdBuilder()
  *        .withHeadlinePart1("First headline of ad")
  *        .withHeadlinePart2("Second headline of ad")
  *        .withDescription("Ad description")
  *        .withPath1("path1")
  *        .withPath2("path2")
  *        .withFinalUrl("http://www.example.com")
  *        .build();
  *      var ad = adOperation.getResult();
  */
trait ExpandedTextAdBuilder
  extends StObject
     with Builder[AdOperation] {
  
  /** Sets the custom parameters of the new ad to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the new ad's description to the specified value. */
  def withDescription(description: String): this.type
  
  /** Sets the new ad's first description to the specified value. */
  def withDescription1(description1: String): this.type
  
  /** Sets the new ad's second description to the specified value. */
  def withDescription2(description2: String): this.type
  
  /** Sets the final URL of the new ad to the specified value. */
  def withFinalUrl(finalUrl: String): this.type
  
  /** Sets the final URL suffix of the new ad to the specified value. */
  def withFinalUrlSuffix(suffix: String): this.type
  
  /** Sets the first part of the new ad's headline to the specified value. */
  def withHeadlinePart1(headlinePart1: String): this.type
  
  /** Sets the second part of the new ad's headline to the specified value. */
  def withHeadlinePart2(headlinePart2: String): this.type
  
  /** Sets the third part of the new ad's headline to the specified value. */
  def withHeadlinePart3(headlinePart3: String): this.type
  
  /** Sets the mobile final URL of the new ad to the specified value. */
  def withMobileFinalUrl(mobileFinalUrl: String): this.type
  
  /** Sets the first path that appears with the new ad's displayed URL. */
  def withPath1(urlPath1: String): this.type
  
  /** Sets the second path that appears with the new ad's displayed URL. */
  def withPath2(urlPath2: String): this.type
  
  /** Sets the tracking template of the new ad to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
}
object ExpandedTextAdBuilder {
  
  inline def apply(
    build: () => AdOperation,
    withCustomParameters: Record[String, String] => ExpandedTextAdBuilder,
    withDescription: String => ExpandedTextAdBuilder,
    withDescription1: String => ExpandedTextAdBuilder,
    withDescription2: String => ExpandedTextAdBuilder,
    withFinalUrl: String => ExpandedTextAdBuilder,
    withFinalUrlSuffix: String => ExpandedTextAdBuilder,
    withHeadlinePart1: String => ExpandedTextAdBuilder,
    withHeadlinePart2: String => ExpandedTextAdBuilder,
    withHeadlinePart3: String => ExpandedTextAdBuilder,
    withMobileFinalUrl: String => ExpandedTextAdBuilder,
    withPath1: String => ExpandedTextAdBuilder,
    withPath2: String => ExpandedTextAdBuilder,
    withTrackingTemplate: String => ExpandedTextAdBuilder
  ): ExpandedTextAdBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withDescription1 = js.Any.fromFunction1(withDescription1), withDescription2 = js.Any.fromFunction1(withDescription2), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withFinalUrlSuffix = js.Any.fromFunction1(withFinalUrlSuffix), withHeadlinePart1 = js.Any.fromFunction1(withHeadlinePart1), withHeadlinePart2 = js.Any.fromFunction1(withHeadlinePart2), withHeadlinePart3 = js.Any.fromFunction1(withHeadlinePart3), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withPath1 = js.Any.fromFunction1(withPath1), withPath2 = js.Any.fromFunction1(withPath2), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ExpandedTextAdBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandedTextAdBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithCustomParameters(value: Record[String, String] => ExpandedTextAdBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithDescription(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withDescription", js.Any.fromFunction1(value))
    
    inline def setWithDescription1(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withDescription1", js.Any.fromFunction1(value))
    
    inline def setWithDescription2(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withDescription2", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrlSuffix(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setWithHeadlinePart1(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withHeadlinePart1", js.Any.fromFunction1(value))
    
    inline def setWithHeadlinePart2(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withHeadlinePart2", js.Any.fromFunction1(value))
    
    inline def setWithHeadlinePart3(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withHeadlinePart3", js.Any.fromFunction1(value))
    
    inline def setWithMobileFinalUrl(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithPath1(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withPath1", js.Any.fromFunction1(value))
    
    inline def setWithPath2(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withPath2", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => ExpandedTextAdBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
