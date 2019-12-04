package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.STATE_UNSPECIFIED
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.CREATING
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.READY
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.ERROR
*/
trait IndexState extends js.Object

object IndexState {
  @scala.inline
  def CREATING: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.CREATING = this.cast("CREATING")
  @scala.inline
  def ERROR: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def READY: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.READY = this.cast("READY")
  @scala.inline
  def STATE_UNSPECIFIED: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.STATE_UNSPECIFIED = this.cast("STATE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

