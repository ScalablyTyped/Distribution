package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostConfig extends js.Object {
  var AutoRemove: scala.Boolean
  var Binds: js.Array[java.lang.String]
  var BlkioDeviceReadBps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceReadIOps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceWriteBps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceWriteIOps: js.UndefOr[js.Any] = js.undefined
  var BlkioWeight: scala.Double
  var BlkioWeightDevice: js.UndefOr[js.Any] = js.undefined
  var CapAdd: js.UndefOr[js.Any] = js.undefined
  var CapDrop: js.UndefOr[js.Any] = js.undefined
  var CgroupParent: java.lang.String
  var ConsoleSize: js.Array[scala.Double]
  var ContainerIDFile: java.lang.String
  var CpuPeriod: scala.Double
  var CpuQuota: scala.Double
  var CpuShares: scala.Double
  var CpusetCpus: java.lang.String
  var CpusetMems: java.lang.String
  var Devices: js.UndefOr[js.Any] = js.undefined
  var DiskQuota: scala.Double
  var Dns: js.Array[_]
  var DnsOptions: js.Array[_]
  var DnsSearch: js.Array[_]
  var ExtraHosts: js.UndefOr[js.Any] = js.undefined
  var IpcMode: java.lang.String
  var Isolation: java.lang.String
  var KernelMemory: scala.Double
  var Links: js.UndefOr[js.Any] = js.undefined
  var LogConfig: dockerodeLib.Anon_Config
  var Memory: scala.Double
  var MemoryReservation: scala.Double
  var MemorySwap: scala.Double
  var MemorySwappiness: scala.Double
  var NetworkMode: java.lang.String
  var OomKillDisable: scala.Boolean
  var OomScoreAdj: scala.Double
  var PidMode: java.lang.String
  var PidsLimit: scala.Double
  var PortBindings: js.UndefOr[js.Any] = js.undefined
  var Privileged: scala.Boolean
  var PublishAllPorts: scala.Boolean
  var ReadonlyRootfs: scala.Boolean
  var RestartPolicy: dockerodeLib.Anon_MaximumRetryCount
  var SecurityOpt: js.UndefOr[js.Any] = js.undefined
  var ShmSize: scala.Double
  var UTSMode: java.lang.String
  var Ulimits: js.UndefOr[js.Any] = js.undefined
  var VolumeDriver: java.lang.String
  var VolumesFrom: js.UndefOr[js.Any] = js.undefined
}

