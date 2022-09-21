package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicyPreservedStateDiskDevice extends StObject {
  
  /**
    * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatefulPolicyPreservedStateDiskDevice {
  
  inline def apply(): SchemaStatefulPolicyPreservedStateDiskDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedStateDiskDevice]
  }
  
  extension [Self <: SchemaStatefulPolicyPreservedStateDiskDevice](x: Self) {
    
    inline def setAutoDelete(value: String): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteNull: Self = StObject.set(x, "autoDelete", null)
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
  }
}
