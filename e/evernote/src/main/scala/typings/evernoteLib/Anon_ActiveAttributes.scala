package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAttributes extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var attributes: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.NoteAttributes] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var contentHash: js.UndefOr[java.lang.String] = js.undefined
  var contentLength: js.UndefOr[scala.Double] = js.undefined
  var created: js.UndefOr[scala.Double] = js.undefined
  var deleted: js.UndefOr[scala.Double] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var notebookGuid: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[js.Array[evernoteLib.evernoteMod.EvernoteNs.Resource]] = js.undefined
  var tagGuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tagNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
  var updated: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ActiveAttributes {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    attributes: evernoteLib.evernoteMod.EvernoteNs.NoteAttributes = null,
    content: java.lang.String = null,
    contentHash: java.lang.String = null,
    contentLength: scala.Int | scala.Double = null,
    created: scala.Int | scala.Double = null,
    deleted: scala.Int | scala.Double = null,
    guid: java.lang.String = null,
    notebookGuid: java.lang.String = null,
    resources: js.Array[evernoteLib.evernoteMod.EvernoteNs.Resource] = null,
    tagGuids: js.Array[java.lang.String] = null,
    tagNames: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    updateSequenceNum: scala.Int | scala.Double = null,
    updated: scala.Int | scala.Double = null
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

