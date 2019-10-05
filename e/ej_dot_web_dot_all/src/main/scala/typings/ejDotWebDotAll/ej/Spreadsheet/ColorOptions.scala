package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorOptions extends js.Object {
  /** Pass the background color to sort the cell
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Pass the color to sort the cell
    */
  var color: js.UndefOr[String] = js.undefined
}

object ColorOptions {
  @scala.inline
  def apply(backgroundColor: String = null, color: String = null): ColorOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ColorOptions]
  }
}

