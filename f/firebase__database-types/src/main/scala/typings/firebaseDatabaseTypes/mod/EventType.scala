package typings.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value
  - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added
  - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed
  - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved
  - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def child_added: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added = this.cast("child_added")
  @scala.inline
  def child_changed: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed = this.cast("child_changed")
  @scala.inline
  def child_moved: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved = this.cast("child_moved")
  @scala.inline
  def child_removed: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed = this.cast("child_removed")
  @scala.inline
  def value: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value = this.cast("value")
}

