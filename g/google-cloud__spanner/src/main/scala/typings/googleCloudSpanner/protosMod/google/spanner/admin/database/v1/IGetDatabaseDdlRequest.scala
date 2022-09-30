package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetDatabaseDdlRequest. */
trait IGetDatabaseDdlRequest extends StObject {
  
  /** GetDatabaseDdlRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
}
object IGetDatabaseDdlRequest {
  
  inline def apply(): IGetDatabaseDdlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetDatabaseDdlRequest]
  }
  
  extension [Self <: IGetDatabaseDdlRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}
