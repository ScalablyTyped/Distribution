package typings.firebase.firebaseMod.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.value
  - typings.firebase.firebaseStrings.child_added
  - typings.firebase.firebaseStrings.child_changed
  - typings.firebase.firebaseStrings.child_moved
  - typings.firebase.firebaseStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typings.firebase.firebaseStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typings.firebase.firebaseStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typings.firebase.firebaseStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typings.firebase.firebaseStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typings.firebase.firebaseStrings.value = this.cast("value")
}

