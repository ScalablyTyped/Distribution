package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostConfig extends js.Object {
  var AutoRemove: js.UndefOr[scala.Boolean] = js.undefined
  var Binds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var BlkioDeviceReadBps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceReadIOps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceWriteBps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceWriteIOps: js.UndefOr[js.Any] = js.undefined
  var BlkioWeight: js.UndefOr[scala.Double] = js.undefined
  var BlkioWeightDevice: js.UndefOr[js.Any] = js.undefined
  var CapAdd: js.UndefOr[js.Any] = js.undefined
  var CapDrop: js.UndefOr[js.Any] = js.undefined
  var Cgroup: js.UndefOr[java.lang.String] = js.undefined
  var CgroupParent: js.UndefOr[java.lang.String] = js.undefined
  var ConsoleSize: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var ContainerIDFile: js.UndefOr[java.lang.String] = js.undefined
  var CpuPeriod: js.UndefOr[scala.Double] = js.undefined
  var CpuQuota: js.UndefOr[scala.Double] = js.undefined
  var CpuShares: js.UndefOr[scala.Double] = js.undefined
  var CpusetCpus: js.UndefOr[java.lang.String] = js.undefined
  var CpusetMems: js.UndefOr[java.lang.String] = js.undefined
  var Devices: js.UndefOr[js.Any] = js.undefined
  var DiskQuota: js.UndefOr[scala.Double] = js.undefined
  var Dns: js.UndefOr[js.Array[_]] = js.undefined
  var DnsOptions: js.UndefOr[js.Array[_]] = js.undefined
  var DnsSearch: js.UndefOr[js.Array[_]] = js.undefined
  var ExtraHosts: js.UndefOr[js.Any] = js.undefined
  var GroupAdd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var IpcMode: js.UndefOr[java.lang.String] = js.undefined
  var Isolation: js.UndefOr[java.lang.String] = js.undefined
  var KernelMemory: js.UndefOr[scala.Double] = js.undefined
  var Links: js.UndefOr[js.Any] = js.undefined
  var LogConfig: js.UndefOr[dockerodeLib.Anon_Config] = js.undefined
  var MaskedPaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var Memory: js.UndefOr[scala.Double] = js.undefined
  var MemoryReservation: js.UndefOr[scala.Double] = js.undefined
  var MemorySwap: js.UndefOr[scala.Double] = js.undefined
  var MemorySwappiness: js.UndefOr[scala.Double] = js.undefined
  var Mounts: js.UndefOr[MountConfig] = js.undefined
  var NetworkMode: js.UndefOr[java.lang.String] = js.undefined
  var OomKillDisable: js.UndefOr[scala.Boolean] = js.undefined
  var OomScoreAdj: js.UndefOr[scala.Double] = js.undefined
  var PidMode: js.UndefOr[java.lang.String] = js.undefined
  var PidsLimit: js.UndefOr[scala.Double] = js.undefined
  var PortBindings: js.UndefOr[js.Any] = js.undefined
  var Privileged: js.UndefOr[scala.Boolean] = js.undefined
  var PublishAllPorts: js.UndefOr[scala.Boolean] = js.undefined
  var ReadonlyPaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ReadonlyRootfs: js.UndefOr[scala.Boolean] = js.undefined
  var RestartPolicy: js.UndefOr[RestartPolicy] = js.undefined
  var Runtime: js.UndefOr[java.lang.String] = js.undefined
  var SecurityOpt: js.UndefOr[js.Any] = js.undefined
  var ShmSize: js.UndefOr[scala.Double] = js.undefined
  var StorageOpt: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Sysctls: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Tmpfs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var UTSMode: js.UndefOr[java.lang.String] = js.undefined
  var Ulimits: js.UndefOr[js.Any] = js.undefined
  var UsernsMode: js.UndefOr[java.lang.String] = js.undefined
  var VolumeDriver: js.UndefOr[java.lang.String] = js.undefined
  var VolumesFrom: js.UndefOr[js.Any] = js.undefined
}

