package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Lessthansign
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.LessthansignEqualssign
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.EqualssignEqualssign
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.GreaterthansignEqualssign
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Greaterthansign
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains`
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.in
  - typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def EqualssignEqualssign: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def Greaterthansign: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def `array-contains`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typings.firebaseFirestoreTypes.firebaseFirestoreTypesStrings.in = this.cast("in")
}

