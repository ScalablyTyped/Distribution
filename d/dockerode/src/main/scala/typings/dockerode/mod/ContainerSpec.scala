package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerSpec extends js.Object {
  
  var Args: js.UndefOr[js.Array[String]] = js.native
  
  var CapabilityAdd: js.UndefOr[js.Array[String]] = js.native
  
  var CapabilityDrop: js.UndefOr[js.Array[String]] = js.native
  
  var Command: js.UndefOr[js.Array[String]] = js.native
  
  var DNSConfig: js.UndefOr[typings.dockerode.mod.DNSConfig] = js.native
  
  var Dir: js.UndefOr[String] = js.native
  
  var Env: js.UndefOr[js.Array[String]] = js.native
  
  var Groups: js.UndefOr[js.Array[String]] = js.native
  
  var HealthCheck: js.UndefOr[HealthConfig] = js.native
  
  var Hostname: js.UndefOr[String] = js.native
  
  var Hosts: js.UndefOr[js.Array[String]] = js.native
  
  var Image: js.UndefOr[String] = js.native
  
  var Init: js.UndefOr[Boolean] = js.native
  
  var Isolation: js.UndefOr[String] = js.native
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var Mounts: js.UndefOr[js.Array[MountSettings]] = js.native
  
  var OpenStdin: js.UndefOr[Boolean] = js.native
  
  var Privileges: js.UndefOr[typings.dockerode.mod.Privileges] = js.native
  
  var ReadOnly: js.UndefOr[Boolean] = js.native
  
  var Secrets: js.UndefOr[js.Array[SecretReference]] = js.native
  
  var StopGracePeriod: js.UndefOr[Double] = js.native
  
  var StopSignal: js.UndefOr[String] = js.native
  
  var Sysctls: js.UndefOr[StringDictionary[String]] = js.native
  
  var TTY: js.UndefOr[Boolean] = js.native
  
  var Ulimits: js.UndefOr[js.Array[Ulimit]] = js.native
  
  var User: js.UndefOr[String] = js.native
}
object ContainerSpec {
  
  @scala.inline
  def apply(): ContainerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSpec]
  }
  
  @scala.inline
  implicit class ContainerSpecOps[Self <: ContainerSpec] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
    
    @scala.inline
    def setCapabilityAddVarargs(value: String*): Self = this.set("CapabilityAdd", js.Array(value :_*))
    
    @scala.inline
    def setCapabilityAdd(value: js.Array[String]): Self = this.set("CapabilityAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilityAdd: Self = this.set("CapabilityAdd", js.undefined)
    
    @scala.inline
    def setCapabilityDropVarargs(value: String*): Self = this.set("CapabilityDrop", js.Array(value :_*))
    
    @scala.inline
    def setCapabilityDrop(value: js.Array[String]): Self = this.set("CapabilityDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilityDrop: Self = this.set("CapabilityDrop", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = this.set("Command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = this.set("Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("Command", js.undefined)
    
    @scala.inline
    def setDNSConfig(value: DNSConfig): Self = this.set("DNSConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDNSConfig: Self = this.set("DNSConfig", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("Dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("Dir", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("Env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = this.set("Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("Env", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthConfig): Self = this.set("HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("HealthCheck", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = this.set("Hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = this.set("Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("Hosts", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("Image", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = this.set("Init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("Init", js.undefined)
    
    @scala.inline
    def setIsolation(value: String): Self = this.set("Isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolation: Self = this.set("Isolation", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    
    @scala.inline
    def setMountsVarargs(value: MountSettings*): Self = this.set("Mounts", js.Array(value :_*))
    
    @scala.inline
    def setMounts(value: js.Array[MountSettings]): Self = this.set("Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMounts: Self = this.set("Mounts", js.undefined)
    
    @scala.inline
    def setOpenStdin(value: Boolean): Self = this.set("OpenStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenStdin: Self = this.set("OpenStdin", js.undefined)
    
    @scala.inline
    def setPrivileges(value: Privileges): Self = this.set("Privileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivileges: Self = this.set("Privileges", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("ReadOnly", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: SecretReference*): Self = this.set("Secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: js.Array[SecretReference]): Self = this.set("Secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecrets: Self = this.set("Secrets", js.undefined)
    
    @scala.inline
    def setStopGracePeriod(value: Double): Self = this.set("StopGracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopGracePeriod: Self = this.set("StopGracePeriod", js.undefined)
    
    @scala.inline
    def setStopSignal(value: String): Self = this.set("StopSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopSignal: Self = this.set("StopSignal", js.undefined)
    
    @scala.inline
    def setSysctls(value: StringDictionary[String]): Self = this.set("Sysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSysctls: Self = this.set("Sysctls", js.undefined)
    
    @scala.inline
    def setTTY(value: Boolean): Self = this.set("TTY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTTY: Self = this.set("TTY", js.undefined)
    
    @scala.inline
    def setUlimitsVarargs(value: Ulimit*): Self = this.set("Ulimits", js.Array(value :_*))
    
    @scala.inline
    def setUlimits(value: js.Array[Ulimit]): Self = this.set("Ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUlimits: Self = this.set("Ulimits", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
