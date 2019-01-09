package typings
package gapiDotClientDotResourceviewsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsFormat extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The requested format of the return value. It can be URL or URL_PORT. A JSON object will be included in the response based on the format. The default
    * format is NONE, which results in no JSON in the response.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The state of the instance to list. By default, it lists all instances. */
  var listState: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum count of results to be returned. Acceptable values are 0 to 5000, inclusive. (Default: 5000) */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies a nextPageToken returned by a previous list request. This token can be used to request the next page of results from a previous list request. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** The project name of the resource view. */
  var project: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the resource view. */
  var resourceView: java.lang.String
  /** The service name to return in the response. It is optional and if it is not set, all the service end points will be returned. */
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The zone name of the resource view. */
  var zone: java.lang.String
}

