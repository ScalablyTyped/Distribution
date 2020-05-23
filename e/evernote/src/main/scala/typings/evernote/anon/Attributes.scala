package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  var contentLength: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Timestamp] = js.undefined
  var deleted: js.UndefOr[Timestamp] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var largestResourceMime: js.UndefOr[String] = js.undefined
  var largestResourceSize: js.UndefOr[Double] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var tagGuids: js.UndefOr[js.Array[typings.evernote.mod.Types.Guid]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    attributes: NoteAttributes = null,
    contentLength: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Timestamp] = js.undefined,
    deleted: js.UndefOr[Timestamp] = js.undefined,
    guid: typings.evernote.mod.Types.Guid = null,
    largestResourceMime: String = null,
    largestResourceSize: js.UndefOr[Double] = js.undefined,
    notebookGuid: String = null,
    tagGuids: js.Array[typings.evernote.mod.Types.Guid] = null,
    title: String = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined,
    updated: js.UndefOr[Timestamp] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLength)) __obj.updateDynamic("contentLength")(contentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (largestResourceMime != null) __obj.updateDynamic("largestResourceMime")(largestResourceMime.asInstanceOf[js.Any])
    if (!js.isUndefined(largestResourceSize)) __obj.updateDynamic("largestResourceSize")(largestResourceSize.get.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

