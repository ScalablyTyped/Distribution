package typings.googleCloudTextToSpeech

import org.scalablytyped.runtime.StringDictionary
import typings.googleAuthLibrary.buildSrcAuthGoogleauthMod.JSONClient
import typings.googleCloudTextToSpeech.anon.Typeoffallback
import typings.googleCloudTextToSpeech.anon.Typeofgax
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeLongAudioMetadata
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeLongAudioRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.ISynthesizeLongAudioResponse
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeLongAudioMetadata
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1beta1.SynthesizeLongAudioResponse
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.CancelOperationRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.DeleteOperationRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.GetOperationRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.IOperation
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.ListOperationsRequest
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.ListOperationsResponse
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.longrunning.Operation
import typings.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.Empty
import typings.googleGax.buildSrcClientInterfaceMod.Callback
import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import typings.googleGax.buildSrcClientInterfaceMod.Descriptors
import typings.googleGax.buildSrcClientInterfaceMod.LROperation
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.mod.GoogleAuth
import typings.googleGax.mod.OperationsClient
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcV1beta1TextToSpeechLongAudioSynthesizeClientMod {
  
  @JSImport("@google-cloud/text-to-speech/build/src/v1beta1/text_to_speech_long_audio_synthesize_client", "TextToSpeechLongAudioSynthesizeClient")
  @js.native
  /**
    * Construct an instance of TextToSpeechLongAudioSynthesizeClient.
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
    *     const client = new TextToSpeechLongAudioSynthesizeClient({fallback: 'rest'}, gax);
    *     ```
    */
  open class TextToSpeechLongAudioSynthesizeClient () extends StObject {
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
      * Starts asynchronous cancellation on a long-running operation.  The server
      * makes a best effort to cancel the operation, but success is not
      * guaranteed.  If the server doesn't support this method, it returns
      * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use
      * {@link Operations.GetOperation} or
      * other methods to check whether the cancellation succeeded or whether the
      * operation completed despite cancellation. On successful cancellation,
      * the operation is not deleted; instead, it becomes an operation with
      * an {@link Operation.error} value with a {@link google.rpc.Status.code} of
      * 1, corresponding to `Code.CANCELLED`.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource to be cancelled.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See {@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions | gax.CallOptions} for the
      * details.
      * @param {function(?Error)=} callback
      *   The function which will be called with the result of the API call.
      * @return {Promise} - The promise which resolves when API call finishes.
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * await client.cancelOperation({name: ''});
      * ```
      */
    def cancelOperation(request: CancelOperationRequest): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: Unit,
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: Callback[Empty, CancelOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: Callback[Empty, CancelOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def cancelOperation(request: CancelOperationRequest, options: CallOptions): js.Promise[Empty] = js.native
    def cancelOperation(
      request: CancelOperationRequest,
      options: CallOptions,
      callback: Callback[CancelOperationRequest, Empty, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    
    /**
      * Check the status of the long running operation returned by `synthesizeLongAudio()`.
      * @param {String} name
      *   The operation name that will be passed.
      * @returns {Promise} - The promise which resolves to an object.
      *   The decoded operation object has result and metadata field to get information from.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1beta1/text_to_speech_long_audio_synthesize.synthesize_long_audio.js</caption>
      * region_tag:texttospeech_v1beta1_generated_TextToSpeechLongAudioSynthesize_SynthesizeLongAudio_async
      */
    def checkSynthesizeLongAudioProgress(name: String): js.Promise[LROperation[SynthesizeLongAudioResponse, SynthesizeLongAudioMetadata]] = js.native
    
    /**
      * Terminate the gRPC channel and close the client.
      *
      * The client will no longer be usable and all future behavior is undefined.
      * @returns {Promise} A promise that resolves when the client is closed.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Deletes a long-running operation. This method indicates that the client is
      * no longer interested in the operation result. It does not cancel the
      * operation. If the server doesn't support this method, it returns
      * `google.rpc.Code.UNIMPLEMENTED`.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource to be deleted.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      * e.g, timeout, retries, paginations, etc. See {@link
      * https://googleapis.github.io/gax-nodejs/global.html#CallOptions | gax.CallOptions}
      * for the details.
      * @param {function(?Error)=} callback
      *   The function which will be called with the result of the API call.
      * @return {Promise} - The promise which resolves when API call finishes.
      *   The promise has a method named "cancel" which cancels the ongoing API
      * call.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * await client.deleteOperation({name: ''});
      * ```
      */
    def deleteOperation(request: DeleteOperationRequest): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: Unit,
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    def deleteOperation(request: DeleteOperationRequest, options: CallOptions): js.Promise[Empty] = js.native
    def deleteOperation(
      request: DeleteOperationRequest,
      options: CallOptions,
      callback: Callback[Empty, DeleteOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[Empty] = js.native
    
    var descriptors: Descriptors = js.native
    
    /**
      * Gets the latest state of a long-running operation.  Clients can use this
      * method to poll the operation result at intervals as recommended by the API
      * service.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation resource.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See {@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions | gax.CallOptions}
      *   for the details.
      * @param {function(?Error, ?Object)=} callback
      *   The function which will be called with the result of the API call.
      *
      *   The second parameter to the callback is an object representing
      *   {@link google.longrunning.Operation | google.longrunning.Operation}.
      * @return {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      * {@link google.longrunning.Operation | google.longrunning.Operation}.
      * The promise has a method named "cancel" which cancels the ongoing API call.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * const name = '';
      * const [response] = await client.getOperation({name});
      * // doThingsWith(response)
      * ```
      */
    def getOperation(request: GetOperationRequest): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: Unit,
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]],
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    def getOperation(request: GetOperationRequest, options: CallOptions): js.Promise[js.Array[Operation]] = js.native
    def getOperation(
      request: GetOperationRequest,
      options: CallOptions,
      callback: Callback[Operation, GetOperationRequest, js.UndefOr[js.Object | Null]]
    ): js.Promise[js.Array[Operation]] = js.native
    
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
      * Lists operations that match the specified filter in the request. If the
      * server doesn't support this method, it returns `UNIMPLEMENTED`. Returns an iterable object.
      *
      * For-await-of syntax is used with the iterable to recursively get response element on-demand.
      *
      * @param {Object} request - The request object that will be sent.
      * @param {string} request.name - The name of the operation collection.
      * @param {string} request.filter - The standard list filter.
      * @param {number=} request.pageSize -
      *   The maximum number of resources contained in the underlying API
      *   response. If page streaming is performed per-resource, this
      *   parameter does not affect the return value. If page streaming is
      *   performed per-page, this determines the maximum number of
      *   resources in a page.
      * @param {Object=} options
      *   Optional parameters. You can override the default settings for this call,
      *   e.g, timeout, retries, paginations, etc. See {@link
      *   https://googleapis.github.io/gax-nodejs/global.html#CallOptions | gax.CallOptions} for the
      *   details.
      * @returns {Object}
      *   An iterable Object that conforms to {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols | iteration protocols}.
      *
      * @example
      * ```
      * const client = longrunning.operationsClient();
      * for await (const response of client.listOperationsAsync(request));
      * // doThingsWith(response)
      * ```
      */
    def listOperationsAsync(request: ListOperationsRequest): AsyncIterable[ListOperationsResponse] = js.native
    def listOperationsAsync(request: ListOperationsRequest, options: CallOptions): AsyncIterable[ListOperationsResponse] = js.native
    
    var operationsClient: OperationsClient = js.native
    
    /**
      * Synthesizes long form text asynchronously.
      *
      * @param {Object} request
      *   The request object that will be sent.
      * @param {string} request.parent
      *   The resource states of the request in the form of
      *   `projects/ * /locations/ * /voices/ *`.
      * @param {google.cloud.texttospeech.v1beta1.SynthesisInput} request.input
      *   Required. The Synthesizer requires either plain text or SSML as input.
      * @param {google.cloud.texttospeech.v1beta1.AudioConfig} request.audioConfig
      *   Required. The configuration of the synthesized audio.
      * @param {string} request.outputGcsUri
      *   Specifies a Cloud Storage URI for the synthesis results. Must be
      *   specified in the format: `gs://bucket_name/object_name`, and the bucket
      *   must already exist.
      * @param {google.cloud.texttospeech.v1beta1.VoiceSelectionParams} request.voice
      *   The desired voice of the synthesized audio.
      * @param {object} [options]
      *   Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions} for more details.
      * @returns {Promise} - The promise which resolves to an array.
      *   The first element of the array is an object representing
      *   a long running operation. Its `promise()` method returns a promise
      *   you can `await` for.
      *   Please see the
      *   [documentation](https://github.com/googleapis/gax-nodejs/blob/master/client-libraries.md#long-running-operations)
      *   for more details and examples.
      * @example <caption>include:samples/generated/v1beta1/text_to_speech_long_audio_synthesize.synthesize_long_audio.js</caption>
      * region_tag:texttospeech_v1beta1_generated_TextToSpeechLongAudioSynthesize_SynthesizeLongAudio_async
      */
    def synthesizeLongAudio(): js.Promise[
        js.Tuple3[
          LROperation[ISynthesizeLongAudioResponse, ISynthesizeLongAudioMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeLongAudio(request: Unit, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[ISynthesizeLongAudioResponse, ISynthesizeLongAudioMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeLongAudio(request: ISynthesizeLongAudioRequest): js.Promise[
        js.Tuple3[
          LROperation[ISynthesizeLongAudioResponse, ISynthesizeLongAudioMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeLongAudio(
      request: ISynthesizeLongAudioRequest,
      callback: Callback[
          LROperation[ISynthesizeLongAudioResponse, ISynthesizeLongAudioMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    def synthesizeLongAudio(request: ISynthesizeLongAudioRequest, options: CallOptions): js.Promise[
        js.Tuple3[
          LROperation[ISynthesizeLongAudioResponse, ISynthesizeLongAudioMetadata], 
          js.UndefOr[IOperation], 
          js.UndefOr[js.Object]
        ]
      ] = js.native
    def synthesizeLongAudio(
      request: ISynthesizeLongAudioRequest,
      options: CallOptions,
      callback: Callback[
          LROperation[ISynthesizeLongAudioResponse, ISynthesizeLongAudioMetadata], 
          js.UndefOr[IOperation | Null], 
          js.UndefOr[js.Object | Null]
        ]
    ): Unit = js.native
    
    var textToSpeechLongAudioSynthesizeStub: js.UndefOr[js.Promise[StringDictionary[js.Function]]] = js.native
    
    def warn(code: String, message: String): Unit = js.native
    def warn(code: String, message: String, warnType: String): Unit = js.native
  }
}
