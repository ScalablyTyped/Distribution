package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerID extends js.Object {
  
  var ContainerID: String = js.native
}
object ContainerID {
  
  @scala.inline
  def apply(ContainerID: String): ContainerID = {
    val __obj = js.Dynamic.literal(ContainerID = ContainerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerID]
  }
  
  @scala.inline
  implicit class ContainerIDOps[Self <: ContainerID] (val x: Self) extends AnyVal {
    
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
    def setContainerID(value: String): Self = this.set("ContainerID", value.asInstanceOf[js.Any])
  }
}
