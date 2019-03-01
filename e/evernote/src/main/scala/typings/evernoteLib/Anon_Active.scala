package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var alternateData: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.Data] = js.undefined
  var attributes: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.ResourceAttributes] = js.undefined
  var data: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.Data] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var noteGuid: js.UndefOr[java.lang.String] = js.undefined
  var recognition: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.Data] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alternateData: evernoteLib.evernoteMod.EvernoteNs.Data = null,
    attributes: evernoteLib.evernoteMod.EvernoteNs.ResourceAttributes = null,
    data: evernoteLib.evernoteMod.EvernoteNs.Data = null,
    duration: scala.Int | scala.Double = null,
    guid: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    mime: java.lang.String = null,
    noteGuid: java.lang.String = null,
    recognition: evernoteLib.evernoteMod.EvernoteNs.Data = null,
    updateSequenceNum: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (alternateData != null) __obj.updateDynamic("alternateData")(alternateData)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (data != null) __obj.updateDynamic("data")(data)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid)
    if (recognition != null) __obj.updateDynamic("recognition")(recognition)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

