package typings
package dockerodeLib.dockerodeMod.DockerodeNs

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
  var HostConfig: HostConfig
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

