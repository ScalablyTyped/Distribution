package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GetDatabaseDdlResponse. */
trait IGetDatabaseDdlResponse extends StObject {
  
  /** GetDatabaseDdlResponse statements */
  var statements: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IGetDatabaseDdlResponse {
  
  inline def apply(): IGetDatabaseDdlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetDatabaseDdlResponse]
  }
  
  extension [Self <: IGetDatabaseDdlResponse](x: Self) {
    
    inline def setStatements(value: js.Array[String]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsNull: Self = StObject.set(x, "statements", null)
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: String*): Self = StObject.set(x, "statements", js.Array(value*))
  }
}
