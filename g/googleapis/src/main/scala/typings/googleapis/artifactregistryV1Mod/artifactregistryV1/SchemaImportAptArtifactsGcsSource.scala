package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAptArtifactsGcsSource extends StObject {
  
  /**
    * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
    */
  var uris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Supports URI wildcards for matching multiple objects from a single URI.
    */
  var useWildcards: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaImportAptArtifactsGcsSource {
  
  inline def apply(): SchemaImportAptArtifactsGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAptArtifactsGcsSource]
  }
  
  extension [Self <: SchemaImportAptArtifactsGcsSource](x: Self) {
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisNull: Self = StObject.set(x, "uris", null)
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
    
    inline def setUseWildcards(value: Boolean): Self = StObject.set(x, "useWildcards", value.asInstanceOf[js.Any])
    
    inline def setUseWildcardsNull: Self = StObject.set(x, "useWildcards", null)
    
    inline def setUseWildcardsUndefined: Self = StObject.set(x, "useWildcards", js.undefined)
  }
}
