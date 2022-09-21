package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesTablesRestore
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the instance in which to create the restored table. This instance must be in the same project as the source backup. Values are of the form `projects//instances/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRestoreTableRequest] = js.undefined
}
object ParamsResourceProjectsInstancesTablesRestore {
  
  inline def apply(): ParamsResourceProjectsInstancesTablesRestore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesTablesRestore]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesTablesRestore](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaRestoreTableRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
