package typings.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupOption extends js.Object {
  /** The backup option to be used in instances where no ad is available. */
  var backupOption: js.UndefOr[Color] = js.undefined
  /** Size of this ad unit. Size values are in the form SIZE_{width}_{height}. */
  var size: js.UndefOr[String] = js.undefined
  /** Type of this ad unit. Possible values are TEXT, TEXT_IMAGE, IMAGE and LINK. */
  var `type`: js.UndefOr[String] = js.undefined
}

object BackupOption {
  @scala.inline
  def apply(backupOption: Color = null, size: String = null, `type`: String = null): BackupOption = {
    val __obj = js.Dynamic.literal()
    if (backupOption != null) __obj.updateDynamic("backupOption")(backupOption.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupOption]
  }
}

