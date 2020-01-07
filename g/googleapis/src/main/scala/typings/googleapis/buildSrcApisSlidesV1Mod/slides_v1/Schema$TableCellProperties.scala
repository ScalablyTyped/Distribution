package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the TableCell.
  */
@js.native
trait Schema$TableCellProperties extends js.Object {
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[Schema$TableCellBackgroundFill] = js.native
}

object Schema$TableCellProperties {
  @scala.inline
  def apply(contentAlignment: String = null, tableCellBackgroundFill: Schema$TableCellBackgroundFill = null): Schema$TableCellProperties = {
    val __obj = js.Dynamic.literal()
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment.asInstanceOf[js.Any])
    if (tableCellBackgroundFill != null) __obj.updateDynamic("tableCellBackgroundFill")(tableCellBackgroundFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableCellProperties]
  }
}

