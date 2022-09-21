package typings.googleapis.bigqueryreservationV1Mod.bigqueryreservationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableReference extends StObject {
  
  /**
    * The ID of the dataset in the above project.
    */
  var datasetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The assigned project ID of the project.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the table in the above dataset.
    */
  var tableId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTableReference {
  
  inline def apply(): SchemaTableReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableReference]
  }
  
  extension [Self <: SchemaTableReference](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdNull: Self = StObject.set(x, "datasetId", null)
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdNull: Self = StObject.set(x, "tableId", null)
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
