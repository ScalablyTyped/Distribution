package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information needed for generating an [OAuth
  * token](https://developers.google.com/identity/protocols/OAuth2). This type
  * of authorization should be used when sending requests to a GCP endpoint.
  */
@js.native
trait SchemaOAuthToken extends js.Object {
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
  implicit class SchemaOAuthTokenOps[Self <: SchemaOAuthToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setServiceAccountEmail(value: String): Self = this.set("serviceAccountEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccountEmail: Self = this.set("serviceAccountEmail", js.undefined)
  }
  
}

