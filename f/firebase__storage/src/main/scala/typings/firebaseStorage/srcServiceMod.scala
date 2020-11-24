package typings.firebaseStorage

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.locationMod.Location
import typings.firebaseStorage.requestMod.Request
import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.srcReferenceMod.Reference
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/service", JSImport.Namespace)
@js.native
object srcServiceMod extends js.Object {
  
  def isUrl(): Boolean = js.native
  def isUrl(path: String): Boolean = js.native
  
  def ref(storageOrRef: Reference): Reference = js.native
  def ref(storageOrRef: Reference, path: String): Reference = js.native
  def ref(storage: StorageService): Reference = js.native
  def ref(storage: StorageService, url: String): Reference = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @js.native
  class StorageService protected () extends js.Object {
    def this(
      app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any,
      /**
      * @internal
      */
    _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _pool: XhrIoPool
    ) = this()
    def this(
      app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any,
      /**
      * @internal
      */
    _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _pool: XhrIoPool,
      /**
      * @internal
      */
    _url: String
    ) = this()
    
    val _appId: String | Null = js.native
    
    /**
      * @internal
      */
    val _authProvider: Provider[FirebaseAuthInternalName] = js.native
    
    /**
      * @internal
      */
    val _bucket: Location | Null = js.native
    
    /**
      * Stop running requests and prevent more from being created.
      * @internal
      */
    def _delete(): js.Promise[Unit] = js.native
    
    var _deleted: js.Any = js.native
    
    var _maxOperationRetryTime: js.Any = js.native
    
    var _maxUploadRetryTime: js.Any = js.native
    
    /**
      * @internal
      */
    val _pool: XhrIoPool = js.native
    
    val _requests: js.Any = js.native
    
    /**
      * @internal
      */
    val _url: js.UndefOr[String] = js.native
    
    val app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any = js.native
    
    def getAuthToken(): js.Promise[String | Null] = js.native
    
    /**
      * @internal
      * @param requestInfo - HTTP RequestInfo object
      * @param authToken - Firebase auth token
      */
    def makeRequest[T](requestInfo: RequestInfo[T]): Request[T] = js.native
    def makeRequest[T](requestInfo: RequestInfo[T], authToken: String): Request[T] = js.native
    
    /**
      * Returns a new firebaseStorage.Reference object referencing this StorageService
      * at the given Location.
      */
    def makeStorageReference(loc: Location): Reference = js.native
    
    def maxOperationRetryTime: Double = js.native
    def maxOperationRetryTime_=(time: Double): Unit = js.native
    
    def maxUploadRetryTime: Double = js.native
    def maxUploadRetryTime_=(time: Double): Unit = js.native
  }
}
