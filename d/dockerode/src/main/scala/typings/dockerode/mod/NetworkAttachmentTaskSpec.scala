package typings.dockerode.mod

import typings.dockerode.anon.ContainerID
import typings.dockerode.dockerodeStrings.attachment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAttachmentTaskSpec
  extends StObject
     with TaskSpecBase
     with TaskSpec {
  
  var NetworkAttachmentSpec: ContainerID
  
  @JSName("Runtime")
  var Runtime_NetworkAttachmentTaskSpec: attachment
}
object NetworkAttachmentTaskSpec {
  
  inline def apply(NetworkAttachmentSpec: ContainerID): NetworkAttachmentTaskSpec = {
    val __obj = js.Dynamic.literal(NetworkAttachmentSpec = NetworkAttachmentSpec.asInstanceOf[js.Any], Runtime = "attachment")
    __obj.asInstanceOf[NetworkAttachmentTaskSpec]
  }
  
  extension [Self <: NetworkAttachmentTaskSpec](x: Self) {
    
    inline def setNetworkAttachmentSpec(value: ContainerID): Self = StObject.set(x, "NetworkAttachmentSpec", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: attachment): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
  }
}
