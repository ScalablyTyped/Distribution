package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicyPreservedStateNetworkIp extends StObject {
  
  /**
    * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
    */
  var autoDelete: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatefulPolicyPreservedStateNetworkIp {
  
  inline def apply(): SchemaStatefulPolicyPreservedStateNetworkIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedStateNetworkIp]
  }
  
  extension [Self <: SchemaStatefulPolicyPreservedStateNetworkIp](x: Self) {
    
    inline def setAutoDelete(value: String): Self = StObject.set(x, "autoDelete", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteNull: Self = StObject.set(x, "autoDelete", null)
    
    inline def setAutoDeleteUndefined: Self = StObject.set(x, "autoDelete", js.undefined)
  }
}
