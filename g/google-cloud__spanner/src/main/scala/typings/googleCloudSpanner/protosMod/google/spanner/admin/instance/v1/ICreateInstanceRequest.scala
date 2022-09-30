package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateInstanceRequest. */
trait ICreateInstanceRequest extends StObject {
  
  /** CreateInstanceRequest instance */
  var instance: js.UndefOr[IInstance | Null] = js.undefined
  
  /** CreateInstanceRequest instanceId */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /** CreateInstanceRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateInstanceRequest {
  
  inline def apply(): ICreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateInstanceRequest]
  }
  
  extension [Self <: ICreateInstanceRequest](x: Self) {
    
    inline def setInstance(value: IInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
