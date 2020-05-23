package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CcAddresses extends js.Object {
  var ccAddresses: js.UndefOr[js.Array[String]] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[typings.evernote.mod.Types.Note] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var toAddresses: js.UndefOr[js.Array[String]] = js.undefined
}

object CcAddresses {
  @scala.inline
  def apply(
    ccAddresses: js.Array[String] = null,
    guid: String = null,
    message: String = null,
    note: typings.evernote.mod.Types.Note = null,
    subject: String = null,
    toAddresses: js.Array[String] = null
  ): CcAddresses = {
    val __obj = js.Dynamic.literal()
    if (ccAddresses != null) __obj.updateDynamic("ccAddresses")(ccAddresses.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (toAddresses != null) __obj.updateDynamic("toAddresses")(toAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcAddresses]
  }
}

