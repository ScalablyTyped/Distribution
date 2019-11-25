package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionGroup extends js.Object {
  /**
    * This field is true if this group is collapsed. A collapsed group remains
    * collapsed if an overlapping group at a shallower depth is expanded.
    *
    * A true value does not imply that all dimensions within the group are
    * hidden, since a dimension's visibility can change independently from this
    * group property. However, when this property is updated, all dimensions
    * within it are set to hidden if this field is true, or set to visible if
    * this field is false.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * The depth of the group, representing how many groups have a range that
    * wholly contains the range of this group.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /** The range over which this group exists. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}

object DimensionGroup {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    range: DimensionRange = null
  ): DimensionGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionGroup]
  }
}

