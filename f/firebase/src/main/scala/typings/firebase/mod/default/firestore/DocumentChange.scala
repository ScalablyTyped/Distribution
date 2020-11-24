package typings.firebase.mod.default.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentChange[T] extends js.Object {
  
  /** The document affected by this change. */
  val doc: typings.firebase.mod.firebase.firestore.QueryDocumentSnapshot[T] = js.native
  
  /**
    * The index of the changed document in the result set immediately after
    * this `DocumentChange` (i.e. supposing that all prior `DocumentChange`
    * objects and the current `DocumentChange` object have been applied).
    * Is -1 for 'removed' events.
    */
  val newIndex: Double = js.native
  
  /**
    * The index of the changed document in the result set immediately prior to
    * this `DocumentChange` (i.e. supposing that all prior `DocumentChange` objects
    * have been applied). Is -1 for 'added' events.
    */
  val oldIndex: Double = js.native
  
  /** The type of change ('added', 'modified', or 'removed'). */
  val `type`: typings.firebase.mod.firebase.firestore.DocumentChangeType = js.native
}
object DocumentChange {
  
  @scala.inline
  def apply[T](
    doc: typings.firebase.mod.firebase.firestore.QueryDocumentSnapshot[T],
    newIndex: Double,
    oldIndex: Double,
    `type`: typings.firebase.mod.firebase.firestore.DocumentChangeType
  ): DocumentChange[T] = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange[T]]
  }
  
  @scala.inline
  implicit class DocumentChangeOps[Self <: DocumentChange[_], T] (val x: Self with DocumentChange[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDoc(value: typings.firebase.mod.firebase.firestore.QueryDocumentSnapshot[T]): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.firebase.mod.firebase.firestore.DocumentChangeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
