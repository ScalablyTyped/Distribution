package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDeviceTierConfigsResponse extends StObject {
  
  /**
    * Device tier configs created by the developer.
    */
  var deviceTierConfigs: js.UndefOr[js.Array[SchemaDeviceTierConfig]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDeviceTierConfigsResponse {
  
  inline def apply(): SchemaListDeviceTierConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceTierConfigsResponse]
  }
  
  extension [Self <: SchemaListDeviceTierConfigsResponse](x: Self) {
    
    inline def setDeviceTierConfigs(value: js.Array[SchemaDeviceTierConfig]): Self = StObject.set(x, "deviceTierConfigs", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierConfigsUndefined: Self = StObject.set(x, "deviceTierConfigs", js.undefined)
    
    inline def setDeviceTierConfigsVarargs(value: SchemaDeviceTierConfig*): Self = StObject.set(x, "deviceTierConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
