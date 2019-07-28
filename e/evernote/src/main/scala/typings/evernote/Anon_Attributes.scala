package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.NoteAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  var contentLength: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var deleted: js.UndefOr[Double] = js.undefined
  var guid: String
  var largestResourceMime: js.UndefOr[String] = js.undefined
  var largestResourceSize: js.UndefOr[Double] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Double] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    guid: String,
    attributes: NoteAttributes = null,
    contentLength: Int | Double = null,
    created: Int | Double = null,
    deleted: Int | Double = null,
    largestResourceMime: String = null,
    largestResourceSize: Int | Double = null,
    notebookGuid: String = null,
    tagGuids: js.Array[String] = null,
    title: String = null,
    updateSequenceNum: Int | Double = null,
    updated: Int | Double = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(guid = guid)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (largestResourceMime != null) __obj.updateDynamic("largestResourceMime")(largestResourceMime)
    if (largestResourceSize != null) __obj.updateDynamic("largestResourceSize")(largestResourceSize.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid)
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes]
  }
}