object HostConfig {
  @scala.inline
  def apply(
    AutoRemove: js.UndefOr[scala.Boolean] = js.undefined,
    Binds: js.Array[java.lang.String] = null,
    BlkioDeviceReadBps: js.Any = null,
    BlkioDeviceReadIOps: js.Any = null,
    BlkioDeviceWriteBps: js.Any = null,
    BlkioDeviceWriteIOps: js.Any = null,
    BlkioWeight: scala.Int | scala.Double = null,
    BlkioWeightDevice: js.Any = null,
    CapAdd: js.Any = null,
    CapDrop: js.Any = null,
    Cgroup: java.lang.String = null,
    CgroupParent: java.lang.String = null,
    ConsoleSize: js.Array[scala.Double] = null,
    ContainerIDFile: java.lang.String = null,
    CpuPeriod: scala.Int | scala.Double = null,
    CpuQuota: scala.Int | scala.Double = null,
    CpuShares: scala.Int | scala.Double = null,
    CpusetCpus: java.lang.String = null,
    CpusetMems: java.lang.String = null,
    Devices: js.Any = null,
    DiskQuota: scala.Int | scala.Double = null,
    Dns: js.Array[_] = null,
    DnsOptions: js.Array[_] = null,
    DnsSearch: js.Array[_] = null,
    ExtraHosts: js.Any = null,
    GroupAdd: js.Array[java.lang.String] = null,
    IpcMode: java.lang.String = null,
    Isolation: java.lang.String = null,
    KernelMemory: scala.Int | scala.Double = null,
    Links: js.Any = null,
    LogConfig: dockerodeLib.Anon_Config = null,
    MaskedPaths: js.Array[java.lang.String] = null,
    Memory: scala.Int | scala.Double = null,
    MemoryReservation: scala.Int | scala.Double = null,
    MemorySwap: scala.Int | scala.Double = null,
    MemorySwappiness: scala.Int | scala.Double = null,
    Mounts: MountConfig = null,
    NetworkMode: java.lang.String = null,
    OomKillDisable: js.UndefOr[scala.Boolean] = js.undefined,
    OomScoreAdj: scala.Int | scala.Double = null,
    PidMode: java.lang.String = null,
    PidsLimit: scala.Int | scala.Double = null,
    PortBindings: js.Any = null,
    Privileged: js.UndefOr[scala.Boolean] = js.undefined,
    PublishAllPorts: js.UndefOr[scala.Boolean] = js.undefined,
    ReadonlyPaths: js.Array[java.lang.String] = null,
    ReadonlyRootfs: js.UndefOr[scala.Boolean] = js.undefined,
    RestartPolicy: RestartPolicy = null,
    Runtime: java.lang.String = null,
    SecurityOpt: js.Any = null,
    ShmSize: scala.Int | scala.Double = null,
    StorageOpt: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Sysctls: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Tmpfs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    UTSMode: java.lang.String = null,
    Ulimits: js.Any = null,
    UsernsMode: java.lang.String = null,
    VolumeDriver: java.lang.String = null,
    VolumesFrom: js.Any = null
  ): HostConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoRemove)) __obj.updateDynamic("AutoRemove")(AutoRemove)
    if (Binds != null) __obj.updateDynamic("Binds")(Binds)
    if (BlkioDeviceReadBps != null) __obj.updateDynamic("BlkioDeviceReadBps")(BlkioDeviceReadBps)
    if (BlkioDeviceReadIOps != null) __obj.updateDynamic("BlkioDeviceReadIOps")(BlkioDeviceReadIOps)
    if (BlkioDeviceWriteBps != null) __obj.updateDynamic("BlkioDeviceWriteBps")(BlkioDeviceWriteBps)
    if (BlkioDeviceWriteIOps != null) __obj.updateDynamic("BlkioDeviceWriteIOps")(BlkioDeviceWriteIOps)
    if (BlkioWeight != null) __obj.updateDynamic("BlkioWeight")(BlkioWeight.asInstanceOf[js.Any])
    if (BlkioWeightDevice != null) __obj.updateDynamic("BlkioWeightDevice")(BlkioWeightDevice)
    if (CapAdd != null) __obj.updateDynamic("CapAdd")(CapAdd)
    if (CapDrop != null) __obj.updateDynamic("CapDrop")(CapDrop)
    if (Cgroup != null) __obj.updateDynamic("Cgroup")(Cgroup)
    if (CgroupParent != null) __obj.updateDynamic("CgroupParent")(CgroupParent)
    if (ConsoleSize != null) __obj.updateDynamic("ConsoleSize")(ConsoleSize)
    if (ContainerIDFile != null) __obj.updateDynamic("ContainerIDFile")(ContainerIDFile)
    if (CpuPeriod != null) __obj.updateDynamic("CpuPeriod")(CpuPeriod.asInstanceOf[js.Any])
    if (CpuQuota != null) __obj.updateDynamic("CpuQuota")(CpuQuota.asInstanceOf[js.Any])
    if (CpuShares != null) __obj.updateDynamic("CpuShares")(CpuShares.asInstanceOf[js.Any])
    if (CpusetCpus != null) __obj.updateDynamic("CpusetCpus")(CpusetCpus)
    if (CpusetMems != null) __obj.updateDynamic("CpusetMems")(CpusetMems)
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (DiskQuota != null) __obj.updateDynamic("DiskQuota")(DiskQuota.asInstanceOf[js.Any])
    if (Dns != null) __obj.updateDynamic("Dns")(Dns)
    if (DnsOptions != null) __obj.updateDynamic("DnsOptions")(DnsOptions)
    if (DnsSearch != null) __obj.updateDynamic("DnsSearch")(DnsSearch)
    if (ExtraHosts != null) __obj.updateDynamic("ExtraHosts")(ExtraHosts)
    if (GroupAdd != null) __obj.updateDynamic("GroupAdd")(GroupAdd)
    if (IpcMode != null) __obj.updateDynamic("IpcMode")(IpcMode)
    if (Isolation != null) __obj.updateDynamic("Isolation")(Isolation)
    if (KernelMemory != null) __obj.updateDynamic("KernelMemory")(KernelMemory.asInstanceOf[js.Any])
    if (Links != null) __obj.updateDynamic("Links")(Links)
    if (LogConfig != null) __obj.updateDynamic("LogConfig")(LogConfig)
    if (MaskedPaths != null) __obj.updateDynamic("MaskedPaths")(MaskedPaths)
    if (Memory != null) __obj.updateDynamic("Memory")(Memory.asInstanceOf[js.Any])
    if (MemoryReservation != null) __obj.updateDynamic("MemoryReservation")(MemoryReservation.asInstanceOf[js.Any])
    if (MemorySwap != null) __obj.updateDynamic("MemorySwap")(MemorySwap.asInstanceOf[js.Any])
    if (MemorySwappiness != null) __obj.updateDynamic("MemorySwappiness")(MemorySwappiness.asInstanceOf[js.Any])
    if (Mounts != null) __obj.updateDynamic("Mounts")(Mounts)
    if (NetworkMode != null) __obj.updateDynamic("NetworkMode")(NetworkMode)
    if (!js.isUndefined(OomKillDisable)) __obj.updateDynamic("OomKillDisable")(OomKillDisable)
    if (OomScoreAdj != null) __obj.updateDynamic("OomScoreAdj")(OomScoreAdj.asInstanceOf[js.Any])
    if (PidMode != null) __obj.updateDynamic("PidMode")(PidMode)
    if (PidsLimit != null) __obj.updateDynamic("PidsLimit")(PidsLimit.asInstanceOf[js.Any])
    if (PortBindings != null) __obj.updateDynamic("PortBindings")(PortBindings)
    if (!js.isUndefined(Privileged)) __obj.updateDynamic("Privileged")(Privileged)
    if (!js.isUndefined(PublishAllPorts)) __obj.updateDynamic("PublishAllPorts")(PublishAllPorts)
    if (ReadonlyPaths != null) __obj.updateDynamic("ReadonlyPaths")(ReadonlyPaths)
    if (!js.isUndefined(ReadonlyRootfs)) __obj.updateDynamic("ReadonlyRootfs")(ReadonlyRootfs)
    if (RestartPolicy != null) __obj.updateDynamic("RestartPolicy")(RestartPolicy)
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime)
    if (SecurityOpt != null) __obj.updateDynamic("SecurityOpt")(SecurityOpt)
    if (ShmSize != null) __obj.updateDynamic("ShmSize")(ShmSize.asInstanceOf[js.Any])
    if (StorageOpt != null) __obj.updateDynamic("StorageOpt")(StorageOpt)
    if (Sysctls != null) __obj.updateDynamic("Sysctls")(Sysctls)
    if (Tmpfs != null) __obj.updateDynamic("Tmpfs")(Tmpfs)
    if (UTSMode != null) __obj.updateDynamic("UTSMode")(UTSMode)
    if (Ulimits != null) __obj.updateDynamic("Ulimits")(Ulimits)
    if (UsernsMode != null) __obj.updateDynamic("UsernsMode")(UsernsMode)
    if (VolumeDriver != null) __obj.updateDynamic("VolumeDriver")(VolumeDriver)
    if (VolumesFrom != null) __obj.updateDynamic("VolumesFrom")(VolumesFrom)
    __obj.asInstanceOf[HostConfig]
  }
}

