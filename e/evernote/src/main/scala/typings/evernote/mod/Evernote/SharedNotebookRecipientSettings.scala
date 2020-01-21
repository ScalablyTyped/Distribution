package typings.evernote.mod.Evernote

import typings.evernote.AnonReminderNotifyEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings meant for the recipient of a shared notebook, such as
  * for indicating which types of notifications the recipient wishes
  * for reminders, etc.
  *
  * The reminderNotifyEmail and reminderNotifyInApp fields have a
  * 3-state read value but a 2-state write value.    On read, it is
  * possible to observe "unset", true, or false.    The initial state is
  * "unset".    When you choose to set a value, you may set it to either
  * true or false, but you cannot unset the value.    Once one of these
  * members has a true/false value, it will always have a true/false
  * value.
  *
  * <dl>
  * <dt>reminderNotifyEmail</dt>
  * <dd>Indicates that the user wishes to receive daily e-mail notifications
  *         for reminders associated with the shared notebook.    This may be
  *         true only for business notebooks that belong to the business of
  *         which the user is a member.    You may only set this value on a
  *         notebook in your business.</dd>
  * <dt>reminderNotifyInApp</dt>
  * <dd>Indicates that the user wishes to receive notifications for
  *         reminders by applications that support providing such
  *         notifications.    The exact nature of the notification is defined
  *         by the individual applications.</dd>
  * </dl>
  *
  */
@JSImport("evernote", "Evernote.SharedNotebookRecipientSettings")
@js.native
class SharedNotebookRecipientSettings () extends js.Object {
  def this(args: AnonReminderNotifyEmail) = this()
  var reminderNotifyEmail: Boolean = js.native
  var reminderNotifyInApp: Boolean = js.native
}

