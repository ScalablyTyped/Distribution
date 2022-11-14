package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostConfig extends StObject {
  
  var AutoRemove: js.UndefOr[Boolean] = js.undefined
  
  var Binds: js.UndefOr[js.Array[String]] = js.undefined
  
  var BlkioDeviceReadBps: js.UndefOr[Any] = js.undefined
  
  var BlkioDeviceReadIOps: js.UndefOr[Any] = js.undefined
  
  var BlkioDeviceWriteBps: js.UndefOr[Any] = js.undefined
  
  var BlkioDeviceWriteIOps: js.UndefOr[Any] = js.undefined
  
  var BlkioWeight: js.UndefOr[Double] = js.undefined
  
  var BlkioWeightDevice: js.UndefOr[Any] = js.undefined
  
  var CapAdd: js.UndefOr[Any] = js.undefined
  
  var CapDrop: js.UndefOr[Any] = js.undefined
  
  var Cgroup: js.UndefOr[String] = js.undefined
  
  var CgroupParent: js.UndefOr[String] = js.undefined
  
  var ConsoleSize: js.UndefOr[js.Array[Double]] = js.undefined
  
  var ContainerIDFile: js.UndefOr[String] = js.undefined
  
  var CpuCount: js.UndefOr[Double] = js.undefined
  
  var CpuPercent: js.UndefOr[Double] = js.undefined
  
  var CpuPeriod: js.UndefOr[Double] = js.undefined
  
  var CpuQuota: js.UndefOr[Double] = js.undefined
  
  var CpuRealtimePeriod: js.UndefOr[Double] = js.undefined
  
  var CpuRealtimeRuntime: js.UndefOr[Double] = js.undefined
  
  var CpuShares: js.UndefOr[Double] = js.undefined
  
  var CpusetCpus: js.UndefOr[String] = js.undefined
  
  var CpusetMems: js.UndefOr[String] = js.undefined
  
  var DeviceCgroupRules: js.UndefOr[js.Array[String]] = js.undefined
  
  var DeviceRequests: js.UndefOr[js.Array[DeviceRequest]] = js.undefined
  
  var Devices: js.UndefOr[Any] = js.undefined
  
  var DiskQuota: js.UndefOr[Double] = js.undefined
  
  var Dns: js.UndefOr[js.Array[Any]] = js.undefined
  
  var DnsOptions: js.UndefOr[js.Array[Any]] = js.undefined
  
  var DnsSearch: js.UndefOr[js.Array[String]] = js.undefined
  
  var ExtraHosts: js.UndefOr[Any] = js.undefined
  
  var GroupAdd: js.UndefOr[js.Array[String]] = js.undefined
  
  var Init: js.UndefOr[Boolean] = js.undefined
  
  var IpcMode: js.UndefOr[String] = js.undefined
  
  var Isolation: js.UndefOr[String] = js.undefined
  
  var KernelMemory: js.UndefOr[Double] = js.undefined
  
  var Links: js.UndefOr[Any] = js.undefined
  
  var LogConfig: js.UndefOr[Type] = js.undefined
  
  var MaskedPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var Memory: js.UndefOr[Double] = js.undefined
  
  var MemoryReservation: js.UndefOr[Double] = js.undefined
  
  var MemorySwap: js.UndefOr[Double] = js.undefined
  
  var MemorySwappiness: js.UndefOr[Double] = js.undefined
  
  var Mounts: js.UndefOr[MountConfig] = js.undefined
  
  var NanoCpus: js.UndefOr[Double] = js.undefined
  
  var NetworkMode: js.UndefOr[String] = js.undefined
  
  var OomKillDisable: js.UndefOr[Boolean] = js.undefined
  
  var OomScoreAdj: js.UndefOr[Double] = js.undefined
  
  var PidMode: js.UndefOr[String] = js.undefined
  
  var PidsLimit: js.UndefOr[Double] = js.undefined
  
  var PortBindings: js.UndefOr[Any] = js.undefined
  
  var Privileged: js.UndefOr[Boolean] = js.undefined
  
  var PublishAllPorts: js.UndefOr[Boolean] = js.undefined
  
  var ReadonlyPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var ReadonlyRootfs: js.UndefOr[Boolean] = js.undefined
  
  var RestartPolicy: js.UndefOr[HostRestartPolicy] = js.undefined
  
  var Runtime: js.UndefOr[String] = js.undefined
  
  var SecurityOpt: js.UndefOr[Any] = js.undefined
  
  var ShmSize: js.UndefOr[Double] = js.undefined
  
  var StorageOpt: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Sysctls: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Tmpfs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var UTSMode: js.UndefOr[String] = js.undefined
  
  var Ulimits: js.UndefOr[Any] = js.undefined
  
  var UsernsMode: js.UndefOr[String] = js.undefined
  
  var VolumeDriver: js.UndefOr[String] = js.undefined
  
  var VolumesFrom: js.UndefOr[Any] = js.undefined
}
object HostConfig {
  
