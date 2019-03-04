package typings
package atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentChange extends js.Object {
  /** The document affected by this change. */
  val doc: QueryDocumentSnapshot
  /**
    * The index of the changed document in the result set immediately after
    * this DocumentChange (i.e. supposing that all prior DocumentChange
    * objects and the current DocumentChange object have been applied).
    * Is -1 for 'removed' events.
    */
  val newIndex: scala.Double
  /**
    * The index of the changed document in the result set immediately prior to
    * this DocumentChange (i.e. supposing that all prior DocumentChange objects
    * have been applied). Is -1 for 'added' events.
    */
  val oldIndex: scala.Double
  /** The type of change ('added', 'modified', or 'removed'). */
  val `type`: DocumentChangeType
}

object DocumentChange {
  @scala.inline
  def apply(
    doc: QueryDocumentSnapshot,
    newIndex: scala.Double,
    oldIndex: scala.Double,
    `type`: DocumentChangeType
  ): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc, newIndex = newIndex, oldIndex = oldIndex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentChange]
  }
}

