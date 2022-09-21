package typings.googleapis.bigqueryconnectionV1beta1Mod.bigqueryconnectionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnection extends StObject {
  
  /**
    * Cloud SQL properties.
    */
  var cloudSql: js.UndefOr[SchemaCloudSqlProperties] = js.undefined
  
  /**
    * Output only. The creation timestamp of the connection.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User provided description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User provided display name for the connection.
    */
  var friendlyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. True, if credential is configured for this connection.
    */
  var hasCredential: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of the connection.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the connection in the form of: `projects/{project_id\}/locations/{location_id\}/connections/{connection_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnection {
  
  inline def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  
  extension [Self <: SchemaConnection](x: Self) {
    
    inline def setCloudSql(value: SchemaCloudSqlProperties): Self = StObject.set(x, "cloudSql", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlUndefined: Self = StObject.set(x, "cloudSql", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameNull: Self = StObject.set(x, "friendlyName", null)
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setHasCredential(value: Boolean): Self = StObject.set(x, "hasCredential", value.asInstanceOf[js.Any])
    
    inline def setHasCredentialNull: Self = StObject.set(x, "hasCredential", null)
    
    inline def setHasCredentialUndefined: Self = StObject.set(x, "hasCredential", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
