package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the `BitbucketServerConfig` that added connected repository. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate {
  
  inline def apply(): ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchCreateBitbucketServerConnectedRepositoriesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
