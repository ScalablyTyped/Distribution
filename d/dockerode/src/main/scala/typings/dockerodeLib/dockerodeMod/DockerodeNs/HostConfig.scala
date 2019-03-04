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

object HostConfig {
  @scala.inline
  def apply(
    AutoRemove: scala.Boolean,
    Binds: js.Array[java.lang.String],
    BlkioWeight: scala.Double,
    CgroupParent: java.lang.String,
    ConsoleSize: js.Array[scala.Double],
    ContainerIDFile: java.lang.String,
    CpuPeriod: scala.Double,
    CpuQuota: scala.Double,
    CpuShares: scala.Double,
    CpusetCpus: java.lang.String,
    CpusetMems: java.lang.String,
    DiskQuota: scala.Double,
    Dns: js.Array[_],
    DnsOptions: js.Array[_],
    DnsSearch: js.Array[_],
    IpcMode: java.lang.String,
    Isolation: java.lang.String,
    KernelMemory: scala.Double,
    LogConfig: dockerodeLib.Anon_Config,
    Memory: scala.Double,
    MemoryReservation: scala.Double,
    MemorySwap: scala.Double,
    MemorySwappiness: scala.Double,
    NetworkMode: java.lang.String,
    OomKillDisable: scala.Boolean,
    OomScoreAdj: scala.Double,
    PidMode: java.lang.String,
    PidsLimit: scala.Double,
    Privileged: scala.Boolean,
    PublishAllPorts: scala.Boolean,
    ReadonlyRootfs: scala.Boolean,
    RestartPolicy: dockerodeLib.Anon_MaximumRetryCount,
    ShmSize: scala.Double,
    UTSMode: java.lang.String,
    VolumeDriver: java.lang.String,
    BlkioDeviceReadBps: js.Any = null,
    BlkioDeviceReadIOps: js.Any = null,
    BlkioDeviceWriteBps: js.Any = null,
    BlkioDeviceWriteIOps: js.Any = null,
    BlkioWeightDevice: js.Any = null,
    CapAdd: js.Any = null,
    CapDrop: js.Any = null,
    Devices: js.Any = null,
    ExtraHosts: js.Any = null,
    Links: js.Any = null,
    PortBindings: js.Any = null,
    SecurityOpt: js.Any = null,
    Ulimits: js.Any = null,
    VolumesFrom: js.Any = null
  ): HostConfig = {
    val __obj = js.Dynamic.literal(AutoRemove = AutoRemove, Binds = Binds, BlkioWeight = BlkioWeight, CgroupParent = CgroupParent, ConsoleSize = ConsoleSize, ContainerIDFile = ContainerIDFile, CpuPeriod = CpuPeriod, CpuQuota = CpuQuota, CpuShares = CpuShares, CpusetCpus = CpusetCpus, CpusetMems = CpusetMems, DiskQuota = DiskQuota, Dns = Dns, DnsOptions = DnsOptions, DnsSearch = DnsSearch, IpcMode = IpcMode, Isolation = Isolation, KernelMemory = KernelMemory, LogConfig = LogConfig, Memory = Memory, MemoryReservation = MemoryReservation, MemorySwap = MemorySwap, MemorySwappiness = MemorySwappiness, NetworkMode = NetworkMode, OomKillDisable = OomKillDisable, OomScoreAdj = OomScoreAdj, PidMode = PidMode, PidsLimit = PidsLimit, Privileged = Privileged, PublishAllPorts = PublishAllPorts, ReadonlyRootfs = ReadonlyRootfs, RestartPolicy = RestartPolicy, ShmSize = ShmSize, UTSMode = UTSMode, VolumeDriver = VolumeDriver)
    if (BlkioDeviceReadBps != null) __obj.updateDynamic("BlkioDeviceReadBps")(BlkioDeviceReadBps)
    if (BlkioDeviceReadIOps != null) __obj.updateDynamic("BlkioDeviceReadIOps")(BlkioDeviceReadIOps)
    if (BlkioDeviceWriteBps != null) __obj.updateDynamic("BlkioDeviceWriteBps")(BlkioDeviceWriteBps)
    if (BlkioDeviceWriteIOps != null) __obj.updateDynamic("BlkioDeviceWriteIOps")(BlkioDeviceWriteIOps)
    if (BlkioWeightDevice != null) __obj.updateDynamic("BlkioWeightDevice")(BlkioWeightDevice)
    if (CapAdd != null) __obj.updateDynamic("CapAdd")(CapAdd)
    if (CapDrop != null) __obj.updateDynamic("CapDrop")(CapDrop)
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (ExtraHosts != null) __obj.updateDynamic("ExtraHosts")(ExtraHosts)
    if (Links != null) __obj.updateDynamic("Links")(Links)
    if (PortBindings != null) __obj.updateDynamic("PortBindings")(PortBindings)
    if (SecurityOpt != null) __obj.updateDynamic("SecurityOpt")(SecurityOpt)
    if (Ulimits != null) __obj.updateDynamic("Ulimits")(Ulimits)
    if (VolumesFrom != null) __obj.updateDynamic("VolumesFrom")(VolumesFrom)
    __obj.asInstanceOf[HostConfig]
  }
}

