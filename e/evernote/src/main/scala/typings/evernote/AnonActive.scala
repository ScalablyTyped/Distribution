package typings.evernote

import typings.evernote.mod.Evernote.Data
import typings.evernote.mod.Evernote.ResourceAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var alternateData: js.UndefOr[Data] = js.undefined
  var attributes: js.UndefOr[ResourceAttributes] = js.undefined
  var data: js.UndefOr[Data] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var noteGuid: js.UndefOr[String] = js.undefined
  var recognition: js.UndefOr[Data] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    alternateData: Data = null,
    attributes: ResourceAttributes = null,
    data: Data = null,
    duration: Int | Double = null,
    guid: String = null,
    height: Int | Double = null,
    mime: String = null,
    noteGuid: String = null,
    recognition: Data = null,
    updateSequenceNum: Int | Double = null,
    width: Int | Double = null
  ): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (alternateData != null) __obj.updateDynamic("alternateData")(alternateData.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid.asInstanceOf[js.Any])
    if (recognition != null) __obj.updateDynamic("recognition")(recognition.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

