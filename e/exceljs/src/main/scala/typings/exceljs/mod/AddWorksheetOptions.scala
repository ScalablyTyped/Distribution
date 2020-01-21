package typings.exceljs.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddWorksheetOptions extends js.Object {
  var pageSetup: Partial[PageSetup]
  var properties: Partial[WorksheetProperties]
  var state: WorksheetState
  var views: js.Array[Partial[WorksheetView]]
}

object AddWorksheetOptions {
  @scala.inline
  def apply(
    pageSetup: Partial[PageSetup],
    properties: Partial[WorksheetProperties],
    state: WorksheetState,
    views: js.Array[Partial[WorksheetView]]
  ): AddWorksheetOptions = {
    val __obj = js.Dynamic.literal(pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddWorksheetOptions]
  }
}

