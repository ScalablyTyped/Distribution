package typings.exceljs

import typings.exceljs.mod.WorksheetState
import typings.exceljs.mod.WorksheetView
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.AddWorksheetOptions> */
trait PartialAddWorksheetOption extends js.Object {
  var pageSetup: js.UndefOr[PartialPageSetup] = js.undefined
  var properties: js.UndefOr[PartialWorksheetPropertie] = js.undefined
  var state: js.UndefOr[WorksheetState] = js.undefined
  var views: js.UndefOr[js.Array[Partial[WorksheetView]]] = js.undefined
}

object PartialAddWorksheetOption {
  @scala.inline
  def apply(
    pageSetup: PartialPageSetup = null,
    properties: PartialWorksheetPropertie = null,
    state: WorksheetState = null,
    views: js.Array[Partial[WorksheetView]] = null
  ): PartialAddWorksheetOption = {
    val __obj = js.Dynamic.literal()
    if (pageSetup != null) __obj.updateDynamic("pageSetup")(pageSetup.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAddWorksheetOption]
  }
}

