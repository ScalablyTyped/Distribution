package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.MODE_UNSPECIFIED
  - typings.firebaseFirestore.firebaseFirestoreStrings.ASCENDING
  - typings.firebaseFirestore.firebaseFirestoreStrings.DESCENDING
*/
trait IndexFieldMode extends js.Object

object IndexFieldMode {
  @scala.inline
  def ASCENDING: typings.firebaseFirestore.firebaseFirestoreStrings.ASCENDING = this.cast("ASCENDING")
  @scala.inline
  def DESCENDING: typings.firebaseFirestore.firebaseFirestoreStrings.DESCENDING = this.cast("DESCENDING")
  @scala.inline
  def MODE_UNSPECIFIED: typings.firebaseFirestore.firebaseFirestoreStrings.MODE_UNSPECIFIED = this.cast("MODE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

