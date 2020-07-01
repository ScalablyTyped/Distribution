package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRangePartitioning extends js.Object {
  /**
    * [TrustedTester] [Required] The table is partitioned by this field. The
    * field must be a top-level NULLABLE/REQUIRED field. The only supported
    * type is INTEGER/INT64.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * [TrustedTester] [Required] Defines the ranges for range partitioning.
    */
  var range: js.UndefOr[End] = js.native
}

object SchemaRangePartitioning {
  @scala.inline
  def apply(field: String = null, range: End = null): SchemaRangePartitioning = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRangePartitioning]
  }
}

