package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDockerImagesResponse extends StObject {
  
  /**
    * The docker images returned.
    */
  var dockerImages: js.UndefOr[js.Array[SchemaDockerImage]] = js.undefined
  
  /**
    * The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDockerImagesResponse {
  
  inline def apply(): SchemaListDockerImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDockerImagesResponse]
  }
  
  extension [Self <: SchemaListDockerImagesResponse](x: Self) {
    
    inline def setDockerImages(value: js.Array[SchemaDockerImage]): Self = StObject.set(x, "dockerImages", value.asInstanceOf[js.Any])
    
    inline def setDockerImagesUndefined: Self = StObject.set(x, "dockerImages", js.undefined)
    
    inline def setDockerImagesVarargs(value: SchemaDockerImage*): Self = StObject.set(x, "dockerImages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
