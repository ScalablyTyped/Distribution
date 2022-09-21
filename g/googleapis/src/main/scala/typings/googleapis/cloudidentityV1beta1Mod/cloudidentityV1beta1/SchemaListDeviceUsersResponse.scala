package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDeviceUsersResponse extends StObject {
  
  /**
    * Devices meeting the list restrictions.
    */
  var deviceUsers: js.UndefOr[js.Array[SchemaDeviceUser]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. Empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDeviceUsersResponse {
  
  inline def apply(): SchemaListDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceUsersResponse]
  }
  
  extension [Self <: SchemaListDeviceUsersResponse](x: Self) {
    
    inline def setDeviceUsers(value: js.Array[SchemaDeviceUser]): Self = StObject.set(x, "deviceUsers", value.asInstanceOf[js.Any])
    
    inline def setDeviceUsersUndefined: Self = StObject.set(x, "deviceUsers", js.undefined)
    
    inline def setDeviceUsersVarargs(value: SchemaDeviceUser*): Self = StObject.set(x, "deviceUsers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
