package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

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
  def annotate(request: gapiDotClientDotVideointelligenceLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning_Operation]
}

object VideosResource {
  @scala.inline
  def apply(
    annotate: js.Function1[
      gapiDotClientDotVideointelligenceLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning_Operation]
    ]
  ): VideosResource = {
    val __obj = js.Dynamic.literal(annotate = annotate)
  
    __obj.asInstanceOf[VideosResource]
  }
}

