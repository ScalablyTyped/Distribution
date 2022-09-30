package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateDatabaseRequest. */
trait IUpdateDatabaseRequest extends StObject {
  
  /** UpdateDatabaseRequest database */
  var database: js.UndefOr[IDatabase | Null] = js.undefined
  
  /** UpdateDatabaseRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}
object IUpdateDatabaseRequest {
  
  inline def apply(): IUpdateDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateDatabaseRequest]
  }
  
  extension [Self <: IUpdateDatabaseRequest](x: Self) {
    
    inline def setDatabase(value: IDatabase): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
