package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateInstanceRequest. */
trait IUpdateInstanceRequest extends StObject {
  
  /** UpdateInstanceRequest fieldMask */
  var fieldMask: js.UndefOr[IFieldMask | Null] = js.undefined
  
  /** UpdateInstanceRequest instance */
  var instance: js.UndefOr[IInstance | Null] = js.undefined
}
object IUpdateInstanceRequest {
  
  inline def apply(): IUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateInstanceRequest]
  }
  
  extension [Self <: IUpdateInstanceRequest](x: Self) {
    
    inline def setFieldMask(value: IFieldMask): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskNull: Self = StObject.set(x, "fieldMask", null)
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setInstance(value: IInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
