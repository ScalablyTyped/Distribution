package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateBitbucketServerConnectedRepositoriesResponseMetadata extends StObject {
  
  /**
    * Time the operation was completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the `BitbucketServerConfig` that added connected repositories. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    */
  var config: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatchCreateBitbucketServerConnectedRepositoriesResponseMetadata {
  
  inline def apply(): SchemaBatchCreateBitbucketServerConnectedRepositoriesResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateBitbucketServerConnectedRepositoriesResponseMetadata]
  }
  
  extension [Self <: SchemaBatchCreateBitbucketServerConnectedRepositoriesResponseMetadata](x: Self) {
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigNull: Self = StObject.set(x, "config", null)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
