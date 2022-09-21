package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatasourcesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The field will contain name of the resource requested, for example: `projects/{project_id\}/dataSources/{data_source_id\}` or `projects/{project_id\}/locations/{location_id\}/dataSources/{data_source_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatasourcesGet {
  
  inline def apply(): ParamsResourceProjectsDatasourcesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatasourcesGet]
  }
  
  extension [Self <: ParamsResourceProjectsDatasourcesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