  inline def apply(): HostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostConfig]
  }
  
  extension [Self <: HostConfig](x: Self) {
    
    inline def setAutoRemove(value: Boolean): Self = StObject.set(x, "AutoRemove", value.asInstanceOf[js.Any])
    
    inline def setAutoRemoveUndefined: Self = StObject.set(x, "AutoRemove", js.undefined)
    
    inline def setBinds(value: js.Array[String]): Self = StObject.set(x, "Binds", value.asInstanceOf[js.Any])
    
    inline def setBindsUndefined: Self = StObject.set(x, "Binds", js.undefined)
    
    inline def setBindsVarargs(value: String*): Self = StObject.set(x, "Binds", js.Array(value*))
    
    inline def setBlkioDeviceReadBps(value: Any): Self = StObject.set(x, "BlkioDeviceReadBps", value.asInstanceOf[js.Any])
    
    inline def setBlkioDeviceReadBpsUndefined: Self = StObject.set(x, "BlkioDeviceReadBps", js.undefined)
    
    inline def setBlkioDeviceReadIOps(value: Any): Self = StObject.set(x, "BlkioDeviceReadIOps", value.asInstanceOf[js.Any])
    
    inline def setBlkioDeviceReadIOpsUndefined: Self = StObject.set(x, "BlkioDeviceReadIOps", js.undefined)
    
    inline def setBlkioDeviceWriteBps(value: Any): Self = StObject.set(x, "BlkioDeviceWriteBps", value.asInstanceOf[js.Any])
    
    inline def setBlkioDeviceWriteBpsUndefined: Self = StObject.set(x, "BlkioDeviceWriteBps", js.undefined)
    
    inline def setBlkioDeviceWriteIOps(value: Any): Self = StObject.set(x, "BlkioDeviceWriteIOps", value.asInstanceOf[js.Any])
    
    inline def setBlkioDeviceWriteIOpsUndefined: Self = StObject.set(x, "BlkioDeviceWriteIOps", js.undefined)
    
    inline def setBlkioWeight(value: Double): Self = StObject.set(x, "BlkioWeight", value.asInstanceOf[js.Any])
    
    inline def setBlkioWeightDevice(value: Any): Self = StObject.set(x, "BlkioWeightDevice", value.asInstanceOf[js.Any])
    
    inline def setBlkioWeightDeviceUndefined: Self = StObject.set(x, "BlkioWeightDevice", js.undefined)
    
    inline def setBlkioWeightUndefined: Self = StObject.set(x, "BlkioWeight", js.undefined)
    
    inline def setCapAdd(value: Any): Self = StObject.set(x, "CapAdd", value.asInstanceOf[js.Any])
    
    inline def setCapAddUndefined: Self = StObject.set(x, "CapAdd", js.undefined)
    
    inline def setCapDrop(value: Any): Self = StObject.set(x, "CapDrop", value.asInstanceOf[js.Any])
    
    inline def setCapDropUndefined: Self = StObject.set(x, "CapDrop", js.undefined)
    
    inline def setCgroup(value: String): Self = StObject.set(x, "Cgroup", value.asInstanceOf[js.Any])
    
    inline def setCgroupParent(value: String): Self = StObject.set(x, "CgroupParent", value.asInstanceOf[js.Any])
    
    inline def setCgroupParentUndefined: Self = StObject.set(x, "CgroupParent", js.undefined)
    
    inline def setCgroupUndefined: Self = StObject.set(x, "Cgroup", js.undefined)
    
    inline def setConsoleSize(value: js.Array[Double]): Self = StObject.set(x, "ConsoleSize", value.asInstanceOf[js.Any])
    
    inline def setConsoleSizeUndefined: Self = StObject.set(x, "ConsoleSize", js.undefined)
    
    inline def setConsoleSizeVarargs(value: Double*): Self = StObject.set(x, "ConsoleSize", js.Array(value*))
    
    inline def setContainerIDFile(value: String): Self = StObject.set(x, "ContainerIDFile", value.asInstanceOf[js.Any])
    
    inline def setContainerIDFileUndefined: Self = StObject.set(x, "ContainerIDFile", js.undefined)
    
    inline def setCpuCount(value: Double): Self = StObject.set(x, "CpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "CpuCount", js.undefined)
    
    inline def setCpuPercent(value: Double): Self = StObject.set(x, "CpuPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuPercentUndefined: Self = StObject.set(x, "CpuPercent", js.undefined)
    
    inline def setCpuPeriod(value: Double): Self = StObject.set(x, "CpuPeriod", value.asInstanceOf[js.Any])
    
    inline def setCpuPeriodUndefined: Self = StObject.set(x, "CpuPeriod", js.undefined)
    
    inline def setCpuQuota(value: Double): Self = StObject.set(x, "CpuQuota", value.asInstanceOf[js.Any])
    
    inline def setCpuQuotaUndefined: Self = StObject.set(x, "CpuQuota", js.undefined)
    
    inline def setCpuRealtimePeriod(value: Double): Self = StObject.set(x, "CpuRealtimePeriod", value.asInstanceOf[js.Any])
    
    inline def setCpuRealtimePeriodUndefined: Self = StObject.set(x, "CpuRealtimePeriod", js.undefined)
    
    inline def setCpuRealtimeRuntime(value: Double): Self = StObject.set(x, "CpuRealtimeRuntime", value.asInstanceOf[js.Any])
    
    inline def setCpuRealtimeRuntimeUndefined: Self = StObject.set(x, "CpuRealtimeRuntime", js.undefined)
    
    inline def setCpuShares(value: Double): Self = StObject.set(x, "CpuShares", value.asInstanceOf[js.Any])
    
    inline def setCpuSharesUndefined: Self = StObject.set(x, "CpuShares", js.undefined)
    
    inline def setCpusetCpus(value: String): Self = StObject.set(x, "CpusetCpus", value.asInstanceOf[js.Any])
    
    inline def setCpusetCpusUndefined: Self = StObject.set(x, "CpusetCpus", js.undefined)
    
    inline def setCpusetMems(value: String): Self = StObject.set(x, "CpusetMems", value.asInstanceOf[js.Any])
    
    inline def setCpusetMemsUndefined: Self = StObject.set(x, "CpusetMems", js.undefined)
    
    inline def setDeviceCgroupRules(value: js.Array[String]): Self = StObject.set(x, "DeviceCgroupRules", value.asInstanceOf[js.Any])
    
    inline def setDeviceCgroupRulesUndefined: Self = StObject.set(x, "DeviceCgroupRules", js.undefined)
    
    inline def setDeviceCgroupRulesVarargs(value: String*): Self = StObject.set(x, "DeviceCgroupRules", js.Array(value*))
    
    inline def setDeviceRequests(value: js.Array[DeviceRequest]): Self = StObject.set(x, "DeviceRequests", value.asInstanceOf[js.Any])
    
    inline def setDeviceRequestsUndefined: Self = StObject.set(x, "DeviceRequests", js.undefined)
    
    inline def setDeviceRequestsVarargs(value: DeviceRequest*): Self = StObject.set(x, "DeviceRequests", js.Array(value*))
    
    inline def setDevices(value: Any): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDiskQuota(value: Double): Self = StObject.set(x, "DiskQuota", value.asInstanceOf[js.Any])
    
    inline def setDiskQuotaUndefined: Self = StObject.set(x, "DiskQuota", js.undefined)
    
    inline def setDns(value: js.Array[Any]): Self = StObject.set(x, "Dns", value.asInstanceOf[js.Any])
    
    inline def setDnsOptions(value: js.Array[Any]): Self = StObject.set(x, "DnsOptions", value.asInstanceOf[js.Any])
    
    inline def setDnsOptionsUndefined: Self = StObject.set(x, "DnsOptions", js.undefined)
    
    inline def setDnsOptionsVarargs(value: Any*): Self = StObject.set(x, "DnsOptions", js.Array(value*))
    
    inline def setDnsSearch(value: js.Array[String]): Self = StObject.set(x, "DnsSearch", value.asInstanceOf[js.Any])
    
    inline def setDnsSearchUndefined: Self = StObject.set(x, "DnsSearch", js.undefined)
    
    inline def setDnsSearchVarargs(value: String*): Self = StObject.set(x, "DnsSearch", js.Array(value*))
    
    inline def setDnsUndefined: Self = StObject.set(x, "Dns", js.undefined)
    
    inline def setDnsVarargs(value: Any*): Self = StObject.set(x, "Dns", js.Array(value*))
    
    inline def setExtraHosts(value: Any): Self = StObject.set(x, "ExtraHosts", value.asInstanceOf[js.Any])
    
    inline def setExtraHostsUndefined: Self = StObject.set(x, "ExtraHosts", js.undefined)
    
    inline def setGroupAdd(value: js.Array[String]): Self = StObject.set(x, "GroupAdd", value.asInstanceOf[js.Any])
    
    inline def setGroupAddUndefined: Self = StObject.set(x, "GroupAdd", js.undefined)
    
    inline def setGroupAddVarargs(value: String*): Self = StObject.set(x, "GroupAdd", js.Array(value*))
    
    inline def setInit(value: Boolean): Self = StObject.set(x, "Init", value.asInstanceOf[js.Any])
    
    inline def setInitUndefined: Self = StObject.set(x, "Init", js.undefined)
    
    inline def setIpcMode(value: String): Self = StObject.set(x, "IpcMode", value.asInstanceOf[js.Any])
    
    inline def setIpcModeUndefined: Self = StObject.set(x, "IpcMode", js.undefined)
    
    inline def setIsolation(value: String): Self = StObject.set(x, "Isolation", value.asInstanceOf[js.Any])
    
    inline def setIsolationUndefined: Self = StObject.set(x, "Isolation", js.undefined)
    
    inline def setKernelMemory(value: Double): Self = StObject.set(x, "KernelMemory", value.asInstanceOf[js.Any])
    
    inline def setKernelMemoryUndefined: Self = StObject.set(x, "KernelMemory", js.undefined)
    
    inline def setLinks(value: Any): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    inline def setLogConfig(value: Type): Self = StObject.set(x, "LogConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "LogConfig", js.undefined)
    
    inline def setMaskedPaths(value: js.Array[String]): Self = StObject.set(x, "MaskedPaths", value.asInstanceOf[js.Any])
    
    inline def setMaskedPathsUndefined: Self = StObject.set(x, "MaskedPaths", js.undefined)
    
    inline def setMaskedPathsVarargs(value: String*): Self = StObject.set(x, "MaskedPaths", js.Array(value*))
    
    inline def setMemory(value: Double): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservation(value: Double): Self = StObject.set(x, "MemoryReservation", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservationUndefined: Self = StObject.set(x, "MemoryReservation", js.undefined)
    
    inline def setMemorySwap(value: Double): Self = StObject.set(x, "MemorySwap", value.asInstanceOf[js.Any])
    
    inline def setMemorySwapUndefined: Self = StObject.set(x, "MemorySwap", js.undefined)
    
    inline def setMemorySwappiness(value: Double): Self = StObject.set(x, "MemorySwappiness", value.asInstanceOf[js.Any])
    
    inline def setMemorySwappinessUndefined: Self = StObject.set(x, "MemorySwappiness", js.undefined)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    inline def setMounts(value: MountConfig): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsUndefined: Self = StObject.set(x, "Mounts", js.undefined)
    
    inline def setMountsVarargs(value: MountSettings*): Self = StObject.set(x, "Mounts", js.Array(value*))
    
    inline def setNanoCpus(value: Double): Self = StObject.set(x, "NanoCpus", value.asInstanceOf[js.Any])
    
    inline def setNanoCpusUndefined: Self = StObject.set(x, "NanoCpus", js.undefined)
    
    inline def setNetworkMode(value: String): Self = StObject.set(x, "NetworkMode", value.asInstanceOf[js.Any])
    
    inline def setNetworkModeUndefined: Self = StObject.set(x, "NetworkMode", js.undefined)
    
    inline def setOomKillDisable(value: Boolean): Self = StObject.set(x, "OomKillDisable", value.asInstanceOf[js.Any])
    
    inline def setOomKillDisableUndefined: Self = StObject.set(x, "OomKillDisable", js.undefined)
    
    inline def setOomScoreAdj(value: Double): Self = StObject.set(x, "OomScoreAdj", value.asInstanceOf[js.Any])
    
    inline def setOomScoreAdjUndefined: Self = StObject.set(x, "OomScoreAdj", js.undefined)
    
    inline def setPidMode(value: String): Self = StObject.set(x, "PidMode", value.asInstanceOf[js.Any])
    
    inline def setPidModeUndefined: Self = StObject.set(x, "PidMode", js.undefined)
    
    inline def setPidsLimit(value: Double): Self = StObject.set(x, "PidsLimit", value.asInstanceOf[js.Any])
    
    inline def setPidsLimitUndefined: Self = StObject.set(x, "PidsLimit", js.undefined)
    
    inline def setPortBindings(value: Any): Self = StObject.set(x, "PortBindings", value.asInstanceOf[js.Any])
    
    inline def setPortBindingsUndefined: Self = StObject.set(x, "PortBindings", js.undefined)
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    inline def setPublishAllPorts(value: Boolean): Self = StObject.set(x, "PublishAllPorts", value.asInstanceOf[js.Any])
    
    inline def setPublishAllPortsUndefined: Self = StObject.set(x, "PublishAllPorts", js.undefined)
    
    inline def setReadonlyPaths(value: js.Array[String]): Self = StObject.set(x, "ReadonlyPaths", value.asInstanceOf[js.Any])
    
    inline def setReadonlyPathsUndefined: Self = StObject.set(x, "ReadonlyPaths", js.undefined)
    
    inline def setReadonlyPathsVarargs(value: String*): Self = StObject.set(x, "ReadonlyPaths", js.Array(value*))
    
    inline def setReadonlyRootfs(value: Boolean): Self = StObject.set(x, "ReadonlyRootfs", value.asInstanceOf[js.Any])
    
    inline def setReadonlyRootfsUndefined: Self = StObject.set(x, "ReadonlyRootfs", js.undefined)
    
    inline def setRestartPolicy(value: HostRestartPolicy): Self = StObject.set(x, "RestartPolicy", value.asInstanceOf[js.Any])
    
    inline def setRestartPolicyUndefined: Self = StObject.set(x, "RestartPolicy", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    inline def setSecurityOpt(value: Any): Self = StObject.set(x, "SecurityOpt", value.asInstanceOf[js.Any])
    
    inline def setSecurityOptUndefined: Self = StObject.set(x, "SecurityOpt", js.undefined)
    
    inline def setShmSize(value: Double): Self = StObject.set(x, "ShmSize", value.asInstanceOf[js.Any])
    
    inline def setShmSizeUndefined: Self = StObject.set(x, "ShmSize", js.undefined)
    
    inline def setStorageOpt(value: StringDictionary[String]): Self = StObject.set(x, "StorageOpt", value.asInstanceOf[js.Any])
    
    inline def setStorageOptUndefined: Self = StObject.set(x, "StorageOpt", js.undefined)
    
    inline def setSysctls(value: StringDictionary[String]): Self = StObject.set(x, "Sysctls", value.asInstanceOf[js.Any])
    
    inline def setSysctlsUndefined: Self = StObject.set(x, "Sysctls", js.undefined)
    
    inline def setTmpfs(value: StringDictionary[String]): Self = StObject.set(x, "Tmpfs", value.asInstanceOf[js.Any])
    
    inline def setTmpfsUndefined: Self = StObject.set(x, "Tmpfs", js.undefined)
    
    inline def setUTSMode(value: String): Self = StObject.set(x, "UTSMode", value.asInstanceOf[js.Any])
    
    inline def setUTSModeUndefined: Self = StObject.set(x, "UTSMode", js.undefined)
    
    inline def setUlimits(value: Any): Self = StObject.set(x, "Ulimits", value.asInstanceOf[js.Any])
    
    inline def setUlimitsUndefined: Self = StObject.set(x, "Ulimits", js.undefined)
    
    inline def setUsernsMode(value: String): Self = StObject.set(x, "UsernsMode", value.asInstanceOf[js.Any])
    
    inline def setUsernsModeUndefined: Self = StObject.set(x, "UsernsMode", js.undefined)
    
    inline def setVolumeDriver(value: String): Self = StObject.set(x, "VolumeDriver", value.asInstanceOf[js.Any])
    
    inline def setVolumeDriverUndefined: Self = StObject.set(x, "VolumeDriver", js.undefined)
    
    inline def setVolumesFrom(value: Any): Self = StObject.set(x, "VolumesFrom", value.asInstanceOf[js.Any])
    
    inline def setVolumesFromUndefined: Self = StObject.set(x, "VolumesFrom", js.undefined)
  }
}
