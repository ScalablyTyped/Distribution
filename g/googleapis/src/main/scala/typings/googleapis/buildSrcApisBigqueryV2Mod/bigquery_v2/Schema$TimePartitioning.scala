package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TimePartitioning extends js.Object {
  /**
    * [Optional] Number of milliseconds for which to keep the storage for
    * partitions in the table. The storage in a partition will have an
    * expiration time of its partition time plus this value.
    */
  var expirationMs: js.UndefOr[String] = js.native
  /**
    * [Beta] [Optional] If not set, the table is partitioned by pseudo column,
    * referenced via either &#39;_PARTITIONTIME&#39; as TIMESTAMP type, or
    * &#39;_PARTITIONDATE&#39; as DATE type. If field is specified, the table
    * is instead partitioned by this field. The field must be a top-level
    * TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String] = js.native
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  /**
    * [Required] The only type supported is DAY, which will generate one
    * partition per day.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$TimePartitioning {
  @scala.inline
  def apply(
    expirationMs: String = null,
    field: String = null,
    requirePartitionFilter: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): Schema$TimePartitioning = {
    val __obj = js.Dynamic.literal()
    if (expirationMs != null) __obj.updateDynamic("expirationMs")(expirationMs.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(requirePartitionFilter)) __obj.updateDynamic("requirePartitionFilter")(requirePartitionFilter.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimePartitioning]
  }
}

