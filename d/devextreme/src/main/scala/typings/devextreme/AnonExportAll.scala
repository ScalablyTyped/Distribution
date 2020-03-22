package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExportAll extends js.Object {
  var exportAll: js.UndefOr[String] = js.undefined
  var exportSelectedRows: js.UndefOr[String] = js.undefined
  var exportTo: js.UndefOr[String] = js.undefined
}

object AnonExportAll {
  @scala.inline
  def apply(exportAll: String = null, exportSelectedRows: String = null, exportTo: String = null): AnonExportAll = {
    val __obj = js.Dynamic.literal()
    if (exportAll != null) __obj.updateDynamic("exportAll")(exportAll.asInstanceOf[js.Any])
    if (exportSelectedRows != null) __obj.updateDynamic("exportSelectedRows")(exportSelectedRows.asInstanceOf[js.Any])
    if (exportTo != null) __obj.updateDynamic("exportTo")(exportTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExportAll]
  }
}

