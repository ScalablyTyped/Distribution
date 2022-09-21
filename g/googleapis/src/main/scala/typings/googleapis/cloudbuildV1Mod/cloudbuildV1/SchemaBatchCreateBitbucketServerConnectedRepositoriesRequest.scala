package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest extends StObject {
  
  /**
    * Required. Requests to connect Bitbucket Server repositories.
    */
  var requests: js.UndefOr[js.Array[SchemaCreateBitbucketServerConnectedRepositoryRequest]] = js.undefined
}
object SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest {
  
  inline def apply(): SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest]
  }
  
  extension [Self <: SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaCreateBitbucketServerConnectedRepositoryRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaCreateBitbucketServerConnectedRepositoryRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
