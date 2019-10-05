package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReminderEmailConfig extends js.Object

/**
  * An enumeration describing the configuration state related to receiving
  * reminder e-mails from the service.    Reminder e-mails summarize notes
  * based on their Note.attributes.reminderTime values.
  *
  * DO_NOT_SEND: The user has selected to not receive reminder e-mail.
  *
  * SEND_DAILY_EMAIL: The user has selected to receive reminder e-mail for those
  *     days when there is a reminder.
  */
@JSImport("evernote", "Evernote.ReminderEmailConfig")
@js.native
object ReminderEmailConfig extends js.Object {
  @js.native
  sealed trait DO_NOT_SEND extends ReminderEmailConfig
  
  @js.native
  sealed trait SEND_DAILY_EMAIL extends ReminderEmailConfig
  
  /* 1 */ val DO_NOT_SEND: typings.evernote.evernoteMod.Evernote.ReminderEmailConfig.DO_NOT_SEND with Double = js.native
  /* 2 */ val SEND_DAILY_EMAIL: typings.evernote.evernoteMod.Evernote.ReminderEmailConfig.SEND_DAILY_EMAIL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReminderEmailConfig with Double] = js.native
}

