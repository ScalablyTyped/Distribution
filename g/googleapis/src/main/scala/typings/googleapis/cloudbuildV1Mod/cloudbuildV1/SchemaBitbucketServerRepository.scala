package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBitbucketServerRepository extends StObject {
  
  /**
    * Link to the browse repo page on the Bitbucket Server instance.
    */
  var browseUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the repository.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name of the repository.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the repository.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifier for a repository hosted on a Bitbucket Server.
    */
  var repoId: js.UndefOr[SchemaBitbucketServerRepositoryId] = js.undefined
}
object SchemaBitbucketServerRepository {
  
  inline def apply(): SchemaBitbucketServerRepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBitbucketServerRepository]
  }
  
  extension [Self <: SchemaBitbucketServerRepository](x: Self) {
    
    inline def setBrowseUri(value: String): Self = StObject.set(x, "browseUri", value.asInstanceOf[js.Any])
    
    inline def setBrowseUriNull: Self = StObject.set(x, "browseUri", null)
    
    inline def setBrowseUriUndefined: Self = StObject.set(x, "browseUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepoId(value: SchemaBitbucketServerRepositoryId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
  }
}
