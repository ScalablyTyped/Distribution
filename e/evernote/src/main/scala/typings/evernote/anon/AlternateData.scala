package typings.evernote.anon

import typings.evernote.mod.Types.Data
import typings.evernote.mod.Types.ResourceAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlternateData extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var alternateData: js.UndefOr[Data] = js.undefined
  var attributes: js.UndefOr[ResourceAttributes] = js.undefined
  var data: js.UndefOr[Data] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var noteguid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var recognition: js.UndefOr[Data] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AlternateData {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    alternateData: Data = null,
    attributes: ResourceAttributes = null,
    data: Data = null,
    duration: js.UndefOr[Double] = js.undefined,
    guid: typings.evernote.mod.Types.Guid = null,
    height: js.UndefOr[Double] = js.undefined,
    mime: String = null,
    noteguid: typings.evernote.mod.Types.Guid = null,
    recognition: Data = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AlternateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (alternateData != null) __obj.updateDynamic("alternateData")(alternateData.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (noteguid != null) __obj.updateDynamic("noteguid")(noteguid.asInstanceOf[js.Any])
    if (recognition != null) __obj.updateDynamic("recognition")(recognition.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateData]
  }
}

