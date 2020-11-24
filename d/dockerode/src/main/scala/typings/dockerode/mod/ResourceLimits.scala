package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimits extends js.Object {
  
  var MemoryBytes: js.UndefOr[Double] = js.native
  
  var NanoCPUs: js.UndefOr[Double] = js.native
  
  var Pids: js.UndefOr[Double] = js.native
}
object ResourceLimits {
  
  @scala.inline
  def apply(): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimits]
  }
  
  @scala.inline
  implicit class ResourceLimitsOps[Self <: ResourceLimits] (val x: Self) extends AnyVal {
    
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
    def setMemoryBytes(value: Double): Self = this.set("MemoryBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryBytes: Self = this.set("MemoryBytes", js.undefined)
    
    @scala.inline
    def setNanoCPUs(value: Double): Self = this.set("NanoCPUs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNanoCPUs: Self = this.set("NanoCPUs", js.undefined)
    
    @scala.inline
    def setPids(value: Double): Self = this.set("Pids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePids: Self = this.set("Pids", js.undefined)
  }
}
