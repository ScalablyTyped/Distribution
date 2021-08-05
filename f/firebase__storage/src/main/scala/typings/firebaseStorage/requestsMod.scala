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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestsMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "ResumableUploadStatus")
  @js.native
  class ResumableUploadStatus protected () extends StObject {
    def this(current: Double, total: Double) = this()
    def this(current: Double, total: Double, finalized: Boolean) = this()
    def this(current: Double, total: Double, finalized: Boolean, metadata: Metadata) = this()
    def this(current: Double, total: Double, finalized: Unit, metadata: Metadata) = this()
    
    var current: Double = js.native
    
    var finalized: Boolean = js.native
    
    var metadata: Metadata | Null = js.native
    
    var total: Double = js.native
  }
  
  inline def checkResumeHeader(xhr: XhrIo): String = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResumeHeader_")(xhr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def checkResumeHeader(xhr: XhrIo, allowed: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("checkResumeHeader_")(xhr.asInstanceOf[js.Any], allowed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings
  ): RequestInfo[ResumableUploadStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueResumableUpload")(location.asInstanceOf[js.Any], service.asInstanceOf[js.Any], url.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ResumableUploadStatus]]
  inline def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: Null,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueResumableUpload")(location.asInstanceOf[js.Any], service.asInstanceOf[js.Any], url.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], status.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ResumableUploadStatus]]
  inline def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: Unit,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueResumableUpload")(location.asInstanceOf[js.Any], service.asInstanceOf[js.Any], url.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], status.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ResumableUploadStatus]]
  inline def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus
  ): RequestInfo[ResumableUploadStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueResumableUpload")(location.asInstanceOf[js.Any], service.asInstanceOf[js.Any], url.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ResumableUploadStatus]]
  inline def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueResumableUpload")(location.asInstanceOf[js.Any], service.asInstanceOf[js.Any], url.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], status.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ResumableUploadStatus]]
  
  inline def createResumableUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createResumableUpload")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[String]]
  inline def createResumableUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob, metadata: Metadata): RequestInfo[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createResumableUpload")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[String]]
  
  inline def deleteObject(service: StorageService, location: Location): RequestInfo[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteObject")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[Unit]]
  
  inline def determineContentType(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineContentType_")().asInstanceOf[String]
  inline def determineContentType(metadata: Null, blob: FbsBlob): String = (^.asInstanceOf[js.Dynamic].applyDynamic("determineContentType_")(metadata.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def determineContentType(metadata: Metadata): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineContentType_")(metadata.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def determineContentType(metadata: Metadata, blob: FbsBlob): String = (^.asInstanceOf[js.Dynamic].applyDynamic("determineContentType_")(metadata.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def downloadUrlHandler(service: StorageService, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadUrlHandler")(service.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* p1 */ XhrIo, /* p2 */ String, String | Null]]
  
  inline def getDownloadUrl(service: StorageService, location: Location, mappings: Mappings): RequestInfo[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDownloadUrl")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[String | Null]]
  
  inline def getMetadata(service: StorageService, location: Location, mappings: Mappings): RequestInfo[Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[Metadata]]
  
  inline def getResumableUploadStatus(service: StorageService, location: Location, url: String, blob: FbsBlob): RequestInfo[ResumableUploadStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResumableUploadStatus")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], url.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ResumableUploadStatus]]
  
  inline def handlerCheck(cndn: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handlerCheck")(cndn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def list(service: StorageService, location: Location): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(service: StorageService, location: Location, delimiter: String): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(service: StorageService, location: Location, delimiter: String, pageToken: String): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: Null,
    maxResults: Double
  ): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: Unit,
    maxResults: Double
  ): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(service: StorageService, location: Location, delimiter: Unit, pageToken: String): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(
    service: StorageService,
    location: Location,
    delimiter: Unit,
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(service: StorageService, location: Location, delimiter: Unit, pageToken: Null, maxResults: Double): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  inline def list(service: StorageService, location: Location, delimiter: Unit, pageToken: Unit, maxResults: Double): RequestInfo[ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], pageToken.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[ListResult]]
  
  inline def listHandler(service: StorageService, bucket: String): js.Function2[/* p1 */ XhrIo, /* p2 */ String, ListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("listHandler")(service.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* p1 */ XhrIo, /* p2 */ String, ListResult]]
  
  inline def metadataForUpload(location: Location, blob: FbsBlob): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("metadataForUpload_")(location.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  inline def metadataForUpload(location: Location, blob: FbsBlob, metadata: Metadata): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("metadataForUpload_")(location.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  inline def metadataHandler(service: StorageService, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("metadataHandler")(service.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* p1 */ XhrIo, /* p2 */ String, Metadata]]
  
  inline def multipartUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartUpload")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], blob.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[Metadata]]
  inline def multipartUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob, metadata: Metadata): RequestInfo[Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartUpload")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[Metadata]]
  
  inline def objectErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectErrorHandler")(location.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError]]
  
  @JSImport("@firebase/storage/dist/src/implementation/requests", "resumableUploadChunkSize")
  @js.native
  val resumableUploadChunkSize: Double = js.native
  
  inline def sharedErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedErrorHandler")(location.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError]]
  
  inline def updateMetadata(service: StorageService, location: Location, metadata: Metadata, mappings: Mappings): RequestInfo[Metadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMetadata")(service.asInstanceOf[js.Any], location.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], mappings.asInstanceOf[js.Any])).asInstanceOf[RequestInfo[Metadata]]
}
