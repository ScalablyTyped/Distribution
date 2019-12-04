package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateUnderscoreSyncerMod

import typings.atFirebaseFirestore.atFirebaseFirestoreStrings.current_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.`not-current`
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.current_
  - typings.atFirebaseFirestore.atFirebaseFirestoreStrings.rejected
*/
trait QueryTargetState extends js.Object

object QueryTargetState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current: current_ = this.cast("current")
  @scala.inline
  def `not-current`: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.`not-current` = this.cast("not-current")
  @scala.inline
  def rejected: typings.atFirebaseFirestore.atFirebaseFirestoreStrings.rejected = this.cast("rejected")
}

