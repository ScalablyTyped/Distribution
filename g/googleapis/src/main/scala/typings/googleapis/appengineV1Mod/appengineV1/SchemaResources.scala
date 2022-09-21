package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResources extends StObject {
  
  /**
    * Number of CPU cores needed.
    */
  var cpu: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Disk size (GB) needed.
    */
  var diskGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
    */
  var kmsKeyReference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Memory (GB) needed.
    */
  var memoryGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * User specified volumes.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
}
object SchemaResources {
  
  inline def apply(): SchemaResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResources]
  }
  
  extension [Self <: SchemaResources](x: Self) {
    
    inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuNull: Self = StObject.set(x, "cpu", null)
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setDiskGb(value: Double): Self = StObject.set(x, "diskGb", value.asInstanceOf[js.Any])
    
    inline def setDiskGbNull: Self = StObject.set(x, "diskGb", null)
    
    inline def setDiskGbUndefined: Self = StObject.set(x, "diskGb", js.undefined)
    
    inline def setKmsKeyReference(value: String): Self = StObject.set(x, "kmsKeyReference", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyReferenceNull: Self = StObject.set(x, "kmsKeyReference", null)
    
    inline def setKmsKeyReferenceUndefined: Self = StObject.set(x, "kmsKeyReference", js.undefined)
    
    inline def setMemoryGb(value: Double): Self = StObject.set(x, "memoryGb", value.asInstanceOf[js.Any])
    
    inline def setMemoryGbNull: Self = StObject.set(x, "memoryGb", null)
    
    inline def setMemoryGbUndefined: Self = StObject.set(x, "memoryGb", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
