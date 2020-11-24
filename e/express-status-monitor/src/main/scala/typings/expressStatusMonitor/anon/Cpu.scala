package typings.expressStatusMonitor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cpu extends js.Object {
  
  var cpu: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var heap: js.UndefOr[Boolean] = js.native
  
  var load: js.UndefOr[Boolean] = js.native
  
  var mem: js.UndefOr[Boolean] = js.native
  
  var responseTime: js.UndefOr[Boolean] = js.native
  
  var rps: js.UndefOr[Boolean] = js.native
  
  var statusCodes: js.UndefOr[Boolean] = js.native
}
object Cpu {
  
  @scala.inline
  def apply(): Cpu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cpu]
  }
  
  @scala.inline
  implicit class CpuOps[Self <: Cpu] (val x: Self) extends AnyVal {
    
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
    def setCpu(value: Boolean): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    
    @scala.inline
    def setHeap(value: Boolean): Self = this.set("heap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeap: Self = this.set("heap", js.undefined)
    
    @scala.inline
    def setLoad(value: Boolean): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setMem(value: Boolean): Self = this.set("mem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMem: Self = this.set("mem", js.undefined)
    
    @scala.inline
    def setResponseTime(value: Boolean): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTime: Self = this.set("responseTime", js.undefined)
    
    @scala.inline
    def setRps(value: Boolean): Self = this.set("rps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRps: Self = this.set("rps", js.undefined)
    
    @scala.inline
    def setStatusCodes(value: Boolean): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
  }
}
