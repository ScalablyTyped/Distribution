package typings.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The delimiter used to separate cell values. This can only consist of a single character. Default is ,. */
  var delimiter: js.UndefOr[String] = js.undefined
  /** The encoding of the content. Default is UTF-8. Use 'auto-detect' if you are unsure of the encoding. */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * The index of the line up to which data will be imported. Default is to import the entire file. If endLine is negative, it is an offset from the end of
    * the file; the imported content will exclude the last endLine lines.
    */
  var endLine: js.UndefOr[Double] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Whether the imported CSV must have the same number of column values for each row. If true, throws an exception if the CSV does not have the same number
    * of columns. If false, rows with fewer column values will be padded with empty values. Default is true.
    */
  var isStrict: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The index of the first line from which to start importing, inclusive. Default is 0. */
  var startLine: js.UndefOr[Double] = js.undefined
  /** Table whose rows will be replaced. */
  var tableId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Delimiter {
  @scala.inline
  def apply(
    tableId: String,
    alt: String = null,
    delimiter: String = null,
    encoding: String = null,
    endLine: js.UndefOr[Double] = js.undefined,
    fields: String = null,
    isStrict: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startLine: js.UndefOr[Double] = js.undefined,
    userIp: String = null
  ): Delimiter = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(isStrict)) __obj.updateDynamic("isStrict")(isStrict.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(startLine)) __obj.updateDynamic("startLine")(startLine.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
}

