package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListApiDeploymentRevisionsResponse extends StObject {
  
  /**
    * The revisions of the deployment.
    */
  var apiDeployments: js.UndefOr[js.Array[SchemaApiDeployment]] = js.undefined
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListApiDeploymentRevisionsResponse {
  
  inline def apply(): SchemaListApiDeploymentRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListApiDeploymentRevisionsResponse]
  }
  
  extension [Self <: SchemaListApiDeploymentRevisionsResponse](x: Self) {
    
    inline def setApiDeployments(value: js.Array[SchemaApiDeployment]): Self = StObject.set(x, "apiDeployments", value.asInstanceOf[js.Any])
    
    inline def setApiDeploymentsUndefined: Self = StObject.set(x, "apiDeployments", js.undefined)
    
    inline def setApiDeploymentsVarargs(value: SchemaApiDeployment*): Self = StObject.set(x, "apiDeployments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
