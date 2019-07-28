package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotVision.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: Anon_Accesstoken): Request[BatchAnnotateImagesResponse]
}

object ImagesResource {
  @scala.inline
  def apply(annotate: Anon_Accesstoken => Request[BatchAnnotateImagesResponse]): ImagesResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

