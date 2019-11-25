package typings.firebaseDashAdmin.admin.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseDashAdmin.firebaseDashAdminStrings.value
  - typings.firebaseDashAdmin.firebaseDashAdminStrings.child_added
  - typings.firebaseDashAdmin.firebaseDashAdminStrings.child_changed
  - typings.firebaseDashAdmin.firebaseDashAdminStrings.child_moved
  - typings.firebaseDashAdmin.firebaseDashAdminStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typings.firebaseDashAdmin.firebaseDashAdminStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typings.firebaseDashAdmin.firebaseDashAdminStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typings.firebaseDashAdmin.firebaseDashAdminStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typings.firebaseDashAdmin.firebaseDashAdminStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typings.firebaseDashAdmin.firebaseDashAdminStrings.value = this.cast("value")
}

