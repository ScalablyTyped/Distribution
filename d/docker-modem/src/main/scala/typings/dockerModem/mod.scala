package typings.dockerModem

import org.scalablytyped.runtime.NumberDictionary
import typings.dockerModem.anon.Base64
import typings.dockerModem.anon.Dictkey
import typings.dockerModem.anon.DictkeyBase64
import typings.dockerModem.dockerModemStrings.http
import typings.dockerModem.dockerModemStrings.https
import typings.dockerModem.dockerModemStrings.ssh
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Stream
import typings.ssh2.mod.ConnectConfig
import typings.std.AbortSignal
import typings.std.PromiseConstructor
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docker-modem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DockerModem {
    def this(options: ConstructorOptions) = this()
  }
  
  @JSImport("docker-modem", "HttpDuplex")
  @js.native
  open class HttpDuplex protected () extends Duplex {
    def this(request: ClientRequest, response: IncomingMessage) = this()
    def this(request: ClientRequest, response: IncomingMessage, options: DuplexOptions) = this()
    
    def connect(request: ClientRequest, response: IncomingMessage): Unit = js.native
  }
  
  trait ConstructorOptions extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var checkServerIdentity: js.UndefOr[Boolean] = js.undefined
    
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String | (js.Array[Buffer | KeyObject | String]) | Buffer] = js.undefined
    
    var port: js.UndefOr[Double | String] = js.undefined
    
    var protocol: js.UndefOr[https | http | ssh] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var sshOptions: js.UndefOr[ConnectConfig] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCheckServerIdentity(value: Boolean): Self = StObject.set(x, "checkServerIdentity", value.asInstanceOf[js.Any])
      
      inline def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: String | (js.Array[Buffer | KeyObject | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | KeyObject | String)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setProtocol(value: https | http | ssh): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setSshOptions(value: ConnectConfig): Self = StObject.set(x, "sshOptions", value.asInstanceOf[js.Any])
      
      inline def setSshOptionsUndefined: Self = StObject.set(x, "sshOptions", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait DialOptions extends StObject {
    
    var abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var authconfig: js.UndefOr[Base64] = js.undefined
    
    var file: js.UndefOr[String | Buffer | ReadableStream[Any]] = js.undefined
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var hijack: js.UndefOr[Boolean] = js.undefined
    
    var isStream: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var openStdin: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[Dictkey] = js.undefined
    
    var path: String
    
    var registryconfig: js.UndefOr[DictkeyBase64] = js.undefined
    
    var statusCodes: js.UndefOr[StatusCodes] = js.undefined
  }
  object DialOptions {
    
    inline def apply(path: String): DialOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialOptions]
    }
    
    extension [Self <: DialOptions](x: Self) {
      
      inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAuthconfig(value: Base64): Self = StObject.set(x, "authconfig", value.asInstanceOf[js.Any])
      
      inline def setAuthconfigUndefined: Self = StObject.set(x, "authconfig", js.undefined)
      
      inline def setFile(value: String | Buffer | ReadableStream[Any]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHijack(value: Boolean): Self = StObject.set(x, "hijack", value.asInstanceOf[js.Any])
      
      inline def setHijackUndefined: Self = StObject.set(x, "hijack", js.undefined)
      
      inline def setIsStream(value: Boolean): Self = StObject.set(x, "isStream", value.asInstanceOf[js.Any])
      
      inline def setIsStreamUndefined: Self = StObject.set(x, "isStream", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOpenStdin(value: Boolean): Self = StObject.set(x, "openStdin", value.asInstanceOf[js.Any])
      
      inline def setOpenStdinUndefined: Self = StObject.set(x, "openStdin", js.undefined)
      
      inline def setOptions(value: Dictkey): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegistryconfig(value: DictkeyBase64): Self = StObject.set(x, "registryconfig", value.asInstanceOf[js.Any])
      
      inline def setRegistryconfigUndefined: Self = StObject.set(x, "registryconfig", js.undefined)
      
      inline def setStatusCodes(value: StatusCodes): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    }
  }
  
  @js.native
  trait DockerModem extends StObject {
    
    var Promise: PromiseConstructor = js.native
    
    /* private */ def buildPayload(
      error: js.Error,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage
    ): Unit = js.native
    /* private */ def buildPayload(
      error: js.Error,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: js.Object
    ): Unit = js.native
    /* private */ def buildPayload(
      error: js.Error,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: js.Object,
      callback: RequestCallback
    ): Unit = js.native
    /* private */ def buildPayload(
      error: js.Error,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: Null,
      callback: RequestCallback
    ): Unit = js.native
    /* private */ def buildPayload(
      error: js.Error,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: Buffer
    ): Unit = js.native
    /* private */ def buildPayload(
      error: js.Error,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: Buffer,
      callback: RequestCallback
    ): Unit = js.native
    /* private */ def buildPayload(
      error: Unit,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage
    ): Unit = js.native
    /* private */ def buildPayload(
      error: Unit,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: js.Object
    ): Unit = js.native
    /* private */ def buildPayload(
      error: Unit,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: js.Object,
      callback: RequestCallback
    ): Unit = js.native
    /* private */ def buildPayload(
      error: Unit,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: Null,
      callback: RequestCallback
    ): Unit = js.native
    /* private */ def buildPayload(
      error: Unit,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: Buffer
    ): Unit = js.native
    /* private */ def buildPayload(
      error: Unit,
      isStream: Boolean,
      statusCode: StatusCodes,
      openStdin: Boolean,
      req: ClientRequest,
      res: IncomingMessage,
      json: Buffer,
      callback: RequestCallback
    ): Unit = js.native
    
    /* private */ def buildQuerystring(options: js.Object): String = js.native
    
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions): Unit = js.native
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions, data: String): Unit = js.native
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions, data: String, callback: RequestCallback): Unit = js.native
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions, data: Unit, callback: RequestCallback): Unit = js.native
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions, data: Buffer): Unit = js.native
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions, data: Buffer, callback: RequestCallback): Unit = js.native
    /* private */ def buildRequest(options: RequestOptions, context: DialOptions, data: ReadableStream[Any]): Unit = js.native
    /* private */ def buildRequest(
      options: RequestOptions,
      context: DialOptions,
      data: ReadableStream[Any],
      callback: RequestCallback
    ): Unit = js.native
    
    def demuxStream(stream: Stream, stdout: WritableStream[Any], stderr: WritableStream[Any]): Unit = js.native
    
    def dial(options: DialOptions): Unit = js.native
    def dial(options: DialOptions, callback: RequestCallback): Unit = js.native
    
    def followProgress(
      stream: Stream,
      onFinished: js.Function2[/* error */ js.Error | Null, /* result */ js.Array[Any], Unit]
    ): Unit = js.native
    def followProgress(
      stream: Stream,
      onFinished: js.Function2[/* error */ js.Error | Null, /* result */ js.Array[Any], Unit],
      onProgress: js.Function1[/* obj */ Any, Unit]
    ): Unit = js.native
  }
  
  trait KeyObject extends StObject {
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pem: String | Buffer
  }
  object KeyObject {
    
    inline def apply(pem: String | Buffer): KeyObject = {
      val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    extension [Self <: KeyObject](x: Self) {
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPem(value: String | Buffer): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    }
  }
  
  type RequestCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* result */ IncomingMessage | HttpDuplex | Socket | Buffer | js.Object | Null, 
    Unit
  ]
  
  type StatusCodes = NumberDictionary[String | Boolean]
}
