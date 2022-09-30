package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetInstanceRequest. */
trait IGetInstanceRequest extends StObject {
  
  /** GetInstanceRequest fieldMask */
  var fieldMask: js.UndefOr[IFieldMask | Null] = js.undefined
  
  /** GetInstanceRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IGetInstanceRequest {
  
  inline def apply(): IGetInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetInstanceRequest]
  }
  
  extension [Self <: IGetInstanceRequest](x: Self) {
    
    inline def setFieldMask(value: IFieldMask): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskNull: Self = StObject.set(x, "fieldMask", null)
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
