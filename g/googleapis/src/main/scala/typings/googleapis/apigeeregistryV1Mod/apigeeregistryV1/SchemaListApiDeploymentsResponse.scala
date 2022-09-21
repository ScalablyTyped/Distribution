package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListApiDeploymentsResponse extends StObject {
  
  /**
    * The deployments from the specified publisher.
    */
  var apiDeployments: js.UndefOr[js.Array[SchemaApiDeployment]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListApiDeploymentsResponse {
  
  inline def apply(): SchemaListApiDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListApiDeploymentsResponse]
  }
  
  extension [Self <: SchemaListApiDeploymentsResponse](x: Self) {
    
    inline def setApiDeployments(value: js.Array[SchemaApiDeployment]): Self = StObject.set(x, "apiDeployments", value.asInstanceOf[js.Any])
    
    inline def setApiDeploymentsUndefined: Self = StObject.set(x, "apiDeployments", js.undefined)
    
    inline def setApiDeploymentsVarargs(value: SchemaApiDeployment*): Self = StObject.set(x, "apiDeployments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
