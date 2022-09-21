package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a responsive ad for Display
  *
  * Typical usage:
  *
  *      var image1 = ...
  *      var image2 = ...
  *      var image3 = ...
  *      var squareImage1 = ...
  *      var squareImage2 = ...
  *      var adOperation = adGroup.newAd().responsiveDisplayAdBuilder()
  *        .withHeadlines([
  *          "Headline 1", "Headline 2"
  *        ])
  *        .addHeadline("Headline 3")
  *        .withDescriptions([
  *          "Description 1", "Description 2"
  *        ])
  *        .addDescription("Description 3")
  *        .withMarketingImages([
  *          image1, image2
  *        ])
  *        .addMarketingImage(image3)
  *        .withSquareMarketingImages([
  *          squareImage1, squareImage2
  *        ])
  *        .withFinalUrl("http://www.example.com")
  *        .withBusinessName("Your Business")
  *        .build();
  *      var ad = adOperation.getResult();
  *
  * Note that it is only necessary to call AdOperation.getResult() if you need to access the actual ad for further processing
  * (for instance, one can attach a label to the newly created ad). Otherwise, calling build() on the builder is sufficient to ensure that the ad is created.
  */
@js.native
trait ResponsiveDisplayAdBuilder
  extends StObject
     with Builder[AdOperation] {
  
  /** Adds the provided description to the current list of descriptions. */
  def addDescription(description: String): this.type = js.native
  def addDescription(description: AdTextAsset): this.type = js.native
  
  /** Adds the provided headline to the current list of headlines. */
  def addHeadline(headline: String): this.type = js.native
  def addHeadline(headline: AdTextAsset): this.type = js.native
  
  /** Adds the provided landscape logo image to the current list of landscape logo images. */
  def addLandscapeLogoImage(image: Asset): this.type = js.native
  
  /** Adds the provided logo image to the current list of logo images. */
  def addLogoImage(image: Asset): this.type = js.native
  
  /** Adds the provided marketing image to the current list of marketing images. */
  def addMarketingImage(image: Asset): this.type = js.native
  
  /** Adds the provided square marketing image to the current list of square marketing images. */
  def addSquareMarketingImage(image: Asset): this.type = js.native
  
  /** Adds the provided video to the current list of YouTube videos. */
  def addYouTubeVideo(video: Asset): this.type = js.native
  
  /** Sets the new ad's business name to the specified value. */
  def withBusinessName(businessName: String): this.type = js.native
  
  /** Sets the custom parameters of the new ad to the specified value. */
  def withCustomParameters(customParameters: Record[String, String]): this.type = js.native
  
  /** Sets the new ad's descriptions to the specified value. */
  def withDescriptions(descriptions: js.Array[String | AdTextAsset]): this.type = js.native
  
  /** Sets the final URL of the new ad to the specified value. */
  def withFinalUrl(finalUrl: String): this.type = js.native
  
  /** Sets the final URL suffix of the new ad to the specified value. */
  def withFinalUrlSuffix(suffix: String): this.type = js.native
  
  /** Sets the list of the new ad's headlines to the specified value. */
  def withHeadlines(headlines: js.Array[String | AdTextAsset]): this.type = js.native
  
  /** Sets the new ad's landscape logo images to the specified value. */
  def withLandscapeLogoImages(images: js.Array[Asset]): this.type = js.native
  
  /** Sets the new ad's logo images to the specified value. */
  def withLogoImages(images: js.Array[Asset]): this.type = js.native
  
  /** Sets the new ad's long headline to the specified value. */
  def withLongHeadline(longHeadline: String): this.type = js.native
  
  /** Sets the new ad's marketing images to the specified value. */
  def withMarketingImages(images: js.Array[Asset]): this.type = js.native
  
  /** Sets the mobile final URL of the new ad to the specified value. */
  def withMobileFinalUrl(mobileFinalUrl: String): this.type = js.native
  
  /** Sets the new ad's square marketing images to the specified value. */
  def withSquareMarketingImages(images: js.Array[Asset]): this.type = js.native
  
  /** Sets the tracking template of the new ad to the specified value. */
  def withTrackingTemplate(trackingTemplate: String): this.type = js.native
  
  /** Sets the new ad's YouTube videos to the specified value. */
  def withYouTubeVideos(videos: js.Array[Asset]): this.type = js.native
}
