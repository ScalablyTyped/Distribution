package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    */
  var artifactId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent, which owns this collection of artifacts. Format: {parent\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaArtifact] = js.undefined
}
object ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsApisVersionsSpecsArtifactsCreate](x: Self) {
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdUndefined: Self = StObject.set(x, "artifactId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaArtifact): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
