package typings.dockerode.mod

import typings.dockerode.anon.AttachStderr
import typings.dockerode.anon.Bridge
import typings.dockerode.anon.Data
import typings.dockerode.anon.Dead
import typings.dockerode.anon.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerInspectInfo extends StObject {
  
  var AppArmorProfile: String
  
  var Args: js.Array[String]
  
  var Config: AttachStderr
  
  var Created: String
  
  var Driver: String
  
  var ExecIDs: js.UndefOr[js.Array[String]] = js.undefined
  
  var GraphDriver: Data
  
  var HostConfig: typings.dockerode.mod.HostConfig
  
  var HostnamePath: String
  
  var HostsPath: String
  
  var Id: String
  
  var Image: String
  
  var LogPath: String
  
  var MountLabel: String
  
  var Mounts: js.Array[Mode]
  
  var Name: String
  
  var NetworkSettings: Bridge
  
  var Path: String
  
  var Platform: String
  
  var ProcessLabel: String
  
  var ResolvConfPath: String
  
  var RestartCount: Double
  
  var State: Dead
}
object ContainerInspectInfo {
  
  inline def apply(
    AppArmorProfile: String,
    Args: js.Array[String],
    Config: AttachStderr,
    Created: String,
    Driver: String,
    GraphDriver: Data,
    HostConfig: HostConfig,
    HostnamePath: String,
    HostsPath: String,
    Id: String,
    Image: String,
    LogPath: String,
    MountLabel: String,
    Mounts: js.Array[Mode],
    Name: String,
    NetworkSettings: Bridge,
    Path: String,
    Platform: String,
    ProcessLabel: String,
    ResolvConfPath: String,
    RestartCount: Double,
    State: Dead
  ): ContainerInspectInfo = {
    val __obj = js.Dynamic.literal(AppArmorProfile = AppArmorProfile.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], HostnamePath = HostnamePath.asInstanceOf[js.Any], HostsPath = HostsPath.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], LogPath = LogPath.asInstanceOf[js.Any], MountLabel = MountLabel.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], ProcessLabel = ProcessLabel.asInstanceOf[js.Any], ResolvConfPath = ResolvConfPath.asInstanceOf[js.Any], RestartCount = RestartCount.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInspectInfo]
  }
  
  extension [Self <: ContainerInspectInfo](x: Self) {
    
    inline def setAppArmorProfile(value: String): Self = StObject.set(x, "AppArmorProfile", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    inline def setConfig(value: AttachStderr): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setExecIDs(value: js.Array[String]): Self = StObject.set(x, "ExecIDs", value.asInstanceOf[js.Any])
    
    inline def setExecIDsUndefined: Self = StObject.set(x, "ExecIDs", js.undefined)
    
    inline def setExecIDsVarargs(value: String*): Self = StObject.set(x, "ExecIDs", js.Array(value :_*))
    
    inline def setGraphDriver(value: Data): Self = StObject.set(x, "GraphDriver", value.asInstanceOf[js.Any])
    
    inline def setHostConfig(value: HostConfig): Self = StObject.set(x, "HostConfig", value.asInstanceOf[js.Any])
    
    inline def setHostnamePath(value: String): Self = StObject.set(x, "HostnamePath", value.asInstanceOf[js.Any])
    
    inline def setHostsPath(value: String): Self = StObject.set(x, "HostsPath", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setLogPath(value: String): Self = StObject.set(x, "LogPath", value.asInstanceOf[js.Any])
    
    inline def setMountLabel(value: String): Self = StObject.set(x, "MountLabel", value.asInstanceOf[js.Any])
    
    inline def setMounts(value: js.Array[Mode]): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsVarargs(value: Mode*): Self = StObject.set(x, "Mounts", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettings(value: Bridge): Self = StObject.set(x, "NetworkSettings", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setProcessLabel(value: String): Self = StObject.set(x, "ProcessLabel", value.asInstanceOf[js.Any])
    
    inline def setResolvConfPath(value: String): Self = StObject.set(x, "ResolvConfPath", value.asInstanceOf[js.Any])
    
    inline def setRestartCount(value: Double): Self = StObject.set(x, "RestartCount", value.asInstanceOf[js.Any])
    
    inline def setState(value: Dead): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
