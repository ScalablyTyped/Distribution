package typings.exceljs.anon

import typings.exceljs.mod.WorksheetState
import typings.exceljs.mod.WorksheetView
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.AddWorksheetOptions> */
@js.native
trait PartialAddWorksheetOption extends js.Object {
  var headerFooter: js.UndefOr[PartialHeaderFooter] = js.native
  var pageSetup: js.UndefOr[PartialPageSetup] = js.native
  var properties: js.UndefOr[PartialWorksheetPropertie] = js.native
  var state: js.UndefOr[WorksheetState] = js.native
  var views: js.UndefOr[js.Array[Partial[WorksheetView]]] = js.native
}

object PartialAddWorksheetOption {
  @scala.inline
  def apply(): PartialAddWorksheetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddWorksheetOption]
  }
  @scala.inline
  implicit class PartialAddWorksheetOptionOps[Self <: PartialAddWorksheetOption] (val x: Self) extends AnyVal {
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
    def deleteHeaderFooter: Self = this.set("headerFooter", js.undefined)
    @scala.inline
    def setPageSetup(value: PartialPageSetup): Self = this.set("pageSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSetup: Self = this.set("pageSetup", js.undefined)
    @scala.inline
    def setProperties(value: PartialWorksheetPropertie): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setState(value: WorksheetState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setViewsVarargs(value: Partial[WorksheetView]*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[Partial[WorksheetView]]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

