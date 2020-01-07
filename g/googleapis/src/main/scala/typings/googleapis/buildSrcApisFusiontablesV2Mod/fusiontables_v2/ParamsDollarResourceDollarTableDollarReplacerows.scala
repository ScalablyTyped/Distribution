package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import typings.googleapis.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarTableDollarReplacerows extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The delimiter used to separate cell values. This can only consist of a
    * single character. Default is ,.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * The encoding of the content. Default is UTF-8. Use 'auto-detect' if you
    * are unsure of the encoding.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * The index of the line up to which data will be imported. Default is to
    * import the entire file. If endLine is negative, it is an offset from the
    * end of the file; the imported content will exclude the last endLine
    * lines.
    */
  var endLine: js.UndefOr[Double] = js.native
  /**
    * Whether the imported CSV must have the same number of column values for
    * each row. If true, throws an exception if the CSV does not have the same
    * number of columns. If false, rows with fewer column values will be padded
    * with empty values. Default is true.
    */
  var isStrict: js.UndefOr[Boolean] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Anon_Body] = js.native
  /**
    * The index of the first line from which to start importing, inclusive.
    * Default is 0.
    */
  var startLine: js.UndefOr[Double] = js.native
  /**
    * Table whose rows will be replaced.
    */
  var tableId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarTableDollarReplacerows {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    delimiter: String = null,
    encoding: String = null,
    endLine: Int | Double = null,
    fields: String = null,
    isStrict: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    media: Anon_Body = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startLine: Int | Double = null,
    tableId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarTableDollarReplacerows = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(isStrict)) __obj.updateDynamic("isStrict")(isStrict.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarTableDollarReplacerows]
  }
}

