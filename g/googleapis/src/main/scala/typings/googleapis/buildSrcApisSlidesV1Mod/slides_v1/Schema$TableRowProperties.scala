package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of each row in a table.
  */
@js.native
trait Schema$TableRowProperties extends js.Object {
  /**
    * Minimum height of the row. The row will be rendered in the Slides editor
    * at a height equal to or greater than this value in order to show all the
    * text in the row&#39;s cell(s).
    */
  var minRowHeight: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$TableRowProperties {
  @scala.inline
  def apply(minRowHeight: Schema$Dimension = null): Schema$TableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableRowProperties]
  }
}

