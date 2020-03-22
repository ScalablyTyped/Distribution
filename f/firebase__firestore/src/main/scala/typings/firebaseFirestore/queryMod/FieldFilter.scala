package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.modelFieldValueMod.FieldValue
import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "FieldFilter")
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
@JSImport("@firebase/firestore/dist/lib/src/core/query", "FieldFilter")
@js.native
object FieldFilter extends js.Object {
  /**
    * Creates a filter based on the provided arguments.
    */
  def create(field: FieldPath, op: Operator, value: FieldValue): FieldFilter = js.native
}

