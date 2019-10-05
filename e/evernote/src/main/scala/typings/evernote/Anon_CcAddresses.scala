package typings.evernote

import typings.evernote.evernoteMod.Evernote.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CcAddresses extends js.Object {
  var ccAddresses: js.UndefOr[js.Array[String]] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[Note] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var toAddresses: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_CcAddresses {
  @scala.inline
  def apply(
    ccAddresses: js.Array[String] = null,
    guid: String = null,
    message: String = null,
    note: Note = null,
    subject: String = null,
    toAddresses: js.Array[String] = null
  ): Anon_CcAddresses = {
    val __obj = js.Dynamic.literal()
    if (ccAddresses != null) __obj.updateDynamic("ccAddresses")(ccAddresses)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (message != null) __obj.updateDynamic("message")(message)
    if (note != null) __obj.updateDynamic("note")(note)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (toAddresses != null) __obj.updateDynamic("toAddresses")(toAddresses)
    __obj.asInstanceOf[Anon_CcAddresses]
  }
}

