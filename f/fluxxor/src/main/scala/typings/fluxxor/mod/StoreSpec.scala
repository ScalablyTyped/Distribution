package typings.fluxxor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSpec extends js.Object {
  
  var actions: js.UndefOr[js.Any] = js.native
  
  var initialize: js.UndefOr[
    js.Function2[/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object], Unit]
  ] = js.native
}
object StoreSpec {
  
  @scala.inline
  def apply(): StoreSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreSpec]
  }
  
  @scala.inline
  implicit class StoreSpecOps[Self <: StoreSpec] (val x: Self) extends AnyVal {
    
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
    def setActions(value: js.Any): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setInitialize(value: (/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
  }
}
