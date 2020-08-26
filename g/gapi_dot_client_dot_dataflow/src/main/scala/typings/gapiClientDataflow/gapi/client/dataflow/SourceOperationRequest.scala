package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceOperationRequest extends js.Object {
  /** Information about a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataRequest] = js.native
  /** Information about a request to split a source. */
  var split: js.UndefOr[SourceSplitRequest] = js.native
}

object SourceOperationRequest {
  @scala.inline
  def apply(): SourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOperationRequest]
  }
  @scala.inline
  implicit class SourceOperationRequestOps[Self <: SourceOperationRequest] (val x: Self) extends AnyVal {
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
    def setGetMetadata(value: SourceGetMetadataRequest): Self = this.set("getMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetMetadata: Self = this.set("getMetadata", js.undefined)
    @scala.inline
    def setSplit(value: SourceSplitRequest): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
  
}

