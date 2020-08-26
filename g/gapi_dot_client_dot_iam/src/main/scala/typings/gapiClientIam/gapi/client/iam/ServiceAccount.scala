package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccount extends js.Object {
  /**
    * Optional. A user-specified description of the service account.  Must be
    * fewer than 100 UTF-8 bytes.
    */
  var displayName: js.UndefOr[String] = js.native
  /** @OutputOnly The email address of the service account. */
  var email: js.UndefOr[String] = js.native
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.native
  /**
    * The resource name of the service account in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    *
    * Requests using `-` as a wildcard for the `PROJECT_ID` will infer the
    * project from the `account` and the `ACCOUNT` value can be the `email`
    * address or the `unique_id` of the service account.
    *
    * In responses the resource name will always be in the format
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * @OutputOnly. The OAuth2 client id for the service account.
    * This is used in conjunction with the OAuth2 clientconfig API to make
    * three legged OAuth2 (3LO) flows to access the data of Google users.
    */
  var oauth2ClientId: js.UndefOr[String] = js.native
  /** @OutputOnly The id of the project that owns the service account. */
  var projectId: js.UndefOr[String] = js.native
  /** @OutputOnly The unique and stable id of the service account. */
  var uniqueId: js.UndefOr[String] = js.native
}

object ServiceAccount {
  @scala.inline
  def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  @scala.inline
  implicit class ServiceAccountOps[Self <: ServiceAccount] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOauth2ClientId(value: String): Self = this.set("oauth2ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth2ClientId: Self = this.set("oauth2ClientId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueId: Self = this.set("uniqueId", js.undefined)
  }
  
}

