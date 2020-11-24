package typings.epilogue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Controllers extends js.Object {
  
  var base: BaseController = js.native
  
  var create: CreateController = js.native
  
  var delete: DeleteController = js.native
  
  var list: ListController = js.native
  
  var read: ReadController = js.native
  
  var update: UpdateController = js.native
}
object Controllers {
  
  @scala.inline
  def apply(
    base: BaseController,
    create: CreateController,
    delete: DeleteController,
    list: ListController,
    read: ReadController,
    update: UpdateController
  ): Controllers = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controllers]
  }
  
  @scala.inline
  implicit class ControllersOps[Self <: Controllers] (val x: Self) extends AnyVal {
    
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
    def setBase(value: BaseController): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: CreateController): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: DeleteController): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: ListController): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: ReadController): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: UpdateController): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
