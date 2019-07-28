package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookView extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var firstSheet: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object WorkbookView {
  @scala.inline
  def apply(
    activeTab: Int | Double = null,
    firstSheet: Int | Double = null,
    height: Int | Double = null,
    visibility: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): WorkbookView = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (firstSheet != null) __obj.updateDynamic("firstSheet")(firstSheet.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookView]
  }
}

