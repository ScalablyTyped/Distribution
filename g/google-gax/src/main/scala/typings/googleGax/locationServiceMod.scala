package typings.googleGax

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.mod.GoogleAuth
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.clientInterfaceMod.PaginationCallback
import typings.googleGax.fallbackMod.GrpcClient
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.locationsMod.google.cloud.location.IGetLocationRequest
import typings.googleGax.locationsMod.google.cloud.location.IListLocationsRequest
import typings.googleGax.locationsMod.google.cloud.location.IListLocationsResponse
import typings.googleGax.locationsMod.google.cloud.location.ILocation
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationServiceMod {
  
  @JSImport("google-gax/build/src/locationService", "LocationsClient")
  @js.native
  open class LocationsClient protected () extends StObject {
    def this(gaxGrpc: GrpcClient, opts: ClientOptions) = this()
    /**
      * Construct an instance of LocationsClient.
      *
      * @param {object} [options] - The configuration object.
      * The options accepted by the constructor are described in detail
      * in [this document](https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#creating-the-client-instance).
      * The common options are:
      * @param {object} [options.credentials] - Credentials object.
      * @param {string} [options.credentials.client_email]
      * @param {string} [options.credentials.private_key]
      * @param {string} [options.email] - Account email address. Required when
      *     using a .pem or .p12 keyFilename.
      * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
      *     .p12 key downloaded from the Google Developers Console. If you provide
      *     a path to a JSON file, the projectId option below is not necessary.
      *     NOTE: .pem and .p12 require you to specify options.email as well.
      * @param {number} [options.port] - The port on which to connect to
      *     the remote host.
      * @param {string} [options.projectId] - The project ID from the Google
      *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
      *     the environment variable GCLOUD_PROJECT for your project ID. If your
      *     app is running in an environment which supports
      *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
      *     your project ID will be detected automatically.
      * @param {string} [options.apiEndpoint] - The domain name of the
      *     API remote host.
      * @param {gax.ClientConfig} [options.clientConfig] - Client configuration override.
      *     Follows the structure of {@link gapicConfig}.
      * @param {boolean} [options.fallback] - Use HTTP fallback mode.
      *     In fallback mode, a special browser-compatible transport implementation is used
      *     instead of gRPC transport. In browser context (if the `window` object is defined)
      *     the fallback mode is enabled automatically; set `options.fallback` to `false`
      *     if you need to override this behavior.
      */
    def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient, opts: ClientOptions) = this()
    
    var PageDescriptor: Any = js.native
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _opts: Any = js.native
    
    /* private */ var _protos: Any = js.native
    
    /* private */ var _providedCustomServicePath: Any = js.native
    
    /* private */ var _terminated: Any = js.native
    
    var auth: GoogleAuth[JSONClient] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    var descriptors: Descriptors = js.native
    
    var gaxGrpc: typings.googleGax.grpcMod.GrpcClient | GrpcClient = js.native
    
    def getLocation(): js.Promise[ILocation] = js.native
    def getLocation(request: Unit, options: CallOptions): js.Promise[ILocation] = js.native
    def getLocation(request: IGetLocationRequest): Unit = js.native
    def getLocation(
      request: IGetLocationRequest,
      callback: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    def getLocation(
      request: IGetLocationRequest,
      options: Unit,
      callback: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[ILocation] = js.native
    def getLocation(
      request: IGetLocationRequest,
      options: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]],
      callback: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[ILocation] = js.native
    def getLocation(request: IGetLocationRequest, options: CallOptions): js.Promise[ILocation] = js.native
    def getLocation(
      request: IGetLocationRequest,
      options: CallOptions,
      callback: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]]
    ): Unit = js.native
    @JSName("getLocation")
    def getLocation_Promise(request: IGetLocationRequest): js.Promise[ILocation] = js.native
    @JSName("getLocation")
    def getLocation_Promise(
      request: IGetLocationRequest,
      options: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[ILocation] = js.native
    @JSName("getLocation")
    def getLocation_Promise(
      request: IGetLocationRequest,
      options: CallOptions,
      callback: Callback[ILocation, js.UndefOr[IGetLocationRequest | Null], js.UndefOr[js.Object | Null]]
    ): js.Promise[ILocation] = js.native
    
    /**
      * Return the project ID used by this class.
      * @returns {Promise} A promise that resolves to string containing the project ID.
      */
    def getProjectId(): js.Promise[String] = js.native
    def getProjectId(callback: Callback[String, Unit, Unit]): Unit = js.native
    
    /**
      * Initialize the client.
      * Performs asynchronous operations (such as authentication) and prepares the client.
      * This function will be called automatically when any class method is called for the
      * first time, but if you need to initialize it before calling an actual method,
      * feel free to call initialize() directly.
      *
      * You can await on this method if you want to make sure the client is initialized.
      *
      * @returns {Promise} A promise that resolves to an authenticated service stub.
      */
    def initialize(): js.Promise[StringDictionary[js.Function]] = js.native
    
    var innerApiCalls: StringDictionary[js.Function] = js.native
    
    def listLocations(): js.Promise[
        js.Tuple3[js.Array[ILocation], IListLocationsRequest | Null, IListLocationsResponse]
      ] = js.native
    def listLocations(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ILocation], IListLocationsRequest | Null, IListLocationsResponse]
      ] = js.native
    def listLocations(request: IListLocationsRequest): js.Promise[
        js.Tuple3[js.Array[ILocation], IListLocationsRequest | Null, IListLocationsResponse]
      ] = js.native
    def listLocations(
      request: IListLocationsRequest,
      callback: PaginationCallback[IListLocationsRequest, js.UndefOr[IListLocationsResponse | Null], ILocation]
    ): Unit = js.native
    def listLocations(request: IListLocationsRequest, options: CallOptions): js.Promise[
        js.Tuple3[js.Array[ILocation], IListLocationsRequest | Null, IListLocationsResponse]
      ] = js.native
    def listLocations(
      request: IListLocationsRequest,
      options: CallOptions,
      callback: PaginationCallback[IListLocationsRequest, js.UndefOr[IListLocationsResponse | Null], ILocation]
    ): Unit = js.native
    
    def listLocationsAsync(request: IListLocationsRequest): AsyncIterable[ILocation] = js.native
    def listLocationsAsync(request: IListLocationsRequest, options: CallOptions): AsyncIterable[ILocation] = js.native
    
    var locationsStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
