package typings.dockerode.dockerodeMod

import typings.dockerode.Anon_AttachStderr
import typings.dockerode.Anon_Bridge
import typings.dockerode.Anon_Data
import typings.dockerode.Anon_Dead
import typings.dockerode.Anon_DestinationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInspectInfo extends js.Object {
  var AppArmorProfile: String
  var Args: js.Array[String]
  var Config: Anon_AttachStderr
  var Created: String
  var Driver: String
  var ExecIDs: js.UndefOr[js.Any] = js.undefined
  var GraphDriver: Anon_Data
  var HostConfig: typings.dockerode.dockerodeMod.HostConfig
  var HostnamePath: String
  var HostsPath: String
  var Id: String
  var Image: String
  var LogPath: String
  var MountLabel: String
  var Mounts: js.Array[Anon_DestinationMode]
  var Name: String
  var NetworkSettings: Anon_Bridge
  var Path: String
  var ProcessLabel: String
  var ResolvConfPath: String
  var RestartCount: Double
  var State: Anon_Dead
}

object ContainerInspectInfo {
  @scala.inline
  def apply(
    AppArmorProfile: String,
    Args: js.Array[String],
    Config: Anon_AttachStderr,
    Created: String,
    Driver: String,
    GraphDriver: Anon_Data,
    HostConfig: HostConfig,
    HostnamePath: String,
    HostsPath: String,
    Id: String,
    Image: String,
    LogPath: String,
    MountLabel: String,
    Mounts: js.Array[Anon_DestinationMode],
    Name: String,
    NetworkSettings: Anon_Bridge,
    Path: String,
    ProcessLabel: String,
    ResolvConfPath: String,
    RestartCount: Double,
    State: Anon_Dead,
    ExecIDs: js.Any = null
  ): ContainerInspectInfo = {
    val __obj = js.Dynamic.literal(AppArmorProfile = AppArmorProfile.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Created = Created.asInstanceOf[js.Any], Driver = Driver.asInstanceOf[js.Any], GraphDriver = GraphDriver.asInstanceOf[js.Any], HostConfig = HostConfig.asInstanceOf[js.Any], HostnamePath = HostnamePath.asInstanceOf[js.Any], HostsPath = HostsPath.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], LogPath = LogPath.asInstanceOf[js.Any], MountLabel = MountLabel.asInstanceOf[js.Any], Mounts = Mounts.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NetworkSettings = NetworkSettings.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ProcessLabel = ProcessLabel.asInstanceOf[js.Any], ResolvConfPath = ResolvConfPath.asInstanceOf[js.Any], RestartCount = RestartCount.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (ExecIDs != null) __obj.updateDynamic("ExecIDs")(ExecIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInspectInfo]
  }
}

