package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsSpecsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the spec to retrieve. Format: projects/x/locations/x/apis/x/versions/x/specs/x
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsSpecsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsSpecsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsSpecsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsSpecsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
