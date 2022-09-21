package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateBitbucketServerConnectedRepositoriesResponse extends StObject {
  
  /**
    * The connected Bitbucket Server repositories.
    */
  var bitbucketServerConnectedRepositories: js.UndefOr[js.Array[SchemaBitbucketServerConnectedRepository]] = js.undefined
}
object SchemaBatchCreateBitbucketServerConnectedRepositoriesResponse {
  
  inline def apply(): SchemaBatchCreateBitbucketServerConnectedRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateBitbucketServerConnectedRepositoriesResponse]
  }
  
  extension [Self <: SchemaBatchCreateBitbucketServerConnectedRepositoriesResponse](x: Self) {
    
    inline def setBitbucketServerConnectedRepositories(value: js.Array[SchemaBitbucketServerConnectedRepository]): Self = StObject.set(x, "bitbucketServerConnectedRepositories", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConnectedRepositoriesUndefined: Self = StObject.set(x, "bitbucketServerConnectedRepositories", js.undefined)
    
    inline def setBitbucketServerConnectedRepositoriesVarargs(value: SchemaBitbucketServerConnectedRepository*): Self = StObject.set(x, "bitbucketServerConnectedRepositories", js.Array(value*))
  }
}
