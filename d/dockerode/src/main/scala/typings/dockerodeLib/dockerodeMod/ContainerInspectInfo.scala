package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInspectInfo extends js.Object {
  var AppArmorProfile: java.lang.String
  var Args: js.Array[java.lang.String]
  var Config: dockerodeLib.Anon_AttachStderr
  var Created: java.lang.String
  var Driver: java.lang.String
  var ExecIDs: js.UndefOr[js.Any] = js.undefined
  var GraphDriver: dockerodeLib.Anon_Data
  var HostConfig: dockerodeLib.dockerodeMod.HostConfig
  var HostnamePath: java.lang.String
  var HostsPath: java.lang.String
  var Id: java.lang.String
  var Image: java.lang.String
  var LogPath: java.lang.String
  var MountLabel: java.lang.String
  var Mounts: js.Array[dockerodeLib.Anon_Destination]
  var Name: java.lang.String
  var NetworkSettings: dockerodeLib.Anon_Bridge
  var Path: java.lang.String
  var ProcessLabel: java.lang.String
  var ResolvConfPath: java.lang.String
  var RestartCount: scala.Double
  var State: dockerodeLib.Anon_Dead
}

object ContainerInspectInfo {
  @scala.inline
  def apply(
    AppArmorProfile: java.lang.String,
    Args: js.Array[java.lang.String],
    Config: dockerodeLib.Anon_AttachStderr,
    Created: java.lang.String,
    Driver: java.lang.String,
    GraphDriver: dockerodeLib.Anon_Data,
    HostConfig: HostConfig,
    HostnamePath: java.lang.String,
    HostsPath: java.lang.String,
    Id: java.lang.String,
    Image: java.lang.String,
    LogPath: java.lang.String,
    MountLabel: java.lang.String,
    Mounts: js.Array[dockerodeLib.Anon_Destination],
    Name: java.lang.String,
    NetworkSettings: dockerodeLib.Anon_Bridge,
    Path: java.lang.String,
    ProcessLabel: java.lang.String,
    ResolvConfPath: java.lang.String,
    RestartCount: scala.Double,
    State: dockerodeLib.Anon_Dead,
    ExecIDs: js.Any = null
  ): ContainerInspectInfo = {
    val __obj = js.Dynamic.literal(AppArmorProfile = AppArmorProfile, Args = Args, Config = Config, Created = Created, Driver = Driver, GraphDriver = GraphDriver, HostConfig = HostConfig, HostnamePath = HostnamePath, HostsPath = HostsPath, Id = Id, Image = Image, LogPath = LogPath, MountLabel = MountLabel, Mounts = Mounts, Name = Name, NetworkSettings = NetworkSettings, Path = Path, ProcessLabel = ProcessLabel, ResolvConfPath = ResolvConfPath, RestartCount = RestartCount, State = State)
    if (ExecIDs != null) __obj.updateDynamic("ExecIDs")(ExecIDs)
    __obj.asInstanceOf[ContainerInspectInfo]
  }
}

