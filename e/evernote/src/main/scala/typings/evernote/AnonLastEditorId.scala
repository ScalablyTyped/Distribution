package typings.evernote

import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastEditorId extends js.Object {
  var lastEditorId: js.UndefOr[UserID] = js.undefined
  var saved: js.UndefOr[Timestamp] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object AnonLastEditorId {
  @scala.inline
  def apply(
    lastEditorId: Int | Double = null,
    saved: Int | Double = null,
    title: String = null,
    updateSequenceNum: Int | Double = null,
    updated: Int | Double = null
  ): AnonLastEditorId = {
    val __obj = js.Dynamic.literal()
    if (lastEditorId != null) __obj.updateDynamic("lastEditorId")(lastEditorId.asInstanceOf[js.Any])
    if (saved != null) __obj.updateDynamic("saved")(saved.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastEditorId]
  }
}

