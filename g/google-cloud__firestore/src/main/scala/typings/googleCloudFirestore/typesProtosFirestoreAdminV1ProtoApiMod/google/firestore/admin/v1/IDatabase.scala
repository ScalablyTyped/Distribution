package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database.ConcurrencyMode
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.Database.DatabaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Database. */
trait IDatabase extends StObject {
  
  /** Database concurrencyMode */
  var concurrencyMode: js.UndefOr[ConcurrencyMode | Null] = js.undefined
  
  /** Database etag */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /** Database locationId */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /** Database name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Database type */
  var `type`: js.UndefOr[DatabaseType | Null] = js.undefined
}
object IDatabase {
  
  inline def apply(): IDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatabase]
  }
  
  extension [Self <: IDatabase](x: Self) {
    
    inline def setConcurrencyMode(value: ConcurrencyMode): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyModeNull: Self = StObject.set(x, "concurrencyMode", null)
    
    inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: DatabaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
