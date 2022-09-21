package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsArtifactsGetcontents
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the artifact whose contents should be retrieved. Format: {parent\}/artifacts/x
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsArtifactsGetcontents {
  
  inline def apply(): ParamsResourceProjectsLocationsArtifactsGetcontents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsArtifactsGetcontents]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsArtifactsGetcontents](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
