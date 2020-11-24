package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElement[T] extends js.Object {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var changes: js.UndefOr[js.Array[_]] = js.native
  
  var component: js.UndefOr[T] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var promise: js.UndefOr[typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.native
}
object ComponentElement {
  
  @scala.inline
  def apply[T](): ComponentElement[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentElement[T]]
  }
  
  @scala.inline
  implicit class ComponentElementOps[Self <: ComponentElement[_], T] (val x: Self with ComponentElement[T]) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setChangesVarargs(value: js.Any*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[_]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    
    @scala.inline
    def setComponent(value: T): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setPromise(value: typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
  }
}
