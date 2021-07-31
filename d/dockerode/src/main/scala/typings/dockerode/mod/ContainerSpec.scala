package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSpec extends StObject {
  
  var Args: js.UndefOr[js.Array[String]] = js.undefined
  
  var CapabilityAdd: js.UndefOr[js.Array[String]] = js.undefined
  
  var CapabilityDrop: js.UndefOr[js.Array[String]] = js.undefined
  
  var Command: js.UndefOr[js.Array[String]] = js.undefined
  
  var DNSConfig: js.UndefOr[typings.dockerode.mod.DNSConfig] = js.undefined
  
  var Dir: js.UndefOr[String] = js.undefined
  
  var Env: js.UndefOr[js.Array[String]] = js.undefined
  
  var Groups: js.UndefOr[js.Array[String]] = js.undefined
  
  var HealthCheck: js.UndefOr[HealthConfig] = js.undefined
  
  var Hostname: js.UndefOr[String] = js.undefined
  
  var Hosts: js.UndefOr[js.Array[String]] = js.undefined
  
  var Image: js.UndefOr[String] = js.undefined
  
  var Init: js.UndefOr[Boolean] = js.undefined
  
  var Isolation: js.UndefOr[String] = js.undefined
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Mounts: js.UndefOr[js.Array[MountSettings]] = js.undefined
  
  var OpenStdin: js.UndefOr[Boolean] = js.undefined
  
  var Privileges: js.UndefOr[typings.dockerode.mod.Privileges] = js.undefined
  
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  var Secrets: js.UndefOr[js.Array[SecretReference]] = js.undefined
  
  var StopGracePeriod: js.UndefOr[Double] = js.undefined
  
  var StopSignal: js.UndefOr[String] = js.undefined
  
  var Sysctls: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var TTY: js.UndefOr[Boolean] = js.undefined
  
  var Ulimits: js.UndefOr[js.Array[Ulimit]] = js.undefined
  
  var User: js.UndefOr[String] = js.undefined
}
object ContainerSpec {
  
  @scala.inline
  def apply(): ContainerSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSpec]
  }
  
  @scala.inline
  implicit class ContainerSpecMutableBuilder[Self <: ContainerSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    @scala.inline
    def setCapabilityAdd(value: js.Array[String]): Self = StObject.set(x, "CapabilityAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityAddUndefined: Self = StObject.set(x, "CapabilityAdd", js.undefined)
    
    @scala.inline
    def setCapabilityAddVarargs(value: String*): Self = StObject.set(x, "CapabilityAdd", js.Array(value :_*))
    
    @scala.inline
    def setCapabilityDrop(value: js.Array[String]): Self = StObject.set(x, "CapabilityDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityDropUndefined: Self = StObject.set(x, "CapabilityDrop", js.undefined)
    
    @scala.inline
    def setCapabilityDropVarargs(value: String*): Self = StObject.set(x, "CapabilityDrop", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[String]): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "Command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: String*): Self = StObject.set(x, "Command", js.Array(value :_*))
    
    @scala.inline
    def setDNSConfig(value: DNSConfig): Self = StObject.set(x, "DNSConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSConfigUndefined: Self = StObject.set(x, "DNSConfig", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "Dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "Dir", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "Env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setHealthCheck(value: HealthConfig): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = StObject.set(x, "Hosts", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    @scala.inline
    def setInit(value: Boolean): Self = StObject.set(x, "Init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "Init", js.undefined)
    
    @scala.inline
    def setIsolation(value: String): Self = StObject.set(x, "Isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationUndefined: Self = StObject.set(x, "Isolation", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setMounts(value: js.Array[MountSettings]): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsUndefined: Self = StObject.set(x, "Mounts", js.undefined)
    
    @scala.inline
    def setMountsVarargs(value: MountSettings*): Self = StObject.set(x, "Mounts", js.Array(value :_*))
    
    @scala.inline
    def setOpenStdin(value: Boolean): Self = StObject.set(x, "OpenStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenStdinUndefined: Self = StObject.set(x, "OpenStdin", js.undefined)
    
    @scala.inline
    def setPrivileges(value: Privileges): Self = StObject.set(x, "Privileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegesUndefined: Self = StObject.set(x, "Privileges", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    @scala.inline
    def setSecrets(value: js.Array[SecretReference]): Self = StObject.set(x, "Secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsUndefined: Self = StObject.set(x, "Secrets", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: SecretReference*): Self = StObject.set(x, "Secrets", js.Array(value :_*))
    
    @scala.inline
    def setStopGracePeriod(value: Double): Self = StObject.set(x, "StopGracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopGracePeriodUndefined: Self = StObject.set(x, "StopGracePeriod", js.undefined)
    
    @scala.inline
    def setStopSignal(value: String): Self = StObject.set(x, "StopSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopSignalUndefined: Self = StObject.set(x, "StopSignal", js.undefined)
    
    @scala.inline
    def setSysctls(value: StringDictionary[String]): Self = StObject.set(x, "Sysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysctlsUndefined: Self = StObject.set(x, "Sysctls", js.undefined)
    
    @scala.inline
    def setTTY(value: Boolean): Self = StObject.set(x, "TTY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTYUndefined: Self = StObject.set(x, "TTY", js.undefined)
    
    @scala.inline
    def setUlimits(value: js.Array[Ulimit]): Self = StObject.set(x, "Ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlimitsUndefined: Self = StObject.set(x, "Ulimits", js.undefined)
    
    @scala.inline
    def setUlimitsVarargs(value: Ulimit*): Self = StObject.set(x, "Ulimits", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
