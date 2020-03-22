package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.firebaseFirestoreStrings.F
import typings.firebaseFirestore.firebaseFirestoreStrings.L
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.F
  - typings.firebaseFirestore.firebaseFirestoreStrings.L
*/
trait LimitType extends js.Object

object LimitType {
  @scala.inline
  def First: F = this.cast("F")
  @scala.inline
  def Last: L = this.cast("L")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

