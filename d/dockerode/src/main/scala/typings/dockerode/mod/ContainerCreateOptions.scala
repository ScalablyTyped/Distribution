package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerCreateOptions extends StObject {
  
  var AttachStderr: js.UndefOr[Boolean] = js.native
  
  var AttachStdin: js.UndefOr[Boolean] = js.native
  
  var AttachStdout: js.UndefOr[Boolean] = js.native
  
  var Cmd: js.UndefOr[js.Array[String]] = js.native
  
  var Domainname: js.UndefOr[String] = js.native
  
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.native
  
  var Env: js.UndefOr[js.Array[String]] = js.native
  
  var ExposedPorts: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var HostConfig: js.UndefOr[typings.dockerode.mod.HostConfig] = js.native
  
  var Hostname: js.UndefOr[String] = js.native
  
  var Image: js.UndefOr[String] = js.native
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var MacAddress: js.UndefOr[Boolean] = js.native
  
  var NetworkDisabled: js.UndefOr[Boolean] = js.native
  
  var NetworkingConfig: js.UndefOr[typings.dockerode.anon.EndpointsConfig] = js.native
  
  var OpenStdin: js.UndefOr[Boolean] = js.native
  
  var StdinOnce: js.UndefOr[Boolean] = js.native
  
  var StopSignal: js.UndefOr[String] = js.native
  
  var StopTimeout: js.UndefOr[Double] = js.native
  
  var Tty: js.UndefOr[Boolean] = js.native
  
  var User: js.UndefOr[String] = js.native
  
  var Volumes: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var WorkingDir: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ContainerCreateOptions {
  
  @scala.inline
  def apply(): ContainerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerCreateOptions]
  }
  
  @scala.inline
  implicit class ContainerCreateOptionsMutableBuilder[Self <: ContainerCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachStderr(value: Boolean): Self = StObject.set(x, "AttachStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStderrUndefined: Self = StObject.set(x, "AttachStderr", js.undefined)
    
    @scala.inline
    def setAttachStdin(value: Boolean): Self = StObject.set(x, "AttachStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStdinUndefined: Self = StObject.set(x, "AttachStdin", js.undefined)
    
    @scala.inline
    def setAttachStdout(value: Boolean): Self = StObject.set(x, "AttachStdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStdoutUndefined: Self = StObject.set(x, "AttachStdout", js.undefined)
    
    @scala.inline
    def setCmd(value: js.Array[String]): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdUndefined: Self = StObject.set(x, "Cmd", js.undefined)
    
    @scala.inline
    def setCmdVarargs(value: String*): Self = StObject.set(x, "Cmd", js.Array(value :_*))
    
    @scala.inline
    def setDomainname(value: String): Self = StObject.set(x, "Domainname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainnameUndefined: Self = StObject.set(x, "Domainname", js.undefined)
    
    @scala.inline
    def setEntrypoint(value: String | js.Array[String]): Self = StObject.set(x, "Entrypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypointUndefined: Self = StObject.set(x, "Entrypoint", js.undefined)
    
    @scala.inline
    def setEntrypointVarargs(value: String*): Self = StObject.set(x, "Entrypoint", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "Env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    @scala.inline
    def setExposedPorts(value: StringDictionary[js.Object]): Self = StObject.set(x, "ExposedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposedPortsUndefined: Self = StObject.set(x, "ExposedPorts", js.undefined)
    
    @scala.inline
    def setHostConfig(value: HostConfig): Self = StObject.set(x, "HostConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostConfigUndefined: Self = StObject.set(x, "HostConfig", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setMacAddress(value: Boolean): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkDisabled(value: Boolean): Self = StObject.set(x, "NetworkDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkDisabledUndefined: Self = StObject.set(x, "NetworkDisabled", js.undefined)
    
    @scala.inline
    def setNetworkingConfig(value: typings.dockerode.anon.EndpointsConfig): Self = StObject.set(x, "NetworkingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkingConfigUndefined: Self = StObject.set(x, "NetworkingConfig", js.undefined)
    
    @scala.inline
    def setOpenStdin(value: Boolean): Self = StObject.set(x, "OpenStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenStdinUndefined: Self = StObject.set(x, "OpenStdin", js.undefined)
    
    @scala.inline
    def setStdinOnce(value: Boolean): Self = StObject.set(x, "StdinOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdinOnceUndefined: Self = StObject.set(x, "StdinOnce", js.undefined)
    
    @scala.inline
    def setStopSignal(value: String): Self = StObject.set(x, "StopSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopSignalUndefined: Self = StObject.set(x, "StopSignal", js.undefined)
    
    @scala.inline
    def setStopTimeout(value: Double): Self = StObject.set(x, "StopTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeoutUndefined: Self = StObject.set(x, "StopTimeout", js.undefined)
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtyUndefined: Self = StObject.set(x, "Tty", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    @scala.inline
    def setVolumes(value: StringDictionary[js.Object]): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    @scala.inline
    def setWorkingDir(value: String): Self = StObject.set(x, "WorkingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirUndefined: Self = StObject.set(x, "WorkingDir", js.undefined)
  }
}
