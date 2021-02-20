package typings.firebaseStorage

import typings.firebaseStorage.blobMod.FbsBlob
import typings.firebaseStorage.errorMod.FirebaseStorageError
import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.metadataMod.Mappings
import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.srcListMod.ListResult
import typings.firebaseStorage.srcMetadataMod.Metadata
import typings.firebaseStorage.srcServiceMod.StorageService
import typings.firebaseStorage.xhrioMod.XhrIo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "ResumableUploadStatus")
  @js.native
  class ResumableUploadStatus protected () extends StObject {
    def this(current: Double, total: Double) = this()
    def this(current: Double, total: Double, finalized: Boolean) = this()
    def this(current: Double, total: Double, finalized: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
    def this(current: Double, total: Double, finalized: Boolean, metadata: Metadata) = this()
    
    var current: Double = js.native
    
    var finalized: Boolean = js.native
    
    var metadata: Metadata | Null = js.native
    
    var total: Double = js.native
  }
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "checkResumeHeader_")
  @js.native
  def checkResumeHeader(xhr: XhrIo): String = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "checkResumeHeader_")
  @js.native
  def checkResumeHeader(xhr: XhrIo, allowed: js.Array[String]): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "continueResumableUpload")
  @js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings
  ): RequestInfo[ResumableUploadStatus] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "continueResumableUpload")
  @js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: js.UndefOr[scala.Nothing],
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "continueResumableUpload")
  @js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: Null,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "continueResumableUpload")
  @js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus
  ): RequestInfo[ResumableUploadStatus] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "continueResumableUpload")
  @js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "createResumableUpload")
  @js.native
  def createResumableUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[String] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "createResumableUpload")
  @js.native
  def createResumableUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob, metadata: Metadata): RequestInfo[String] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "deleteObject")
  @js.native
  def deleteObject(service: StorageService, location: Location): RequestInfo[Unit] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "determineContentType_")
  @js.native
  def determineContentType(): String = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "determineContentType_")
  @js.native
  def determineContentType(metadata: Null, blob: FbsBlob): String = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "determineContentType_")
  @js.native
  def determineContentType(metadata: Metadata): String = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "determineContentType_")
  @js.native
  def determineContentType(metadata: Metadata, blob: FbsBlob): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "downloadUrlHandler")
  @js.native
  def downloadUrlHandler(service: StorageService, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, String | Null] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "getDownloadUrl")
  @js.native
  def getDownloadUrl(service: StorageService, location: Location, mappings: Mappings): RequestInfo[String | Null] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "getMetadata")
  @js.native
  def getMetadata(service: StorageService, location: Location, mappings: Mappings): RequestInfo[Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "getResumableUploadStatus")
  @js.native
  def getResumableUploadStatus(service: StorageService, location: Location, url: String, blob: FbsBlob): RequestInfo[ResumableUploadStatus] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "handlerCheck")
  @js.native
  def handlerCheck(cndn: Boolean): Unit = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(service: StorageService, location: Location): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: String
  ): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: Null,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(service: StorageService, location: Location, delimiter: String): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(service: StorageService, location: Location, delimiter: String, pageToken: String): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "list")
  @js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: Null,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "listHandler")
  @js.native
  def listHandler(service: StorageService, bucket: String): js.Function2[/* p1 */ XhrIo, /* p2 */ String, ListResult] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "metadataForUpload_")
  @js.native
  def metadataForUpload(location: Location, blob: FbsBlob): Metadata = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "metadataForUpload_")
  @js.native
  def metadataForUpload(location: Location, blob: FbsBlob, metadata: Metadata): Metadata = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "metadataHandler")
  @js.native
  def metadataHandler(service: StorageService, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "multipartUpload")
  @js.native
  def multipartUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[Metadata] = js.native
  @JSImport("@firebase/storage/dist/src/implementation/requests", "multipartUpload")
  @js.native
  def multipartUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob, metadata: Metadata): RequestInfo[Metadata] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "objectErrorHandler")
  @js.native
  def objectErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "resumableUploadChunkSize")
  @js.native
  val resumableUploadChunkSize: Double = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "sharedErrorHandler")
  @js.native
  def sharedErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "updateMetadata")
  @js.native
  def updateMetadata(service: StorageService, location: Location, metadata: Metadata, mappings: Mappings): RequestInfo[Metadata] = js.native
}
