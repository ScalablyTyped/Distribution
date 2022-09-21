package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFilesResponse extends StObject {
  
  /**
    * The files returned.
    */
  var files: js.UndefOr[js.Array[SchemaGoogleDevtoolsArtifactregistryV1File]] = js.undefined
  
  /**
    * The token to retrieve the next page of files, or empty if there are no more files to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListFilesResponse {
  
  inline def apply(): SchemaListFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFilesResponse]
  }
  
  extension [Self <: SchemaListFilesResponse](x: Self) {
    
    inline def setFiles(value: js.Array[SchemaGoogleDevtoolsArtifactregistryV1File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaGoogleDevtoolsArtifactregistryV1File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
