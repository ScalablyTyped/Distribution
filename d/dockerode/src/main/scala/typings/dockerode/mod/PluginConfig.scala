package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConfig extends js.Object {
  
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
  implicit class PluginConfigOps[Self <: PluginConfig] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: Args): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("Documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypointVarargs(value: String*): Self = this.set("Entrypoint", js.Array(value :_*))
    
    @scala.inline
    def setEntrypoint(value: js.Array[String]): Self = this.set("Entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVarargs(value: PluginEnv*): Self = this.set("Env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[PluginEnv]): Self = this.set("Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterface(value: js.Any): Self = this.set("Interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinux(value: Linux): Self = this.set("Linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsVarargs(value: PluginMount*): Self = this.set("Mounts", js.Array(value :_*))
    
    @scala.inline
    def setMounts(value: js.Array[PluginMount]): Self = this.set("Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: Network): Self = this.set("Network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagatedMount(value: String): Self = this.set("PropagatedMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDir(value: String): Self = this.set("WorkDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootfs(value: js.Any): Self = this.set("rootfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
