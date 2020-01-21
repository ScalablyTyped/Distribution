package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.DIRECTION_UNSPECIFIED
  - typings.firebaseFirestore.firebaseFirestoreStrings.ASCENDING
  - typings.firebaseFirestore.firebaseFirestoreStrings.DESCENDING
*/
trait OrderDirection extends js.Object

object OrderDirection {
  @scala.inline
  def ASCENDING: typings.firebaseFirestore.firebaseFirestoreStrings.ASCENDING = this.cast("ASCENDING")
  @scala.inline
  def DESCENDING: typings.firebaseFirestore.firebaseFirestoreStrings.DESCENDING = this.cast("DESCENDING")
  @scala.inline
  def DIRECTION_UNSPECIFIED: typings.firebaseFirestore.firebaseFirestoreStrings.DIRECTION_UNSPECIFIED = this.cast("DIRECTION_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

