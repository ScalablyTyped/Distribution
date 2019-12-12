package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationAuthwrapperMod.AuthWrapper
import typings.atFirebaseStorage.distSrcImplementationBlobMod.FbsBlob
import typings.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
import typings.atFirebaseStorage.distSrcImplementationLocationMod.Location
import typings.atFirebaseStorage.distSrcImplementationMetadataMod.Mappings
import typings.atFirebaseStorage.distSrcImplementationRequestinfoMod.RequestInfo
import typings.atFirebaseStorage.distSrcImplementationRequestsMod.ResumableUploadStatus
import typings.atFirebaseStorage.distSrcImplementationXhrioMod.XhrIo
import typings.atFirebaseStorage.distSrcListMod.ListResult
import typings.atFirebaseStorage.distSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requests", JSImport.Namespace)
@js.native
object distSrcImplementationRequestsMod extends js.Object {
  @js.native
  class ResumableUploadStatus protected () extends js.Object {
    def this(current: Double, total: Double) = this()
    def this(current: Double, total: Double, finalized: Boolean) = this()
    def this(current: Double, total: Double, finalized: Boolean, metadata: Metadata) = this()
    var current: Double = js.native
    var finalized: Boolean = js.native
    var metadata: Metadata | Null = js.native
    var total: Double = js.native
  }
  
  val resumableUploadChunkSize: Double = js.native
  def checkResumeHeader_(xhr: XhrIo): String = js.native
  def checkResumeHeader_(xhr: XhrIo, allowed: js.Array[String]): String = js.native
  def continueResumableUpload(
    location: Location,
    authWrapper: AuthWrapper,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    authWrapper: AuthWrapper,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: Null,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    authWrapper: AuthWrapper,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    authWrapper: AuthWrapper,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  def createResumableUpload(authWrapper: AuthWrapper, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[String] = js.native
  def createResumableUpload(
    authWrapper: AuthWrapper,
    location: Location,
    mappings: Mappings,
    blob: FbsBlob,
    metadata: Metadata
  ): RequestInfo[String] = js.native
  def deleteObject(authWrapper: AuthWrapper, location: Location): RequestInfo[Unit] = js.native
  def determineContentType_(): String = js.native
  def determineContentType_(metadata: Null, blob: FbsBlob): String = js.native
  def determineContentType_(metadata: Metadata): String = js.native
  def determineContentType_(metadata: Metadata, blob: FbsBlob): String = js.native
  def downloadUrlHandler(authWrapper: AuthWrapper, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, String | Null] = js.native
  def getDownloadUrl(authWrapper: AuthWrapper, location: Location, mappings: Mappings): RequestInfo[String | Null] = js.native
  def getMetadata(authWrapper: AuthWrapper, location: Location, mappings: Mappings): RequestInfo[Metadata] = js.native
  def getResumableUploadStatus(authWrapper: AuthWrapper, location: Location, url: String, blob: FbsBlob): RequestInfo[ResumableUploadStatus] = js.native
  def handlerCheck(cndn: Boolean): Unit = js.native
  def list(authWrapper: AuthWrapper, location: Location): RequestInfo[ListResult] = js.native
  def list(authWrapper: AuthWrapper, location: Location, delimiter: String): RequestInfo[ListResult] = js.native
  def list(authWrapper: AuthWrapper, location: Location, delimiter: String, pageToken: String): RequestInfo[ListResult] = js.native
  def list(
    authWrapper: AuthWrapper,
    location: Location,
    delimiter: String,
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def list(
    authWrapper: AuthWrapper,
    location: Location,
    delimiter: String,
    pageToken: Null,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def listHandler(authWrapper: AuthWrapper): js.Function2[/* p1 */ XhrIo, /* p2 */ String, ListResult] = js.native
  def metadataForUpload_(location: Location, blob: FbsBlob): Metadata = js.native
  def metadataForUpload_(location: Location, blob: FbsBlob, metadata: Metadata): Metadata = js.native
  def metadataHandler(authWrapper: AuthWrapper, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, Metadata] = js.native
  def multipartUpload(authWrapper: AuthWrapper, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[Metadata] = js.native
  def multipartUpload(
    authWrapper: AuthWrapper,
    location: Location,
    mappings: Mappings,
    blob: FbsBlob,
    metadata: Metadata
  ): RequestInfo[Metadata] = js.native
  def objectErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = js.native
  def sharedErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = js.native
  def updateMetadata(authWrapper: AuthWrapper, location: Location, metadata: Metadata, mappings: Mappings): RequestInfo[Metadata] = js.native
}

