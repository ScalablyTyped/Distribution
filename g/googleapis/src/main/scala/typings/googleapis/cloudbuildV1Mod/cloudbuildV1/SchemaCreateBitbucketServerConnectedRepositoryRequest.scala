package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateBitbucketServerConnectedRepositoryRequest extends StObject {
  
  /**
    * Required. The Bitbucket Server repository to connect.
    */
  var bitbucketServerConnectedRepository: js.UndefOr[SchemaBitbucketServerConnectedRepository] = js.undefined
  
  /**
    * Required. The name of the `BitbucketServerConfig` that added connected repository. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateBitbucketServerConnectedRepositoryRequest {
  
  inline def apply(): SchemaCreateBitbucketServerConnectedRepositoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateBitbucketServerConnectedRepositoryRequest]
  }
  
  extension [Self <: SchemaCreateBitbucketServerConnectedRepositoryRequest](x: Self) {
    
    inline def setBitbucketServerConnectedRepository(value: SchemaBitbucketServerConnectedRepository): Self = StObject.set(x, "bitbucketServerConnectedRepository", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConnectedRepositoryUndefined: Self = StObject.set(x, "bitbucketServerConnectedRepository", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
