package typings.dockerode.mod

import typings.dockerode.anon.AttachStderr
import typings.dockerode.anon.Bridge
import typings.dockerode.anon.Data
import typings.dockerode.anon.Dead
import typings.dockerode.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerInspectInfo extends js.Object {
  
  var AppArmorProfile: String = js.native
  
  var Args: js.Array[String] = js.native
  
  var Config: AttachStderr = js.native
  
  var Created: String = js.native
  
  var Driver: String = js.native
  
  var ExecIDs: js.UndefOr[js.Array[String]] = js.native
  
  var GraphDriver: Data = js.native
  
  var HostConfig: typings.dockerode.mod.HostConfig = js.native
  
  var HostnamePath: String = js.native
  
  var HostsPath: String = js.native
  
  var Id: String = js.native
  
  var Image: String = js.native
  
  var LogPath: String = js.native
  
  var MountLabel: String = js.native
  
  var Mounts: js.Array[Mode] = js.native
  
  var Name: String = js.native
  
  var NetworkSettings: Bridge = js.native
  
  var Path: String = js.native
  
  var Platform: String = js.native
  
  var ProcessLabel: String = js.native
  
  var ResolvConfPath: String = js.native
  
  var RestartCount: Double = js.native
  
  var State: Dead = js.native
}
object ContainerInspectInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ContainerInspectInfoOps[Self <: ContainerInspectInfo] (val x: Self) extends AnyVal {
    
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
    def setAppArmorProfile(value: String): Self = this.set("AppArmorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: AttachStderr): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: String): Self = this.set("Driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphDriver(value: Data): Self = this.set("GraphDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostConfig(value: HostConfig): Self = this.set("HostConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnamePath(value: String): Self = this.set("HostnamePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsPath(value: String): Self = this.set("HostsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPath(value: String): Self = this.set("LogPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountLabel(value: String): Self = this.set("MountLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsVarargs(value: Mode*): Self = this.set("Mounts", js.Array(value :_*))
    
    @scala.inline
    def setMounts(value: js.Array[Mode]): Self = this.set("Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSettings(value: Bridge): Self = this.set("NetworkSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessLabel(value: String): Self = this.set("ProcessLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvConfPath(value: String): Self = this.set("ResolvConfPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartCount(value: Double): Self = this.set("RestartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Dead): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecIDsVarargs(value: String*): Self = this.set("ExecIDs", js.Array(value :_*))
    
    @scala.inline
    def setExecIDs(value: js.Array[String]): Self = this.set("ExecIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecIDs: Self = this.set("ExecIDs", js.undefined)
  }
}
