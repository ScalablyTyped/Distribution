package typings.drivelist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drivelist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def list(callback: js.Function2[/* error */ js.Any, /* drives */ js.Array[Drive], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.drivelist.drivelistStrings.SATA
    - typings.drivelist.drivelistStrings.SCSI
    - typings.drivelist.drivelistStrings.ATA
    - typings.drivelist.drivelistStrings.IDE
    - typings.drivelist.drivelistStrings.PCI
    - typings.drivelist.drivelistStrings.UNKNOWN
  */
  trait BusType extends StObject
  object BusType {
    
    inline def ATA: typings.drivelist.drivelistStrings.ATA = "ATA".asInstanceOf[typings.drivelist.drivelistStrings.ATA]
    
    inline def IDE: typings.drivelist.drivelistStrings.IDE = "IDE".asInstanceOf[typings.drivelist.drivelistStrings.IDE]
    
    inline def PCI: typings.drivelist.drivelistStrings.PCI = "PCI".asInstanceOf[typings.drivelist.drivelistStrings.PCI]
    
    inline def SATA: typings.drivelist.drivelistStrings.SATA = "SATA".asInstanceOf[typings.drivelist.drivelistStrings.SATA]
    
    inline def SCSI: typings.drivelist.drivelistStrings.SCSI = "SCSI".asInstanceOf[typings.drivelist.drivelistStrings.SCSI]
    
    inline def UNKNOWN: typings.drivelist.drivelistStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.drivelist.drivelistStrings.UNKNOWN]
  }
  
  trait Drive extends StObject {
    
    var blockSize: Double | Null
    
    var busType: BusType
    
    var busVersion: String | Null
    
    var description: String
    
    var device: String
    
    var devicePath: String | Null
    
    var enumerator: String
    
    var error: js.Any
    
    var isCard: Boolean | Null
    
    var isReadOnly: Boolean
    
    var isRemovable: Boolean | Null
    
    var isSCSI: Boolean | Null
    
    var isSystem: Boolean
    
    var isUAS: Boolean | Null
    
    var isUSB: Boolean | Null
    
    var isVirtual: Boolean | Null
    
    var logicalBlockSize: Double | Null
    
    var mountpoints: js.Array[MountPoint]
    
    var raw: String
    
    // can be null
    var size: Double | Null
  }
  object Drive {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(busType = busType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], enumerator = enumerator.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], mountpoints = mountpoints.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], blockSize = null, busVersion = null, devicePath = null, isCard = null, isRemovable = null, isSCSI = null, isUAS = null, isUSB = null, isVirtual = null, logicalBlockSize = null, size = null)
      __obj.asInstanceOf[Drive]
    }
    
    extension [Self <: Drive](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeNull: Self = StObject.set(x, "blockSize", null)
      
      inline def setBusType(value: BusType): Self = StObject.set(x, "busType", value.asInstanceOf[js.Any])
      
      inline def setBusVersion(value: String): Self = StObject.set(x, "busVersion", value.asInstanceOf[js.Any])
      
      inline def setBusVersionNull: Self = StObject.set(x, "busVersion", null)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
      
      inline def setDevicePathNull: Self = StObject.set(x, "devicePath", null)
      
      inline def setEnumerator(value: String): Self = StObject.set(x, "enumerator", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIsCard(value: Boolean): Self = StObject.set(x, "isCard", value.asInstanceOf[js.Any])
      
      inline def setIsCardNull: Self = StObject.set(x, "isCard", null)
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      inline def setIsRemovable(value: Boolean): Self = StObject.set(x, "isRemovable", value.asInstanceOf[js.Any])
      
      inline def setIsRemovableNull: Self = StObject.set(x, "isRemovable", null)
      
      inline def setIsSCSI(value: Boolean): Self = StObject.set(x, "isSCSI", value.asInstanceOf[js.Any])
      
      inline def setIsSCSINull: Self = StObject.set(x, "isSCSI", null)
      
      inline def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
      
      inline def setIsUAS(value: Boolean): Self = StObject.set(x, "isUAS", value.asInstanceOf[js.Any])
      
      inline def setIsUASNull: Self = StObject.set(x, "isUAS", null)
      
      inline def setIsUSB(value: Boolean): Self = StObject.set(x, "isUSB", value.asInstanceOf[js.Any])
      
      inline def setIsUSBNull: Self = StObject.set(x, "isUSB", null)
      
      inline def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
      
      inline def setIsVirtualNull: Self = StObject.set(x, "isVirtual", null)
      
      inline def setLogicalBlockSize(value: Double): Self = StObject.set(x, "logicalBlockSize", value.asInstanceOf[js.Any])
      
      inline def setLogicalBlockSizeNull: Self = StObject.set(x, "logicalBlockSize", null)
      
      inline def setMountpoints(value: js.Array[MountPoint]): Self = StObject.set(x, "mountpoints", value.asInstanceOf[js.Any])
      
      inline def setMountpointsVarargs(value: MountPoint*): Self = StObject.set(x, "mountpoints", js.Array(value :_*))
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
    }
  }
  
  trait MountPoint extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object MountPoint {
    
    inline def apply(path: String): MountPoint = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MountPoint]
    }
    
    extension [Self <: MountPoint](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
