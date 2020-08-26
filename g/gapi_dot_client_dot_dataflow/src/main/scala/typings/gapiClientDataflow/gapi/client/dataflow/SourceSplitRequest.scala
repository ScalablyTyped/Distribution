package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSplitRequest extends js.Object {
  /** Hints for tuning the splitting process. */
  var options: js.UndefOr[SourceSplitOptions] = js.native
  /** Specification of the source to be split. */
  var source: js.UndefOr[Source] = js.native
}

object SourceSplitRequest {
  @scala.inline
  def apply(): SourceSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitRequest]
  }
  @scala.inline
  implicit class SourceSplitRequestOps[Self <: SourceSplitRequest] (val x: Self) extends AnyVal {
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
    def setOptions(value: SourceSplitOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

