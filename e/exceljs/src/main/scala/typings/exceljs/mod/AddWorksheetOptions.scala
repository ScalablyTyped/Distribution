package typings.exceljs.mod

import typings.exceljs.anon.PartialHeaderFooter
import typings.exceljs.anon.PartialPageSetup
import typings.exceljs.anon.PartialWorksheetPropertie
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddWorksheetOptions extends js.Object {
  var headerFooter: PartialHeaderFooter = js.native
  var pageSetup: PartialPageSetup = js.native
  var properties: PartialWorksheetPropertie = js.native
  var state: WorksheetState = js.native
  var views: js.Array[Partial[WorksheetView]] = js.native
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
  @scala.inline
  implicit class AddWorksheetOptionsOps[Self <: AddWorksheetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaderFooter(value: PartialHeaderFooter): Self = this.set("headerFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSetup(value: PartialPageSetup): Self = this.set("pageSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: PartialWorksheetPropertie): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: WorksheetState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewsVarargs(value: Partial[WorksheetView]*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[Partial[WorksheetView]]): Self = this.set("views", value.asInstanceOf[js.Any])
  }
  
}

