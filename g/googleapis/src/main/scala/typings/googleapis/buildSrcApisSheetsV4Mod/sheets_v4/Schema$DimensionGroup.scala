package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group over an interval of rows or columns on a sheet, which can contain
  * or be contained within other groups. A group can be collapsed or expanded
  * as a unit on the sheet.
  */
@js.native
trait Schema$DimensionGroup extends js.Object {
  /**
    * This field is true if this group is collapsed. A collapsed group remains
    * collapsed if an overlapping group at a shallower depth is expanded.  A
    * true value does not imply that all dimensions within the group are
    * hidden, since a dimension&#39;s visibility can change independently from
    * this group property. However, when this property is updated, all
    * dimensions within it are set to hidden if this field is true, or set to
    * visible if this field is false.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The depth of the group, representing how many groups have a range that
    * wholly contains the range of this group.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * The range over which this group exists.
    */
  var range: js.UndefOr[Schema$DimensionRange] = js.native
}

object Schema$DimensionGroup {
  @scala.inline
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    range: Schema$DimensionRange = null
  ): Schema$DimensionGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DimensionGroup]
  }
}

