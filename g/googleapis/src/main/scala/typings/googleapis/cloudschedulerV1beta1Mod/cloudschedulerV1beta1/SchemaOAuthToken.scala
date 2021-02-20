package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information needed for generating an [OAuth
  * token](https://developers.google.com/identity/protocols/OAuth2). This type
  * of authorization should be used when sending requests to a GCP endpoint.
  */
@js.native
trait SchemaOAuthToken extends StObject {
  
  /**
    * OAuth scope to be used for generating OAuth access token. If not
    * specified, &quot;https://www.googleapis.com/auth/cloud-platform&quot;
    * will be used.
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating OAuth token. The service account must be within the same
    * project as the job. The caller must have iam.serviceAccounts.actAs
    * permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}
object SchemaOAuthToken {
  
  @scala.inline
  def apply(): SchemaOAuthToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOAuthToken]
  }
  
  @scala.inline
  implicit class SchemaOAuthTokenMutableBuilder[Self <: SchemaOAuthToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
  }
}
