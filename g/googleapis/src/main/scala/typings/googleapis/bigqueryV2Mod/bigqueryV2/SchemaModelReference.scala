package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModelReference extends StObject {
  
  /**
    * [Required] The ID of the dataset containing this model.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
    */
  var modelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] The ID of the project containing this model.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaModelReference {
  
  inline def apply(): SchemaModelReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModelReference]
  }
  
  extension [Self <: SchemaModelReference](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdNull: Self = StObject.set(x, "modelId", null)
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
