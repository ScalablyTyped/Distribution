package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.added
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.removed
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.removed = this.cast("removed")
}

