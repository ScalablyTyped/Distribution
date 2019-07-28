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
    val __obj = js.Dynamic.literal(AppArmorProfile = AppArmorProfile, Args = Args, Config = Config, Created = Created, Driver = Driver, GraphDriver = GraphDriver, HostConfig = HostConfig, HostnamePath = HostnamePath, HostsPath = HostsPath, Id = Id, Image = Image, LogPath = LogPath, MountLabel = MountLabel, Mounts = Mounts, Name = Name, NetworkSettings = NetworkSettings, Path = Path, ProcessLabel = ProcessLabel, ResolvConfPath = ResolvConfPath, RestartCount = RestartCount, State = State)
    if (ExecIDs != null) __obj.updateDynamic("ExecIDs")(ExecIDs)
    __obj.asInstanceOf[ContainerInspectInfo]
  }
}

