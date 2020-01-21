package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.STATE_UNSPECIFIED
  - typings.firebaseFirestore.firebaseFirestoreStrings.CREATING
  - typings.firebaseFirestore.firebaseFirestoreStrings.READY
  - typings.firebaseFirestore.firebaseFirestoreStrings.ERROR
*/
trait IndexState extends js.Object

object IndexState {
  @scala.inline
  def CREATING: typings.firebaseFirestore.firebaseFirestoreStrings.CREATING = this.cast("CREATING")
  @scala.inline
  def ERROR: typings.firebaseFirestore.firebaseFirestoreStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def READY: typings.firebaseFirestore.firebaseFirestoreStrings.READY = this.cast("READY")
  @scala.inline
  def STATE_UNSPECIFIED: typings.firebaseFirestore.firebaseFirestoreStrings.STATE_UNSPECIFIED = this.cast("STATE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

