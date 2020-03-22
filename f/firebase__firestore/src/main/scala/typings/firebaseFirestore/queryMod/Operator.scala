package typings.firebaseFirestore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "Operator")
@js.native
class Operator protected () extends js.Object {
  def this(name: String) = this()
  var name: String = js.native
  def isEqual(other: Operator): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/core/query", "Operator")
@js.native
object Operator extends js.Object {
  var ARRAY_CONTAINS: Operator = js.native
  var ARRAY_CONTAINS_ANY: Operator = js.native
  var EQUAL: Operator = js.native
  var GREATER_THAN: Operator = js.native
  var GREATER_THAN_OR_EQUAL: Operator = js.native
  var IN: Operator = js.native
  var LESS_THAN: Operator = js.native
  var LESS_THAN_OR_EQUAL: Operator = js.native
  def fromString(op: String): Operator = js.native
}

