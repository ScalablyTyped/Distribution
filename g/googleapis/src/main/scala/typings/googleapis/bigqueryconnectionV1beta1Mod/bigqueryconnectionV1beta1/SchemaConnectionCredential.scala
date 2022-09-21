package typings.googleapis.bigqueryconnectionV1beta1Mod.bigqueryconnectionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionCredential extends StObject {
  
  /**
    * Credential for Cloud SQL database.
    */
  var cloudSql: js.UndefOr[SchemaCloudSqlCredential] = js.undefined
}
object SchemaConnectionCredential {
  
  inline def apply(): SchemaConnectionCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionCredential]
  }
  
  extension [Self <: SchemaConnectionCredential](x: Self) {
    
    inline def setCloudSql(value: SchemaCloudSqlCredential): Self = StObject.set(x, "cloudSql", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlUndefined: Self = StObject.set(x, "cloudSql", js.undefined)
  }
}
