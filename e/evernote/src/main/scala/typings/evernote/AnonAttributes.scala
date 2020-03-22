package typings.evernote

import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  var contentLength: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Timestamp] = js.undefined
  var deleted: js.UndefOr[Timestamp] = js.undefined
  var guid: js.UndefOr[Guid] = js.undefined
  var largestResourceMime: js.UndefOr[String] = js.undefined
  var largestResourceSize: js.UndefOr[Double] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var tagGuids: js.UndefOr[js.Array[Guid]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(
    attributes: NoteAttributes = null,
    contentLength: Int | Double = null,
    created: Int | Double = null,
    deleted: Int | Double = null,
    guid: Guid = null,
    largestResourceMime: String = null,
    largestResourceSize: Int | Double = null,
    notebookGuid: String = null,
    tagGuids: js.Array[Guid] = null,
    title: String = null,
    updateSequenceNum: Int | Double = null,
    updated: Int | Double = null
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (largestResourceMime != null) __obj.updateDynamic("largestResourceMime")(largestResourceMime.asInstanceOf[js.Any])
    if (largestResourceSize != null) __obj.updateDynamic("largestResourceSize")(largestResourceSize.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

