package typings.dockerode.mod

import typings.dockerode.anon.ContainerID
import typings.dockerode.dockerodeStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAttachmentTaskSpec
  extends TaskSpecBase
     with TaskSpec {
  
  var NetworkAttachmentSpec: ContainerID = js.native
  
  @JSName("Runtime")
  var Runtime_NetworkAttachmentTaskSpec: attachment = js.native
}
object NetworkAttachmentTaskSpec {
  
  @scala.inline
  def apply(NetworkAttachmentSpec: ContainerID, Runtime: attachment): NetworkAttachmentTaskSpec = {
    val __obj = js.Dynamic.literal(NetworkAttachmentSpec = NetworkAttachmentSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAttachmentTaskSpec]
  }
  
  @scala.inline
  implicit class NetworkAttachmentTaskSpecOps[Self <: NetworkAttachmentTaskSpec] (val x: Self) extends AnyVal {
    
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
    def setNetworkAttachmentSpec(value: ContainerID): Self = this.set("NetworkAttachmentSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: attachment): Self = this.set("Runtime", value.asInstanceOf[js.Any])
  }
}
