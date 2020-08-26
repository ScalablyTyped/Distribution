package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumn extends js.Object {
  var align: js.UndefOr[String] = js.native
  var cssClass: js.UndefOr[String] = js.native
  var decimalDigits: js.UndefOr[Double] = js.native
  var editField: js.UndefOr[String] = js.native
  var editor: js.UndefOr[js.Any] = js.native
  var events: js.UndefOr[js.Any] = js.native
  var field: js.UndefOr[String] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var filterable: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var headerCssClass: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var priority: js.UndefOr[Double] = js.native
  var renderer: js.UndefOr[js.Any] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var tmpl: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GridColumn {
  @scala.inline
  def apply(): GridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumn]
  }
  @scala.inline
  implicit class GridColumnOps[Self <: GridColumn] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDecimalDigits(value: Double): Self = this.set("decimalDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalDigits: Self = this.set("decimalDigits", js.undefined)
    @scala.inline
    def setEditField(value: String): Self = this.set("editField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditField: Self = this.set("editField", js.undefined)
    @scala.inline
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeaderCssClass(value: String): Self = this.set("headerCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCssClass: Self = this.set("headerCssClass", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTmpl(value: String): Self = this.set("tmpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmpl: Self = this.set("tmpl", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

