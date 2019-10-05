package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillObject extends js.Object {
  /** Pass the data range to autofill
    */
  var dataRange: js.UndefOr[String] = js.undefined
  /** Pass the direction to autofill
    */
  var direction: js.UndefOr[String] = js.undefined
  /** Pass the fill range to autofill
    */
  var fillRange: js.UndefOr[String] = js.undefined
  /** Pass the fill type to perform autofill in spreadsheet
    */
  var fillType: js.UndefOr[String] = js.undefined
}

object AutoFillObject {
  @scala.inline
  def apply(
    dataRange: String = null,
    direction: String = null,
    fillRange: String = null,
    fillType: String = null
  ): AutoFillObject = {
    val __obj = js.Dynamic.literal()
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (fillRange != null) __obj.updateDynamic("fillRange")(fillRange)
    if (fillType != null) __obj.updateDynamic("fillType")(fillType)
    __obj.asInstanceOf[AutoFillObject]
  }
}

