package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Name of the bucket in which the object resides. */
  var bucket: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** If present, selects a specific revision of this object (as opposed to the latest version, the default). */
  var generation: js.UndefOr[String] = js.undefined
  /**
    * Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if
    * there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
  /**
    * Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition
    * fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the object's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts. */
  var `object`: String
  /** Apply a predefined set of access controls to this object. */
  var predefinedAcl: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Set of properties to return. Defaults to full. */
  var projection: js.UndefOr[String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[String] = js.undefined
}

object Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch {
  @scala.inline
  def apply(
    bucket: String,
    `object`: String,
    alt: String = null,
    fields: String = null,
    generation: String = null,
    ifGenerationMatch: String = null,
    ifGenerationNotMatch: String = null,
    ifMetagenerationMatch: String = null,
    ifMetagenerationNotMatch: String = null,
    key: String = null,
    oauth_token: String = null,
    predefinedAcl: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    quotaUser: String = null,
    userIp: String = null,
    userProject: String = null
  ): Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    __obj.updateDynamic("object")(`object`)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (generation != null) __obj.updateDynamic("generation")(generation)
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch)
    if (ifGenerationNotMatch != null) __obj.updateDynamic("ifGenerationNotMatch")(ifGenerationNotMatch)
    if (ifMetagenerationMatch != null) __obj.updateDynamic("ifMetagenerationMatch")(ifMetagenerationMatch)
    if (ifMetagenerationNotMatch != null) __obj.updateDynamic("ifMetagenerationNotMatch")(ifMetagenerationNotMatch)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[Anon_AltBucketFieldsGenerationIfGenerationMatchIfGenerationNotMatchIfMetagenerationMatch]
  }
}

