package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastEditorId extends js.Object {
  var lastEditorId: js.UndefOr[UserID] = js.undefined
  var saved: js.UndefOr[Timestamp] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object LastEditorId {
  @scala.inline
  def apply(
    lastEditorId: js.UndefOr[UserID] = js.undefined,
    saved: js.UndefOr[Timestamp] = js.undefined,
    title: String = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined,
    updated: js.UndefOr[Timestamp] = js.undefined
  ): LastEditorId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastEditorId)) __obj.updateDynamic("lastEditorId")(lastEditorId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saved)) __obj.updateDynamic("saved")(saved.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastEditorId]
  }
}

