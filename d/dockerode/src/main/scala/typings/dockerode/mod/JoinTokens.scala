package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinTokens extends js.Object {
  
  var Manager: String = js.native
  
  var Worker: String = js.native
}
object JoinTokens {
  
  @scala.inline
  def apply(Manager: String, Worker: String): JoinTokens = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any], Worker = Worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinTokens]
  }
  
  @scala.inline
  implicit class JoinTokensOps[Self <: JoinTokens] (val x: Self) extends AnyVal {
    
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
    def setManager(value: String): Self = this.set("Manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorker(value: String): Self = this.set("Worker", value.asInstanceOf[js.Any])
  }
}
