package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostConfig extends StObject {
  
  var AutoRemove: js.UndefOr[Boolean] = js.native
  
  var Binds: js.UndefOr[js.Array[String]] = js.native
  
  var BlkioDeviceReadBps: js.UndefOr[js.Any] = js.native
  
  var BlkioDeviceReadIOps: js.UndefOr[js.Any] = js.native
  
  var BlkioDeviceWriteBps: js.UndefOr[js.Any] = js.native
  
  var BlkioDeviceWriteIOps: js.UndefOr[js.Any] = js.native
  
  var BlkioWeight: js.UndefOr[Double] = js.native
  
  var BlkioWeightDevice: js.UndefOr[js.Any] = js.native
  
  var CapAdd: js.UndefOr[js.Any] = js.native
  
  var CapDrop: js.UndefOr[js.Any] = js.native
  
  var Cgroup: js.UndefOr[String] = js.native
  
  var CgroupParent: js.UndefOr[String] = js.native
  
  var ConsoleSize: js.UndefOr[js.Array[Double]] = js.native
  
  var ContainerIDFile: js.UndefOr[String] = js.native
  
  var CpuPeriod: js.UndefOr[Double] = js.native
  
  var CpuQuota: js.UndefOr[Double] = js.native
  
  var CpuShares: js.UndefOr[Double] = js.native
  
  var CpusetCpus: js.UndefOr[String] = js.native
  
  var CpusetMems: js.UndefOr[String] = js.native
  
  var DeviceCgroupRules: js.UndefOr[js.Array[String]] = js.native
  
  var DeviceRequests: js.UndefOr[js.Array[DeviceRequest]] = js.native
  
  var Devices: js.UndefOr[js.Any] = js.native
  
  var DiskQuota: js.UndefOr[Double] = js.native
  
  var Dns: js.UndefOr[js.Array[_]] = js.native
  
  var DnsOptions: js.UndefOr[js.Array[_]] = js.native
  
  var DnsSearch: js.UndefOr[js.Array[_]] = js.native
  
  var ExtraHosts: js.UndefOr[js.Any] = js.native
  
  var GroupAdd: js.UndefOr[js.Array[String]] = js.native
  
  var IpcMode: js.UndefOr[String] = js.native
  
  var Isolation: js.UndefOr[String] = js.native
  
  var KernelMemory: js.UndefOr[Double] = js.native
  
  var Links: js.UndefOr[js.Any] = js.native
  
  var LogConfig: js.UndefOr[typings.dockerode.anon.Config] = js.native
  
  var MaskedPaths: js.UndefOr[js.Array[String]] = js.native
  
  var Memory: js.UndefOr[Double] = js.native
  
  var MemoryReservation: js.UndefOr[Double] = js.native
  
  var MemorySwap: js.UndefOr[Double] = js.native
  
  var MemorySwappiness: js.UndefOr[Double] = js.native
  
  var Mounts: js.UndefOr[MountConfig] = js.native
  
  var NetworkMode: js.UndefOr[String] = js.native
  
  var OomKillDisable: js.UndefOr[Boolean] = js.native
  
  var OomScoreAdj: js.UndefOr[Double] = js.native
  
  var PidMode: js.UndefOr[String] = js.native
  
  var PidsLimit: js.UndefOr[Double] = js.native
  
  var PortBindings: js.UndefOr[js.Any] = js.native
  
  var Privileged: js.UndefOr[Boolean] = js.native
  
  var PublishAllPorts: js.UndefOr[Boolean] = js.native
  
  var ReadonlyPaths: js.UndefOr[js.Array[String]] = js.native
  
  var ReadonlyRootfs: js.UndefOr[Boolean] = js.native
  
  var RestartPolicy: js.UndefOr[typings.dockerode.mod.RestartPolicy] = js.native
  
  var Runtime: js.UndefOr[String] = js.native
  
  var SecurityOpt: js.UndefOr[js.Any] = js.native
  
  var ShmSize: js.UndefOr[Double] = js.native
  
  var StorageOpt: js.UndefOr[StringDictionary[String]] = js.native
  
  var Sysctls: js.UndefOr[StringDictionary[String]] = js.native
  
  var Tmpfs: js.UndefOr[StringDictionary[String]] = js.native
  
  var UTSMode: js.UndefOr[String] = js.native
  
  var Ulimits: js.UndefOr[js.Any] = js.native
  
  var UsernsMode: js.UndefOr[String] = js.native
  
  var VolumeDriver: js.UndefOr[String] = js.native
  
  var VolumesFrom: js.UndefOr[js.Any] = js.native
}
object HostConfig {
  
