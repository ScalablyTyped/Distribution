package typings.gapiDotClientDotIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  /**
    * Optional. A user-specified description of the service account.  Must be
    * fewer than 100 UTF-8 bytes.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** @OutputOnly The email address of the service account. */
  var email: js.UndefOr[String] = js.undefined
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[String] = js.undefined
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
  var name: js.UndefOr[String] = js.undefined
  /**
    * @OutputOnly. The OAuth2 client id for the service account.
    * This is used in conjunction with the OAuth2 clientconfig API to make
    * three legged OAuth2 (3LO) flows to access the data of Google users.
    */
  var oauth2ClientId: js.UndefOr[String] = js.undefined
  /** @OutputOnly The id of the project that owns the service account. */
  var projectId: js.UndefOr[String] = js.undefined
  /** @OutputOnly The unique and stable id of the service account. */
  var uniqueId: js.UndefOr[String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    etag: String = null,
    name: String = null,
    oauth2ClientId: String = null,
    projectId: String = null,
    uniqueId: String = null
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
}

