package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  todoId :number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait todoIdnumberundefinedSudo extends js.Object {
  
  var sudo: js.UndefOr[String | Double] = js.native
  
  var todoId: js.UndefOr[Double] = js.native
}
object todoIdnumberundefinedSudo {
  
  @scala.inline
  def apply(): todoIdnumberundefinedSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[todoIdnumberundefinedSudo]
  }
  
  @scala.inline
  implicit class todoIdnumberundefinedSudoOps[Self <: todoIdnumberundefinedSudo] (val x: Self) extends AnyVal {
    
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
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
    
    @scala.inline
    def setTodoId(value: Double): Self = this.set("todoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodoId: Self = this.set("todoId", js.undefined)
  }
}
