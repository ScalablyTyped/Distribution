package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAnnotateImagesRequest extends js.Object {
  /** Individual image annotation requests for this batch. */
  var requests: js.UndefOr[js.Array[AnnotateImageRequest]] = js.native
}

object BatchAnnotateImagesRequest {
  @scala.inline
  def apply(): BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateImagesRequest]
  }
  @scala.inline
  implicit class BatchAnnotateImagesRequestOps[Self <: BatchAnnotateImagesRequest] (val x: Self) extends AnyVal {
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
    def setRequestsVarargs(value: AnnotateImageRequest*): Self = this.set("requests", js.Array(value :_*))
    @scala.inline
    def setRequests(value: js.Array[AnnotateImageRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
  
}

