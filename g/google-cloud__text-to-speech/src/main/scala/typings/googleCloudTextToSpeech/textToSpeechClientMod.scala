package typings.googleCloudTextToSpeech

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IListVoicesRequest
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.IListVoicesResponse
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechRequest
import typings.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechResponse
import typings.googleGax.clientInterfaceMod.Callback
import typings.googleGax.clientInterfaceMod.ClientOptions
import typings.googleGax.clientInterfaceMod.Descriptors
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textToSpeechClientMod {
  
  @JSImport("@google-cloud/text-to-speech/build/src/v1beta1/text_to_speech_client", "TextToSpeechClient")
  @js.native
  /**
    * Construct an instance of TextToSpeechClient.
    *
    * @param {object} [options] - The configuration object.
    * The options accepted by the constructor are described in detail
    * in [this document](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#creating-the-client-instance).
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
    * @param {gax.ClientConfig} [options.clientConfig] - client configuration override.
    *     TODO(@alexander-fenster): link to gax documentation.
    * @param {boolean} fallback - Use HTTP fallback mode.
    *     In fallback mode, a special browser-compatible transport implementation is used
    *     instead of gRPC transport. In browser context (if the `window` object is defined)
    *     the fallback mode is enabled automatically; set `options.fallback` to `false`
    *     if you need to override this behavior.
    */
  class TextToSpeechClient () extends StObject {
    def this(opts: ClientOptions) = this()
    
    var _defaults: js.Any = js.native
    
    var _gaxGrpc: js.Any = js.native
    
    var _gaxModule: js.Any = js.native
    
    var _opts: js.Any = js.native
    
    var _protos: js.Any = js.native
    
    var _terminated: js.Any = js.native
    
    var auth: GoogleAuth = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    var descriptors: Descriptors = js.native
    
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
    
    def listVoices(request: IListVoicesRequest): js.Promise[
        js.Tuple3[IListVoicesResponse, js.UndefOr[IListVoicesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listVoices(
      request: IListVoicesRequest,
      callback: Callback[
          IListVoicesResponse, 
          js.UndefOr[IListVoicesRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def listVoices(request: IListVoicesRequest, options: CallOptions): js.Promise[
        js.Tuple3[IListVoicesResponse, js.UndefOr[IListVoicesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listVoices(
      request: IListVoicesRequest,
      options: CallOptions,
      callback: Callback[
          IListVoicesResponse, 
          js.UndefOr[IListVoicesRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    def synthesizeSpeech(request: ISynthesizeSpeechRequest): js.Promise[
        js.Tuple3[
          ISynthesizeSpeechResponse, 
          js.UndefOr[ISynthesizeSpeechRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeSpeech(
      request: ISynthesizeSpeechRequest,
      callback: Callback[
          ISynthesizeSpeechResponse, 
          js.UndefOr[ISynthesizeSpeechRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def synthesizeSpeech(request: ISynthesizeSpeechRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          ISynthesizeSpeechResponse, 
          js.UndefOr[ISynthesizeSpeechRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeSpeech(
      request: ISynthesizeSpeechRequest,
      options: CallOptions,
      callback: Callback[
          ISynthesizeSpeechResponse, 
          js.UndefOr[ISynthesizeSpeechRequest | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    var textToSpeechStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
  }
}
