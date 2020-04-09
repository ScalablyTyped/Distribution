package typings.gettextParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTextTranslation extends js.Object {
  var comments: js.UndefOr[GetTextComment] = js.undefined
  var msgctxt: js.UndefOr[String] = js.undefined
  var msgid: String
  var msgid_plural: js.UndefOr[js.Any] = js.undefined
  var msgstr: js.Array[String]
}

object GetTextTranslation {
  @scala.inline
  def apply(
    msgid: String,
    msgstr: js.Array[String],
    comments: GetTextComment = null,
    msgctxt: String = null,
    msgid_plural: js.Any = null
  ): GetTextTranslation = {
    val __obj = js.Dynamic.literal(msgid = msgid.asInstanceOf[js.Any], msgstr = msgstr.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (msgctxt != null) __obj.updateDynamic("msgctxt")(msgctxt.asInstanceOf[js.Any])
    if (msgid_plural != null) __obj.updateDynamic("msgid_plural")(msgid_plural.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTextTranslation]
  }
}

