package typings.evernote

import typings.evernote.evernoteMod.Evernote.NoteAttributes
import typings.evernote.evernoteMod.Evernote.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAttributes extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentHash: js.UndefOr[String] = js.undefined
  var contentLength: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var deleted: js.UndefOr[Double] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var notebookGuid: js.UndefOr[String] = js.undefined
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  var tagNames: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Double] = js.undefined
}

object Anon_ActiveAttributes {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attributes: NoteAttributes = null,
    content: String = null,
    contentHash: String = null,
    contentLength: Int | Double = null,
    created: Int | Double = null,
    deleted: Int | Double = null,
    guid: String = null,
    notebookGuid: String = null,
    resources: js.Array[Resource] = null,
    tagGuids: js.Array[String] = null,
    tagNames: js.Array[String] = null,
    title: String = null,
    updateSequenceNum: Int | Double = null,
    updated: Int | Double = null
  ): Anon_ActiveAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash)
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids)
    if (tagNames != null) __obj.updateDynamic("tagNames")(tagNames)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveAttributes]
  }
}

