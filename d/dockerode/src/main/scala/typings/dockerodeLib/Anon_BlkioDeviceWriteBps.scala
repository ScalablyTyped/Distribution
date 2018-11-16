package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_BlkioDeviceWriteBps extends js.Object {
  var AutoRemove: js.UndefOr[scala.Boolean] = js.undefined
  var Binds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var BlkioDeviceReadBps: js.UndefOr[js.Array[js.Object]] = js.undefined
  var BlkioDeviceReadIOps: js.UndefOr[js.Array[js.Object]] = js.undefined
  var BlkioDeviceWriteBps: js.UndefOr[js.Array[js.Object]] = js.undefined
  var BlkioDeviceWriteIOps: js.UndefOr[js.Array[js.Object]] = js.undefined
  var BlkioWeightDevice: js.UndefOr[js.Array[js.Object]] = js.undefined
  var CapAdd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var CapDrop: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var CgroupParent: js.UndefOr[java.lang.String] = js.undefined
  var CpuPercent: js.UndefOr[scala.Double] = js.undefined
  var CpuPeriod: js.UndefOr[scala.Double] = js.undefined
  var CpuQuota: js.UndefOr[scala.Double] = js.undefined
  var CpuShares: js.UndefOr[scala.Double] = js.undefined
  var CpusetMems: js.UndefOr[java.lang.String] = js.undefined
  var Devices: js.UndefOr[js.Array[dockerodeLib.dockerodeMod.DockerodeNs.DeviceMapping]] = js.undefined
  var Dns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var DnsOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var DnsSearch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ExtraHosts: js.UndefOr[js.Any] = js.undefined
  var GroupAdd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var KernelMemory: js.UndefOr[scala.Double] = js.undefined
  var Links: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var LogConfig: js.UndefOr[dockerodeLib.dockerodeMod.DockerodeNs.LogConfig] = js.undefined
  var MaximumIOps: js.UndefOr[scala.Double] = js.undefined
  var MaxmimumIOBps: js.UndefOr[scala.Double] = js.undefined
  var Memory: js.UndefOr[scala.Double] = js.undefined
  var MemoryReservation: js.UndefOr[scala.Double] = js.undefined
  var MemorySwap: js.UndefOr[scala.Double] = js.undefined
  var MemorySwappiness: js.UndefOr[scala.Double] = js.undefined
  var NetworkMode: js.UndefOr[java.lang.String] = js.undefined
  var OomKillDisable: js.UndefOr[scala.Boolean] = js.undefined
  var OomScoreAdj: js.UndefOr[scala.Double] = js.undefined
  var PidMode: js.UndefOr[java.lang.String] = js.undefined
  var PidsLimit: js.UndefOr[scala.Double] = js.undefined
  var PortBindings: js.UndefOr[dockerodeLib.dockerodeMod.DockerodeNs.PortMap] = js.undefined
  var Privileged: js.UndefOr[scala.Boolean] = js.undefined
  var PublishAllPorts: js.UndefOr[scala.Boolean] = js.undefined
  var ReadonlyRootfs: js.UndefOr[scala.Boolean] = js.undefined
  var RestartPolicy: js.UndefOr[dockerodeLib.dockerodeMod.DockerodeNs.RestartPolicy] = js.undefined
  var SecurityOpt: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var ShmSize: js.UndefOr[scala.Double] = js.undefined
  var Sysctls: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Ulimits: js.UndefOr[js.Array[js.Object]] = js.undefined
  var VolumeDriver: js.UndefOr[java.lang.String] = js.undefined
  var VolumesFrom: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

