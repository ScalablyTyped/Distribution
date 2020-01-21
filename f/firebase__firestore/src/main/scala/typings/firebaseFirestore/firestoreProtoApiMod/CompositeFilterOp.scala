package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED
  - typings.firebaseFirestore.firebaseFirestoreStrings.AND
*/
trait CompositeFilterOp extends js.Object

object CompositeFilterOp {
  @scala.inline
  def AND: typings.firebaseFirestore.firebaseFirestoreStrings.AND = this.cast("AND")
  @scala.inline
  def OPERATOR_UNSPECIFIED: typings.firebaseFirestore.firebaseFirestoreStrings.OPERATOR_UNSPECIFIED = this.cast("OPERATOR_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

