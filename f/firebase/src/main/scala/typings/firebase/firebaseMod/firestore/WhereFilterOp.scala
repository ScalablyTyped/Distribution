package typings.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.`<`
  - typings.firebase.firebaseStrings.`<=`
  - typings.firebase.firebaseStrings.`==`
  - typings.firebase.firebaseStrings.`>=`
  - typings.firebase.firebaseStrings.`>`
  - typings.firebase.firebaseStrings.`array-contains`
  - typings.firebase.firebaseStrings.in
  - typings.firebase.firebaseStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def `<`: typings.firebase.firebaseStrings.`<` = this.cast("<")
  @scala.inline
  def `<=`: typings.firebase.firebaseStrings.`<=` = this.cast("<=")
  @scala.inline
  def `==`: typings.firebase.firebaseStrings.`==` = this.cast("==")
  @scala.inline
  def `>`: typings.firebase.firebaseStrings.`>` = this.cast(">")
  @scala.inline
  def `>=`: typings.firebase.firebaseStrings.`>=` = this.cast(">=")
  @scala.inline
  def `array-contains`: typings.firebase.firebaseStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typings.firebase.firebaseStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typings.firebase.firebaseStrings.in = this.cast("in")
}

