package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  /**
    * Optional. A user-specified description of the service account.  Must be
    * fewer than 100 UTF-8 bytes.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** @OutputOnly The email address of the service account. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Used to perform a consistent read-modify-write. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @OutputOnly. The OAuth2 client id for the service account.
    * This is used in conjunction with the OAuth2 clientconfig API to make
    * three legged OAuth2 (3LO) flows to access the data of Google users.
    */
  var oauth2ClientId: js.UndefOr[java.lang.String] = js.undefined
  /** @OutputOnly The id of the project that owns the service account. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** @OutputOnly The unique and stable id of the service account. */
  var uniqueId: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    etag: java.lang.String = null,
    name: java.lang.String = null,
    oauth2ClientId: java.lang.String = null,
    projectId: java.lang.String = null,
    uniqueId: java.lang.String = null
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oauth2ClientId != null) __obj.updateDynamic("oauth2ClientId")(oauth2ClientId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId)
    __obj.asInstanceOf[ServiceAccount]
  }
}

