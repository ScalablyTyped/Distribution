package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Dataset ID of the table to delete
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the table to delete
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Table ID of the table to delete
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesDelete {
  
  inline def apply(): ParamsResourceTablesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesDelete]
  }
  
  extension [Self <: ParamsResourceTablesDelete](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
