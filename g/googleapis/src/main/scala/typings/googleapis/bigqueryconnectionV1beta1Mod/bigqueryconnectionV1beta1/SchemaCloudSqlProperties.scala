package typings.googleapis.bigqueryconnectionV1beta1Mod.bigqueryconnectionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudSqlProperties extends StObject {
  
  /**
    * Input only. Cloud SQL credential.
    */
  var credential: js.UndefOr[SchemaCloudSqlCredential] = js.undefined
  
  /**
    * Database name.
    */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud SQL instance ID in the form `project:location:instance`.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The account ID of the service used for the purpose of this connection. When the connection is used in the context of an operation in BigQuery, this service account will serve as the identity being used for connecting to the CloudSQL instance specified in this connection.
    */
  var serviceAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the Cloud SQL database.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudSqlProperties {
  
  inline def apply(): SchemaCloudSqlProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudSqlProperties]
  }
  
  extension [Self <: SchemaCloudSqlProperties](x: Self) {
    
    inline def setCredential(value: SchemaCloudSqlCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setServiceAccountId(value: String): Self = StObject.set(x, "serviceAccountId", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountIdNull: Self = StObject.set(x, "serviceAccountId", null)
    
    inline def setServiceAccountIdUndefined: Self = StObject.set(x, "serviceAccountId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
