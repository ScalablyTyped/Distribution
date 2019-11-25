package typings.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.added
  - typings.firebase.firebaseStrings.removed
  - typings.firebase.firebaseStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typings.firebase.firebaseStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typings.firebase.firebaseStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typings.firebase.firebaseStrings.removed = this.cast("removed")
}

