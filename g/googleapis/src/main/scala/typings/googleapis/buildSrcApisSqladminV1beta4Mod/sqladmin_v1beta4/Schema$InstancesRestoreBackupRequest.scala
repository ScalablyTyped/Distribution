package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance restore backup request.
  */
@js.native
trait Schema$InstancesRestoreBackupRequest extends js.Object {
  /**
    * Parameters required to perform the restore backup operation.
    */
  var restoreBackupContext: js.UndefOr[Schema$RestoreBackupContext] = js.native
}

object Schema$InstancesRestoreBackupRequest {
  @scala.inline
  def apply(restoreBackupContext: Schema$RestoreBackupContext = null): Schema$InstancesRestoreBackupRequest = {
    val __obj = js.Dynamic.literal()
    if (restoreBackupContext != null) __obj.updateDynamic("restoreBackupContext")(restoreBackupContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesRestoreBackupRequest]
  }
}

