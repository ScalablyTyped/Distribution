package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListDatabasesResponse. */
trait IListDatabasesResponse extends StObject {
  
  /** ListDatabasesResponse databases */
  var databases: js.UndefOr[js.Array[IDatabase] | Null] = js.undefined
  
  /** ListDatabasesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object IListDatabasesResponse {
  
  inline def apply(): IListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListDatabasesResponse]
  }
  
  extension [Self <: IListDatabasesResponse](x: Self) {
    
    inline def setDatabases(value: js.Array[IDatabase]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesNull: Self = StObject.set(x, "databases", null)
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: IDatabase*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
