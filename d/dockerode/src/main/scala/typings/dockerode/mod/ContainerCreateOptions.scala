package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerCreateOptions extends StObject {
  
  var AttachStderr: js.UndefOr[Boolean] = js.undefined
  
  var AttachStdin: js.UndefOr[Boolean] = js.undefined
  
  var AttachStdout: js.UndefOr[Boolean] = js.undefined
  
  var Cmd: js.UndefOr[js.Array[String]] = js.undefined
  
  var Domainname: js.UndefOr[String] = js.undefined
  
  var Entrypoint: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var Env: js.UndefOr[js.Array[String]] = js.undefined
  
  var ExposedPorts: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  
  var HostConfig: js.UndefOr[typings.dockerode.mod.HostConfig] = js.undefined
  
  var Hostname: js.UndefOr[String] = js.undefined
  
  var Image: js.UndefOr[String] = js.undefined
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var MacAddress: js.UndefOr[Boolean] = js.undefined
  
  var NetworkDisabled: js.UndefOr[Boolean] = js.undefined
  
  var NetworkingConfig: js.UndefOr[typings.dockerode.anon.EndpointsConfig] = js.undefined
  
  var OpenStdin: js.UndefOr[Boolean] = js.undefined
  
  var StdinOnce: js.UndefOr[Boolean] = js.undefined
  
  var StopSignal: js.UndefOr[String] = js.undefined
  
  var StopTimeout: js.UndefOr[Double] = js.undefined
  
  var Tty: js.UndefOr[Boolean] = js.undefined
  
  var User: js.UndefOr[String] = js.undefined
  
  var Volumes: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  
  var WorkingDir: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ContainerCreateOptions {
  
  inline def apply(): ContainerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerCreateOptions]
  }
  
  extension [Self <: ContainerCreateOptions](x: Self) {
    
    inline def setAttachStderr(value: Boolean): Self = StObject.set(x, "AttachStderr", value.asInstanceOf[js.Any])
    
    inline def setAttachStderrUndefined: Self = StObject.set(x, "AttachStderr", js.undefined)
    
    inline def setAttachStdin(value: Boolean): Self = StObject.set(x, "AttachStdin", value.asInstanceOf[js.Any])
    
    inline def setAttachStdinUndefined: Self = StObject.set(x, "AttachStdin", js.undefined)
    
    inline def setAttachStdout(value: Boolean): Self = StObject.set(x, "AttachStdout", value.asInstanceOf[js.Any])
    
    inline def setAttachStdoutUndefined: Self = StObject.set(x, "AttachStdout", js.undefined)
    
    inline def setCmd(value: js.Array[String]): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdUndefined: Self = StObject.set(x, "Cmd", js.undefined)
    
    inline def setCmdVarargs(value: String*): Self = StObject.set(x, "Cmd", js.Array(value :_*))
    
    inline def setDomainname(value: String): Self = StObject.set(x, "Domainname", value.asInstanceOf[js.Any])
    
    inline def setDomainnameUndefined: Self = StObject.set(x, "Domainname", js.undefined)
    
    inline def setEntrypoint(value: String | js.Array[String]): Self = StObject.set(x, "Entrypoint", value.asInstanceOf[js.Any])
    
    inline def setEntrypointUndefined: Self = StObject.set(x, "Entrypoint", js.undefined)
    
    inline def setEntrypointVarargs(value: String*): Self = StObject.set(x, "Entrypoint", js.Array(value :_*))
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "Env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    inline def setExposedPorts(value: StringDictionary[js.Object]): Self = StObject.set(x, "ExposedPorts", value.asInstanceOf[js.Any])
    
    inline def setExposedPortsUndefined: Self = StObject.set(x, "ExposedPorts", js.undefined)
    
    inline def setHostConfig(value: HostConfig): Self = StObject.set(x, "HostConfig", value.asInstanceOf[js.Any])
    
    inline def setHostConfigUndefined: Self = StObject.set(x, "HostConfig", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setMacAddress(value: Boolean): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkDisabled(value: Boolean): Self = StObject.set(x, "NetworkDisabled", value.asInstanceOf[js.Any])
    
    inline def setNetworkDisabledUndefined: Self = StObject.set(x, "NetworkDisabled", js.undefined)
    
    inline def setNetworkingConfig(value: typings.dockerode.anon.EndpointsConfig): Self = StObject.set(x, "NetworkingConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkingConfigUndefined: Self = StObject.set(x, "NetworkingConfig", js.undefined)
    
    inline def setOpenStdin(value: Boolean): Self = StObject.set(x, "OpenStdin", value.asInstanceOf[js.Any])
    
    inline def setOpenStdinUndefined: Self = StObject.set(x, "OpenStdin", js.undefined)
    
    inline def setStdinOnce(value: Boolean): Self = StObject.set(x, "StdinOnce", value.asInstanceOf[js.Any])
    
    inline def setStdinOnceUndefined: Self = StObject.set(x, "StdinOnce", js.undefined)
    
    inline def setStopSignal(value: String): Self = StObject.set(x, "StopSignal", value.asInstanceOf[js.Any])
    
    inline def setStopSignalUndefined: Self = StObject.set(x, "StopSignal", js.undefined)
    
    inline def setStopTimeout(value: Double): Self = StObject.set(x, "StopTimeout", value.asInstanceOf[js.Any])
    
    inline def setStopTimeoutUndefined: Self = StObject.set(x, "StopTimeout", js.undefined)
    
    inline def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    inline def setTtyUndefined: Self = StObject.set(x, "Tty", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setVolumes(value: StringDictionary[js.Object]): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "WorkingDir", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirUndefined: Self = StObject.set(x, "WorkingDir", js.undefined)
  }
}
