package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateAnnotationsResponse extends js.Object {
  /**
    * The resulting per-annotation entries, ordered consistently with the
    * original request.
    */
  var entries: js.UndefOr[js.Array[Entry]] = js.native
}

object BatchCreateAnnotationsResponse {
  @scala.inline
  def apply(): BatchCreateAnnotationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAnnotationsResponse]
  }
  @scala.inline
  implicit class BatchCreateAnnotationsResponseOps[Self <: BatchCreateAnnotationsResponse] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: Entry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[Entry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

