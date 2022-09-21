package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGithubEnterpriseConfigsResponse extends StObject {
  
  /**
    * A list of GitHubEnterpriseConfigs
    */
  var configs: js.UndefOr[js.Array[SchemaGitHubEnterpriseConfig]] = js.undefined
}
object SchemaListGithubEnterpriseConfigsResponse {
  
  inline def apply(): SchemaListGithubEnterpriseConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGithubEnterpriseConfigsResponse]
  }
  
  extension [Self <: SchemaListGithubEnterpriseConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGitHubEnterpriseConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGitHubEnterpriseConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
