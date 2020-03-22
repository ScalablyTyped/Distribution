package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.modelFieldValueMod.FieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "Bound")
@js.native
class Bound protected () extends js.Object {
  def this(position: js.Array[FieldValue], before: Boolean) = this()
  val before: Boolean = js.native
  val position: js.Array[FieldValue] = js.native
  def canonicalId(): String = js.native
  def isEqual(): Boolean = js.native
  def isEqual(other: Bound): Boolean = js.native
  /**
    * Returns true if a document sorts before a bound using the provided sort
    * order.
    */
  def sortsBeforeDocument(orderBy: js.Array[OrderBy], doc: Document): Boolean = js.native
}

