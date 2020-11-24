package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessInfo extends js.Object {
  
  /**
    * Specifies cumulative CPU usage in seconds across all threads of the
    * process since the process start.
    */
  var cpuTime: Double = js.native
  
  /**
    * Specifies process id.
    */
  var id: integer = js.native
  
  /**
    * Specifies process type.
    */
  var `type`: String = js.native
}
object ProcessInfo {
  
  @scala.inline
  def apply(cpuTime: Double, id: integer, `type`: String): ProcessInfo = {
    val __obj = js.Dynamic.literal(cpuTime = cpuTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
  
  @scala.inline
  implicit class ProcessInfoOps[Self <: ProcessInfo] (val x: Self) extends AnyVal {
    
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
    def setCpuTime(value: Double): Self = this.set("cpuTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: integer): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
