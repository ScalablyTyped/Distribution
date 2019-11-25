package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookView extends js.Object {
  var activeTab: Double
  var firstSheet: Double
  var height: Double
  var visibility: String
  var width: Double
  var x: Double
  var y: Double
}

object WorkbookView {
  @scala.inline
  def apply(
    activeTab: Double,
    firstSheet: Double,
    height: Double,
    visibility: String,
    width: Double,
    x: Double,
    y: Double
  ): WorkbookView = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], firstSheet = firstSheet.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkbookView]
  }
}

