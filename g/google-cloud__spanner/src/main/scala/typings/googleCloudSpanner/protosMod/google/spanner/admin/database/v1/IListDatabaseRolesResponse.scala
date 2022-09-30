package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDatabaseRolesResponse. */
trait IListDatabaseRolesResponse extends StObject {
  
  /** ListDatabaseRolesResponse databaseRoles */
  var databaseRoles: js.UndefOr[js.Array[IDatabaseRole] | Null] = js.undefined
  
  /** ListDatabaseRolesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListDatabaseRolesResponse {
  
  inline def apply(): IListDatabaseRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDatabaseRolesResponse]
  }
  
  extension [Self <: IListDatabaseRolesResponse](x: Self) {
    
    inline def setDatabaseRoles(value: js.Array[IDatabaseRole]): Self = StObject.set(x, "databaseRoles", value.asInstanceOf[js.Any])
    
    inline def setDatabaseRolesNull: Self = StObject.set(x, "databaseRoles", null)
    
    inline def setDatabaseRolesUndefined: Self = StObject.set(x, "databaseRoles", js.undefined)
    
    inline def setDatabaseRolesVarargs(value: IDatabaseRole*): Self = StObject.set(x, "databaseRoles", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
