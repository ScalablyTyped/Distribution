package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationDatasetReference extends StObject {
  
  /**
    * Required. A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The ID of the project containing this dataset.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationDatasetReference {
  
  inline def apply(): SchemaDestinationDatasetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationDatasetReference]
  }
  
  extension [Self <: SchemaDestinationDatasetReference](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
