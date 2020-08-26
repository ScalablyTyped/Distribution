package typings.firebaseFirestoreTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChange[T] extends js.Object {
  val doc: QueryDocumentSnapshot[T] = js.native
  val newIndex: Double = js.native
  val oldIndex: Double = js.native
  val `type`: DocumentChangeType = js.native
}

object DocumentChange {
  @scala.inline
  def apply[T](doc: QueryDocumentSnapshot[T], newIndex: Double, oldIndex: Double, `type`: DocumentChangeType): DocumentChange[T] = {
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
    def setDoc(value: QueryDocumentSnapshot[T]): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DocumentChangeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

