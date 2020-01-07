package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sorts data in rows based on a sort order per column.
  */
@js.native
trait Schema$SortRangeRequest extends js.Object {
  /**
    * The range to sort.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[Schema$SortSpec]] = js.native
}

object Schema$SortRangeRequest {
  @scala.inline
  def apply(range: Schema$GridRange = null, sortSpecs: js.Array[Schema$SortSpec] = null): Schema$SortRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SortRangeRequest]
  }
}

