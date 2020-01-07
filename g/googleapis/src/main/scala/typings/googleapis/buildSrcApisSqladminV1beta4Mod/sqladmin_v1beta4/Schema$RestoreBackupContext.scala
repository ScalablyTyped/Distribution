package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance restore from backup context.
  */
@js.native
trait Schema$RestoreBackupContext extends js.Object {
  /**
    * The ID of the backup run to restore from.
    */
  var backupRunId: js.UndefOr[String] = js.native
  /**
    * The ID of the instance that the backup was taken from.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * This is always sql#restoreBackupContext.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$RestoreBackupContext {
  @scala.inline
  def apply(backupRunId: String = null, instanceId: String = null, kind: String = null): Schema$RestoreBackupContext = {
    val __obj = js.Dynamic.literal()
    if (backupRunId != null) __obj.updateDynamic("backupRunId")(backupRunId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RestoreBackupContext]
  }
}

