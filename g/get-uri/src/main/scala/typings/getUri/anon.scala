package typings.getUri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.getUri.distFileMod.FileReadable
import typings.getUri.distHttpMod.HttpOrHttpsModule
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import typings.node.fsMod.ReadStreamOptions
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.Server
import typings.node.httpMod.ServerOptions
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonurlMod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cache extends StObject {
    
    var cache: js.UndefOr[FileReadable] = js.undefined
  }
  object Cache {
    
    inline def apply(): Cache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setCache(value: FileReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: BufferEncoding): ReadStream = js.native
    def apply(path: PathLike, options: ReadStreamOptions): ReadStream = js.native
  }
  
  @js.native
  trait Typeofhttp
    extends StObject
       with HttpOrHttpsModule {
    
    /**
      * An `Agent` is responsible for managing connection persistence
      * and reuse for HTTP clients. It maintains a queue of pending requests
      * for a given host and port, reusing a single socket connection for each
      * until the queue is empty, at which time the socket is either destroyed
      * or put into a pool where it is kept to be used again for requests to the
      * same host and port. Whether it is destroyed or pooled depends on the`keepAlive` `option`.
      *
      * Pooled connections have TCP Keep-Alive enabled for them, but servers may
      * still close idle connections, in which case they will be removed from the
      * pool and a new connection will be made when a new HTTP request is made for
      * that host and port. Servers may also refuse to allow multiple requests
      * over the same connection, in which case the connection will have to be
      * remade for every request and cannot be pooled. The `Agent` will still make
      * the requests to that server, but each one will occur over a new connection.
      *
      * When a connection is closed by the client or the server, it is removed
      * from the pool. Any unused sockets in the pool will be unrefed so as not
      * to keep the Node.js process running when there are no outstanding requests.
      * (see `socket.unref()`).
      *
      * It is good practice, to `destroy()` an `Agent` instance when it is no
      * longer in use, because unused sockets consume OS resources.
      *
      * Sockets are removed from an agent when the socket emits either
      * a `'close'` event or an `'agentRemove'` event. When intending to keep one
      * HTTP request open for a long time without keeping it in the agent, something
      * like the following may be done:
      *
      * ```js
      * http.get(options, (res) => {
      *   // Do stuff
      * }).on('socket', (socket) => {
      *   socket.emit('agentRemove');
      * });
      * ```
      *
      * An agent may also be used for an individual request. By providing`{agent: false}` as an option to the `http.get()` or `http.request()`functions, a one-time use `Agent` with default options
      * will be used
      * for the client connection.
      *
      * `agent:false`:
      *
      * ```js
      * http.get({
      *   hostname: 'localhost',
      *   port: 80,
      *   path: '/',
      *   agent: false  // Create a new agent just for this one request
      * }, (res) => {
      *   // Do stuff with response
      * });
      * ```
      * @since v0.3.4
      */
    var Agent: Instantiable0[typings.node.httpMod.Agent] = js.native
    
    /**
      * This object is created internally and returned from {@link request}. It
      * represents an _in-progress_ request whose header has already been queued. The
      * header is still mutable using the `setHeader(name, value)`,`getHeader(name)`, `removeHeader(name)` API. The actual header will
      * be sent along with the first data chunk or when calling `request.end()`.
      *
      * To get the response, add a listener for `'response'` to the request object.`'response'` will be emitted from the request object when the response
      * headers have been received. The `'response'` event is executed with one
      * argument which is an instance of {@link IncomingMessage}.
      *
      * During the `'response'` event, one can add listeners to the
      * response object; particularly to listen for the `'data'` event.
      *
      * If no `'response'` handler is added, then the response will be
      * entirely discarded. However, if a `'response'` event handler is added,
      * then the data from the response object **must** be consumed, either by
      * calling `response.read()` whenever there is a `'readable'` event, or
      * by adding a `'data'` handler, or by calling the `.resume()` method.
      * Until the data is consumed, the `'end'` event will not fire. Also, until
      * the data is read it will consume memory that can eventually lead to a
      * 'process out of memory' error.
      *
      * For backward compatibility, `res` will only emit `'error'` if there is an`'error'` listener registered.
      *
      * Node.js does not check whether Content-Length and the length of the
      * body which has been transmitted are equal or not.
      * @since v0.1.17
      */
    var ClientRequest: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest] = js.native
    
    /**
      * An `IncomingMessage` object is created by {@link Server} or {@link ClientRequest} and passed as the first argument to the `'request'` and `'response'` event respectively. It may be used to
      * access response
      * status, headers and data.
      *
      * Different from its `socket` value which is a subclass of `stream.Duplex`, the`IncomingMessage` itself extends `stream.Readable` and is created separately to
      * parse and emit the incoming HTTP headers and payload, as the underlying socket
      * may be reused multiple times in case of keep-alive.
      * @since v0.1.17
      */
    var IncomingMessage: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] = js.native
    
    val METHODS: js.Array[String] = js.native
    
    /**
      * This class serves as the parent class of {@link ClientRequest} and {@link ServerResponse}. It is an abstract of outgoing message from
      * the perspective of the participants of HTTP transaction.
      * @since v0.1.17
      */
    var OutgoingMessage: Instantiable0[typings.node.httpMod.OutgoingMessage[IncomingMessage]] = js.native
    
    val STATUS_CODES: Any = js.native
    
    /**
      * @since v0.1.17
      */
    var Server: Instantiable0[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    
    /**
      * This object is created internally by an HTTP server, not by the user. It is
      * passed as the second parameter to the `'request'` event.
      * @since v0.1.17
      */
    var ServerResponse: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.httpMod.ServerResponse[IncomingMessage]
      ] = js.native
    
    /**
      * Returns a new instance of {@link Server}.
      *
      * The `requestListener` is a function which is automatically
      * added to the `'request'` event.
      * @since v0.1.13
      */
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ] */](): Server[Request, Response] = js.native
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ] */](options: ServerOptions[Request, Response]): Server[Request, Response] = js.native
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ] */](options: ServerOptions[Request, Response], requestListener: RequestListener[Request, Response]): Server[Request, Response] = js.native
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ] */](requestListener: RequestListener[Request, Response]): Server[Request, Response] = js.native
    
    def get(options: String): ClientRequest = js.native
    def get(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    /**
      * Since most requests are GET requests without bodies, Node.js provides this
      * convenience method. The only difference between this method and {@link request} is that it sets the method to GET and calls `req.end()`automatically. The callback must take care to consume the
      * response
      * data for reasons stated in {@link ClientRequest} section.
      *
      * The `callback` is invoked with a single argument that is an instance of {@link IncomingMessage}.
      *
      * JSON fetching example:
      *
      * ```js
      * http.get('http://localhost:8000/', (res) => {
      *   const { statusCode } = res;
      *   const contentType = res.headers['content-type'];
      *
      *   let error;
      *   // Any 2xx status code signals a successful response but
      *   // here we're only checking for 200.
      *   if (statusCode !== 200) {
      *     error = new Error('Request Failed.\n' +
      *                       `Status Code: ${statusCode}`);
      *   } else if (!/^application\/json/.test(contentType)) {
      *     error = new Error('Invalid content-type.\n' +
      *                       `Expected application/json but received ${contentType}`);
      *   }
      *   if (error) {
      *     console.error(error.message);
      *     // Consume response data to free up memory
      *     res.resume();
      *     return;
      *   }
      *
      *   res.setEncoding('utf8');
      *   let rawData = '';
      *   res.on('data', (chunk) => { rawData += chunk; });
      *   res.on('end', () => {
      *     try {
      *       const parsedData = JSON.parse(rawData);
      *       console.log(parsedData);
      *     } catch (e) {
      *       console.error(e.message);
      *     }
      *   });
      * }).on('error', (e) => {
      *   console.error(`Got error: ${e.message}`);
      * });
      *
      * // Create a local server to receive data from
      * const server = http.createServer((req, res) => {
      *   res.writeHead(200, { 'Content-Type': 'application/json' });
      *   res.end(JSON.stringify({
      *     data: 'Hello World!'
      *   }));
      * });
      *
      * server.listen(8000);
      * ```
      * @since v0.3.6
      * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`. Properties that are inherited from the prototype are ignored.
      */
    def get(options: RequestOptions): ClientRequest = js.native
    def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(options: URL): ClientRequest = js.native
    def get(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(url: String, options: RequestOptions): ClientRequest = js.native
    def get(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def get(url: URL, options: RequestOptions): ClientRequest = js.native
    def get(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    
    var globalAgent: Agent = js.native
    
    /**
      * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
      * Defaults to 16KB. Configurable using the `--max-http-header-size` CLI option.
      */
    val maxHeaderSize: Double = js.native
    
    def request(options: String): ClientRequest = js.native
    def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    /**
      * `options` in `socket.connect()` are also supported.
      *
      * Node.js maintains several connections per server to make HTTP requests.
      * This function allows one to transparently issue requests.
      *
      * `url` can be a string or a `URL` object. If `url` is a
      * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
      *
      * If both `url` and `options` are specified, the objects are merged, with the`options` properties taking precedence.
      *
      * The optional `callback` parameter will be added as a one-time listener for
      * the `'response'` event.
      *
      * `http.request()` returns an instance of the {@link ClientRequest} class. The `ClientRequest` instance is a writable stream. If one needs to
      * upload a file with a POST request, then write to the `ClientRequest` object.
      *
      * ```js
      * const http = require('http');
      *
      * const postData = JSON.stringify({
      *   'msg': 'Hello World!'
      * });
      *
      * const options = {
      *   hostname: 'www.google.com',
      *   port: 80,
      *   path: '/upload',
      *   method: 'POST',
      *   headers: {
      *     'Content-Type': 'application/json',
      *     'Content-Length': Buffer.byteLength(postData)
      *   }
      * };
      *
      * const req = http.request(options, (res) => {
      *   console.log(`STATUS: ${res.statusCode}`);
      *   console.log(`HEADERS: ${JSON.stringify(res.headers)}`);
      *   res.setEncoding('utf8');
      *   res.on('data', (chunk) => {
      *     console.log(`BODY: ${chunk}`);
      *   });
      *   res.on('end', () => {
      *     console.log('No more data in response.');
      *   });
      * });
      *
      * req.on('error', (e) => {
      *   console.error(`problem with request: ${e.message}`);
      * });
      *
      * // Write data to request body
      * req.write(postData);
      * req.end();
      * ```
      *
      * In the example `req.end()` was called. With `http.request()` one
      * must always call `req.end()` to signify the end of the request -
      * even if there is no data being written to the request body.
      *
      * If any error is encountered during the request (be that with DNS resolution,
      * TCP level errors, or actual HTTP parse errors) an `'error'` event is emitted
      * on the returned request object. As with all `'error'` events, if no listeners
      * are registered the error will be thrown.
      *
      * There are a few special headers that should be noted.
      *
      * * Sending a 'Connection: keep-alive' will notify Node.js that the connection to
      * the server should be persisted until the next request.
      * * Sending a 'Content-Length' header will disable the default chunked encoding.
      * * Sending an 'Expect' header will immediately send the request headers.
      * Usually, when sending 'Expect: 100-continue', both a timeout and a listener
      * for the `'continue'` event should be set. See RFC 2616 Section 8.2.3 for more
      * information.
      * * Sending an Authorization header will override using the `auth` option
      * to compute basic authentication.
      *
      * Example using a `URL` as `options`:
      *
      * ```js
      * const options = new URL('http://abc:xyz@example.com');
      *
      * const req = http.request(options, (res) => {
      *   // ...
      * });
      * ```
      *
      * In a successful request, the following events will be emitted in the following
      * order:
      *
      * * `'socket'`
      * * `'response'`
      *    * `'data'` any number of times, on the `res` object
      *    (`'data'` will not be emitted at all if the response body is empty, for
      *    instance, in most redirects)
      *    * `'end'` on the `res` object
      * * `'close'`
      *
      * In the case of a connection error, the following events will be emitted:
      *
      * * `'socket'`
      * * `'error'`
      * * `'close'`
      *
      * In the case of a premature connection close before the response is received,
      * the following events will be emitted in the following order:
      *
      * * `'socket'`
      * * `'error'` with an error with message `'Error: socket hang up'` and code`'ECONNRESET'`
      * * `'close'`
      *
      * In the case of a premature connection close after the response is received,
      * the following events will be emitted in the following order:
      *
      * * `'socket'`
      * * `'response'`
      *    * `'data'` any number of times, on the `res` object
      * * (connection closed here)
      * * `'aborted'` on the `res` object
      * * `'error'` on the `res` object with an error with message`'Error: aborted'` and code `'ECONNRESET'`.
      * * `'close'`
      * * `'close'` on the `res` object
      *
      * If `req.destroy()` is called before a socket is assigned, the following
      * events will be emitted in the following order:
      *
      * * (`req.destroy()` called here)
      * * `'error'` with an error with message `'Error: socket hang up'` and code`'ECONNRESET'`
      * * `'close'`
      *
      * If `req.destroy()` is called before the connection succeeds, the following
      * events will be emitted in the following order:
      *
      * * `'socket'`
      * * (`req.destroy()` called here)
      * * `'error'` with an error with message `'Error: socket hang up'` and code`'ECONNRESET'`
      * * `'close'`
      *
      * If `req.destroy()` is called after the response is received, the following
      * events will be emitted in the following order:
      *
      * * `'socket'`
      * * `'response'`
      *    * `'data'` any number of times, on the `res` object
      * * (`req.destroy()` called here)
      * * `'aborted'` on the `res` object
      * * `'error'` on the `res` object with an error with message`'Error: aborted'` and code `'ECONNRESET'`.
      * * `'close'`
      * * `'close'` on the `res` object
      *
      * If `req.abort()` is called before a socket is assigned, the following
      * events will be emitted in the following order:
      *
      * * (`req.abort()` called here)
      * * `'abort'`
      * * `'close'`
      *
      * If `req.abort()` is called before the connection succeeds, the following
      * events will be emitted in the following order:
      *
      * * `'socket'`
      * * (`req.abort()` called here)
      * * `'abort'`
      * * `'error'` with an error with message `'Error: socket hang up'` and code`'ECONNRESET'`
      * * `'close'`
      *
      * If `req.abort()` is called after the response is received, the following
      * events will be emitted in the following order:
      *
      * * `'socket'`
      * * `'response'`
      *    * `'data'` any number of times, on the `res` object
      * * (`req.abort()` called here)
      * * `'abort'`
      * * `'aborted'` on the `res` object
      * * `'error'` on the `res` object with an error with message`'Error: aborted'` and code `'ECONNRESET'`.
      * * `'close'`
      * * `'close'` on the `res` object
      *
      * Setting the `timeout` option or using the `setTimeout()` function will
      * not abort the request or do anything besides add a `'timeout'` event.
      *
      * Passing an `AbortSignal` and then calling `abort` on the corresponding`AbortController` will behave the same way as calling `.destroy()` on the
      * request itself.
      * @since v0.3.6
      */
    def request(options: RequestOptions): ClientRequest = js.native
    def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(options: URL): ClientRequest = js.native
    def request(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(url: String, options: RequestOptions): ClientRequest = js.native
    def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    def request(url: URL, options: RequestOptions): ClientRequest = js.native
    def request(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
    
    /**
      * Set the maximum number of idle HTTP parsers. Default: 1000.
      * @param count
      * @since v18.8.0, v16.18.0
      */
    def setMaxIdleHTTPParsers(count: Double): Unit = js.native
    
    /**
      * Performs the low-level validations on the provided name that are done when `res.setHeader(name, value)` is called.
      * Passing illegal value as name will result in a TypeError being thrown, identified by `code: 'ERR_INVALID_HTTP_TOKEN'`.
      * @param name Header name
      * @since v14.3.0
      */
    def validateHeaderName(name: String): Unit = js.native
    
    /**
      * Performs the low-level validations on the provided value that are done when `res.setHeader(name, value)` is called.
      * Passing illegal value as value will result in a TypeError being thrown.
      * - Undefined value error is identified by `code: 'ERR_HTTP_INVALID_HEADER_VALUE'`.
      * - Invalid value character error is identified by `code: 'ERR_INVALID_CHAR'`.
      * @param name Header name
      * @param value Header value
      * @since v14.3.0
      */
    def validateHeaderValue(name: String, value: String): Unit = js.native
  }
  
  @js.native
  trait Typeofhttps
    extends StObject
       with HttpOrHttpsModule {
    
    /**
      * An `Agent` object for HTTPS similar to `http.Agent`. See {@link request} for more information.
      * @since v0.4.5
      */
    var Agent: Instantiable0[typings.node.httpsMod.Agent] = js.native
    
    /**
      * See `http.Server` for more information.
      * @since v0.3.4
      */
    var Server: Instantiable0[
        typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    
    /**
      * ```js
      * // curl -k https://localhost:8000/
      * const https = require('https');
      * const fs = require('fs');
      *
      * const options = {
      *   key: fs.readFileSync('test/fixtures/keys/agent2-key.pem'),
      *   cert: fs.readFileSync('test/fixtures/keys/agent2-cert.pem')
      * };
      *
      * https.createServer(options, (req, res) => {
      *   res.writeHead(200);
      *   res.end('hello world\n');
      * }).listen(8000);
      * ```
      *
      * Or
      *
      * ```js
      * const https = require('https');
      * const fs = require('fs');
      *
      * const options = {
      *   pfx: fs.readFileSync('test/fixtures/test_cert.pfx'),
      *   passphrase: 'sample'
      * };
      *
      * https.createServer(options, (req, res) => {
      *   res.writeHead(200);
      *   res.end('hello world\n');
      * }).listen(8000);
      * ```
      * @since v0.3.4
      * @param options Accepts `options` from `createServer`, `createSecureContext` and `createServer`.
      * @param requestListener A listener to be added to the `'request'` event.
      */
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ] */](): typings.node.httpsMod.Server[Request, Response] = js.native
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ] */](options: typings.node.httpsMod.ServerOptions[Request, Response]): typings.node.httpsMod.Server[Request, Response] = js.native
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ] */](
      options: typings.node.httpsMod.ServerOptions[Request, Response],
      requestListener: RequestListener[Request, Response]
    ): typings.node.httpsMod.Server[Request, Response] = js.native
    def createServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ] */](requestListener: RequestListener[Request, Response]): typings.node.httpsMod.Server[Request, Response] = js.native
    
    def get(options: String): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(
      options: String,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    /**
      * Like `http.get()` but for HTTPS.
      *
      * `options` can be an object, a string, or a `URL` object. If `options` is a
      * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
      *
      * ```js
      * const https = require('https');
      *
      * https.get('https://encrypted.google.com/', (res) => {
      *   console.log('statusCode:', res.statusCode);
      *   console.log('headers:', res.headers);
      *
      *   res.on('data', (d) => {
      *     process.stdout.write(d);
      *   });
      *
      * }).on('error', (e) => {
      *   console.error(e);
      * });
      * ```
      * @since v0.3.6
      * @param options Accepts the same `options` as {@link request}, with the `method` always set to `GET`.
      */
    def get(options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(options: URL): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(
      options: URL,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(url: String, options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(
      url: String,
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(url: URL, options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def get(
      url: URL,
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    
    var globalAgent: typings.node.httpsMod.Agent = js.native
    
    def request(options: String): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(
      options: String,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    /**
      * Makes a request to a secure web server.
      *
      * The following additional `options` from `tls.connect()` are also accepted:`ca`, `cert`, `ciphers`, `clientCertEngine`, `crl`, `dhparam`, `ecdhCurve`,`honorCipherOrder`, `key`, `passphrase`,
      * `pfx`, `rejectUnauthorized`,`secureOptions`, `secureProtocol`, `servername`, `sessionIdContext`,`highWaterMark`.
      *
      * `options` can be an object, a string, or a `URL` object. If `options` is a
      * string, it is automatically parsed with `new URL()`. If it is a `URL` object, it will be automatically converted to an ordinary `options` object.
      *
      * `https.request()` returns an instance of the `http.ClientRequest` class. The `ClientRequest` instance is a writable stream. If one needs to
      * upload a file with a POST request, then write to the `ClientRequest` object.
      *
      * ```js
      * const https = require('https');
      *
      * const options = {
      *   hostname: 'encrypted.google.com',
      *   port: 443,
      *   path: '/',
      *   method: 'GET'
      * };
      *
      * const req = https.request(options, (res) => {
      *   console.log('statusCode:', res.statusCode);
      *   console.log('headers:', res.headers);
      *
      *   res.on('data', (d) => {
      *     process.stdout.write(d);
      *   });
      * });
      *
      * req.on('error', (e) => {
      *   console.error(e);
      * });
      * req.end();
      * ```
      *
      * Example using options from `tls.connect()`:
      *
      * ```js
      * const options = {
      *   hostname: 'encrypted.google.com',
      *   port: 443,
      *   path: '/',
      *   method: 'GET',
      *   key: fs.readFileSync('test/fixtures/keys/agent2-key.pem'),
      *   cert: fs.readFileSync('test/fixtures/keys/agent2-cert.pem')
      * };
      * options.agent = new https.Agent(options);
      *
      * const req = https.request(options, (res) => {
      *   // ...
      * });
      * ```
      *
      * Alternatively, opt out of connection pooling by not using an `Agent`.
      *
      * ```js
      * const options = {
      *   hostname: 'encrypted.google.com',
      *   port: 443,
      *   path: '/',
      *   method: 'GET',
      *   key: fs.readFileSync('test/fixtures/keys/agent2-key.pem'),
      *   cert: fs.readFileSync('test/fixtures/keys/agent2-cert.pem'),
      *   agent: false
      * };
      *
      * const req = https.request(options, (res) => {
      *   // ...
      * });
      * ```
      *
      * Example using a `URL` as `options`:
      *
      * ```js
      * const options = new URL('https://abc:xyz@example.com');
      *
      * const req = https.request(options, (res) => {
      *   // ...
      * });
      * ```
      *
      * Example pinning on certificate fingerprint, or the public key (similar to`pin-sha256`):
      *
      * ```js
      * const tls = require('tls');
      * const https = require('https');
      * const crypto = require('crypto');
      *
      * function sha256(s) {
      *   return crypto.createHash('sha256').update(s).digest('base64');
      * }
      * const options = {
      *   hostname: 'github.com',
      *   port: 443,
      *   path: '/',
      *   method: 'GET',
      *   checkServerIdentity: function(host, cert) {
      *     // Make sure the certificate is issued to the host we are connected to
      *     const err = tls.checkServerIdentity(host, cert);
      *     if (err) {
      *       return err;
      *     }
      *
      *     // Pin the public key, similar to HPKP pin-sha25 pinning
      *     const pubkey256 = 'pL1+qb9HTMRZJmuC/bB/ZI9d302BYrrqiVuRyW+DGrU=';
      *     if (sha256(cert.pubkey) !== pubkey256) {
      *       const msg = 'Certificate verification error: ' +
      *         `The public key of '${cert.subject.CN}' ` +
      *         'does not match our pinned fingerprint';
      *       return new Error(msg);
      *     }
      *
      *     // Pin the exact certificate, rather than the pub key
      *     const cert256 = '25:FE:39:32:D9:63:8C:8A:FC:A1:9A:29:87:' +
      *       'D8:3E:4C:1D:98:DB:71:E4:1A:48:03:98:EA:22:6A:BD:8B:93:16';
      *     if (cert.fingerprint256 !== cert256) {
      *       const msg = 'Certificate verification error: ' +
      *         `The certificate of '${cert.subject.CN}' ` +
      *         'does not match our pinned fingerprint';
      *       return new Error(msg);
      *     }
      *
      *     // This loop is informational only.
      *     // Print the certificate and public key fingerprints of all certs in the
      *     // chain. Its common to pin the public key of the issuer on the public
      *     // internet, while pinning the public key of the service in sensitive
      *     // environments.
      *     do {
      *       console.log('Subject Common Name:', cert.subject.CN);
      *       console.log('  Certificate SHA256 fingerprint:', cert.fingerprint256);
      *
      *       hash = crypto.createHash('sha256');
      *       console.log('  Public key ping-sha256:', sha256(cert.pubkey));
      *
      *       lastprint256 = cert.fingerprint256;
      *       cert = cert.issuerCertificate;
      *     } while (cert.fingerprint256 !== lastprint256);
      *
      *   },
      * };
      *
      * options.agent = new https.Agent(options);
      * const req = https.request(options, (res) => {
      *   console.log('All OK. Server matched our pinned cert or public key');
      *   console.log('statusCode:', res.statusCode);
      *   // Print the HPKP values
      *   console.log('headers:', res.headers['public-key-pins']);
      *
      *   res.on('data', (d) => {});
      * });
      *
      * req.on('error', (e) => {
      *   console.error(e.message);
      * });
      * req.end();
      * ```
      *
      * Outputs for example:
      *
      * ```text
      * Subject Common Name: github.com
      *   Certificate SHA256 fingerprint: 25:FE:39:32:D9:63:8C:8A:FC:A1:9A:29:87:D8:3E:4C:1D:98:DB:71:E4:1A:48:03:98:EA:22:6A:BD:8B:93:16
      *   Public key ping-sha256: pL1+qb9HTMRZJmuC/bB/ZI9d302BYrrqiVuRyW+DGrU=
      * Subject Common Name: DigiCert SHA2 Extended Validation Server CA
      *   Certificate SHA256 fingerprint: 40:3E:06:2A:26:53:05:91:13:28:5B:AF:80:A0:D4:AE:42:2C:84:8C:9F:78:FA:D0:1F:C9:4B:C5:B8:7F:EF:1A
      *   Public key ping-sha256: RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=
      * Subject Common Name: DigiCert High Assurance EV Root CA
      *   Certificate SHA256 fingerprint: 74:31:E5:F4:C3:C1:CE:46:90:77:4F:0B:61:E0:54:40:88:3B:A9:A0:1E:D0:0B:A6:AB:D7:80:6E:D3:B1:18:CF
      *   Public key ping-sha256: WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=
      * All OK. Server matched our pinned cert or public key
      * statusCode: 200
      * headers: max-age=0; pin-sha256="WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18="; pin-sha256="RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=";
      * pin-sha256="k2v657xBsOVe1PQRwOsHsw3bsGT2VzIqz5K+59sNQws="; pin-sha256="K87oWBWM9UZfyddvDfoxL+8lpNyoUB2ptGtn0fv6G2Q="; pin-sha256="IQBnNBEiFuhj+8x6X8XLgh01V9Ic5/V3IRQLNFFc7v4=";
      * pin-sha256="iie1VXtL7HzAMF+/PVPR9xzT80kQxdZeJ+zduCB3uj0="; pin-sha256="LvRiGEjRqfzurezaWuj8Wie2gyHMrW5Q06LspMnox7A="; includeSubDomains
      * ```
      * @since v0.3.6
      * @param options Accepts all `options` from `request`, with some differences in default values:
      */
    def request(options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(options: URL): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(
      options: URL,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(url: String, options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(
      url: String,
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(url: URL, options: typings.node.httpsMod.RequestOptions): typings.node.nodeColonhttpMod.ClientRequest = js.native
    def request(
      url: URL,
      options: typings.node.httpsMod.RequestOptions,
      callback: js.Function1[/* res */ typings.node.nodeColonhttpMod.IncomingMessage, Unit]
    ): typings.node.nodeColonhttpMod.ClientRequest = js.native
  }
}
