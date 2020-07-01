package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetId extends js.Object {
  /** The ID of the file that this shortcut points to. */
  var targetId: js.UndefOr[String] = js.undefined
  /**
    * The MIME type of the file that this shortcut points to. The value of this field is a snapshot of the target's MIME type, captured when the shortcut is
    * created.
    */
  var targetMimeType: js.UndefOr[String] = js.undefined
}

object TargetId {
  @scala.inline
  def apply(targetId: String = null, targetMimeType: String = null): TargetId = {
    val __obj = js.Dynamic.literal()
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (targetMimeType != null) __obj.updateDynamic("targetMimeType")(targetMimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetId]
  }
}

