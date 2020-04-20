package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageAdBuilder[ImageAd]
  extends AdWordsBuilder[ImageAdBuilder[ImageAd]]
     with hasFinalUrlBuilder[ImageAdBuilder[ImageAd]]
     with hasTrackingTemplateBuilder[ImageAdBuilder[ImageAd]] {
  def withDisplayUrl(displayUrl: String): ImageAdBuilder[ImageAd]
  def withImage(image: Media): ImageAdBuilder[ImageAd]
  def withName(name: String): ImageAdBuilder[ImageAd]
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
}

