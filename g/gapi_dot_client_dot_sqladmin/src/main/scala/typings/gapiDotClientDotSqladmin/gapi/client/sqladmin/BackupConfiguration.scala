package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupConfiguration extends js.Object {
  /** Whether binary log is enabled. If backup configuration is disabled, binary log must be disabled as well. */
  var binaryLogEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether this configuration is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** This is always sql#backupConfiguration. */
  var kind: js.UndefOr[String] = js.undefined
  /** Start time for the daily backup configuration in UTC timezone in the 24 hour format - HH:MM. */
  var startTime: js.UndefOr[String] = js.undefined
}

object BackupConfiguration {
  @scala.inline
  def apply(
    binaryLogEnabled: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    startTime: String = null
  ): BackupConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binaryLogEnabled)) __obj.updateDynamic("binaryLogEnabled")(binaryLogEnabled)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[BackupConfiguration]
  }
}

