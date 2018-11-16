package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IfMetagenerationMatchDestinationObject extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the bucket in which to store the new object. */
  var destinationBucket: java.lang.String
  /** Name of the new object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts. */
  var destinationObject: java.lang.String
  /** Apply a predefined set of access controls to the destination object. */
  var destinationPredefinedAcl: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if
                   * there are no live versions of the object.
                   */
  var ifGenerationMatch: js.UndefOr[java.lang.String] = js.undefined
  /** Makes the operation conditional on whether the object's current metageneration matches the given value. */
  var ifMetagenerationMatch: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the
                   * object. Overrides the object metadata's kms_key_name value, if any.
                   */
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The project to be billed for this request, for Requester Pays buckets. */
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

