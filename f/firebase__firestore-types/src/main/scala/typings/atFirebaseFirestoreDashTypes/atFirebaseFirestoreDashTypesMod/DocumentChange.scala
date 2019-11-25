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
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
}

