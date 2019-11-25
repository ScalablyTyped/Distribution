package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderOptions extends js.Object {
  /** Pass the color to set border of the cell
    */
  var color: js.UndefOr[String] = js.undefined
  /** Pass the style to set border of the cell
    */
  var style: js.UndefOr[String] = js.undefined
  /** Pass the type to set border of the cell
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BorderOptions {
  @scala.inline
  def apply(color: String = null, style: String = null, `type`: String = null): BorderOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderOptions]
  }
}

