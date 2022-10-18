package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateFieldRequest. */
trait IUpdateFieldRequest extends StObject {
  
  /** UpdateFieldRequest field */
  var field: js.UndefOr[IField | Null] = js.undefined
  
  /** UpdateFieldRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateFieldRequest {
  
  inline def apply(): IUpdateFieldRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateFieldRequest]
  }
  
  extension [Self <: IUpdateFieldRequest](x: Self) {
    
    inline def setField(value: IField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
