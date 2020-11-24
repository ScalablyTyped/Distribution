package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfoResponse extends js.Object {
  
  /**
    * The command line string used to launch the browser. Will be the empty string if not
    * supported.
    */
  var commandLine: String = js.native
  
  /**
    * Information about the GPUs on the system.
    */
  var gpu: GPUInfo = js.native
  
  /**
    * A platform-dependent description of the model of the machine. On Mac OS, this is, for
    * example, 'MacBookPro'. Will be the empty string if not supported.
    */
  var modelName: String = js.native
  
  /**
    * A platform-dependent description of the version of the machine. On Mac OS, this is, for
    * example, '10.1'. Will be the empty string if not supported.
    */
  var modelVersion: String = js.native
}
object GetInfoResponse {
  
  @scala.inline
  def apply(commandLine: String, gpu: GPUInfo, modelName: String, modelVersion: String): GetInfoResponse = {
    val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelVersion = modelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfoResponse]
  }
  
  @scala.inline
  implicit class GetInfoResponseOps[Self <: GetInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpu(value: GPUInfo): Self = this.set("gpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersion(value: String): Self = this.set("modelVersion", value.asInstanceOf[js.Any])
  }
}
