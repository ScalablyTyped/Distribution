package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPreservedStatePreservedDisk extends StObject {
  
  /**
    * These stateful disks will never be deleted during autohealing, update,
    * instance recreate operations. This flag is used to configure if the disk
    * should be deleted after it is no longer used by the group, e.g. when the
    * given instance or the whole MIG is deleted. Note: disks attached in
    * READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String] = js.undefined
  
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the disk resource that is stateful and should be attached to
    * the VM instance.
    */
  var source: js.UndefOr[String] = js.undefined
}
object SchemaPreservedStatePreservedDisk {
  
  inline def apply(): SchemaPreservedStatePreservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPreservedStatePreservedDisk]
  }
  
  extension [Self <: SchemaPreservedStatePreservedDisk](x: Self) {
    
    inline def setAutoDelete(value: String): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
