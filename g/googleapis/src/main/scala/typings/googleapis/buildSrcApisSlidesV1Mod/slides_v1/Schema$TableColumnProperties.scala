package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of each column in a table.
  */
@js.native
trait Schema$TableColumnProperties extends js.Object {
  /**
    * Width of a column.
    */
  var columnWidth: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$TableColumnProperties {
  @scala.inline
  def apply(columnWidth: Schema$Dimension = null): Schema$TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableColumnProperties]
  }
}

