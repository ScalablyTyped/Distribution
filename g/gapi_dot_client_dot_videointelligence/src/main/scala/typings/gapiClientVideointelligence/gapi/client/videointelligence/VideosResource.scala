package typings.gapiClientVideointelligence.gapi.client.videointelligence

import typings.gapiClient.gapi.client.Request
import typings.gapiClientVideointelligence.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideosResource extends js.Object {
  /**
    * Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    */
  def annotate(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
}

object VideosResource {
  @scala.inline
  def apply(annotate: Accesstoken => Request[GoogleLongrunningOperation]): VideosResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
    __obj.asInstanceOf[VideosResource]
  }
  @scala.inline
  implicit class VideosResourceOps[Self <: VideosResource] (val x: Self) extends AnyVal {
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
    def setAnnotate(value: Accesstoken => Request[GoogleLongrunningOperation]): Self = this.set("annotate", js.Any.fromFunction1(value))
  }
  
}

