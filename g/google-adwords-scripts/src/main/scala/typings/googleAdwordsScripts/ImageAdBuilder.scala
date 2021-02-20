package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAdBuilder[ImageAd] extends AdBuilder[ImageAdBuilder[ImageAd]] {
  
  def withDisplayUrl(displayUrl: String): ImageAdBuilder[ImageAd] = js.native
  
  def withImage(image: Media): ImageAdBuilder[ImageAd] = js.native
  
  def withName(name: String): ImageAdBuilder[ImageAd] = js.native
}
object ImageAdBuilder {
  
  @scala.inline
  def apply[ImageAd](
    build: () => AdWordsOperation[ImageAdBuilder[ImageAd]],
    withCustomParameters: js.Object => ImageAdBuilder[ImageAd],
    withDisplayUrl: String => ImageAdBuilder[ImageAd],
    withFinalUrl: String => ImageAdBuilder[ImageAd],
    withImage: Media => ImageAdBuilder[ImageAd],
    withMobileFinalUrl: String => ImageAdBuilder[ImageAd],
    withName: String => ImageAdBuilder[ImageAd],
    withTrackingTemplate: String => ImageAdBuilder[ImageAd]
  ): ImageAdBuilder[ImageAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDisplayUrl = js.Any.fromFunction1(withDisplayUrl), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withImage = js.Any.fromFunction1(withImage), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[ImageAdBuilder[ImageAd]]
  }
  
  @scala.inline
  implicit class ImageAdBuilderMutableBuilder[Self <: ImageAdBuilder[_], ImageAd] (val x: Self with ImageAdBuilder[ImageAd]) extends AnyVal {
    
    @scala.inline
    def setWithDisplayUrl(value: String => ImageAdBuilder[ImageAd]): Self = StObject.set(x, "withDisplayUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithImage(value: Media => ImageAdBuilder[ImageAd]): Self = StObject.set(x, "withImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithName(value: String => ImageAdBuilder[ImageAd]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
