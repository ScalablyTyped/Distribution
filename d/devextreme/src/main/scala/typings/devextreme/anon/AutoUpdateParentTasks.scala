package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoUpdateParentTasks extends js.Object {
  
  var autoUpdateParentTasks: js.UndefOr[Boolean] = js.native
  
  var validateDependencies: js.UndefOr[Boolean] = js.native
}
object AutoUpdateParentTasks {
  
  @scala.inline
  def apply(): AutoUpdateParentTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoUpdateParentTasks]
  }
  
  @scala.inline
  implicit class AutoUpdateParentTasksOps[Self <: AutoUpdateParentTasks] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdateParentTasks(value: Boolean): Self = this.set("autoUpdateParentTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateParentTasks: Self = this.set("autoUpdateParentTasks", js.undefined)
    
    @scala.inline
    def setValidateDependencies(value: Boolean): Self = this.set("validateDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateDependencies: Self = this.set("validateDependencies", js.undefined)
  }
}
