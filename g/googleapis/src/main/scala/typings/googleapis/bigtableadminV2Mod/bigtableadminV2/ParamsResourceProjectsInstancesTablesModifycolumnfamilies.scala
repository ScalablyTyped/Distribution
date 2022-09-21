package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesTablesModifycolumnfamilies
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique name of the table whose families should be modified. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModifyColumnFamiliesRequest] = js.undefined
}
object ParamsResourceProjectsInstancesTablesModifycolumnfamilies {
  
  inline def apply(): ParamsResourceProjectsInstancesTablesModifycolumnfamilies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesTablesModifycolumnfamilies]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesTablesModifycolumnfamilies](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaModifyColumnFamiliesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
