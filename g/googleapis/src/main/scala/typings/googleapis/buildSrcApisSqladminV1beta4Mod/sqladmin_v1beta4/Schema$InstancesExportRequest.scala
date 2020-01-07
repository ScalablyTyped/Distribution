package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance export request.
  */
@js.native
trait Schema$InstancesExportRequest extends js.Object {
  /**
    * Contains details about the export operation.
    */
  var exportContext: js.UndefOr[Schema$ExportContext] = js.native
}

object Schema$InstancesExportRequest {
  @scala.inline
  def apply(exportContext: Schema$ExportContext = null): Schema$InstancesExportRequest = {
    val __obj = js.Dynamic.literal()
    if (exportContext != null) __obj.updateDynamic("exportContext")(exportContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesExportRequest]
  }
}

