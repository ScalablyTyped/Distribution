package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Root object for fetching and creating asset objects. An asset can be an image, text, or video.
  * Assets are deduplicated within a given customer account, so assets may be shared between different ads.
  */
trait AdAssets extends StObject {
  
  /** Returns a selector for all assets in the account. */
  def assets(): AssetSelector
  
  /** Returns a builder to upload an image asset. */
  def newImageAssetBuilder(): ImageAssetBuilder
  
  /** Returns a builder to upload a media bundle asset. */
  def newMediaBundleAssetBuilder(): MediaBundleAssetBuilder
  
  /** Returns a builder to upload a YouTube video asset. */
  def newYouTubeVideoAssetBuilder(): YouTubeVideoAssetBuilder
}
object AdAssets {
  
  inline def apply(
    assets: () => AssetSelector,
    newImageAssetBuilder: () => ImageAssetBuilder,
    newMediaBundleAssetBuilder: () => MediaBundleAssetBuilder,
    newYouTubeVideoAssetBuilder: () => YouTubeVideoAssetBuilder
  ): AdAssets = {
    val __obj = js.Dynamic.literal(assets = js.Any.fromFunction0(assets), newImageAssetBuilder = js.Any.fromFunction0(newImageAssetBuilder), newMediaBundleAssetBuilder = js.Any.fromFunction0(newMediaBundleAssetBuilder), newYouTubeVideoAssetBuilder = js.Any.fromFunction0(newYouTubeVideoAssetBuilder))
    __obj.asInstanceOf[AdAssets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdAssets] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: () => AssetSelector): Self = StObject.set(x, "assets", js.Any.fromFunction0(value))
    
    inline def setNewImageAssetBuilder(value: () => ImageAssetBuilder): Self = StObject.set(x, "newImageAssetBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMediaBundleAssetBuilder(value: () => MediaBundleAssetBuilder): Self = StObject.set(x, "newMediaBundleAssetBuilder", js.Any.fromFunction0(value))
    
    inline def setNewYouTubeVideoAssetBuilder(value: () => YouTubeVideoAssetBuilder): Self = StObject.set(x, "newYouTubeVideoAssetBuilder", js.Any.fromFunction0(value))
  }
}
