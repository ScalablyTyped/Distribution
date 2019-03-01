package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePartitioning extends js.Object {
  /** [Optional] Number of milliseconds for which to keep the storage for a partition. */
  var expirationMs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Experimental] [Optional] If not set, the table is partitioned by pseudo column '_PARTITIONTIME'; if set, the table is partitioned by this field. The
    * field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Required] The only type supported is DAY, which will generate one partition per day. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TimePartitioning {
  @scala.inline
  def apply(
    expirationMs: java.lang.String = null,
    field: java.lang.String = null,
    `type`: java.lang.String = null
  ): TimePartitioning = {
    val __obj = js.Dynamic.literal()
    if (expirationMs != null) __obj.updateDynamic("expirationMs")(expirationMs)
    if (field != null) __obj.updateDynamic("field")(field)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimePartitioning]
  }
}

