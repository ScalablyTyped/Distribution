package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsGetcontents
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the artifact whose contents should be retrieved. Format: {parent\}/artifacts/x
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsGetcontents {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsGetcontents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsGetcontents]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsGetcontents](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
