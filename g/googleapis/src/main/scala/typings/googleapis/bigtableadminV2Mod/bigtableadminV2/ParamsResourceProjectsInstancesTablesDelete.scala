package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesTablesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique name of the table to be deleted. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesTablesDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesTablesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesTablesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesTablesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
