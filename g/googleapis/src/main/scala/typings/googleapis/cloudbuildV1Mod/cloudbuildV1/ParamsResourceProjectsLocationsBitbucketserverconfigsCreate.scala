package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBitbucketserverconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name. bitbucket_server_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
    */
  var bitbucketServerConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the parent resource.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBitbucketServerConfig] = js.undefined
}
object ParamsResourceProjectsLocationsBitbucketserverconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsBitbucketserverconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBitbucketserverconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate](x: Self) {
    
    inline def setBitbucketServerConfigId(value: String): Self = StObject.set(x, "bitbucketServerConfigId", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigIdUndefined: Self = StObject.set(x, "bitbucketServerConfigId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBitbucketServerConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
