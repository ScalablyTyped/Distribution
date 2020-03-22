package typings.firebaseFirestore.coreQueryMod

import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.srcModelFieldValueMod.FieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/query", "FieldFilter")
@js.native
class FieldFilter protected () extends Filter {
  protected def this(field: FieldPath, op: Operator, value: FieldValue) = this()
  var field: FieldPath = js.native
  var op: Operator = js.native
  var value: FieldValue = js.native
  def isInequality(): Boolean = js.native
  /* protected */ def matchesComparison(comparison: Double): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/core/query", "FieldFilter")
@js.native
object FieldFilter extends js.Object {
  /**
    * Creates a filter based on the provided arguments.
    */
  def create(field: FieldPath, op: Operator, value: FieldValue): FieldFilter = js.native
}

