package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.added
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.removed
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.modified
*/
trait DocumentChangeType extends js.Object

object DocumentChangeType {
  @scala.inline
  def added: typings.googleCloudFirestore.googleCloudFirestoreStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def modified: typings.googleCloudFirestore.googleCloudFirestoreStrings.modified = this.cast("modified")
  @scala.inline
  def removed: typings.googleCloudFirestore.googleCloudFirestoreStrings.removed = this.cast("removed")
}

