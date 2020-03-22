package typings.firebaseFirestore.remoteWatchChangeMod

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`3`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`3`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`4`
*/
trait WatchTargetChangeState extends js.Object

object WatchTargetChangeState {
  @scala.inline
  def Added: `1` = this.cast(1)
  @scala.inline
  def Current: `3` = this.cast(3)
  @scala.inline
  def NoChange: `0` = this.cast(0)
  @scala.inline
  def Removed: `2` = this.cast(2)
  @scala.inline
  def Reset: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

