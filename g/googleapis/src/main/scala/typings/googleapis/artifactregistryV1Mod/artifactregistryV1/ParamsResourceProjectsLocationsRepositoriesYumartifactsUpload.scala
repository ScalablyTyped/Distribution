package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesYumartifactsUpload
  extends StObject
     with StandardParameters {
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * The name of the parent resource where the artifacts will be uploaded.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUploadYumArtifactRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesYumartifactsUpload {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesYumartifactsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesYumartifactsUpload]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesYumartifactsUpload](x: Self) {
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaUploadYumArtifactRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
