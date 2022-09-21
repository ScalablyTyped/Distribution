package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccountKey extends StObject {
  
  /**
    * The body of the private key credentials file, in string format. This is only populated when the ServiceAccountKey is created, and is not stored by Google.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An opaque, unique identifier for this ServiceAccountKey. Assigned by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Public key data for the credentials file. This is an X.509 cert. If you are using the googleCredentials key type, this is identical to the cert that can be retrieved by using the X.509 cert url inside of the credentials file.
    */
  var publicData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file format of the generated key data.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAccountKey {
  
  inline def apply(): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
  
  extension [Self <: SchemaServiceAccountKey](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPublicData(value: String): Self = StObject.set(x, "publicData", value.asInstanceOf[js.Any])
    
    inline def setPublicDataNull: Self = StObject.set(x, "publicData", null)
    
    inline def setPublicDataUndefined: Self = StObject.set(x, "publicData", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
