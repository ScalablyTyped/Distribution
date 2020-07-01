package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetGridRange extends js.Object {
  var endColumnIndex: Double
  var endRowIndex: Double
  var startColumnIndex: Double
  var startRowIndex: Double
}

object WorksheetGridRange {
  @scala.inline
  def apply(endColumnIndex: Double, endRowIndex: Double, startColumnIndex: Double, startRowIndex: Double): WorksheetGridRange = {
    val __obj = js.Dynamic.literal(endColumnIndex = endColumnIndex.asInstanceOf[js.Any], endRowIndex = endRowIndex.asInstanceOf[js.Any], startColumnIndex = startColumnIndex.asInstanceOf[js.Any], startRowIndex = startRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetGridRange]
  }
}

