package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Name of the bucket in which the object resides. */
  var bucket: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** If present, selects a specific revision of this object (as opposed to the latest version, the default). */
  var generation: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if
    * there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  /**
    * Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition
    * fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  /** Makes the operation conditional on whether the object's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts. */
  var `object`: String = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Set of properties to return. Defaults to noAcl. */
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

object Projection {
  @scala.inline
  def apply(bucket: String, `object`: String): Projection = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
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
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setIfGenerationMatch(value: String): Self = this.set("ifGenerationMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationMatch: Self = this.set("ifGenerationMatch", js.undefined)
    @scala.inline
    def setIfGenerationNotMatch(value: String): Self = this.set("ifGenerationNotMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGenerationNotMatch: Self = this.set("ifGenerationNotMatch", js.undefined)
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

