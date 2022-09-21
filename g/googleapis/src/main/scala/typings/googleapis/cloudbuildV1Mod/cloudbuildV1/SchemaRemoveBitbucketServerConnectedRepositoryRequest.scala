package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveBitbucketServerConnectedRepositoryRequest extends StObject {
  
  /**
    * The connected repository to remove.
    */
  var connectedRepository: js.UndefOr[SchemaBitbucketServerRepositoryId] = js.undefined
}
object SchemaRemoveBitbucketServerConnectedRepositoryRequest {
  
  inline def apply(): SchemaRemoveBitbucketServerConnectedRepositoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveBitbucketServerConnectedRepositoryRequest]
  }
  
  extension [Self <: SchemaRemoveBitbucketServerConnectedRepositoryRequest](x: Self) {
    
    inline def setConnectedRepository(value: SchemaBitbucketServerRepositoryId): Self = StObject.set(x, "connectedRepository", value.asInstanceOf[js.Any])
    
    inline def setConnectedRepositoryUndefined: Self = StObject.set(x, "connectedRepository", js.undefined)
  }
}
