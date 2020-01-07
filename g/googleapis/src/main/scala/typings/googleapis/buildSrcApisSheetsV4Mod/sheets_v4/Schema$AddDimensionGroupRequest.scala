package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a group over the specified range.  If the requested range is a
  * superset of the range of an existing group G, then the depth of G is
  * incremented and this new group G&#39; has the depth of that group. For
  * example, a group [C:D, depth 1] + [B:E] results in groups [B:E, depth 1]
  * and [C:D, depth 2]. If the requested range is a subset of the range of an
  * existing group G, then the depth of the new group G&#39; becomes one
  * greater than the depth of G. For example, a group [B:E, depth 1] + [C:D]
  * results in groups [B:E, depth 1] and [C:D, depth 2]. If the requested range
  * starts before and ends within, or starts within and ends after, the range
  * of an existing group G, then the range of the existing group G becomes the
  * union of the ranges, and the new group G&#39; has depth one greater than
  * the depth of G and range as the intersection of the ranges. For example, a
  * group [B:D, depth 1] + [C:E] results in groups [B:E, depth 1] and [C:D,
  * depth 2].
  */
@js.native
trait Schema$AddDimensionGroupRequest extends js.Object {
  /**
    * The range over which to create a group.
    */
  var range: js.UndefOr[Schema$DimensionRange] = js.native
}

object Schema$AddDimensionGroupRequest {
  @scala.inline
  def apply(range: Schema$DimensionRange = null): Schema$AddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddDimensionGroupRequest]
  }
}

