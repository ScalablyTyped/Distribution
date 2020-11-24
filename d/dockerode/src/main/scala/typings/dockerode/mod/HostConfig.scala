package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostConfig extends js.Object {
  
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
  implicit class HostConfigOps[Self <: HostConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoRemove(value: Boolean): Self = this.set("AutoRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRemove: Self = this.set("AutoRemove", js.undefined)
    
    @scala.inline
    def setBindsVarargs(value: String*): Self = this.set("Binds", js.Array(value :_*))
    
    @scala.inline
    def setBinds(value: js.Array[String]): Self = this.set("Binds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinds: Self = this.set("Binds", js.undefined)
    
    @scala.inline
    def setBlkioDeviceReadBps(value: js.Any): Self = this.set("BlkioDeviceReadBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlkioDeviceReadBps: Self = this.set("BlkioDeviceReadBps", js.undefined)
    
    @scala.inline
    def setBlkioDeviceReadIOps(value: js.Any): Self = this.set("BlkioDeviceReadIOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlkioDeviceReadIOps: Self = this.set("BlkioDeviceReadIOps", js.undefined)
    
    @scala.inline
    def setBlkioDeviceWriteBps(value: js.Any): Self = this.set("BlkioDeviceWriteBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlkioDeviceWriteBps: Self = this.set("BlkioDeviceWriteBps", js.undefined)
    
    @scala.inline
    def setBlkioDeviceWriteIOps(value: js.Any): Self = this.set("BlkioDeviceWriteIOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlkioDeviceWriteIOps: Self = this.set("BlkioDeviceWriteIOps", js.undefined)
    
    @scala.inline
    def setBlkioWeight(value: Double): Self = this.set("BlkioWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlkioWeight: Self = this.set("BlkioWeight", js.undefined)
    
    @scala.inline
    def setBlkioWeightDevice(value: js.Any): Self = this.set("BlkioWeightDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlkioWeightDevice: Self = this.set("BlkioWeightDevice", js.undefined)
    
    @scala.inline
    def setCapAdd(value: js.Any): Self = this.set("CapAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapAdd: Self = this.set("CapAdd", js.undefined)
    
    @scala.inline
    def setCapDrop(value: js.Any): Self = this.set("CapDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapDrop: Self = this.set("CapDrop", js.undefined)
    
    @scala.inline
    def setCgroup(value: String): Self = this.set("Cgroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCgroup: Self = this.set("Cgroup", js.undefined)
    
    @scala.inline
    def setCgroupParent(value: String): Self = this.set("CgroupParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCgroupParent: Self = this.set("CgroupParent", js.undefined)
    
    @scala.inline
    def setConsoleSizeVarargs(value: Double*): Self = this.set("ConsoleSize", js.Array(value :_*))
    
    @scala.inline
    def setConsoleSize(value: js.Array[Double]): Self = this.set("ConsoleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleSize: Self = this.set("ConsoleSize", js.undefined)
    
    @scala.inline
    def setContainerIDFile(value: String): Self = this.set("ContainerIDFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerIDFile: Self = this.set("ContainerIDFile", js.undefined)
    
    @scala.inline
    def setCpuPeriod(value: Double): Self = this.set("CpuPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuPeriod: Self = this.set("CpuPeriod", js.undefined)
    
    @scala.inline
    def setCpuQuota(value: Double): Self = this.set("CpuQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuQuota: Self = this.set("CpuQuota", js.undefined)
    
    @scala.inline
    def setCpuShares(value: Double): Self = this.set("CpuShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuShares: Self = this.set("CpuShares", js.undefined)
    
    @scala.inline
    def setCpusetCpus(value: String): Self = this.set("CpusetCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpusetCpus: Self = this.set("CpusetCpus", js.undefined)
    
    @scala.inline
    def setCpusetMems(value: String): Self = this.set("CpusetMems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpusetMems: Self = this.set("CpusetMems", js.undefined)
    
    @scala.inline
    def setDeviceCgroupRulesVarargs(value: String*): Self = this.set("DeviceCgroupRules", js.Array(value :_*))
    
    @scala.inline
    def setDeviceCgroupRules(value: js.Array[String]): Self = this.set("DeviceCgroupRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCgroupRules: Self = this.set("DeviceCgroupRules", js.undefined)
    
    @scala.inline
    def setDeviceRequestsVarargs(value: DeviceRequest*): Self = this.set("DeviceRequests", js.Array(value :_*))
    
    @scala.inline
    def setDeviceRequests(value: js.Array[DeviceRequest]): Self = this.set("DeviceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceRequests: Self = this.set("DeviceRequests", js.undefined)
    
    @scala.inline
    def setDevices(value: js.Any): Self = this.set("Devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("Devices", js.undefined)
    
    @scala.inline
    def setDiskQuota(value: Double): Self = this.set("DiskQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskQuota: Self = this.set("DiskQuota", js.undefined)
    
    @scala.inline
    def setDnsVarargs(value: js.Any*): Self = this.set("Dns", js.Array(value :_*))
    
    @scala.inline
    def setDns(value: js.Array[_]): Self = this.set("Dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDns: Self = this.set("Dns", js.undefined)
    
    @scala.inline
    def setDnsOptionsVarargs(value: js.Any*): Self = this.set("DnsOptions", js.Array(value :_*))
    
    @scala.inline
    def setDnsOptions(value: js.Array[_]): Self = this.set("DnsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsOptions: Self = this.set("DnsOptions", js.undefined)
    
    @scala.inline
    def setDnsSearchVarargs(value: js.Any*): Self = this.set("DnsSearch", js.Array(value :_*))
    
    @scala.inline
    def setDnsSearch(value: js.Array[_]): Self = this.set("DnsSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSearch: Self = this.set("DnsSearch", js.undefined)
    
    @scala.inline
    def setExtraHosts(value: js.Any): Self = this.set("ExtraHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraHosts: Self = this.set("ExtraHosts", js.undefined)
    
    @scala.inline
    def setGroupAddVarargs(value: String*): Self = this.set("GroupAdd", js.Array(value :_*))
    
    @scala.inline
    def setGroupAdd(value: js.Array[String]): Self = this.set("GroupAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupAdd: Self = this.set("GroupAdd", js.undefined)
    
    @scala.inline
    def setIpcMode(value: String): Self = this.set("IpcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpcMode: Self = this.set("IpcMode", js.undefined)
    
    @scala.inline
    def setIsolation(value: String): Self = this.set("Isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolation: Self = this.set("Isolation", js.undefined)
    
    @scala.inline
    def setKernelMemory(value: Double): Self = this.set("KernelMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelMemory: Self = this.set("KernelMemory", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Any): Self = this.set("Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("Links", js.undefined)
    
    @scala.inline
    def setLogConfig(value: typings.dockerode.anon.Config): Self = this.set("LogConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("LogConfig", js.undefined)
    
    @scala.inline
    def setMaskedPathsVarargs(value: String*): Self = this.set("MaskedPaths", js.Array(value :_*))
    
    @scala.inline
    def setMaskedPaths(value: js.Array[String]): Self = this.set("MaskedPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskedPaths: Self = this.set("MaskedPaths", js.undefined)
    
    @scala.inline
    def setMemory(value: Double): Self = this.set("Memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("Memory", js.undefined)
    
    @scala.inline
    def setMemoryReservation(value: Double): Self = this.set("MemoryReservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryReservation: Self = this.set("MemoryReservation", js.undefined)
    
    @scala.inline
    def setMemorySwap(value: Double): Self = this.set("MemorySwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySwap: Self = this.set("MemorySwap", js.undefined)
    
    @scala.inline
    def setMemorySwappiness(value: Double): Self = this.set("MemorySwappiness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySwappiness: Self = this.set("MemorySwappiness", js.undefined)
    
    @scala.inline
    def setMountsVarargs(value: MountSettings*): Self = this.set("Mounts", js.Array(value :_*))
    
    @scala.inline
    def setMounts(value: MountConfig): Self = this.set("Mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMounts: Self = this.set("Mounts", js.undefined)
    
    @scala.inline
    def setNetworkMode(value: String): Self = this.set("NetworkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkMode: Self = this.set("NetworkMode", js.undefined)
    
    @scala.inline
    def setOomKillDisable(value: Boolean): Self = this.set("OomKillDisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOomKillDisable: Self = this.set("OomKillDisable", js.undefined)
    
    @scala.inline
    def setOomScoreAdj(value: Double): Self = this.set("OomScoreAdj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOomScoreAdj: Self = this.set("OomScoreAdj", js.undefined)
    
    @scala.inline
    def setPidMode(value: String): Self = this.set("PidMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePidMode: Self = this.set("PidMode", js.undefined)
    
    @scala.inline
    def setPidsLimit(value: Double): Self = this.set("PidsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePidsLimit: Self = this.set("PidsLimit", js.undefined)
    
    @scala.inline
    def setPortBindings(value: js.Any): Self = this.set("PortBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortBindings: Self = this.set("PortBindings", js.undefined)
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("Privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivileged: Self = this.set("Privileged", js.undefined)
    
    @scala.inline
    def setPublishAllPorts(value: Boolean): Self = this.set("PublishAllPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishAllPorts: Self = this.set("PublishAllPorts", js.undefined)
    
    @scala.inline
    def setReadonlyPathsVarargs(value: String*): Self = this.set("ReadonlyPaths", js.Array(value :_*))
    
    @scala.inline
    def setReadonlyPaths(value: js.Array[String]): Self = this.set("ReadonlyPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonlyPaths: Self = this.set("ReadonlyPaths", js.undefined)
    
    @scala.inline
    def setReadonlyRootfs(value: Boolean): Self = this.set("ReadonlyRootfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonlyRootfs: Self = this.set("ReadonlyRootfs", js.undefined)
    
    @scala.inline
    def setRestartPolicy(value: RestartPolicy): Self = this.set("RestartPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartPolicy: Self = this.set("RestartPolicy", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = this.set("Runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntime: Self = this.set("Runtime", js.undefined)
    
    @scala.inline
    def setSecurityOpt(value: js.Any): Self = this.set("SecurityOpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityOpt: Self = this.set("SecurityOpt", js.undefined)
    
    @scala.inline
    def setShmSize(value: Double): Self = this.set("ShmSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShmSize: Self = this.set("ShmSize", js.undefined)
    
    @scala.inline
    def setStorageOpt(value: StringDictionary[String]): Self = this.set("StorageOpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageOpt: Self = this.set("StorageOpt", js.undefined)
    
    @scala.inline
    def setSysctls(value: StringDictionary[String]): Self = this.set("Sysctls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSysctls: Self = this.set("Sysctls", js.undefined)
    
    @scala.inline
    def setTmpfs(value: StringDictionary[String]): Self = this.set("Tmpfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpfs: Self = this.set("Tmpfs", js.undefined)
    
    @scala.inline
    def setUTSMode(value: String): Self = this.set("UTSMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUTSMode: Self = this.set("UTSMode", js.undefined)
    
    @scala.inline
    def setUlimits(value: js.Any): Self = this.set("Ulimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUlimits: Self = this.set("Ulimits", js.undefined)
    
    @scala.inline
    def setUsernsMode(value: String): Self = this.set("UsernsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernsMode: Self = this.set("UsernsMode", js.undefined)
    
    @scala.inline
    def setVolumeDriver(value: String): Self = this.set("VolumeDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeDriver: Self = this.set("VolumeDriver", js.undefined)
    
    @scala.inline
    def setVolumesFrom(value: js.Any): Self = this.set("VolumesFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumesFrom: Self = this.set("VolumesFrom", js.undefined)
  }
}