  @scala.inline
  def apply(): HostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostConfig]
  }
  
  @scala.inline
  implicit class HostConfigMutableBuilder[Self <: HostConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRemove(value: Boolean): Self = StObject.set(x, "AutoRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRemoveUndefined: Self = StObject.set(x, "AutoRemove", js.undefined)
    
    @scala.inline
    def setBinds(value: js.Array[String]): Self = StObject.set(x, "Binds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindsUndefined: Self = StObject.set(x, "Binds", js.undefined)
    
    @scala.inline
    def setBindsVarargs(value: String*): Self = StObject.set(x, "Binds", js.Array(value :_*))
    
    @scala.inline
    def setBlkioDeviceReadBps(value: js.Any): Self = StObject.set(x, "BlkioDeviceReadBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlkioDeviceReadBpsUndefined: Self = StObject.set(x, "BlkioDeviceReadBps", js.undefined)
    
    @scala.inline
    def setBlkioDeviceReadIOps(value: js.Any): Self = StObject.set(x, "BlkioDeviceReadIOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlkioDeviceReadIOpsUndefined: Self = StObject.set(x, "BlkioDeviceReadIOps", js.undefined)
    
    @scala.inline
    def setBlkioDeviceWriteBps(value: js.Any): Self = StObject.set(x, "BlkioDeviceWriteBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlkioDeviceWriteBpsUndefined: Self = StObject.set(x, "BlkioDeviceWriteBps", js.undefined)
    
    @scala.inline
    def setBlkioDeviceWriteIOps(value: js.Any): Self = StObject.set(x, "BlkioDeviceWriteIOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlkioDeviceWriteIOpsUndefined: Self = StObject.set(x, "BlkioDeviceWriteIOps", js.undefined)
    
    @scala.inline
    def setBlkioWeight(value: Double): Self = StObject.set(x, "BlkioWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlkioWeightDevice(value: js.Any): Self = StObject.set(x, "BlkioWeightDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlkioWeightDeviceUndefined: Self = StObject.set(x, "BlkioWeightDevice", js.undefined)
    
    @scala.inline
    def setBlkioWeightUndefined: Self = StObject.set(x, "BlkioWeight", js.undefined)
    
    @scala.inline
    def setCapAdd(value: js.Any): Self = StObject.set(x, "CapAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapAddUndefined: Self = StObject.set(x, "CapAdd", js.undefined)
    
    @scala.inline
    def setCapDrop(value: js.Any): Self = StObject.set(x, "CapDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapDropUndefined: Self = StObject.set(x, "CapDrop", js.undefined)
    
    @scala.inline
    def setCgroup(value: String): Self = StObject.set(x, "Cgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCgroupParent(value: String): Self = StObject.set(x, "CgroupParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCgroupParentUndefined: Self = StObject.set(x, "CgroupParent", js.undefined)
    
    @scala.inline
    def setCgroupUndefined: Self = StObject.set(x, "Cgroup", js.undefined)
    
    @scala.inline
    def setConsoleSize(value: js.Array[Double]): Self = StObject.set(x, "ConsoleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleSizeUndefined: Self = StObject.set(x, "ConsoleSize", js.undefined)
    
    @scala.inline
    def setConsoleSizeVarargs(value: Double*): Self = StObject.set(x, "ConsoleSize", js.Array(value :_*))
    
    @scala.inline
    def setContainerIDFile(value: String): Self = StObject.set(x, "ContainerIDFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIDFileUndefined: Self = StObject.set(x, "ContainerIDFile", js.undefined)
    
    @scala.inline
    def setCpuPeriod(value: Double): Self = StObject.set(x, "CpuPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuPeriodUndefined: Self = StObject.set(x, "CpuPeriod", js.undefined)
    
    @scala.inline
    def setCpuQuota(value: Double): Self = StObject.set(x, "CpuQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuQuotaUndefined: Self = StObject.set(x, "CpuQuota", js.undefined)
    
    @scala.inline
    def setCpuShares(value: Double): Self = StObject.set(x, "CpuShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuSharesUndefined: Self = StObject.set(x, "CpuShares", js.undefined)
    
    @scala.inline
    def setCpusetCpus(value: String): Self = StObject.set(x, "CpusetCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpusetCpusUndefined: Self = StObject.set(x, "CpusetCpus", js.undefined)
    
    @scala.inline
    def setCpusetMems(value: String): Self = StObject.set(x, "CpusetMems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpusetMemsUndefined: Self = StObject.set(x, "CpusetMems", js.undefined)
    
    @scala.inline
    def setDeviceCgroupRules(value: js.Array[String]): Self = StObject.set(x, "DeviceCgroupRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCgroupRulesUndefined: Self = StObject.set(x, "DeviceCgroupRules", js.undefined)
    
    @scala.inline
    def setDeviceCgroupRulesVarargs(value: String*): Self = StObject.set(x, "DeviceCgroupRules", js.Array(value :_*))
    
    @scala.inline
    def setDeviceRequests(value: js.Array[DeviceRequest]): Self = StObject.set(x, "DeviceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRequestsUndefined: Self = StObject.set(x, "DeviceRequests", js.undefined)
    
    @scala.inline
    def setDeviceRequestsVarargs(value: DeviceRequest*): Self = StObject.set(x, "DeviceRequests", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Any): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    @scala.inline
    def setDiskQuota(value: Double): Self = StObject.set(x, "DiskQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskQuotaUndefined: Self = StObject.set(x, "DiskQuota", js.undefined)
    
    @scala.inline
    def setDns(value: js.Array[_]): Self = StObject.set(x, "Dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsOptions(value: js.Array[_]): Self = StObject.set(x, "DnsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsOptionsUndefined: Self = StObject.set(x, "DnsOptions", js.undefined)
    
    @scala.inline
    def setDnsOptionsVarargs(value: js.Any*): Self = StObject.set(x, "DnsOptions", js.Array(value :_*))
    
    @scala.inline
    def setDnsSearch(value: js.Array[_]): Self = StObject.set(x, "DnsSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSearchUndefined: Self = StObject.set(x, "DnsSearch", js.undefined)
    
    @scala.inline
    def setDnsSearchVarargs(value: js.Any*): Self = StObject.set(x, "DnsSearch", js.Array(value :_*))
    
    @scala.inline
    def setDnsUndefined: Self = StObject.set(x, "Dns", js.undefined)
    
    @scala.inline
    def setDnsVarargs(value: js.Any*): Self = StObject.set(x, "Dns", js.Array(value :_*))
    
    @scala.inline
    def setExtraHosts(value: js.Any): Self = StObject.set(x, "ExtraHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHostsUndefined: Self = StObject.set(x, "ExtraHosts", js.undefined)
    
    @scala.inline
    def setGroupAdd(value: js.Array[String]): Self = StObject.set(x, "GroupAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupAddUndefined: Self = StObject.set(x, "GroupAdd", js.undefined)
    
    @scala.inline
    def setGroupAddVarargs(value: String*): Self = StObject.set(x, "GroupAdd", js.Array(value :_*))
    
    @scala.inline
    def setIpcMode(value: String): Self = StObject.set(x, "IpcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpcModeUndefined: Self = StObject.set(x, "IpcMode", js.undefined)
    
    @scala.inline
    def setIsolation(value: String): Self = StObject.set(x, "Isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationUndefined: Self = StObject.set(x, "Isolation", js.undefined)
    
    @scala.inline
    def setKernelMemory(value: Double): Self = StObject.set(x, "KernelMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelMemoryUndefined: Self = StObject.set(x, "KernelMemory", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Any): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    @scala.inline
    def setLogConfig(value: typings.dockerode.anon.Config): Self = StObject.set(x, "LogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "LogConfig", js.undefined)
    
    @scala.inline
    def setMaskedPaths(value: js.Array[String]): Self = StObject.set(x, "MaskedPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskedPathsUndefined: Self = StObject.set(x, "MaskedPaths", js.undefined)
    
    @scala.inline
    def setMaskedPathsVarargs(value: String*): Self = StObject.set(x, "MaskedPaths", js.Array(value :_*))
    
    @scala.inline
    def setMemory(value: Double): Self = StObject.set(x, "Memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservation(value: Double): Self = StObject.set(x, "MemoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryReservationUndefined: Self = StObject.set(x, "MemoryReservation", js.undefined)
    
    @scala.inline
    def setMemorySwap(value: Double): Self = StObject.set(x, "MemorySwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySwapUndefined: Self = StObject.set(x, "MemorySwap", js.undefined)
    
    @scala.inline
    def setMemorySwappiness(value: Double): Self = StObject.set(x, "MemorySwappiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySwappinessUndefined: Self = StObject.set(x, "MemorySwappiness", js.undefined)
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "Memory", js.undefined)
    
    @scala.inline
    def setMounts(value: MountConfig): Self = StObject.set(x, "Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountsUndefined: Self = StObject.set(x, "Mounts", js.undefined)
    
    @scala.inline
    def setMountsVarargs(value: MountSettings*): Self = StObject.set(x, "Mounts", js.Array(value :_*))
    
    @scala.inline
    def setNetworkMode(value: String): Self = StObject.set(x, "NetworkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkModeUndefined: Self = StObject.set(x, "NetworkMode", js.undefined)
    
    @scala.inline
    def setOomKillDisable(value: Boolean): Self = StObject.set(x, "OomKillDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOomKillDisableUndefined: Self = StObject.set(x, "OomKillDisable", js.undefined)
    
    @scala.inline
    def setOomScoreAdj(value: Double): Self = StObject.set(x, "OomScoreAdj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOomScoreAdjUndefined: Self = StObject.set(x, "OomScoreAdj", js.undefined)
    
    @scala.inline
    def setPidMode(value: String): Self = StObject.set(x, "PidMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidModeUndefined: Self = StObject.set(x, "PidMode", js.undefined)
    
    @scala.inline
    def setPidsLimit(value: Double): Self = StObject.set(x, "PidsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidsLimitUndefined: Self = StObject.set(x, "PidsLimit", js.undefined)
    
    @scala.inline
    def setPortBindings(value: js.Any): Self = StObject.set(x, "PortBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortBindingsUndefined: Self = StObject.set(x, "PortBindings", js.undefined)
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    @scala.inline
    def setPublishAllPorts(value: Boolean): Self = StObject.set(x, "PublishAllPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishAllPortsUndefined: Self = StObject.set(x, "PublishAllPorts", js.undefined)
    
    @scala.inline
    def setReadonlyPaths(value: js.Array[String]): Self = StObject.set(x, "ReadonlyPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyPathsUndefined: Self = StObject.set(x, "ReadonlyPaths", js.undefined)
    
    @scala.inline
    def setReadonlyPathsVarargs(value: String*): Self = StObject.set(x, "ReadonlyPaths", js.Array(value :_*))
    
    @scala.inline
    def setReadonlyRootfs(value: Boolean): Self = StObject.set(x, "ReadonlyRootfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyRootfsUndefined: Self = StObject.set(x, "ReadonlyRootfs", js.undefined)
    
    @scala.inline
    def setRestartPolicy(value: RestartPolicy): Self = StObject.set(x, "RestartPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartPolicyUndefined: Self = StObject.set(x, "RestartPolicy", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    @scala.inline
    def setSecurityOpt(value: js.Any): Self = StObject.set(x, "SecurityOpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOptUndefined: Self = StObject.set(x, "SecurityOpt", js.undefined)
    
    @scala.inline
    def setShmSize(value: Double): Self = StObject.set(x, "ShmSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShmSizeUndefined: Self = StObject.set(x, "ShmSize", js.undefined)
    
    @scala.inline
    def setStorageOpt(value: StringDictionary[String]): Self = StObject.set(x, "StorageOpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageOptUndefined: Self = StObject.set(x, "StorageOpt", js.undefined)
    
    @scala.inline
    def setSysctls(value: StringDictionary[String]): Self = StObject.set(x, "Sysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysctlsUndefined: Self = StObject.set(x, "Sysctls", js.undefined)
    
    @scala.inline
    def setTmpfs(value: StringDictionary[String]): Self = StObject.set(x, "Tmpfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpfsUndefined: Self = StObject.set(x, "Tmpfs", js.undefined)
    
    @scala.inline
    def setUTSMode(value: String): Self = StObject.set(x, "UTSMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUTSModeUndefined: Self = StObject.set(x, "UTSMode", js.undefined)
    
    @scala.inline
    def setUlimits(value: js.Any): Self = StObject.set(x, "Ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUlimitsUndefined: Self = StObject.set(x, "Ulimits", js.undefined)
    
    @scala.inline
    def setUsernsMode(value: String): Self = StObject.set(x, "UsernsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernsModeUndefined: Self = StObject.set(x, "UsernsMode", js.undefined)
    
    @scala.inline
    def setVolumeDriver(value: String): Self = StObject.set(x, "VolumeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeDriverUndefined: Self = StObject.set(x, "VolumeDriver", js.undefined)
    
    @scala.inline
    def setVolumesFrom(value: js.Any): Self = StObject.set(x, "VolumesFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesFromUndefined: Self = StObject.set(x, "VolumesFrom", js.undefined)
  }
}
