package typings.gapiDotClientDotVideointelligence.gapi.client.videointelligence

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotVideointelligence.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /**
    * Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    */
  def annotate(request: Anon_Accesstoken): Request[GoogleLongrunning_Operation]
}

object VideosResource {
  @scala.inline
  def apply(annotate: Anon_Accesstoken => Request[GoogleLongrunning_Operation]): VideosResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
  
    __obj.asInstanceOf[VideosResource]
  }
}

