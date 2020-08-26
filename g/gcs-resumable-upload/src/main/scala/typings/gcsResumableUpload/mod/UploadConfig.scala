package typings.gcsResumableUpload.mod

import typings.gaxios.commonMod.GaxiosOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadConfig extends js.Object {
  /**
    * The API endpoint used for the request.
    * Defaults to `storage.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[String] = js.native
  /**
    * If you want to re-use an auth client from google-auto-auth, pass an
    * instance here.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.native
  /**
    * The GoogleAuthOptions passed to google-auth-library
    */
  var authConfig: js.UndefOr[GoogleAuthOptions] = js.native
  /**
    * The name of the destination bucket.
    */
  var bucket: String = js.native
  /**
    * Where the gcs-resumable-upload configuration file should be stored on your
    * system. This maps to the configstore option by the same name.
    */
  var configPath: js.UndefOr[String] = js.native
  /**
    * For each API request we send, you may specify custom request options that
    * we'll add onto the request. The request options follow the gaxios API:
    * https://github.com/googleapis/gaxios#request-options.
    */
  var customRequestOptions: js.UndefOr[GaxiosOptions] = js.native
  /**
    * The name of the destination file.
    */
  var file: String = js.native
  /**
    * This will cause the upload to fail if the current generation of the remote
    * object does not match the one provided here.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * A customer-supplied encryption key. See
    * https://cloud.google.com/storage/docs/encryption#customer-supplied.
    */
  var key: js.UndefOr[String | Buffer] = js.native
  /**
    * Resource name of the Cloud KMS key, of the form
    * `projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key`,
    * that will be used to encrypt the object. Overrides the object metadata's
    * `kms_key_name` value, if any.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Any metadata you wish to set on the object.
    */
  var metadata: js.UndefOr[ConfigMetadata] = js.native
  /**
    * The starting byte of the upload stream, for resuming an interrupted upload.
    * See
    * https://cloud.google.com/storage/docs/json_api/v1/how-tos/resumable-upload#resume-upload.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Set an Origin header when creating the resumable upload URI.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Specify query parameters that go along with the initial upload request. See
    * https://cloud.google.com/storage/docs/json_api/v1/objects/insert#parameters
    */
  var params: js.UndefOr[QueryParameters] = js.native
  /**
    * Apply a predefined set of access controls to the created file.
    */
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  /**
    * Make the uploaded file private. (Alias for config.predefinedAcl =
    * 'private')
    */
  var `private`: js.UndefOr[Boolean] = js.native
  /**
    * Make the uploaded file public. (Alias for config.predefinedAcl =
    * 'publicRead')
    */
  var public: js.UndefOr[Boolean] = js.native
  /**
    * If you already have a resumable URI from a previously-created resumable
    * upload, just pass it in here and we'll use that.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * If the bucket being accessed has requesterPays functionality enabled, this
    * can be set to control which project is billed for the access of this file.
    */
  var userProject: js.UndefOr[String] = js.native
}

object UploadConfig {
  @scala.inline
  def apply(bucket: String, file: String): UploadConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadConfig]
  }
  @scala.inline
  implicit class UploadConfigOps[Self <: UploadConfig] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiEndpoint(value: String): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiEndpoint: Self = this.set("apiEndpoint", js.undefined)
    @scala.inline
    def setAuthClient(value: GoogleAuth): Self = this.set("authClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthClient: Self = this.set("authClient", js.undefined)
    @scala.inline
    def setAuthConfig(value: GoogleAuthOptions): Self = this.set("authConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthConfig: Self = this.set("authConfig", js.undefined)
    @scala.inline
    def setConfigPath(value: String): Self = this.set("configPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigPath: Self = this.set("configPath", js.undefined)
    @scala.inline
    def setCustomRequestOptions(value: GaxiosOptions): Self = this.set("customRequestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRequestOptions: Self = this.set("customRequestOptions", js.undefined)
    @scala.inline
    def setGeneration(value: Double): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    @scala.inline
    def setMetadata(value: ConfigMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setParams(value: QueryParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPredefinedAcl(value: PredefinedAcl): Self = this.set("predefinedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredefinedAcl: Self = this.set("predefinedAcl", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
  
}

