package typings.fastJsonPatch.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationResult[T] extends js.Object {
  
  var newDocument: T = js.native
  
  var removed: js.UndefOr[js.Any] = js.native
  
  var test: js.UndefOr[Boolean] = js.native
}
object OperationResult {
  
  @scala.inline
  def apply[T](newDocument: T): OperationResult[T] = {
    val __obj = js.Dynamic.literal(newDocument = newDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationResult[T]]
  }
  
  @scala.inline
  implicit class OperationResultOps[Self <: OperationResult[_], T] (val x: Self with OperationResult[T]) extends AnyVal {
    
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
    def setNewDocument(value: T): Self = this.set("newDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoved(value: js.Any): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
