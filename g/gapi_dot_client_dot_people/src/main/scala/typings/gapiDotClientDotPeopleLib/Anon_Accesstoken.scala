package typings
package gapiDotClientDotPeopleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Accesstoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The resource name for the person, assigned by the server. An ASCII string
                   * with a max length of 27 characters, in the form of
                   * `people/`<var>person_id</var>.
                   */
  var resourceName: java.lang.String
  /**
                   * &#42;&#42;Required.&#42;&#42; A field mask to restrict which fields on the person are
                   * updated. Valid values are:
                   *
                   * &#42; addresses
                   * &#42; biographies
                   * &#42; birthdays
                   * &#42; braggingRights
                   * &#42; emailAddresses
                   * &#42; events
                   * &#42; genders
                   * &#42; imClients
                   * &#42; interests
                   * &#42; locales
                   * &#42; names
                   * &#42; nicknames
                   * &#42; occupations
                   * &#42; organizations
                   * &#42; phoneNumbers
                   * &#42; relations
                   * &#42; residences
                   * &#42; skills
                   * &#42; urls
                   */
  var updatePersonFields: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

