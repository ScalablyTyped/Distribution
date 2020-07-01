package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetDimensionBounds extends js.Object {
  var endIndex: Double
  var startIndex: Double
}

object WorksheetDimensionBounds {
  @scala.inline
  def apply(endIndex: Double, startIndex: Double): WorksheetDimensionBounds = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetDimensionBounds]
  }
}

