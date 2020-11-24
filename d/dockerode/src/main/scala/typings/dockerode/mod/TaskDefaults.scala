package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefaults extends js.Object {
  
  var LogDriver: js.UndefOr[Driver] = js.native
}
object TaskDefaults {
  
  @scala.inline
  def apply(): TaskDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefaults]
  }
  
  @scala.inline
  implicit class TaskDefaultsOps[Self <: TaskDefaults] (val x: Self) extends AnyVal {
    
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
    def setLogDriver(value: Driver): Self = this.set("LogDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogDriver: Self = this.set("LogDriver", js.undefined)
  }
}
