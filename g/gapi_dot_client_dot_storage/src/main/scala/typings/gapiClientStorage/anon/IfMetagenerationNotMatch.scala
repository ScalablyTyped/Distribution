package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfMetagenerationNotMatch extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Name of a bucket. */
  var bucket: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Makes the return of the bucket metadata conditional on whether the bucket's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /** Makes the return of the bucket metadata conditional on whether the bucket's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Apply a predefined set of access controls to this bucket. */
  var predefinedAcl: js.UndefOr[String] = js.native
  /** Apply a predefined set of default object access controls to this bucket. */
  var predefinedDefaultObjectAcl: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Set of properties to return. Defaults to full. */
  var projection: js.UndefOr[String] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[String] = js.native
}

object IfMetagenerationNotMatch {
  @scala.inline
  def apply(bucket: String): IfMetagenerationNotMatch = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfMetagenerationNotMatch]
  }
  @scala.inline
  implicit class IfMetagenerationNotMatchOps[Self <: IfMetagenerationNotMatch] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = this.set("ifMetagenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationMatch: Self = this.set("ifMetagenerationMatch", js.undefined)
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = this.set("ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMetagenerationNotMatch: Self = this.set("ifMetagenerationNotMatch", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPredefinedAcl(value: String): Self = this.set("predefinedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedAcl: Self = this.set("predefinedAcl", js.undefined)
    @scala.inline
    def setPredefinedDefaultObjectAcl(value: String): Self = this.set("predefinedDefaultObjectAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedDefaultObjectAcl: Self = this.set("predefinedDefaultObjectAcl", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

