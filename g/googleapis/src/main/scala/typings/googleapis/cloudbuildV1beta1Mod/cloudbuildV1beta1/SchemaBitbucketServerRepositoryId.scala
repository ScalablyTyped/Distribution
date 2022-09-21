package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBitbucketServerRepositoryId extends StObject {
  
  /**
    * Required. Identifier for the project storing the repository.
    */
  var projectKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Identifier for the repository.
    */
  var repoSlug: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ID of the webhook that was created for receiving events from this repo. We only create and manage a single webhook for each repo.
    */
  var webhookId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBitbucketServerRepositoryId {
  
  inline def apply(): SchemaBitbucketServerRepositoryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBitbucketServerRepositoryId]
  }
  
  extension [Self <: SchemaBitbucketServerRepositoryId](x: Self) {
    
    inline def setProjectKey(value: String): Self = StObject.set(x, "projectKey", value.asInstanceOf[js.Any])
    
    inline def setProjectKeyNull: Self = StObject.set(x, "projectKey", null)
    
    inline def setProjectKeyUndefined: Self = StObject.set(x, "projectKey", js.undefined)
    
    inline def setRepoSlug(value: String): Self = StObject.set(x, "repoSlug", value.asInstanceOf[js.Any])
    
    inline def setRepoSlugNull: Self = StObject.set(x, "repoSlug", null)
    
    inline def setRepoSlugUndefined: Self = StObject.set(x, "repoSlug", js.undefined)
    
    inline def setWebhookId(value: Double): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    inline def setWebhookIdNull: Self = StObject.set(x, "webhookId", null)
    
    inline def setWebhookIdUndefined: Self = StObject.set(x, "webhookId", js.undefined)
  }
}
