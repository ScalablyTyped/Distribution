package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProperties extends js.Object {
  /** Width of a column. */
  var columnWidth: js.UndefOr[Dimension] = js.undefined
}

object TableColumnProperties {
  @scala.inline
  def apply(columnWidth: Dimension = null): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth)
    __obj.asInstanceOf[TableColumnProperties]
  }
}

