package typings.firebaseStorage

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseStorage.anon.MockUserToken
import typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.Connection
import typings.firebaseStorage.distNodeEsmSrcImplementationConnectionMod.ConnectionType
import typings.firebaseStorage.distNodeEsmSrcImplementationLocationMod.Location
import typings.firebaseStorage.distNodeEsmSrcImplementationRequestMod.Request
import typings.firebaseStorage.distNodeEsmSrcImplementationRequestinfoMod.RequestInfo
import typings.firebaseStorage.distNodeEsmSrcPublicTypesMod.FirebaseStorage
import typings.firebaseStorage.distNodeEsmSrcReferenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcServiceMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/service", "FirebaseStorageImpl")
  @js.native
  open class FirebaseStorageImpl protected ()
    extends StObject
       with FirebaseStorage {
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName]
    ) = this()
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName],
      /**
      * @internal
      */
    _url: String
    ) = this()
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName],
      /**
      * @internal
      */
    _url: String,
      _firebaseVersion: String
    ) = this()
    def this(
      /**
      * FirebaseApp associated with this StorageService instance.
      */
    app: FirebaseApp,
      _authProvider: Provider[FirebaseAuthInternalName],
      /**
      * @internal
      */
    _appCheckProvider: Provider[AppCheckInternalComponentName],
      /**
      * @internal
      */
    _url: Unit,
      _firebaseVersion: String
    ) = this()
    
    /**
      * @internal
      */
    val _appCheckProvider: Provider[AppCheckInternalComponentName] = js.native
    
    /* protected */ val _appId: String | Null = js.native
    
    val _authProvider: Provider[FirebaseAuthInternalName] = js.native
    
    var _bucket: Location | Null = js.native
    
    /**
      * Stop running requests and prevent more from being created.
      */
    def _delete(): js.Promise[Unit] = js.native
    
    /* private */ var _deleted: Any = js.native
    
    val _firebaseVersion: js.UndefOr[String] = js.native
    
    def _getAppCheckToken(): js.Promise[String | Null] = js.native
    
    def _getAuthToken(): js.Promise[String | Null] = js.native
    
    /**
      * This string can be in the formats:
      * - host
      * - host:port
      */
    /* private */ var _host: Any = js.native
    
    /**
      * @param requestInfo - HTTP RequestInfo object
      * @param authToken - Firebase auth token
      */
    def _makeRequest[I /* <: ConnectionType */, O](requestInfo: RequestInfo[I, O], requestFactory: js.Function0[Connection[I]]): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](requestInfo: RequestInfo[I, O], requestFactory: js.Function0[Connection[I]], authToken: String): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](
      requestInfo: RequestInfo[I, O],
      requestFactory: js.Function0[Connection[I]],
      authToken: String,
      appCheckToken: String
    ): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](
      requestInfo: RequestInfo[I, O],
      requestFactory: js.Function0[Connection[I]],
      authToken: String,
      appCheckToken: String,
      retry: Boolean
    ): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](
      requestInfo: RequestInfo[I, O],
      requestFactory: js.Function0[Connection[I]],
      authToken: String,
      appCheckToken: Null,
      retry: Boolean
    ): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](
      requestInfo: RequestInfo[I, O],
      requestFactory: js.Function0[Connection[I]],
      authToken: Null,
      appCheckToken: String
    ): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](
      requestInfo: RequestInfo[I, O],
      requestFactory: js.Function0[Connection[I]],
      authToken: Null,
      appCheckToken: String,
      retry: Boolean
    ): Request[O] = js.native
    def _makeRequest[I /* <: ConnectionType */, O](
      requestInfo: RequestInfo[I, O],
      requestFactory: js.Function0[Connection[I]],
      authToken: Null,
      appCheckToken: Null,
      retry: Boolean
    ): Request[O] = js.native
    
    /**
      * Returns a new firebaseStorage.Reference object referencing this StorageService
      * at the given Location.
      */
    def _makeStorageReference(loc: Location): Reference = js.native
    
    /* private */ var _maxOperationRetryTime: Any = js.native
    
    /* private */ var _maxUploadRetryTime: Any = js.native
    
    var _overrideAuthToken: js.UndefOr[String] = js.native
    
    var _protocol: String = js.native
    
    /* private */ val _requests: Any = js.native
    
    /**
      * @internal
      */
    val _url: js.UndefOr[String] = js.native
    
    /**
      * The {@link @firebase/app#FirebaseApp} associated with this `FirebaseStorage` instance.
      */
    /* CompleteClass */
    override val app: FirebaseApp = js.native
    
    /**
      * The host string for this service, in the form of `host` or
      * `host:port`.
      */
    def host: String = js.native
    def host_=(host: String): Unit = js.native
    
    def makeRequestWithTokens[I /* <: ConnectionType */, O](requestInfo: RequestInfo[I, O], requestFactory: js.Function0[Connection[I]]): js.Promise[O] = js.native
    
    /**
      * The maximum time to retry operations other than uploads or downloads in
      * milliseconds.
      */
    /* CompleteClass */
    var maxOperationRetryTime: Double = js.native
    /**
      * The maximum time to retry operations other than uploads or downloads in
      * milliseconds.
      */
    @JSName("maxOperationRetryTime")
    def maxOperationRetryTime_MFirebaseStorageImpl: Double = js.native
    
    /**
      * The maximum time to retry uploads in milliseconds.
      */
    /* CompleteClass */
    var maxUploadRetryTime: Double = js.native
    /**
      * The maximum time to retry uploads in milliseconds.
      */
    @JSName("maxUploadRetryTime")
    def maxUploadRetryTime_MFirebaseStorageImpl: Double = js.native
  }
  
  inline def connectStorageEmulator(storage: FirebaseStorageImpl, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectStorageEmulator(storage: FirebaseStorageImpl, host: String, port: Double, options: MockUserToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectStorageEmulator")(storage.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isUrl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")().asInstanceOf[Boolean]
  inline def isUrl(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ref(storageOrRef: Reference): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any]).asInstanceOf[Reference]
  inline def ref(storageOrRef: Reference, path: String): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storageOrRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Reference]
  inline def ref(storage: FirebaseStorageImpl): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storage.asInstanceOf[js.Any]).asInstanceOf[Reference]
  inline def ref(storage: FirebaseStorageImpl, url: String): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(storage.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Reference]
}
