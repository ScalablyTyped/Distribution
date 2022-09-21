package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for a media bundle under construction.
  *
  * Typical usage:
  *
  *  var mediaBundleUrl = "http://www.example.com/example.zip";
  *  var mediaBundleBlob = UrlFetchApp.fetch(mediaBundleUrl).getBlob();
  *  var mediaOperation = AdsApp.adMedia().newMediaBundleBuilder()
  *     .withName("name")
  *     .withData(mediaBundleBlob)
  *     .build();
  *
  *  var mediaBundle = mediaOperation.getResult();
  */
trait MediaBundleBuilder
  extends StObject
     with Builder[MediaOperation] {
  
  /** Sets new media bundle's data to the specified value. */
  def withData(data: Blob): this.type
  
  /** Sets new media bundle's name to the specified value. */
  def withName(name: String): this.type
}
object MediaBundleBuilder {
  
  inline def apply(
    build: () => MediaOperation,
    withData: Blob => MediaBundleBuilder,
    withName: String => MediaBundleBuilder
  ): MediaBundleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[MediaBundleBuilder]
  }
  
  extension [Self <: MediaBundleBuilder](x: Self) {
    
    inline def setWithData(value: Blob => MediaBundleBuilder): Self = StObject.set(x, "withData", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => MediaBundleBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
