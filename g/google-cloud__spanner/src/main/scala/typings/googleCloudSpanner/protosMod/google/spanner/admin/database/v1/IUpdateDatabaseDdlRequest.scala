package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateDatabaseDdlRequest. */
trait IUpdateDatabaseDdlRequest extends StObject {
  
  /** UpdateDatabaseDdlRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** UpdateDatabaseDdlRequest operationId */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /** UpdateDatabaseDdlRequest statements */
  var statements: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IUpdateDatabaseDdlRequest {
  
  inline def apply(): IUpdateDatabaseDdlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateDatabaseDdlRequest]
  }
  
  extension [Self <: IUpdateDatabaseDdlRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsNull: Self = StObject.set(x, "statements", null)
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value*))
  }
}
