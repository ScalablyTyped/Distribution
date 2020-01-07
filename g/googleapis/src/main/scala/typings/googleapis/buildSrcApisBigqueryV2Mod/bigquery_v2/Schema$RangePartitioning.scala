package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RangePartitioning extends js.Object {
  /**
    * [TrustedTester] [Required] The table is partitioned by this field. The
    * field must be a top-level NULLABLE/REQUIRED field. The only supported
    * type is INTEGER/INT64.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * [TrustedTester] [Required] Defines the ranges for range partitioning.
    */
  var range: js.UndefOr[Anon_End] = js.native
}

object Schema$RangePartitioning {
  @scala.inline
  def apply(field: String = null, range: Anon_End = null): Schema$RangePartitioning = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RangePartitioning]
  }
}

