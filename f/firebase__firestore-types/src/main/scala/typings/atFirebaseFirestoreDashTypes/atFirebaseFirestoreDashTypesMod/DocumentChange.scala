package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentChange extends js.Object {
  val doc: QueryDocumentSnapshot
  val newIndex: Double
  val oldIndex: Double
  val `type`: DocumentChangeType
}

object DocumentChange {
  @scala.inline
  def apply(doc: QueryDocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: DocumentChangeType): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc, newIndex = newIndex, oldIndex = oldIndex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentChange]
  }
}

