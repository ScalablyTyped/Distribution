package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DockerodeNs {
  type LoggingDriverType = dockerodeLib.dockerodeLibStrings.`json-file` | dockerodeLib.dockerodeLibStrings.syslog | dockerodeLib.dockerodeLibStrings.journald | dockerodeLib.dockerodeLibStrings.gelf | dockerodeLib.dockerodeLibStrings.fluentd | dockerodeLib.dockerodeLibStrings.awslogs | dockerodeLib.dockerodeLibStrings.splunk | dockerodeLib.dockerodeLibStrings.etwlogs | dockerodeLib.dockerodeLibStrings.none
  type MountConfig = js.Array[MountSettings]
  type MountConsistency = dockerodeLib.dockerodeLibStrings.default | dockerodeLib.dockerodeLibStrings.consistent | dockerodeLib.dockerodeLibStrings.cached | dockerodeLib.dockerodeLibStrings.delegated
  type MountPropagation = dockerodeLib.dockerodeLibStrings.`private` | dockerodeLib.dockerodeLibStrings.rprivate | dockerodeLib.dockerodeLibStrings.shared | dockerodeLib.dockerodeLibStrings.rshared | dockerodeLib.dockerodeLibStrings.slave | dockerodeLib.dockerodeLibStrings.rslave
  type MountType = dockerodeLib.dockerodeLibStrings.bind | dockerodeLib.dockerodeLibStrings.volume | dockerodeLib.dockerodeLibStrings.tmpfs
  type PluginInspectInfo = PluginInfo
}
