package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builds new YouTube video assets.
  *
  * Typical usage:
  *
  *      var youTubeVideoId = "123ABCabc-_";
  *      var assetOperation = AdsApp.adAsset().newYouTubeVideoAssetBuilder()
  *         .withName("name")
  *         .withYouTubeVideoId(youTubeVideoId)
  *         .build();
  *      var videoAsset = assetOperation.getResult();
  */
trait YouTubeVideoAssetBuilder
  extends StObject
     with Builder[AssetOperation] {
  
  /** Sets new image asset's name to the specified value. */
  def withName(name: String): this.type
  
  /** Sets YouTube video ID. */
  def withYouTubeVideoId(youTubeVideoId: String): this.type
}
object YouTubeVideoAssetBuilder {
  
  inline def apply(
    build: () => AssetOperation,
    withName: String => YouTubeVideoAssetBuilder,
    withYouTubeVideoId: String => YouTubeVideoAssetBuilder
  ): YouTubeVideoAssetBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[YouTubeVideoAssetBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YouTubeVideoAssetBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithName(value: String => YouTubeVideoAssetBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
    
    inline def setWithYouTubeVideoId(value: String => YouTubeVideoAssetBuilder): Self = StObject.set(x, "withYouTubeVideoId", js.Any.fromFunction1(value))
  }
}
