package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVariantsResponse extends js.Object {
  /** IDs of the call sets created during the import. */
  var callSetIds: js.UndefOr[js.Array[String]] = js.native
}

object ImportVariantsResponse {
  @scala.inline
  def apply(): ImportVariantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVariantsResponse]
  }
  @scala.inline
  implicit class ImportVariantsResponseOps[Self <: ImportVariantsResponse] (val x: Self) extends AnyVal {
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
    def setCallSetIdsVarargs(value: String*): Self = this.set("callSetIds", js.Array(value :_*))
    @scala.inline
    def setCallSetIds(value: js.Array[String]): Self = this.set("callSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallSetIds: Self = this.set("callSetIds", js.undefined)
  }
  
}

