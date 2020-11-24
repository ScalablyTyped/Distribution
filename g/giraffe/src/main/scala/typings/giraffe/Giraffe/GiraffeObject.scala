package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GiraffeObject extends js.Object {
  
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var app: App = js.native
  
  var appEvents: js.UndefOr[StringMap] = js.native
  
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var dataEvents: js.UndefOr[StringMap] = js.native
  
  var defaultOptions: js.UndefOr[DefaultOptions] = js.native
  
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var initialize: js.UndefOr[js.Function0[js.Any]] = js.native
}
object GiraffeObject {
  
  @scala.inline
  def apply(app: App): GiraffeObject = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiraffeObject]
  }
  
  @scala.inline
  implicit class GiraffeObjectOps[Self <: GiraffeObject] (val x: Self) extends AnyVal {
    
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
    def setApp(value: App): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDispose(value: () => js.Any): Self = this.set("afterDispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterDispose: Self = this.set("afterDispose", js.undefined)
    
    @scala.inline
    def setAfterInitialize(value: () => js.Any): Self = this.set("afterInitialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterInitialize: Self = this.set("afterInitialize", js.undefined)
    
    @scala.inline
    def setAppEvents(value: StringMap): Self = this.set("appEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEvents: Self = this.set("appEvents", js.undefined)
    
    @scala.inline
    def setBeforeDispose(value: () => js.Any): Self = this.set("beforeDispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeDispose: Self = this.set("beforeDispose", js.undefined)
    
    @scala.inline
    def setBeforeInitialize(value: () => js.Any): Self = this.set("beforeInitialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeInitialize: Self = this.set("beforeInitialize", js.undefined)
    
    @scala.inline
    def setDataEvents(value: StringMap): Self = this.set("dataEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataEvents: Self = this.set("dataEvents", js.undefined)
    
    @scala.inline
    def setDefaultOptions(value: DefaultOptions): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
    
    @scala.inline
    def setDispose(value: () => js.Any): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    
    @scala.inline
    def setInitialize(value: () => js.Any): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
  }
}
