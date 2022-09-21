package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDeviceRegistriesResponse extends StObject {
  
  /**
    * The registries that matched the query.
    */
  var deviceRegistries: js.UndefOr[js.Array[SchemaDeviceRegistry]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more registries that match the request; this value should be passed in a new `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDeviceRegistriesResponse {
  
  inline def apply(): SchemaListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceRegistriesResponse]
  }
  
  extension [Self <: SchemaListDeviceRegistriesResponse](x: Self) {
    
    inline def setDeviceRegistries(value: js.Array[SchemaDeviceRegistry]): Self = StObject.set(x, "deviceRegistries", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistriesUndefined: Self = StObject.set(x, "deviceRegistries", js.undefined)
    
    inline def setDeviceRegistriesVarargs(value: SchemaDeviceRegistry*): Self = StObject.set(x, "deviceRegistries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
