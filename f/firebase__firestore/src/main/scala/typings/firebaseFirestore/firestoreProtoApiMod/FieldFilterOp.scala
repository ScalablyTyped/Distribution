package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typings.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN
  - typings.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN_OR_EQUAL
  - typings.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN
  - typings.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN_OR_EQUAL
  - typings.firebaseFirestore.firebaseFirestoreStrings.EQUAL
  - typings.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS
  - typings.firebaseFirestore.firebaseFirestoreStrings.IN
  - typings.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS_ANY
*/
trait FieldFilterOp extends js.Object

object FieldFilterOp {
  @scala.inline
  def ARRAY_CONTAINS: typings.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS = this.cast("ARRAY_CONTAINS")
  @scala.inline
  def ARRAY_CONTAINS_ANY: typings.firebaseFirestore.firebaseFirestoreStrings.ARRAY_CONTAINS_ANY = this.cast("ARRAY_CONTAINS_ANY")
  @scala.inline
  def EQUAL: typings.firebaseFirestore.firebaseFirestoreStrings.EQUAL = this.cast("EQUAL")
  @scala.inline
  def GREATER_THAN: typings.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN = this.cast("GREATER_THAN")
  @scala.inline
  def GREATER_THAN_OR_EQUAL: typings.firebaseFirestore.firebaseFirestoreStrings.GREATER_THAN_OR_EQUAL = this.cast("GREATER_THAN_OR_EQUAL")
  @scala.inline
  def IN: typings.firebaseFirestore.firebaseFirestoreStrings.IN = this.cast("IN")
  @scala.inline
  def LESS_THAN: typings.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN = this.cast("LESS_THAN")
  @scala.inline
  def LESS_THAN_OR_EQUAL: typings.firebaseFirestore.firebaseFirestoreStrings.LESS_THAN_OR_EQUAL = this.cast("LESS_THAN_OR_EQUAL")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typings.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

