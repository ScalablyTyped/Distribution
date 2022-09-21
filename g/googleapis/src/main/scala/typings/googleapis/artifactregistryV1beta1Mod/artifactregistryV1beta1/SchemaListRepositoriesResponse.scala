package typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRepositoriesResponse extends StObject {
  
  /**
    * The token to retrieve the next page of repositories, or empty if there are no more repositories to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The repositories returned.
    */
  var repositories: js.UndefOr[js.Array[SchemaRepository]] = js.undefined
}
object SchemaListRepositoriesResponse {
  
  inline def apply(): SchemaListRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRepositoriesResponse]
  }
  
  extension [Self <: SchemaListRepositoriesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepositories(value: js.Array[SchemaRepository]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: SchemaRepository*): Self = StObject.set(x, "repositories", js.Array(value*))
  }
}
