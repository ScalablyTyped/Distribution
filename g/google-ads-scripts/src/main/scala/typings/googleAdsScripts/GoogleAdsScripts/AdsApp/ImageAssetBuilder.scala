package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builds new image assets.
  *
  * Typical usage:
  *
  *      var imageUrl = "http://www.example.com/example.png";
  *      var imageBlob = UrlFetchApp.fetch(imageUrl).getBlob();
  *      var assetOperation = AdsApp.adAsset().newImageAssetBuilder()
  *         .withName("name")
  *         .withData(imageBlob)
  *         .build();
  *      var imageAsset = assetOperation.getResult();
  *
  * Note that it is only necessary to call `AssetOperation.getResult()` if you need to access the new asset item for further processing.
  * Otherwise calling `ImageAssetBuilder.build()` is sufficient to ensure that the asset is created.
  */
trait ImageAssetBuilder
  extends StObject
     with Builder[AssetOperation] {
  
  /** Sets new image asset's data to the specified value. */
  def withData(data: Blob): this.type
  
  /** Sets new image asset's name to the specified value. */
  def withName(name: String): this.type
}
object ImageAssetBuilder {
  
  inline def apply(
    build: () => AssetOperation,
    withData: Blob => ImageAssetBuilder,
    withName: String => ImageAssetBuilder
  ): ImageAssetBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ImageAssetBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAssetBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithData(value: Blob => ImageAssetBuilder): Self = StObject.set(x, "withData", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => ImageAssetBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
