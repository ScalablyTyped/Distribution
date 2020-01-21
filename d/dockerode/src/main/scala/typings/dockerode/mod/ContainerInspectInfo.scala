package typings.dockerode.mod

import typings.dockerode.AnonAttachStderr
import typings.dockerode.AnonBridge
import typings.dockerode.AnonData
import typings.dockerode.AnonDead
import typings.dockerode.AnonDestinationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInspectInfo extends js.Object {
  var AppArmorProfile: String
  var Args: js.Array[String]
  var Config: AnonAttachStderr
  var Created: String
  var Driver: String
  var ExecIDs: js.UndefOr[js.Any] = js.undefined
  var GraphDriver: AnonData
  var HostConfig: typings.dockerode.mod.HostConfig
  var HostnamePath: String
  var HostsPath: String
  var Id: String
  var Image: String
  var LogPath: String
  var MountLabel: String
  var Mounts: js.Array[AnonDestinationMode]
  var Name: String
  var NetworkSettings: AnonBridge
  var Path: String
  var ProcessLabel: String
  var ResolvConfPath: String
  var RestartCount: Double
  var State: AnonDead
}

object ContainerInspectInfo {
  @scala.inline
  def apply(
    AppArmorProfile: String,
    Args: js.Array[String],
    Config: AnonAttachStderr,
    Created: String,
    Driver: String,
    GraphDriver: AnonData,
    HostConfig: HostConfig,
    HostnamePath: String,
    HostsPath: String,
    Id: String,
    Image: String,
    LogPath: String,
    MountLabel: String,
    Mounts: js.Array[AnonDestinationMode],
    Name: String,
    NetworkSettings: AnonBridge,
    Path: String,
    ProcessLabel: String,
    ResolvConfPath: String,
    RestartCount: Double,
    State: AnonDead,
    ExecIDs: js.Any = null
  ): ContainerInspectInfo = {
    val __obj = js.Dynamic.literal(AppArmorProfile = AppArmorProfile.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], HostnamePath = HostnamePath.asInstanceOf[js.Any], HostsPath = HostsPath.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], LogPath = LogPath.asInstanceOf[js.Any], MountLabel = MountLabel.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ProcessLabel = ProcessLabel.asInstanceOf[js.Any], ResolvConfPath = ResolvConfPath.asInstanceOf[js.Any], RestartCount = RestartCount.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (ExecIDs != null) __obj.updateDynamic("ExecIDs")(ExecIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInspectInfo]
  }
}

