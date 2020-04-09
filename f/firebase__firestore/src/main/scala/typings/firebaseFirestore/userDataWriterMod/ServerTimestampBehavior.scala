package typings.firebaseFirestore.userDataWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.estimate
  - typings.firebaseFirestore.firebaseFirestoreStrings.previous
  - typings.firebaseFirestore.firebaseFirestoreStrings.none
*/
trait ServerTimestampBehavior extends js.Object

object ServerTimestampBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def estimate: typings.firebaseFirestore.firebaseFirestoreStrings.estimate = this.cast("estimate")
  @scala.inline
  def none: typings.firebaseFirestore.firebaseFirestoreStrings.none = this.cast("none")
  @scala.inline
  def previous: typings.firebaseFirestore.firebaseFirestoreStrings.previous = this.cast("previous")
}

