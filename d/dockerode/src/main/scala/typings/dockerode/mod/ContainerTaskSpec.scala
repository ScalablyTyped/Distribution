package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerTaskSpec
  extends TaskSpecBase
     with TaskSpec {
  
  var ContainerSpec: js.UndefOr[typings.dockerode.mod.ContainerSpec] = js.native
}
object ContainerTaskSpec {
  
  @scala.inline
  def apply(): ContainerTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerTaskSpec]
  }
  
  @scala.inline
  implicit class ContainerTaskSpecOps[Self <: ContainerTaskSpec] (val x: Self) extends AnyVal {
    
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
    def setContainerSpec(value: ContainerSpec): Self = this.set("ContainerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerSpec: Self = this.set("ContainerSpec", js.undefined)
  }
}
