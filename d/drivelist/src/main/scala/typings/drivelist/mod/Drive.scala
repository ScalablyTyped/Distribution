package typings.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drive extends js.Object {
  
  var blockSize: Double | Null = js.native
  
  var busType: BusType = js.native
  
  var busVersion: String | Null = js.native
  
  var description: String = js.native
  
  var device: String = js.native
  
  var devicePath: String | Null = js.native
  
  var enumerator: String = js.native
  
  var error: js.Any = js.native
  
  var isCard: Boolean | Null = js.native
  
  var isReadOnly: Boolean = js.native
  
  var isRemovable: Boolean | Null = js.native
  
  var isSCSI: Boolean | Null = js.native
  
  var isSystem: Boolean = js.native
  
  var isUAS: Boolean | Null = js.native
  
  var isUSB: Boolean | Null = js.native
  
  var isVirtual: Boolean | Null = js.native
  
  var logicalBlockSize: Double | Null = js.native
  
  var mountpoints: js.Array[MountPoint] = js.native
  
  var raw: String = js.native
  
   // can be null
  var size: Double | Null = js.native
}
object Drive {
  
  @scala.inline
  def apply(
    busType: BusType,
    description: String,
    device: String,
    enumerator: String,
    error: js.Any,
    isReadOnly: Boolean,
    isSystem: Boolean,
    mountpoints: js.Array[MountPoint],
    raw: String
  ): Drive = {
    val __obj = js.Dynamic.literal(busType = busType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enumerator = enumerator.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], mountpoints = mountpoints.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
  
  @scala.inline
  implicit class DriveOps[Self <: Drive] (val x: Self) extends AnyVal {
    
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
    def setBusType(value: BusType): Self = this.set("busType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerator(value: String): Self = this.set("enumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystem(value: Boolean): Self = this.set("isSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountpointsVarargs(value: MountPoint*): Self = this.set("mountpoints", js.Array(value :_*))
    
    @scala.inline
    def setMountpoints(value: js.Array[MountPoint]): Self = this.set("mountpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeNull: Self = this.set("blockSize", null)
    
    @scala.inline
    def setBusVersion(value: String): Self = this.set("busVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusVersionNull: Self = this.set("busVersion", null)
    
    @scala.inline
    def setDevicePath(value: String): Self = this.set("devicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePathNull: Self = this.set("devicePath", null)
    
    @scala.inline
    def setIsCard(value: Boolean): Self = this.set("isCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCardNull: Self = this.set("isCard", null)
    
    @scala.inline
    def setIsRemovable(value: Boolean): Self = this.set("isRemovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRemovableNull: Self = this.set("isRemovable", null)
    
    @scala.inline
    def setIsSCSI(value: Boolean): Self = this.set("isSCSI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSCSINull: Self = this.set("isSCSI", null)
    
    @scala.inline
    def setIsUAS(value: Boolean): Self = this.set("isUAS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUASNull: Self = this.set("isUAS", null)
    
    @scala.inline
    def setIsUSB(value: Boolean): Self = this.set("isUSB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUSBNull: Self = this.set("isUSB", null)
    
    @scala.inline
    def setIsVirtual(value: Boolean): Self = this.set("isVirtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVirtualNull: Self = this.set("isVirtual", null)
    
    @scala.inline
    def setLogicalBlockSize(value: Double): Self = this.set("logicalBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalBlockSizeNull: Self = this.set("logicalBlockSize", null)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
  }
}
