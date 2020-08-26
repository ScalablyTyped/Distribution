package typings.gapiClientFusiontables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** The delimiter used to separate cell values. This can only consist of a single character. Default is ,. */
  var delimiter: js.UndefOr[String] = js.native
  /** The encoding of the content. Default is UTF-8. Use 'auto-detect' if you are unsure of the encoding. */
  var encoding: js.UndefOr[String] = js.native
  /**
    * The index of the line up to which data will be imported. Default is to import the entire file. If endLine is negative, it is an offset from the end of
    * the file; the imported content will exclude the last endLine lines.
    */
  var endLine: js.UndefOr[Double] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * Whether the imported CSV must have the same number of column values for each row. If true, throws an exception if the CSV does not have the same number
    * of columns. If false, rows with fewer column values will be padded with empty values. Default is true.
    */
  var isStrict: js.UndefOr[Boolean] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** The index of the first line from which to start importing, inclusive. Default is 0. */
  var startLine: js.UndefOr[Double] = js.native
  /** Table whose rows will be replaced. */
  var tableId: String = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Delimiter {
  @scala.inline
  def apply(tableId: String): Delimiter = {
    val __obj = js.Dynamic.literal(tableId = tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
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
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIsStrict(value: Boolean): Self = this.set("isStrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStrict: Self = this.set("isStrict", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setStartLine(value: Double): Self = this.set("startLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLine: Self = this.set("startLine", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

