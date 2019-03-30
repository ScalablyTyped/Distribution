package typings
package gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadConfig extends js.Object {
  /**
    * If you want to re-use an auth client from google-auto-auth, pass an
    * instance here.
    */
  var authClient: js.UndefOr[googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth] = js.undefined
  var authConfig: js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions] = js.undefined
  /**
    * The name of the destination bucket.
    */
  var bucket: java.lang.String
  /**
    * Where the gcs-resumable-upload configuration file should be stored on your
    * system. This maps to the configstore option by the same name.
    */
  var configPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the destination file.
    */
  var file: java.lang.String
  /**
    * This will cause the upload to fail if the current generation of the remote
    * object does not match the one provided here.
    */
  var generation: js.UndefOr[scala.Double] = js.undefined
  /**
    * A customer-supplied encryption key. See
    * https://cloud.google.com/storage/docs/encryption#customer-supplied.
    */
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * Resource name of the Cloud KMS key, of the form
    * `projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key`,
    * that will be used to encrypt the object. Overrides the object metadata's
    * `kms_key_name` value, if any.
    */
  var kmsKeyName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any metadata you wish to set on the object.
    */
  var metadata: js.UndefOr[ConfigMetadata] = js.undefined
  /**
    * The starting byte of the upload stream, for resuming an interrupted upload.
    * See
    * https://cloud.google.com/storage/docs/json_api/v1/how-tos/resumable-upload#resume-upload.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set an Origin header when creating the resumable upload URI.
    */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Apply a predefined set of access controls to the created file.
    */
  var predefinedAcl: js.UndefOr[
    gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.authenticatedRead | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.bucketOwnerFullControl | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.bucketOwnerRead | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.`private` | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.projectPrivate | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.publicRead
  ] = js.undefined
  /**
    * Make the uploaded file private. (Alias for config.predefinedAcl =
    * 'private')
    */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Make the uploaded file public. (Alias for config.predefinedAcl =
    * 'publicRead')
    */
  var public: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you already have a resumable URI from a previously-created resumable
    * upload, just pass it in here and we'll use that.
    */
  var uri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the bucket being accessed has requesterPays functionality enabled, this
    * can be set to control which project is billed for the access of this file.
    */
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object UploadConfig {
  @scala.inline
  def apply(
    bucket: java.lang.String,
    file: java.lang.String,
    authClient: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = null,
    authConfig: googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod.GoogleAuthOptions = null,
    configPath: java.lang.String = null,
    generation: scala.Int | scala.Double = null,
    key: java.lang.String | nodeLib.Buffer = null,
    kmsKeyName: java.lang.String = null,
    metadata: ConfigMetadata = null,
    offset: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    predefinedAcl: gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.authenticatedRead | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.bucketOwnerFullControl | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.bucketOwnerRead | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.`private` | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.projectPrivate | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.publicRead = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    userProject: java.lang.String = null
  ): UploadConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket, file = file)
    if (authClient != null) __obj.updateDynamic("authClient")(authClient)
    if (authConfig != null) __obj.updateDynamic("authConfig")(authConfig)
    if (configPath != null) __obj.updateDynamic("configPath")(configPath)
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (predefinedAcl != null) __obj.updateDynamic("predefinedAcl")(predefinedAcl.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[UploadConfig]
  }
}

