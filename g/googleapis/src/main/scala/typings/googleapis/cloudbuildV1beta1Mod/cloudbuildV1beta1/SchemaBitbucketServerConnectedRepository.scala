package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBitbucketServerConnectedRepository extends StObject {
  
  /**
    * The name of the `BitbucketServerConfig` that added connected repository. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Bitbucket Server repositories to connect.
    */
  var repo: js.UndefOr[SchemaBitbucketServerRepositoryId] = js.undefined
  
  /**
    * Output only. The status of the repo connection request.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaBitbucketServerConnectedRepository {
  
  inline def apply(): SchemaBitbucketServerConnectedRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBitbucketServerConnectedRepository]
  }
  
  extension [Self <: SchemaBitbucketServerConnectedRepository](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRepo(value: SchemaBitbucketServerRepositoryId): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
