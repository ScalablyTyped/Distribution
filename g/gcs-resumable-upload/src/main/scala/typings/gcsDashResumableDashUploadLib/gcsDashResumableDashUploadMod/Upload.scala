package typings
package gcsDashResumableDashUploadLib.gcsDashResumableDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcs-resumable-upload", "Upload")
@js.native
class Upload protected ()
  extends pumpifyLib.pumpifyMod.namespaced {
  def this(cfg: UploadConfig) = this()
  var authClient: googleDashAuthDashLibraryLib.googleDashAuthDashLibraryMod.GoogleAuth = js.native
  var authConfig: js.UndefOr[gcsDashResumableDashUploadLib.Anon_Scopes] = js.native
  var bucket: java.lang.String = js.native
  var bufferStream: js.UndefOr[js.Any] = js.native
  var configStore: configstoreLib.configstoreMod.namespaced = js.native
  var contentLength: scala.Double | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.`*` = js.native
  var continueUploading: js.Any = js.native
  var deleteConfig: js.Any = js.native
  var encryption: js.UndefOr[Encryption] = js.native
  var file: java.lang.String = js.native
  var generation: js.UndefOr[scala.Double] = js.native
  var get: js.Any = js.native
  var getAndSetOffset: js.Any = js.native
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.native
  var kmsKeyName: js.UndefOr[java.lang.String] = js.native
  var makeRequest: js.Any = js.native
  var makeRequestStream: js.Any = js.native
  var metadata: ConfigMetadata = js.native
  var numBytesWritten: scala.Double = js.native
  var numRetries: scala.Double = js.native
  var offset: js.UndefOr[scala.Double] = js.native
  var offsetStream: js.UndefOr[js.Any] = js.native
  var onChunk: js.Any = js.native
  /**
    * @return {bool} is the request good?
    */
  var onResponse: js.Any = js.native
  var origin: js.UndefOr[java.lang.String] = js.native
  var predefinedAcl: js.UndefOr[
    gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.authenticatedRead | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.bucketOwnerFullControl | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.bucketOwnerRead | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.`private` | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.projectPrivate | gcsDashResumableDashUploadLib.gcsDashResumableDashUploadLibStrings.publicRead
  ] = js.native
  var `private`: js.UndefOr[scala.Boolean] = js.native
  var public: js.UndefOr[scala.Boolean] = js.native
  var restart: js.Any = js.native
  var set: js.Any = js.native
  var startUploading: js.Any = js.native
  var uri: js.UndefOr[java.lang.String] = js.native
  var uriProvidedManually: scala.Boolean = js.native
  var userProject: js.UndefOr[java.lang.String] = js.native
  def createURI(): js.Promise[java.lang.String] = js.native
  def createURI(callback: CreateUriCallback): scala.Unit = js.native
  /* protected */ def createURIAsync(): js.Promise[java.lang.String] = js.native
}

