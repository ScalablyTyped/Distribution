package typings
package gapiDotClientDotFusiontablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltDelimiter extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The delimiter used to separate cell values. This can only consist of a single character. Default is ,. */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /** The encoding of the content. Default is UTF-8. Use 'auto-detect' if you are unsure of the encoding. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index of the line up to which data will be imported. Default is to import the entire file. If endLine is negative, it is an offset from the end of
    * the file; the imported content will exclude the last endLine lines.
    */
  var endLine: js.UndefOr[scala.Double] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the imported CSV must have the same number of column values for each row. If true, throws an exception if the CSV does not have the same number
    * of columns. If false, rows with fewer column values will be padded with empty values. Default is true.
    */
  var isStrict: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The index of the first line from which to start importing, inclusive. Default is 0. */
  var startLine: js.UndefOr[scala.Double] = js.undefined
  /** Table whose rows will be replaced. */
  var tableId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltDelimiter {
  @scala.inline
  def apply(
    tableId: java.lang.String,
    alt: java.lang.String = null,
    delimiter: java.lang.String = null,
    encoding: java.lang.String = null,
    endLine: scala.Int | scala.Double = null,
    fields: java.lang.String = null,
    isStrict: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    startLine: scala.Int | scala.Double = null,
    userIp: java.lang.String = null
  ): Anon_AltDelimiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tableId")(tableId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(isStrict)) __obj.updateDynamic("isStrict")(isStrict)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltDelimiter]
  }
}

