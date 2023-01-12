package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a responsive ad for Search under construction.
  *
  * Typical usage:
  *
  *       var adOperation = adGroup.newAd().responsiveSearchAdBuilder()
  *        .withHeadlines([
  *          "Headline 1",
  *          { text: "Pinned Headline 2", pinning: "HEADLINE_2"}
  *        ])
  *        .addHeadline("Headline 3")
  *        .addHeadline("Pinned Headline 4", "HEADLINE_2")
  *        .withDescriptions([
  *          "Description 1",
  *          { text: "Pinned Description 2", pinning: "DESCRIPTION_1" }
  *        ])
  *        .addDescription("Description 3")
  *        .addDescription("Pinned Description 4", "DESCRIPTION_1")
  *        .withPath1("path1")
  *        .withPath2("path2")
  *        .withFinalUrl("http://www.example.com")
  *        .build();
  *      var ad = adOperation.getResult();
  *
  * Note that it is only necessary to call `AdOperation.getResult()` if you need to access the actual ad for further processing
  * (for instance, one can attach a label to the newly created ad). Otherwise, calling `build()` on the builder is sufficient to ensure that the ad is created.
  */
trait ResponsiveSearchAdBuilder
  extends StObject
     with Builder[AdOperation] {
  
  /** Adds the provided description to the current list of descriptions. */
  def addDescription(description: String, pinning: String): this.type
  
  /** Adds the provided headline to the current list of headlines. */
  def addHeadline(headline: String, pinning: String): this.type
  
  /** Sets the custom parameters of the new ad to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the new ad's descriptions to the specified value. */
  def withDescriptions(descriptions: js.Array[String | AdTextAsset]): this.type
  
  /** Sets the final URL of the new ad to the specified value. */
  def withFinalUrl(finalUrl: String): this.type
  
  /** Sets the final URL suffix of the new ad to the specified value. */
  def withFinalUrlSuffix(suffix: String): this.type
  
  /** Sets the list of the new ad's headlines to the specified value. */
  def withHeadlines(headlines: js.Array[String | AdTextAsset]): this.type
  
  /** Sets the mobile final URL of the new ad to the specified value. */
  def withMobileFinalUrl(mobileFinalUrl: String): this.type
  
  /** Sets the first path that appears with the new ad's displayed URL. */
  def withPath1(path1: String): this.type
  
  /** Sets the second path that appears with the new ad's displayed URL. */
  def withPath2(path2: String): this.type
  
  /** Sets the tracking template of the new ad to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
}
object ResponsiveSearchAdBuilder {
  
  inline def apply(
    addDescription: (String, String) => ResponsiveSearchAdBuilder,
    addHeadline: (String, String) => ResponsiveSearchAdBuilder,
    build: () => AdOperation,
    withCustomParameters: Record[String, String] => ResponsiveSearchAdBuilder,
    withDescriptions: js.Array[String | AdTextAsset] => ResponsiveSearchAdBuilder,
    withFinalUrl: String => ResponsiveSearchAdBuilder,
    withFinalUrlSuffix: String => ResponsiveSearchAdBuilder,
    withHeadlines: js.Array[String | AdTextAsset] => ResponsiveSearchAdBuilder,
    withMobileFinalUrl: String => ResponsiveSearchAdBuilder,
    withPath1: String => ResponsiveSearchAdBuilder,
    withPath2: String => ResponsiveSearchAdBuilder,
    withTrackingTemplate: String => ResponsiveSearchAdBuilder
  ): ResponsiveSearchAdBuilder = {
    val __obj = js.Dynamic.literal(addDescription = js.Any.fromFunction2(addDescription), addHeadline = js.Any.fromFunction2(addHeadline), build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescriptions = js.Any.fromFunction1(withDescriptions), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withFinalUrlSuffix = js.Any.fromFunction1(withFinalUrlSuffix), withHeadlines = js.Any.fromFunction1(withHeadlines), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withPath1 = js.Any.fromFunction1(withPath1), withPath2 = js.Any.fromFunction1(withPath2), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ResponsiveSearchAdBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsiveSearchAdBuilder] (val x: Self) extends AnyVal {
    
    inline def setAddDescription(value: (String, String) => ResponsiveSearchAdBuilder): Self = StObject.set(x, "addDescription", js.Any.fromFunction2(value))
    
    inline def setAddHeadline(value: (String, String) => ResponsiveSearchAdBuilder): Self = StObject.set(x, "addHeadline", js.Any.fromFunction2(value))
    
    inline def setWithCustomParameters(value: Record[String, String] => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithDescriptions(value: js.Array[String | AdTextAsset] => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withDescriptions", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrlSuffix(value: String => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setWithHeadlines(value: js.Array[String | AdTextAsset] => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withHeadlines", js.Any.fromFunction1(value))
    
    inline def setWithMobileFinalUrl(value: String => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithPath1(value: String => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withPath1", js.Any.fromFunction1(value))
    
    inline def setWithPath2(value: String => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withPath2", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => ResponsiveSearchAdBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
