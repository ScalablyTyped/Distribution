package typings.dockerode.mod

import typings.dockerode.anon.ContainerID
import typings.dockerode.dockerodeStrings.attachment
import org.scalablytyped.runtime.StObject
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
  implicit class NetworkAttachmentTaskSpecMutableBuilder[Self <: NetworkAttachmentTaskSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAttachmentSpec(value: ContainerID): Self = StObject.set(x, "NetworkAttachmentSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: attachment): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
  }
}
