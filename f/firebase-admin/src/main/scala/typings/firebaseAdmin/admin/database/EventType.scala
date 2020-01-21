package typings.firebaseAdmin.admin.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.firebaseAdminStrings.value
  - typings.firebaseAdmin.firebaseAdminStrings.child_added
  - typings.firebaseAdmin.firebaseAdminStrings.child_changed
  - typings.firebaseAdmin.firebaseAdminStrings.child_moved
  - typings.firebaseAdmin.firebaseAdminStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typings.firebaseAdmin.firebaseAdminStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typings.firebaseAdmin.firebaseAdminStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typings.firebaseAdmin.firebaseAdminStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typings.firebaseAdmin.firebaseAdminStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typings.firebaseAdmin.firebaseAdminStrings.value = this.cast("value")
}

