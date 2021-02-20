package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConfig extends StObject {
  
  var Args: typings.dockerode.mod.Args = js.native
  
  var Description: String = js.native
  
  var Documentation: String = js.native
  
  var Entrypoint: js.Array[String] = js.native
  
  var Env: js.Array[PluginEnv] = js.native
  
  var Interface: js.Any = js.native
  
  var Linux: typings.dockerode.mod.Linux = js.native
  
  var Mounts: js.Array[PluginMount] = js.native
  
  var Network: typings.dockerode.mod.Network = js.native
  
  var PropagatedMount: String = js.native
  
  var User: js.UndefOr[typings.dockerode.mod.User] = js.native
  
  var WorkDir: String = js.native
  
  var rootfs: js.Any = js.native
}
object PluginConfig {
  
  @scala.inline
  def apply(
    Args: Args,
    Description: String,
    Documentation: String,
    Entrypoint: js.Array[String],
    Env: js.Array[PluginEnv],
    Interface: js.Any,
    Linux: Linux,
    Mounts: js.Array[PluginMount],
    Network: Network,
    PropagatedMount: String,
    WorkDir: String,
    rootfs: js.Any
  ): PluginConfig = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Documentation = Documentation.asInstanceOf[js.Any], Entrypoint = Entrypoint.asInstanceOf[js.Any], Env = Env.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], Linux = Linux.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], PropagatedMount = PropagatedMount.asInstanceOf[js.Any], WorkDir = WorkDir.asInstanceOf[js.Any], rootfs = rootfs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConfig]
  }
  
  @scala.inline
  implicit class PluginConfigMutableBuilder[Self <: PluginConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Args): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: String): Self = StObject.set(x, "Documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypoint(value: js.Array[String]): Self = StObject.set(x, "Entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypointVarargs(value: String*): Self = StObject.set(x, "Entrypoint", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[PluginEnv]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVarargs(value: PluginEnv*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    @scala.inline
    def setInterface(value: js.Any): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinux(value: Linux): Self = StObject.set(x, "Linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMounts(value: js.Array[PluginMount]): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsVarargs(value: PluginMount*): Self = StObject.set(x, "Mounts", js.Array(value :_*))
    
    @scala.inline
    def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagatedMount(value: String): Self = StObject.set(x, "PropagatedMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootfs(value: js.Any): Self = StObject.set(x, "rootfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    @scala.inline
    def setWorkDir(value: String): Self = StObject.set(x, "WorkDir", value.asInstanceOf[js.Any])
  }
}
