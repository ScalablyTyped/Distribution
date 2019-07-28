package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddWorksheetOptions extends js.Object {
  var pageSetup: js.UndefOr[PageSetup] = js.undefined
  var properties: js.UndefOr[WorksheetProperties] = js.undefined
  var views: js.UndefOr[js.Array[WorksheetView]] = js.undefined
}

object AddWorksheetOptions {
  @scala.inline
  def apply(
    pageSetup: PageSetup = null,
    properties: WorksheetProperties = null,
    views: js.Array[WorksheetView] = null
  ): AddWorksheetOptions = {
    val __obj = js.Dynamic.literal()
    if (pageSetup != null) __obj.updateDynamic("pageSetup")(pageSetup)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[AddWorksheetOptions]
  }
}

