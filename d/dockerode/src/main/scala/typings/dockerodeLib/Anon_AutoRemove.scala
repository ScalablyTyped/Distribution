package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoRemove extends js.Object {
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
  var Devices: js.UndefOr[js.Array[dockerodeLib.dockerodeMod.DeviceMapping]] = js.undefined
  var Dns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var DnsOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var DnsSearch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ExtraHosts: js.UndefOr[js.Any] = js.undefined
  var GroupAdd: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var KernelMemory: js.UndefOr[scala.Double] = js.undefined
  var Links: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var LogConfig: js.UndefOr[dockerodeLib.dockerodeMod.LogConfig] = js.undefined
  var MaximumIOps: js.UndefOr[scala.Double] = js.undefined
  var MaxmimumIOBps: js.UndefOr[scala.Double] = js.undefined
  var Memory: js.UndefOr[scala.Double] = js.undefined
  var MemoryReservation: js.UndefOr[scala.Double] = js.undefined
  var MemorySwap: js.UndefOr[scala.Double] = js.undefined
  var MemorySwappiness: js.UndefOr[scala.Double] = js.undefined
  var Mounts: js.UndefOr[dockerodeLib.dockerodeMod.MountConfig] = js.undefined
  var NetworkMode: js.UndefOr[java.lang.String] = js.undefined
  var OomKillDisable: js.UndefOr[scala.Boolean] = js.undefined
  var OomScoreAdj: js.UndefOr[scala.Double] = js.undefined
  var PidMode: js.UndefOr[java.lang.String] = js.undefined
  var PidsLimit: js.UndefOr[scala.Double] = js.undefined
  var PortBindings: js.UndefOr[dockerodeLib.dockerodeMod.PortMap] = js.undefined
  var Privileged: js.UndefOr[scala.Boolean] = js.undefined
  var PublishAllPorts: js.UndefOr[scala.Boolean] = js.undefined
  var ReadonlyRootfs: js.UndefOr[scala.Boolean] = js.undefined
  var RestartPolicy: js.UndefOr[dockerodeLib.dockerodeMod.RestartPolicy] = js.undefined
  var SecurityOpt: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var ShmSize: js.UndefOr[scala.Double] = js.undefined
  var Sysctls: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var Ulimits: js.UndefOr[js.Array[js.Object]] = js.undefined
  var VolumeDriver: js.UndefOr[java.lang.String] = js.undefined
  var VolumesFrom: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AutoRemove {
  @scala.inline
  def apply(
    AutoRemove: js.UndefOr[scala.Boolean] = js.undefined,
    Binds: js.Array[java.lang.String] = null,
    BlkioDeviceReadBps: js.Array[js.Object] = null,
    BlkioDeviceReadIOps: js.Array[js.Object] = null,
    BlkioDeviceWriteBps: js.Array[js.Object] = null,
    BlkioDeviceWriteIOps: js.Array[js.Object] = null,
    BlkioWeightDevice: js.Array[js.Object] = null,
    CapAdd: js.Array[java.lang.String] = null,
    CapDrop: js.Array[java.lang.String] = null,
    CgroupParent: java.lang.String = null,
    CpuPercent: scala.Int | scala.Double = null,
    CpuPeriod: scala.Int | scala.Double = null,
    CpuQuota: scala.Int | scala.Double = null,
    CpuShares: scala.Int | scala.Double = null,
    CpusetMems: java.lang.String = null,
    Devices: js.Array[dockerodeLib.dockerodeMod.DeviceMapping] = null,
    Dns: js.Array[java.lang.String] = null,
    DnsOptions: js.Array[java.lang.String] = null,
    DnsSearch: js.Array[java.lang.String] = null,
    ExtraHosts: js.Any = null,
    GroupAdd: js.Array[java.lang.String] = null,
    KernelMemory: scala.Int | scala.Double = null,
    Links: js.Array[java.lang.String] = null,
    LogConfig: dockerodeLib.dockerodeMod.LogConfig = null,
    MaximumIOps: scala.Int | scala.Double = null,
    MaxmimumIOBps: scala.Int | scala.Double = null,
    Memory: scala.Int | scala.Double = null,
    MemoryReservation: scala.Int | scala.Double = null,
    MemorySwap: scala.Int | scala.Double = null,
    MemorySwappiness: scala.Int | scala.Double = null,
    Mounts: dockerodeLib.dockerodeMod.MountConfig = null,
    NetworkMode: java.lang.String = null,
    OomKillDisable: js.UndefOr[scala.Boolean] = js.undefined,
    OomScoreAdj: scala.Int | scala.Double = null,
    PidMode: java.lang.String = null,
    PidsLimit: scala.Int | scala.Double = null,
    PortBindings: dockerodeLib.dockerodeMod.PortMap = null,
    Privileged: js.UndefOr[scala.Boolean] = js.undefined,
    PublishAllPorts: js.UndefOr[scala.Boolean] = js.undefined,
    ReadonlyRootfs: js.UndefOr[scala.Boolean] = js.undefined,
    RestartPolicy: dockerodeLib.dockerodeMod.RestartPolicy = null,
    SecurityOpt: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ShmSize: scala.Int | scala.Double = null,
    Sysctls: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    Ulimits: js.Array[js.Object] = null,
    VolumeDriver: java.lang.String = null,
    VolumesFrom: js.Array[java.lang.String] = null
  ): Anon_AutoRemove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoRemove)) __obj.updateDynamic("AutoRemove")(AutoRemove)
    if (Binds != null) __obj.updateDynamic("Binds")(Binds)
    if (BlkioDeviceReadBps != null) __obj.updateDynamic("BlkioDeviceReadBps")(BlkioDeviceReadBps)
    if (BlkioDeviceReadIOps != null) __obj.updateDynamic("BlkioDeviceReadIOps")(BlkioDeviceReadIOps)
    if (BlkioDeviceWriteBps != null) __obj.updateDynamic("BlkioDeviceWriteBps")(BlkioDeviceWriteBps)
    if (BlkioDeviceWriteIOps != null) __obj.updateDynamic("BlkioDeviceWriteIOps")(BlkioDeviceWriteIOps)
    if (BlkioWeightDevice != null) __obj.updateDynamic("BlkioWeightDevice")(BlkioWeightDevice)
    if (CapAdd != null) __obj.updateDynamic("CapAdd")(CapAdd)
    if (CapDrop != null) __obj.updateDynamic("CapDrop")(CapDrop)
    if (CgroupParent != null) __obj.updateDynamic("CgroupParent")(CgroupParent)
    if (CpuPercent != null) __obj.updateDynamic("CpuPercent")(CpuPercent.asInstanceOf[js.Any])
    if (CpuPeriod != null) __obj.updateDynamic("CpuPeriod")(CpuPeriod.asInstanceOf[js.Any])
    if (CpuQuota != null) __obj.updateDynamic("CpuQuota")(CpuQuota.asInstanceOf[js.Any])
    if (CpuShares != null) __obj.updateDynamic("CpuShares")(CpuShares.asInstanceOf[js.Any])
    if (CpusetMems != null) __obj.updateDynamic("CpusetMems")(CpusetMems)
    if (Devices != null) __obj.updateDynamic("Devices")(Devices)
    if (Dns != null) __obj.updateDynamic("Dns")(Dns)
    if (DnsOptions != null) __obj.updateDynamic("DnsOptions")(DnsOptions)
    if (DnsSearch != null) __obj.updateDynamic("DnsSearch")(DnsSearch)
    if (ExtraHosts != null) __obj.updateDynamic("ExtraHosts")(ExtraHosts)
    if (GroupAdd != null) __obj.updateDynamic("GroupAdd")(GroupAdd)
    if (KernelMemory != null) __obj.updateDynamic("KernelMemory")(KernelMemory.asInstanceOf[js.Any])
    if (Links != null) __obj.updateDynamic("Links")(Links)
    if (LogConfig != null) __obj.updateDynamic("LogConfig")(LogConfig)
    if (MaximumIOps != null) __obj.updateDynamic("MaximumIOps")(MaximumIOps.asInstanceOf[js.Any])
    if (MaxmimumIOBps != null) __obj.updateDynamic("MaxmimumIOBps")(MaxmimumIOBps.asInstanceOf[js.Any])
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
    if (!js.isUndefined(ReadonlyRootfs)) __obj.updateDynamic("ReadonlyRootfs")(ReadonlyRootfs)
    if (RestartPolicy != null) __obj.updateDynamic("RestartPolicy")(RestartPolicy)
    if (SecurityOpt != null) __obj.updateDynamic("SecurityOpt")(SecurityOpt)
    if (ShmSize != null) __obj.updateDynamic("ShmSize")(ShmSize.asInstanceOf[js.Any])
    if (Sysctls != null) __obj.updateDynamic("Sysctls")(Sysctls)
    if (Ulimits != null) __obj.updateDynamic("Ulimits")(Ulimits)
    if (VolumeDriver != null) __obj.updateDynamic("VolumeDriver")(VolumeDriver)
    if (VolumesFrom != null) __obj.updateDynamic("VolumesFrom")(VolumesFrom)
    __obj.asInstanceOf[Anon_AutoRemove]
  }
}

