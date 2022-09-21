package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfig extends StObject {
  
  /**
    * Required. The Customer Managed Encryption Key (CMEK) used for data encryption. The CMEK name should follow the format of `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`, where the `location` must match InstanceConfig.location.
    */
  var cmekKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The GCP location where the Instance resides.
    */
  var location: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfig {
  
  inline def apply(): SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfig]
  }
  
  extension [Self <: SchemaConfig](x: Self) {
    
    inline def setCmekKeyName(value: String): Self = StObject.set(x, "cmekKeyName", value.asInstanceOf[js.Any])
    
    inline def setCmekKeyNameNull: Self = StObject.set(x, "cmekKeyName", null)
    
    inline def setCmekKeyNameUndefined: Self = StObject.set(x, "cmekKeyName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
