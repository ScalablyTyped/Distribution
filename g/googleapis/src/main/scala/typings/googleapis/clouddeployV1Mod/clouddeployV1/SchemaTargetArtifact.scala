package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetArtifact extends StObject {
  
  /**
    * Output only. URI of a directory containing the artifacts. This contains deployment configuration used by Skaffold during a rollout, and all paths are relative to this location.
    */
  var artifactUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. File path of the rendered manifest relative to the URI.
    */
  var manifestPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. File path of the resolved Skaffold configuration relative to the URI.
    */
  var skaffoldConfigPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetArtifact {
  
  inline def apply(): SchemaTargetArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetArtifact]
  }
  
  extension [Self <: SchemaTargetArtifact](x: Self) {
    
    inline def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
    
    inline def setArtifactUriNull: Self = StObject.set(x, "artifactUri", null)
    
    inline def setArtifactUriUndefined: Self = StObject.set(x, "artifactUri", js.undefined)
    
    inline def setManifestPath(value: String): Self = StObject.set(x, "manifestPath", value.asInstanceOf[js.Any])
    
    inline def setManifestPathNull: Self = StObject.set(x, "manifestPath", null)
    
    inline def setManifestPathUndefined: Self = StObject.set(x, "manifestPath", js.undefined)
    
    inline def setSkaffoldConfigPath(value: String): Self = StObject.set(x, "skaffoldConfigPath", value.asInstanceOf[js.Any])
    
    inline def setSkaffoldConfigPathNull: Self = StObject.set(x, "skaffoldConfigPath", null)
    
    inline def setSkaffoldConfigPathUndefined: Self = StObject.set(x, "skaffoldConfigPath", js.undefined)
  }
}
