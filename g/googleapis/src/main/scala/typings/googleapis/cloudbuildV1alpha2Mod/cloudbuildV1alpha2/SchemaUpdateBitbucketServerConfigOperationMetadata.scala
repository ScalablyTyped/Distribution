package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateBitbucketServerConfigOperationMetadata extends StObject {
  
  /**
    * The resource name of the BitbucketServerConfig to be updated. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{id\}`.
    */
  var bitbucketServerConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the operation was completed.
    */
  var completeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateBitbucketServerConfigOperationMetadata {
  
  inline def apply(): SchemaUpdateBitbucketServerConfigOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBitbucketServerConfigOperationMetadata]
  }
  
  extension [Self <: SchemaUpdateBitbucketServerConfigOperationMetadata](x: Self) {
    
    inline def setBitbucketServerConfig(value: String): Self = StObject.set(x, "bitbucketServerConfig", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigNull: Self = StObject.set(x, "bitbucketServerConfig", null)
    
    inline def setBitbucketServerConfigUndefined: Self = StObject.set(x, "bitbucketServerConfig", js.undefined)
    
    inline def setCompleteTime(value: String): Self = StObject.set(x, "completeTime", value.asInstanceOf[js.Any])
    
    inline def setCompleteTimeNull: Self = StObject.set(x, "completeTime", null)
    
    inline def setCompleteTimeUndefined: Self = StObject.set(x, "completeTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
