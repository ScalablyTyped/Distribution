package typings.firebase.firebaseMod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentChange extends js.Object {
  /** The document affected by this change. */
  val doc: QueryDocumentSnapshot
  /**
    * The index of the changed document in the result set immediately after
    * this `DocumentChange` (i.e. supposing that all prior `DocumentChange`
    * objects and the current `DocumentChange` object have been applied).
    * Is -1 for 'removed' events.
    */
  val newIndex: Double
  /**
    * The index of the changed document in the result set immediately prior to
    * this `DocumentChange` (i.e. supposing that all prior `DocumentChange` objects
    * have been applied). Is -1 for 'added' events.
    */
  val oldIndex: Double
  /** The type of change ('added', 'modified', or 'removed'). */
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

