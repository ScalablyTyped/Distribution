package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBitbucketServerRepositoriesResponse extends StObject {
  
  /**
    * List of Bitbucket Server repositories.
    */
  var bitbucketServerRepositories: js.UndefOr[js.Array[SchemaBitbucketServerRepository]] = js.undefined
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBitbucketServerRepositoriesResponse {
  
  inline def apply(): SchemaListBitbucketServerRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBitbucketServerRepositoriesResponse]
  }
  
  extension [Self <: SchemaListBitbucketServerRepositoriesResponse](x: Self) {
    
    inline def setBitbucketServerRepositories(value: js.Array[SchemaBitbucketServerRepository]): Self = StObject.set(x, "bitbucketServerRepositories", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerRepositoriesUndefined: Self = StObject.set(x, "bitbucketServerRepositories", js.undefined)
    
    inline def setBitbucketServerRepositoriesVarargs(value: SchemaBitbucketServerRepository*): Self = StObject.set(x, "bitbucketServerRepositories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
