package typings.evernote.anon

import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.NoteLimits
import typings.evernote.mod.Types.NoteRestrictions
import typings.evernote.mod.Types.Resource
import typings.evernote.mod.Types.SharedNote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.UndefOr[NoteAttributes] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentHash: js.UndefOr[String] = js.undefined
  var contentLength: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var deleted: js.UndefOr[Double] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var limits: js.UndefOr[NoteLimits] = js.undefined
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  var restrictions: js.UndefOr[NoteRestrictions] = js.undefined
  var sharedNotes: js.UndefOr[js.Array[SharedNote]] = js.undefined
  var tagGuids: js.UndefOr[js.Array[String]] = js.undefined
  var tagNames: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Double] = js.undefined
}

object Active {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attributes: NoteAttributes = null,
    content: String = null,
    contentHash: String = null,
    contentLength: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Double] = js.undefined,
    deleted: js.UndefOr[Double] = js.undefined,
    guid: typings.evernote.mod.Types.Guid = null,
    limits: NoteLimits = null,
    notebookGuid: typings.evernote.mod.Types.Guid = null,
    resources: js.Array[Resource] = null,
    restrictions: NoteRestrictions = null,
    sharedNotes: js.Array[SharedNote] = null,
    tagGuids: js.Array[String] = null,
    tagNames: js.Array[String] = null,
    title: String = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined,
    updated: js.UndefOr[Double] = js.undefined
  ): Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentHash != null) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (!js.isUndefined(contentLength)) __obj.updateDynamic("contentLength")(contentLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (sharedNotes != null) __obj.updateDynamic("sharedNotes")(sharedNotes.asInstanceOf[js.Any])
    if (tagGuids != null) __obj.updateDynamic("tagGuids")(tagGuids.asInstanceOf[js.Any])
    if (tagNames != null) __obj.updateDynamic("tagNames")(tagNames.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

