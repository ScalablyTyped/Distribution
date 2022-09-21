package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMavenArtifactsResponse extends StObject {
  
  /**
    * The maven artifacts returned.
    */
  var mavenArtifacts: js.UndefOr[js.Array[SchemaMavenArtifact]] = js.undefined
  
  /**
    * The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListMavenArtifactsResponse {
  
  inline def apply(): SchemaListMavenArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMavenArtifactsResponse]
  }
  
  extension [Self <: SchemaListMavenArtifactsResponse](x: Self) {
    
    inline def setMavenArtifacts(value: js.Array[SchemaMavenArtifact]): Self = StObject.set(x, "mavenArtifacts", value.asInstanceOf[js.Any])
    
    inline def setMavenArtifactsUndefined: Self = StObject.set(x, "mavenArtifacts", js.undefined)
    
    inline def setMavenArtifactsVarargs(value: SchemaMavenArtifact*): Self = StObject.set(x, "mavenArtifacts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
