package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesPartialupdateinstance
  extends StObject
     with StandardParameters {
  
  /**
    * The unique name of the instance. Values are of the form `projects/{project\}/instances/a-z+[a-z0-9]`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstance] = js.undefined
  
  /**
    * Required. The subset of Instance fields which should be replaced. Must be explicitly set.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesPartialupdateinstance {
  
  inline def apply(): ParamsResourceProjectsInstancesPartialupdateinstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesPartialupdateinstance]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesPartialupdateinstance](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaInstance): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
