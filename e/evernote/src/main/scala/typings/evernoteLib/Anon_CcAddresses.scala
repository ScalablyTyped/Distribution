package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CcAddresses extends js.Object {
  var ccAddresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.Note] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var toAddresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_CcAddresses {
  @scala.inline
  def apply(
    ccAddresses: js.Array[java.lang.String] = null,
    guid: java.lang.String = null,
    message: java.lang.String = null,
    note: evernoteLib.evernoteMod.EvernoteNs.Note = null,
    subject: java.lang.String = null,
    toAddresses: js.Array[java.lang.String] = null
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

