package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a table row.
  */
@js.native
trait Schema$TableRowStyle extends js.Object {
  /**
    * The minimum height of the row. The row will be rendered in the Docs
    * editor at a height equal to or greater than this value in order to show
    * all the content in the row&#39;s cells.
    */
  var minRowHeight: js.UndefOr[Schema$Dimension] = js.native
}

object Schema$TableRowStyle {
  @scala.inline
  def apply(minRowHeight: Schema$Dimension = null): Schema$TableRowStyle = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableRowStyle]
  }
}

