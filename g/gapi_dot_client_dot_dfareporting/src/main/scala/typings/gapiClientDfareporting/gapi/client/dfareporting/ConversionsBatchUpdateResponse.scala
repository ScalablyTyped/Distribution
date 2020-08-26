package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversionsBatchUpdateResponse extends js.Object {
  /** Indicates that some or all conversions failed to update. */
  var hasFailures: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#conversionsBatchUpdateResponse". */
  var kind: js.UndefOr[String] = js.native
  /** The update status of each conversion. Statuses are returned in the same order that conversions are updated. */
  var status: js.UndefOr[js.Array[ConversionStatus]] = js.native
}

object ConversionsBatchUpdateResponse {
  @scala.inline
  def apply(): ConversionsBatchUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionsBatchUpdateResponse]
  }
  @scala.inline
  implicit class ConversionsBatchUpdateResponseOps[Self <: ConversionsBatchUpdateResponse] (val x: Self) extends AnyVal {
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
    def setHasFailures(value: Boolean): Self = this.set("hasFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasFailures: Self = this.set("hasFailures", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStatusVarargs(value: ConversionStatus*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: js.Array[ConversionStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

