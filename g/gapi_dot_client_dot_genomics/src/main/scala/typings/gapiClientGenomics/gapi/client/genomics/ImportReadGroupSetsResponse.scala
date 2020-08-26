package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportReadGroupSetsResponse extends js.Object {
  /** IDs of the read group sets that were created. */
  var readGroupSetIds: js.UndefOr[js.Array[String]] = js.native
}

object ImportReadGroupSetsResponse {
  @scala.inline
  def apply(): ImportReadGroupSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportReadGroupSetsResponse]
  }
  @scala.inline
  implicit class ImportReadGroupSetsResponseOps[Self <: ImportReadGroupSetsResponse] (val x: Self) extends AnyVal {
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
    def setReadGroupSetIdsVarargs(value: String*): Self = this.set("readGroupSetIds", js.Array(value :_*))
    @scala.inline
    def setReadGroupSetIds(value: js.Array[String]): Self = this.set("readGroupSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadGroupSetIds: Self = this.set("readGroupSetIds", js.undefined)
  }
  
}

