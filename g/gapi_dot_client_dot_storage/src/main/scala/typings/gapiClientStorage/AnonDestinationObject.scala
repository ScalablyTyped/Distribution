package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestinationObject extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.For information about how to URL
    * encode object names to be path safe, see Encoding URI Path Parts.
    */
  var destinationBucket: String
  /** Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. */
  var destinationObject: String
  /** Apply a predefined set of access controls to the destination object. */
  var destinationPredefinedAcl: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /**
    * Makes the operation conditional on whether the destination object's current generation matches the given value. Setting to 0 makes the operation
    * succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.undefined
  /**
    * Makes the operation conditional on whether the destination object's current generation does not match the given value. If no live object exists, the
    * precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the destination object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the destination object's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the source object's current generation matches the given value. */
  var ifSourceGenerationMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the source object's current generation does not match the given value. */
  var ifSourceGenerationNotMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the source object's current metageneration matches the given value. */
  var ifSourceMetagenerationMatch: js.UndefOr[String] = js.undefined
  /** Makes the operation conditional on whether the source object's current metageneration does not match the given value. */
  var ifSourceMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full. */
  var projection: js.UndefOr[String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Name of the bucket in which to find the source object. */
  var sourceBucket: String
  /** If present, selects a specific revision of the source object (as opposed to the latest version, the default). */
  var sourceGeneration: js.UndefOr[String] = js.undefined
  /** Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts. */
  var sourceObject: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[String] = js.undefined
}

object AnonDestinationObject {
  @scala.inline
  def apply(
    destinationBucket: String,
    destinationObject: String,
    sourceBucket: String,
    sourceObject: String,
    alt: String = null,
    destinationPredefinedAcl: String = null,
    fields: String = null,
    ifGenerationMatch: String = null,
    ifGenerationNotMatch: String = null,
    ifMetagenerationMatch: String = null,
    ifMetagenerationNotMatch: String = null,
    ifSourceGenerationMatch: String = null,
    ifSourceGenerationNotMatch: String = null,
    ifSourceMetagenerationMatch: String = null,
    ifSourceMetagenerationNotMatch: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    quotaUser: String = null,
    sourceGeneration: String = null,
    userIp: String = null,
    userProject: String = null
  ): AnonDestinationObject = {
    val __obj = js.Dynamic.literal(destinationBucket = destinationBucket.asInstanceOf[js.Any], destinationObject = destinationObject.asInstanceOf[js.Any], sourceBucket = sourceBucket.asInstanceOf[js.Any], sourceObject = sourceObject.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (destinationPredefinedAcl != null) __obj.updateDynamic("destinationPredefinedAcl")(destinationPredefinedAcl.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ifGenerationMatch != null) __obj.updateDynamic("ifGenerationMatch")(ifGenerationMatch.asInstanceOf[js.Any])
    if (ifGenerationNotMatch != null) __obj.updateDynamic("ifGenerationNotMatch")(ifGenerationNotMatch.asInstanceOf[js.Any])
    if (ifMetagenerationMatch != null) __obj.updateDynamic("ifMetagenerationMatch")(ifMetagenerationMatch.asInstanceOf[js.Any])
    if (ifMetagenerationNotMatch != null) __obj.updateDynamic("ifMetagenerationNotMatch")(ifMetagenerationNotMatch.asInstanceOf[js.Any])
    if (ifSourceGenerationMatch != null) __obj.updateDynamic("ifSourceGenerationMatch")(ifSourceGenerationMatch.asInstanceOf[js.Any])
    if (ifSourceGenerationNotMatch != null) __obj.updateDynamic("ifSourceGenerationNotMatch")(ifSourceGenerationNotMatch.asInstanceOf[js.Any])
    if (ifSourceMetagenerationMatch != null) __obj.updateDynamic("ifSourceMetagenerationMatch")(ifSourceMetagenerationMatch.asInstanceOf[js.Any])
    if (ifSourceMetagenerationNotMatch != null) __obj.updateDynamic("ifSourceMetagenerationNotMatch")(ifSourceMetagenerationNotMatch.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sourceGeneration != null) __obj.updateDynamic("sourceGeneration")(sourceGeneration.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestinationObject]
  }
}

