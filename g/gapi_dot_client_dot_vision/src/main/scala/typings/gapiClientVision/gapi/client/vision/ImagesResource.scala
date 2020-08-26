package typings.gapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVision.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: Accesstoken): Request[BatchAnnotateImagesResponse] = js.native
}

object ImagesResource {
  @scala.inline
  def apply(annotate: Accesstoken => Request[BatchAnnotateImagesResponse]): ImagesResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
    __obj.asInstanceOf[ImagesResource]
  }
  @scala.inline
  implicit class ImagesResourceOps[Self <: ImagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotate(value: Accesstoken => Request[BatchAnnotateImagesResponse]): Self = this.set("annotate", js.Any.fromFunction1(value))
  }
  
}

