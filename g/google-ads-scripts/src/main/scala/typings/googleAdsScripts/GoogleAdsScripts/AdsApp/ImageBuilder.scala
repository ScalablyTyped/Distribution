package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for an image under construction.
  *
  * Typical usage:
  *
  *  var imageUrl = "http://www.example.com/example.png";
  *  var imageBlob = UrlFetchApp.fetch(imageUrl).getBlob();
  *  var mediaOperation = AdsApp.adMedia().newImageBuilder()
  *     .withName("name")
  *     .withData(imageBlob)
  *     .build();
  *  var image = mediaOperation.getResult();
  */
trait ImageBuilder
  extends StObject
     with Builder[MediaOperation] {
  
  /** Sets new image's data to the specified value. */
  def withData(data: Blob): this.type
  
  /** Sets new image's name to the specified value. */
  def withName(name: String): this.type
}
object ImageBuilder {
  
  inline def apply(build: () => MediaOperation, withData: Blob => ImageBuilder, withName: String => ImageBuilder): ImageBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ImageBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageBuilder] (val x: Self) extends AnyVal {
    
    inline def setWithData(value: Blob => ImageBuilder): Self = StObject.set(x, "withData", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => ImageBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
