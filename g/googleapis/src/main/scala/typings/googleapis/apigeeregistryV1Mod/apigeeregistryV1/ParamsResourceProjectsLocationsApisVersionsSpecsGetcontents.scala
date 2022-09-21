package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the spec whose contents should be retrieved. Format: projects/x/locations/x/apis/x/versions/x/specs/x
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsSpecsGetcontents](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
