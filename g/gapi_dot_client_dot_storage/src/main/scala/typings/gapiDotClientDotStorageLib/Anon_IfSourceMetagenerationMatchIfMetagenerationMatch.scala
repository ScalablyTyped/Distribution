package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IfSourceMetagenerationMatchIfMetagenerationMatch extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.For information about how to URL
                   * encode object names to be path safe, see Encoding URI Path Parts.
                   */
  var destinationBucket: java.lang.String
  /** Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. */
  var destinationObject: java.lang.String
  /** Apply a predefined set of access controls to the destination object. */
  var destinationPredefinedAcl: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Makes the operation conditional on whether the destination object's current generation matches the given value. Setting to 0 makes the operation
                   * succeed only if there are no live versions of the object.
                   */
  var ifGenerationMatch: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Makes the operation conditional on whether the destination object's current generation does not match the given value. If no live object exists, the
                   * precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
                   */
  var ifGenerationNotMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the destination object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the destination object's current metageneration does not match the given value. */
  var ifMetagenerationNotMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the source object's current generation matches the given value. */
  var ifSourceGenerationMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the source object's current generation does not match the given value. */
  var ifSourceGenerationNotMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the source object's current metageneration matches the given value. */
  var ifSourceMetagenerationMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the source object's current metageneration does not match the given value. */
  var ifSourceMetagenerationNotMatch: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full. */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the bucket in which to find the source object. */
  var sourceBucket: java.lang.String
  /** If present, selects a specific revision of the source object (as opposed to the latest version, the default). */
  var sourceGeneration: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts. */
  var sourceObject: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

