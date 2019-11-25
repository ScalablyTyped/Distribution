package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesExportRequest extends js.Object {
  /** Contains details about the export operation. */
  var exportContext: js.UndefOr[ExportContext] = js.undefined
}

object InstancesExportRequest {
  @scala.inline
  def apply(exportContext: ExportContext = null): InstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    if (exportContext != null) __obj.updateDynamic("exportContext")(exportContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesExportRequest]
  }
}

