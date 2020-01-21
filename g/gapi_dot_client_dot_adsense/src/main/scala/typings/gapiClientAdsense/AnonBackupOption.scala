package typings.gapiClientAdsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackupOption extends js.Object {
  /** The backup option to be used in instances where no ad is available. */
  var backupOption: js.UndefOr[AnonColor] = js.undefined
  /** Size of this ad unit. */
  var size: js.UndefOr[String] = js.undefined
  /** Type of this ad unit. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonBackupOption {
  @scala.inline
  def apply(backupOption: AnonColor = null, size: String = null, `type`: String = null): AnonBackupOption = {
    val __obj = js.Dynamic.literal()
    if (backupOption != null) __obj.updateDynamic("backupOption")(backupOption.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackupOption]
  }
}

