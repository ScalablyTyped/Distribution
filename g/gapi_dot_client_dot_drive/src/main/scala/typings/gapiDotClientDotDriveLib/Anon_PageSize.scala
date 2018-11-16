package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_PageSize extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed
                   * from the list of changes and there will be no further change entries for this file.
                   */
  var includeCorpusRemovals: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access. */
  var includeRemoved: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether Team Drive files or changes should be included in results. */
  var includeTeamDriveItems: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of changes to return per page. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
                   * The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to
                   * the response from the getStartPageToken method.
                   */
  var pageToken: java.lang.String
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or
                   * shared files which have not been added to My Drive.
                   */
  var restrictToMyDrive: js.UndefOr[scala.Boolean] = js.undefined
  /** A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'. */
  var spaces: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the requesting application supports Team Drives. */
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * The Team Drive from which changes will be returned. If specified the change IDs will be reflective of the Team Drive; use the combined Team Drive ID
                   * and change ID as an identifier.
                   */
  var teamDriveId: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

