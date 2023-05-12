package typings.googleCloudTextToSpeech

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleCloudTextToSpeech.anon.Typeoffallback
import typings.googleCloudTextToSpeech.anon.Typeofgax
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IListVoicesRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.IListVoicesResponse
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeSpeechResponse
import typings.googleGax.buildSrcClientInterfaceMod.Callback
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typings.googleGax.buildSrcClientInterfaceMod.Descriptors
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.PathTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcV1beta1TextToSpeechClientMod {
  
  @JSImport("@google-cloud/text-to-speech/build/src/v1beta1/text_to_speech_client", "TextToSpeechClient")
  @js.native
  /**
    * Construct an instance of TextToSpeechClient.
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
    * @param {boolean | "rest"} [options.fallback] - Use HTTP fallback mode.
    *     Pass "rest" to use HTTP/1.1 REST API instead of gRPC.
    *     For more information, please check the
    *     {@link https://github.com/googleapis/gax-nodejs/blob/main/client-libraries.md#http11-rest-api-mode documentation}.
    * @param {gax} [gaxInstance]: loaded instance of `google-gax`. Useful if you
    *     need to avoid loading the default gRPC version and want to use the fallback
    *     HTTP implementation. Load only fallback version and pass it to the constructor:
    *     ```
    *     const gax = require('google-gax/build/src/fallback'); // avoids loading google-gax with gRPC
    *     const client = new TextToSpeechClient({fallback: 'rest'}, gax);
    *     ```
    */
  open class TextToSpeechClient () extends StObject {
    def this(opts: ClientOptions) = this()
    def this(opts: Unit, gaxInstance: Typeoffallback) = this()
    def this(opts: Unit, gaxInstance: Typeofgax) = this()
    def this(opts: ClientOptions, gaxInstance: Typeoffallback) = this()
    def this(opts: ClientOptions, gaxInstance: Typeofgax) = this()
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _gaxGrpc: Any = js.native
    
    /* private */ var _gaxModule: Any = js.native
    
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
    
    /**
      * Returns a list of Voice supported for synthesis.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} [request.languageCode]
      *   Optional. Recommended.
      *   [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
      *   If not specified, the API will return all supported voices.
      *   If specified, the ListVoices call will only return voices that can be used
      *   to synthesize this language_code. For example, if you specify `"en-NZ"`,
      *   all `"en-NZ"` voices will be returned. If you specify `"no"`, both
      *   `"no-\*"` (Norwegian) and `"nb-\*"` (Norwegian Bokmal) voices will be
      *   returned.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing {@link google.cloud.texttospeech.v1beta1.ListVoicesResponse | ListVoicesResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1beta1/text_to_speech.list_voices.js</caption>
      * region_tag:texttospeech_v1beta1_generated_TextToSpeech_ListVoices_async
      */
    def listVoices(): js.Promise[
        js.Tuple3[IListVoicesResponse, js.UndefOr[IListVoicesRequest], js.UndefOr[js.Object]]
      ] = js.native
    def listVoices(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[IListVoicesResponse, js.UndefOr[IListVoicesRequest], js.UndefOr[js.Object]]
      ] = js.native
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
    
    /**
      * Parse the location from Model resource.
      *
      * @param {string} modelName
      *   A fully-qualified path representing Model resource.
      * @returns {string} A string representing the location.
      */
    def matchLocationFromModelName(modelName: String): String | Double = js.native
    
    /**
      * Parse the model from Model resource.
      *
      * @param {string} modelName
      *   A fully-qualified path representing Model resource.
      * @returns {string} A string representing the model.
      */
    def matchModelFromModelName(modelName: String): String | Double = js.native
    
    /**
      * Parse the project from Model resource.
      *
      * @param {string} modelName
      *   A fully-qualified path representing Model resource.
      * @returns {string} A string representing the project.
      */
    def matchProjectFromModelName(modelName: String): String | Double = js.native
    
    /**
      * Return a fully-qualified model resource name string.
      *
      * @param {string} project
      * @param {string} location
      * @param {string} model
      * @returns {string} Resource name string.
      */
    def modelPath(project: String, location: String, model: String): String = js.native
    
    var pathTemplates: StringDictionary[PathTemplate] = js.native
    
    /**
      * Synthesizes speech synchronously: receive results after all text input
      * has been processed.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {google.cloud.texttospeech.v1beta1.SynthesisInput} request.input
      *   Required. The Synthesizer requires either plain text or SSML as input.
      * @param {google.cloud.texttospeech.v1beta1.VoiceSelectionParams} request.voice
      *   Required. The desired voice of the synthesized audio.
      * @param {google.cloud.texttospeech.v1beta1.AudioConfig} request.audioConfig
      *   Required. The configuration of the synthesized audio.
      * @param {number[]} request.enableTimePointing
      *   Whether and what timepoints are returned in the response.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing {@link google.cloud.texttospeech.v1beta1.SynthesizeSpeechResponse | SynthesizeSpeechResponse}.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#regular-methods)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1beta1/text_to_speech.synthesize_speech.js</caption>
      * region_tag:texttospeech_v1beta1_generated_TextToSpeech_SynthesizeSpeech_async
      */
    def synthesizeSpeech(): js.Promise[
        js.Tuple3[
          ISynthesizeSpeechResponse, 
          js.UndefOr[ISynthesizeSpeechRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeSpeech(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          ISynthesizeSpeechResponse, 
          js.UndefOr[ISynthesizeSpeechRequest], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
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
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
