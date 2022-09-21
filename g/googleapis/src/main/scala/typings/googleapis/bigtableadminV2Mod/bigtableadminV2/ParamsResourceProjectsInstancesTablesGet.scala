package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesTablesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique name of the requested table. Values are of the form `projects/{project\}/instances/{instance\}/tables/{table\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The view to be applied to the returned table's fields. Defaults to `SCHEMA_VIEW` if unspecified.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesTablesGet {
  
  inline def apply(): ParamsResourceProjectsInstancesTablesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesTablesGet]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesTablesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
