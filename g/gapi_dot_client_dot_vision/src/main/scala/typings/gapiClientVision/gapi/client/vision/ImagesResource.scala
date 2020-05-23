package typings.gapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVision.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: Accesstoken): Request[BatchAnnotateImagesResponse]
}

object ImagesResource {
  @scala.inline
  def apply(annotate: Accesstoken => Request[BatchAnnotateImagesResponse]): ImagesResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
    __obj.asInstanceOf[ImagesResource]
  }
}

