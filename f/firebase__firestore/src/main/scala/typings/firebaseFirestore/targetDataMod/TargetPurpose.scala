package typings.firebaseFirestore.targetDataMod

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
*/
trait TargetPurpose extends js.Object

object TargetPurpose {
  /**
    * The query target was used to refill a query after an existence filter mismatch.
    */
  @scala.inline
  def ExistenceFilterMismatch: `1` = this.cast(1)
  /** The query target was used to resolve a limbo document. */
  @scala.inline
  def LimboResolution: `2` = this.cast(2)
  /** A regular, normal query target. */
  @scala.inline
  def Listen: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

