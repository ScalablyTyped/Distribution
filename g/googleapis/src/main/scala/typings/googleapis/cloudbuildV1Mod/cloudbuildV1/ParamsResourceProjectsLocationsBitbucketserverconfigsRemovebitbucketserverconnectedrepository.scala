package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `BitbucketServerConfig` to remove a connected repository. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    */
  var config: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemoveBitbucketServerConnectedRepositoryRequest] = js.undefined
}
object ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository {
  
  inline def apply(): ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setRequestBody(value: SchemaRemoveBitbucketServerConnectedRepositoryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
