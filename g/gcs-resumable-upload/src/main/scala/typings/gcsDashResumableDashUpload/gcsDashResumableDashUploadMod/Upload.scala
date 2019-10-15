package typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadMod

import typings.gcsDashResumableDashUpload.Anon_Scopes
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.GoogleAuth
import typings.node.Buffer
import typings.pumpify.pumpifyMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcs-resumable-upload", "Upload")
@js.native
class Upload protected () extends ^ {
  def this(cfg: UploadConfig) = this()
  var apiEndpoint: String = js.native
  var authClient: GoogleAuth = js.native
  var authConfig: js.UndefOr[Anon_Scopes] = js.native
  val baseURI: js.Any = js.native
  var bucket: String = js.native
  var bufferStream: js.UndefOr[js.Any] = js.native
  var cacheKey: String = js.native
  var configStore: typings.configstore.configstoreMod.^ = js.native
  var contentLength: Double | typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadStrings.`*` = js.native
  var continueUploading: js.Any = js.native
  var encryption: js.UndefOr[Encryption] = js.native
  var file: String = js.native
  var generation: js.UndefOr[Double] = js.native
  var get: js.Any = js.native
  var getAndSetOffset: js.Any = js.native
  var key: js.UndefOr[String | Buffer] = js.native
  var kmsKeyName: js.UndefOr[String] = js.native
  var makeRequest: js.Any = js.native
  var makeRequestStream: js.Any = js.native
  var metadata: ConfigMetadata = js.native
  var numBytesWritten: Double = js.native
  var numRetries: Double = js.native
  var offset: js.UndefOr[Double] = js.native
  var offsetStream: js.UndefOr[js.Any] = js.native
  var onChunk: js.Any = js.native
  /**
    * @return {bool} is the request good?
    */
  var onResponse: js.Any = js.native
  var origin: js.UndefOr[String] = js.native
  var params: QueryParameters = js.native
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  var `private`: js.UndefOr[Boolean] = js.native
  var public: js.UndefOr[Boolean] = js.native
  var restart: js.Any = js.native
  var set: js.Any = js.native
  var startUploading: js.Any = js.native
  var uri: js.UndefOr[String] = js.native
  var uriProvidedManually: Boolean = js.native
  var userProject: js.UndefOr[String] = js.native
  def createURI(): js.Promise[String] = js.native
  def createURI(callback: CreateUriCallback): Unit = js.native
  /* protected */ def createURIAsync(): js.Promise[String] = js.native
  def deleteConfig(): Unit = js.native
}

@JSImport("gcs-resumable-upload", "upload")
@js.native
object upload extends js.Object {
  def apply(cfg: UploadConfig): Upload = js.native
}

