package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
import typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
import typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
import typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
import typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
import typings.firebaseFirestore.firebaseFirestoreStrings.in_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.Lessthansign
  - typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignEqualssign
  - typings.firebaseFirestore.firebaseFirestoreStrings.EqualssignEqualssign
  - typings.firebaseFirestore.firebaseFirestoreStrings.Greaterthansign
  - typings.firebaseFirestore.firebaseFirestoreStrings.GreaterthansignEqualssign
  - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains`
  - typings.firebaseFirestore.firebaseFirestoreStrings.in_
  - typings.firebaseFirestore.firebaseFirestoreStrings.`array-contains-any`
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def ARRAY_CONTAINS: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def ARRAY_CONTAINS_ANY: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  @scala.inline
  def EQUAL: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  @scala.inline
  def GREATER_THAN: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GREATER_THAN_OR_EQUAL: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def IN: in_ = "in".asInstanceOf[in_]
  @scala.inline
  def LESS_THAN: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LESS_THAN_OR_EQUAL: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
}

