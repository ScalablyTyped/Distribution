package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A table range represents a reference to a subset of a table.  It&#39;s
  * important to note that the cells specified by a table range do not
  * necessarily form a rectangle. For example, let&#39;s say we have a 3 x 3
  * table where all the cells of the last row are merged together. The table
  * looks like this:                      [             ]  A table range with
  * location = (0, 0), row span = 3 and column span = 2 specifies the following
  * cells:        x     x       [ x    x    x ]
  */
@js.native
trait Schema$TableRange extends js.Object {
  /**
    * The column span of the table range.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The starting location of the table range.
    */
  var location: js.UndefOr[Schema$TableCellLocation] = js.native
  /**
    * The row span of the table range.
    */
  var rowSpan: js.UndefOr[Double] = js.native
}

object Schema$TableRange {
  @scala.inline
  def apply(
    columnSpan: Int | Double = null,
    location: Schema$TableCellLocation = null,
    rowSpan: Int | Double = null
  ): Schema$TableRange = {
    val __obj = js.Dynamic.literal()
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableRange]
  }
}

