package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for an image ad under construction.
  *
  * Typical usage:
  *
  *      var adOperation = adGroup.newAd().imageAdBuilder()
  *        .withName("Ad name")
  *        .withImage(image)
  *        .withDisplayUrl("http://www.example.com")
  *        .withFinalUrl("http://www.example.com")
  *        .build();
  *      var ad = adOperation.getResult();
  */
trait ImageAdBuilder
  extends StObject
     with Builder[AdOperation] {
  
  /** Sets the custom parameters of the new ad to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type
  
  /** Sets the display URL of the new ad to the specified value. */
  def withDisplayUrl(displayUrl: String): this.type
  
  /** Sets the final URL of the new ad to the specified value. */
  def withFinalUrl(finalUrl: String): this.type
  
  /** Sets the final URL suffix of the new ad to the specified value. */
  def withFinalUrlSuffix(suffix: String): this.type
  
  /** Sets new ad's image. */
  def withImage(image: Media): this.type
  
  /** Sets the mobile final URL of the new ad to the specified value. */
  def withMobileFinalUrl(mobileFinalUrl: String): this.type
  
  /** Sets new ad's name to the specified value. */
  def withName(name: String): this.type
  
  /** Sets the tracking template of the new ad to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type
}
object ImageAdBuilder {
  
  inline def apply(
    build: () => AdOperation,
    withCustomParameters: Record[String, String] => ImageAdBuilder,
    withDisplayUrl: String => ImageAdBuilder,
    withFinalUrl: String => ImageAdBuilder,
    withFinalUrlSuffix: String => ImageAdBuilder,
    withImage: Media => ImageAdBuilder,
    withMobileFinalUrl: String => ImageAdBuilder,
    withName: String => ImageAdBuilder,
    withTrackingTemplate: String => ImageAdBuilder
  ): ImageAdBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withFinalUrlSuffix = js.Any.fromFunction1(withFinalUrlSuffix), withImage = js.Any.fromFunction1(withImage), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ImageAdBuilder]
  }
  
  extension [Self <: ImageAdBuilder](x: Self) {
    
    inline def setWithCustomParameters(value: Record[String, String] => ImageAdBuilder): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithDisplayUrl(value: String => ImageAdBuilder): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrl(value: String => ImageAdBuilder): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithFinalUrlSuffix(value: String => ImageAdBuilder): Self = StObject.set(x, "withFinalUrlSuffix", js.Any.fromFunction1(value))
    
    inline def setWithImage(value: Media => ImageAdBuilder): Self = StObject.set(x, "withImage", js.Any.fromFunction1(value))
    
    inline def setWithMobileFinalUrl(value: String => ImageAdBuilder): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => ImageAdBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => ImageAdBuilder): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
