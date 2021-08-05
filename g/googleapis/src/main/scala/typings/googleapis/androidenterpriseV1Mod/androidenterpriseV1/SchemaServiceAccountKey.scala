package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Credentials that can be used to authenticate as a service account.
  */
trait SchemaServiceAccountKey extends StObject {
  
  /**
    * The body of the private key credentials file, in string format. This is
    * only populated when the ServiceAccountKey is created, and is not stored
    * by Google.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque, unique identifier for this ServiceAccountKey. Assigned by the
    * server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#serviceAccountKey&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Public key data for the credentials file. This is an X.509 cert. If you
    * are using the googleCredentials key type, this is identical to the cert
    * that can be retrieved by using the X.509 cert url inside of the
    * credentials file.
    */
  var publicData: js.UndefOr[String] = js.undefined
  
  /**
    * The file format of the generated key data.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaServiceAccountKey {
  
  inline def apply(): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
  
  extension [Self <: SchemaServiceAccountKey](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublicData(value: String): Self = StObject.set(x, "publicData", value.asInstanceOf[js.Any])
    
    inline def setPublicDataUndefined: Self = StObject.set(x, "publicData", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
