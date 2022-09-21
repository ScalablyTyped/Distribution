package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportYumArtifactsRequest extends StObject {
  
  /**
    * Google Cloud Storage location where input content is located.
    */
  var gcsSource: js.UndefOr[SchemaImportYumArtifactsGcsSource] = js.undefined
}
object SchemaImportYumArtifactsRequest {
  
  inline def apply(): SchemaImportYumArtifactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportYumArtifactsRequest]
  }
  
  extension [Self <: SchemaImportYumArtifactsRequest](x: Self) {
    
    inline def setGcsSource(value: SchemaImportYumArtifactsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
