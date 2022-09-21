package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builds new media bundle assets.
  *
  * Typical usage:
  *
  *      var assetBundleUrl = "http://www.example.com/example.zip";
  *      var assetBundleBlob = UrlFetchApp.fetch(assetBundleUrl).getBlob();
  *      var assetOperation = AdsApp.adAsset().newMediaBundleAssetBuilder()
  *         .withName("name")
  *         .withData(assetBundleBlob)
  *         .build();
  *      var bundleAsset = assetOperation.getResult();
  */
trait MediaBundleAssetBuilder
  extends StObject
     with Builder[AssetOperation] {
  
  /** Sets new image asset's data to the specified value. */
  def withData(data: Blob): this.type
  
  /** Sets new image asset's name to the specified value. */
  def withName(name: String): this.type
}
object MediaBundleAssetBuilder {
  
  inline def apply(
    build: () => AssetOperation,
    withData: Blob => MediaBundleAssetBuilder,
    withName: String => MediaBundleAssetBuilder
  ): MediaBundleAssetBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[MediaBundleAssetBuilder]
  }
  
  extension [Self <: MediaBundleAssetBuilder](x: Self) {
    
    inline def setWithData(value: Blob => MediaBundleAssetBuilder): Self = StObject.set(x, "withData", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => MediaBundleAssetBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
