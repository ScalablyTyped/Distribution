package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsArtifactsReplaceartifact
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaArtifact] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsArtifactsReplaceartifact {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsArtifactsReplaceartifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsArtifactsReplaceartifact]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsArtifactsReplaceartifact](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaArtifact): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
