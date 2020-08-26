package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePartitioning extends js.Object {
  /** [Optional] Number of milliseconds for which to keep the storage for a partition. */
  var expirationMs: js.UndefOr[String] = js.native
  /**
    * [Experimental] [Optional] If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is partitioned by this field. The
    * field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String] = js.native
  /** [Required] The only type supported is DAY, which will generate one partition per day. */
  var `type`: js.UndefOr[String] = js.native
}

object TimePartitioning {
  @scala.inline
  def apply(): TimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePartitioning]
  }
  @scala.inline
  implicit class TimePartitioningOps[Self <: TimePartitioning] (val x: Self) extends AnyVal {
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
    def setExpirationMs(value: String): Self = this.set("expirationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationMs: Self = this.set("expirationMs", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

