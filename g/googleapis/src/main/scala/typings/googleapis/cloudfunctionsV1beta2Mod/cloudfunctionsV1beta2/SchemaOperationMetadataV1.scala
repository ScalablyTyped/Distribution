package typings.googleapis.cloudfunctionsV1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationMetadataV1 extends StObject {
  
  /**
    * The Cloud Build ID of the function created or updated by an API call. This field is only populated for Create and Update operations.
    */
  var buildId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original request that started the operation.
    */
  var request: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Target of the operation - for example projects/project-1/locations/region-1/functions/function-1
    */
  var target: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of operation.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last update timestamp of the operation.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version id of the function created or updated by an API call. This field is only populated for Create and Update operations.
    */
  var versionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperationMetadataV1 {
  
  inline def apply(): SchemaOperationMetadataV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadataV1]
  }
  
  extension [Self <: SchemaOperationMetadataV1](x: Self) {
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdNull: Self = StObject.set(x, "buildId", null)
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setRequest(value: StringDictionary[Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestNull: Self = StObject.set(x, "request", null)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
