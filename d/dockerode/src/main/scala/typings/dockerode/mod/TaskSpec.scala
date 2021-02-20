package typings.dockerode.mod

import typings.dockerode.anon.ContainerID
import typings.dockerode.dockerodeStrings.attachment
import typings.dockerode.dockerodeStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dockerode.mod.ContainerTaskSpec
  - typings.dockerode.mod.PluginTaskSpec
  - typings.dockerode.mod.NetworkAttachmentTaskSpec
*/
trait TaskSpec extends StObject
object TaskSpec {
  
  @scala.inline
  def ContainerTaskSpec(): typings.dockerode.mod.ContainerTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.dockerode.mod.ContainerTaskSpec]
  }
  
  @scala.inline
  def NetworkAttachmentTaskSpec(NetworkAttachmentSpec: ContainerID, Runtime: attachment): typings.dockerode.mod.NetworkAttachmentTaskSpec = {
    val __obj = js.Dynamic.literal(NetworkAttachmentSpec = NetworkAttachmentSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.dockerode.mod.NetworkAttachmentTaskSpec]
  }
  
  @scala.inline
  def PluginTaskSpec(PluginSpec: PluginSpec, Runtime: plugin): typings.dockerode.mod.PluginTaskSpec = {
    val __obj = js.Dynamic.literal(PluginSpec = PluginSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.dockerode.mod.PluginTaskSpec]
  }
}
