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

