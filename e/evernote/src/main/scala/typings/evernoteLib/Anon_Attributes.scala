package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.NoteAttributes] = js.undefined
  var contentLength: js.UndefOr[scala.Double] = js.undefined
  var created: js.UndefOr[scala.Double] = js.undefined
  var deleted: js.UndefOr[scala.Double] = js.undefined
  var guid: java.lang.String
  var largestResourceMime: js.UndefOr[java.lang.String] = js.undefined
  var largestResourceSize: js.UndefOr[scala.Double] = js.undefined
  var notebookGuid: js.UndefOr[java.lang.String] = js.undefined
  var tagGuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
  var updated: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    guid: java.lang.String,
    attributes: evernoteLib.evernoteMod.EvernoteNs.NoteAttributes = null,
    contentLength: scala.Int | scala.Double = null,
    created: scala.Int | scala.Double = null,
    deleted: scala.Int | scala.Double = null,
    largestResourceMime: java.lang.String = null,
    largestResourceSize: scala.Int | scala.Double = null,
    notebookGuid: java.lang.String = null,
    tagGuids: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    updateSequenceNum: scala.Int | scala.Double = null,
    updated: scala.Int | scala.Double = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("guid")(guid)
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

