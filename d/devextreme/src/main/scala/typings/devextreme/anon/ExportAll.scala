package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAll extends js.Object {
  var exportAll: js.UndefOr[String] = js.native
  var exportSelectedRows: js.UndefOr[String] = js.native
  var exportTo: js.UndefOr[String] = js.native
}

object ExportAll {
  @scala.inline
  def apply(): ExportAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportAll]
  }
  @scala.inline
  implicit class ExportAllOps[Self <: ExportAll] (val x: Self) extends AnyVal {
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
    def setExportAll(value: String): Self = this.set("exportAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportAll: Self = this.set("exportAll", js.undefined)
    @scala.inline
    def setExportSelectedRows(value: String): Self = this.set("exportSelectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportSelectedRows: Self = this.set("exportSelectedRows", js.undefined)
    @scala.inline
    def setExportTo(value: String): Self = this.set("exportTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportTo: Self = this.set("exportTo", js.undefined)
  }
  
}

