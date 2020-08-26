package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The depth of the group, representing how many groups have a range that
    * wholly contains the range of this group.
    */
  var depth: js.UndefOr[Double] = js.native
  /** The range over which this group exists. */
  var range: js.UndefOr[DimensionRange] = js.native
}

object DimensionGroup {
  @scala.inline
  def apply(): DimensionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionGroup]
  }
  @scala.inline
  implicit class DimensionGroupOps[Self <: DimensionGroup] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setRange(value: DimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

