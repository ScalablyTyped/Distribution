package typings.exceljs.mod

import typings.exceljs.anon.PartialHeaderFooter
import typings.exceljs.anon.PartialPageSetup
import typings.exceljs.anon.PartialWorksheetPropertie
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddWorksheetOptions extends js.Object {
  var headerFooter: PartialHeaderFooter
  var pageSetup: PartialPageSetup
  var properties: PartialWorksheetPropertie
  var state: WorksheetState
  var views: js.Array[Partial[WorksheetView]]
}

object AddWorksheetOptions {
  @scala.inline
  def apply(
    headerFooter: PartialHeaderFooter,
    pageSetup: PartialPageSetup,
    properties: PartialWorksheetPropertie,
    state: WorksheetState,
    views: js.Array[Partial[WorksheetView]]
  ): AddWorksheetOptions = {
    val __obj = js.Dynamic.literal(headerFooter = headerFooter.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWorksheetOptions]
  }
}

