package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the fastify instance created by the factory function the module exports.
  */
@js.native
trait FastifyInstance[HttpServer, HttpRequest, HttpResponse] extends js.Object {
  var log: Logger = js.native
  var server: HttpServer = js.native
  def addContentTypeParser(
    contentType: java.lang.String,
    opts: fastifyLib.Anon_BodyLimitBuffer,
    parser: BodyParser[HttpRequest, nodeLib.Buffer]
  ): scala.Unit = js.native
  def addContentTypeParser(
    contentType: java.lang.String,
    opts: fastifyLib.Anon_BodyLimitParseAs,
    parser: BodyParser[HttpRequest, java.lang.String]
  ): scala.Unit = js.native
  /**
    * Add a content type parser
    */
  def addContentTypeParser(
    contentType: java.lang.String,
    opts: fastifyLib.Anon_BodyLimit,
    parser: ContentTypeParser[HttpRequest]
  ): scala.Unit = js.native
  def addContentTypeParser(contentType: java.lang.String, parser: ContentTypeParser[HttpRequest]): scala.Unit = js.native
  def addContentTypeParser(
    contentType: js.Array[java.lang.String],
    opts: fastifyLib.Anon_BodyLimitBuffer,
    parser: BodyParser[HttpRequest, nodeLib.Buffer]
  ): scala.Unit = js.native
  def addContentTypeParser(
    contentType: js.Array[java.lang.String],
    opts: fastifyLib.Anon_BodyLimitParseAs,
    parser: BodyParser[HttpRequest, java.lang.String]
  ): scala.Unit = js.native
  def addContentTypeParser(
    contentType: js.Array[java.lang.String],
    opts: fastifyLib.Anon_BodyLimit,
    parser: ContentTypeParser[HttpRequest]
  ): scala.Unit = js.native
  def addContentTypeParser(contentType: js.Array[java.lang.String], parser: ContentTypeParser[HttpRequest]): scala.Unit = js.native
  /**
    * Adds a hook that is triggered when server.close is called. Useful for closing connections
    * and performing cleanup tasks
    */
  @JSName("addHook")
  def addHook_onClose(
    name: fastifyLib.fastifyLibStrings.onClose,
    hook: js.Function2[
      /* instance */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
      /* done */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Hook that is fired if `reply.send` is invoked with an Error
    */
  @JSName("addHook")
  def addHook_onError(
    name: fastifyLib.fastifyLibStrings.onError,
    hook: js.ThisFunction4[
      /* this */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
      /* req */ FastifyRequest[HttpRequest, DefaultQuery, DefaultParams, DefaultHeaders, DefaultBody], 
      /* reply */ FastifyReply[HttpResponse], 
      /* error */ FastifyError, 
      /* done */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Adds a hook that is triggered when Fastify a new plugin is being registered.
    * This hook can be useful if you are developing a plugin that needs to use the encapsulation functionality of Fastify.
    * The interface is synchronous, and, as such, the listeners do not get passed a callback.
    */
  @JSName("addHook")
  def addHook_onRegister(
    name: fastifyLib.fastifyLibStrings.onRegister,
    hook: js.Function1[
      /* instance */ FastifyInstance[
        nodeLib.httpMod.Server, 
        nodeLib.httpMod.IncomingMessage, 
        nodeLib.httpMod.ServerResponse
      ], 
      scala.Unit
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Add a hook that is triggered when a request is initially received
    */
  @JSName("addHook")
  def addHook_onRequest(
    name: fastifyLib.fastifyLibStrings.onRequest,
    hook: FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Hook that is called when a response is about to be sent to a client
    */
  @JSName("addHook")
  def addHook_onResponse(
    name: fastifyLib.fastifyLibStrings.onResponse,
    hook: FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Adds a hook that is triggered when a new route is registered. Listeners are passed a
    * routeOptions object as the sole parameter.
    * The interface is synchronous, and, as such, the listeners do not get passed a callback.
    */
  @JSName("addHook")
  def addHook_onRoute(
    name: fastifyLib.fastifyLibStrings.onRoute,
    hook: js.Function1[
      /* opts */ (RouteOptions[
        HttpServer, 
        HttpRequest, 
        HttpResponse, 
        DefaultQuery, 
        DefaultParams, 
        DefaultHeaders, 
        DefaultBody
      ]) with fastifyLib.Anon_Path, 
      scala.Unit
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Hook that is fired after a request is processed, but before the "onResponse"
    * hook
    */
  @JSName("addHook")
  def addHook_onSend(
    name: fastifyLib.fastifyLibStrings.onSend,
    hook: js.ThisFunction4[
      /* this */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
      /* req */ FastifyRequest[HttpRequest, DefaultQuery, DefaultParams, DefaultHeaders, DefaultBody], 
      /* reply */ FastifyReply[HttpResponse], 
      /* payload */ js.Any, 
      /* done */ js.Function2[/* err */ js.UndefOr[stdLib.Error], /* value */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Hook that is fired before a request is processed, but after the "preValidation"
    * hook
    */
  @JSName("addHook")
  def addHook_preHandler(
    name: fastifyLib.fastifyLibStrings.preHandler,
    hook: FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Add a hook that is triggered after the onRequest hook and middlewares, but before body parsing
    */
  @JSName("addHook")
  def addHook_preParsing(
    name: fastifyLib.fastifyLibStrings.preParsing,
    hook: FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Hook that is fired after a request is processed, but before the response is serialized
    * hook
    */
  @JSName("addHook")
  def addHook_preSerialization(
    name: fastifyLib.fastifyLibStrings.preSerialization,
    hook: FastifyMiddlewareWithPayload[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Add a hook that is triggered after the onRequest, middlewares, and body parsing, but before the validation
    */
  @JSName("addHook")
  def addHook_preValidation(
    name: fastifyLib.fastifyLibStrings.preValidation,
    hook: FastifyMiddleware[
      HttpServer, 
      HttpRequest, 
      HttpResponse, 
      DefaultQuery, 
      DefaultParams, 
      DefaultHeaders, 
      DefaultBody
    ]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Create a shared schema
    */
  def addSchema(schema: js.Object): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * `Register a callback that will be executed just after a register.
    * It can take up to three parameters
    */
  def after(afterListener: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def after(afterListener: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def after(
    afterListener: js.Function3[
      /* err */ stdLib.Error, 
      /* context */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
      /* done */ js.Function, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Defines a route for all the supported methods with the given mount path and handler
    */
  def all[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a route for all the supported methods with the given mount path, options, and handler
    */
  def all[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Call this function to close the server instance and run the "onClose" callback
    */
  def close(closeListener: js.Function0[scala.Unit]): scala.Unit = js.native
  def close[T](): js.Promise[T] = js.native
  /**
    * Decorate this fastify instance with new properties. Throws an execption if
    * you attempt to add the same decorator name twice
    */
  def decorate(name: java.lang.String, decoration: js.Any): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  def decorate(name: java.lang.String, decoration: js.Any, dependencies: js.Array[java.lang.String]): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Decorate reply objects with new properties. Throws an execption if
    * you attempt to add the same decorator name twice
    */
  def decorateReply(name: java.lang.String, decoration: js.Any): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  def decorateReply(name: java.lang.String, decoration: js.Any, dependencies: js.Array[java.lang.String]): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Decorate request objects with new properties. Throws an execption if
    * you attempt to add the same decorator name twice
    */
  def decorateRequest(name: java.lang.String, decoration: js.Any): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  def decorateRequest(name: java.lang.String, decoration: js.Any, dependencies: js.Array[java.lang.String]): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a DELETE route with the given mount path and handler
    */
  def delete[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a DELETE route with the given mount path, options, and handler
    */
  def delete[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a GET route with the given mount path and handler
    */
  def get[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a GET route with the given mount path, options, and handler
    */
  def get[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Get all shared schemas
    */
  def getSchemas(): org.scalablytyped.runtime.StringDictionary[js.Object] = js.native
  /**
    * Check if a parser for the specified content type exists
    */
  def hasContentTypeParser(contentType: java.lang.String): scala.Boolean = js.native
  /**
    * Determines if the given named decorator is available
    */
  def hasDecorator(name: java.lang.String): scala.Boolean = js.native
  /**
    * Determines if the given named reply decorator is available
    */
  def hasReplyDecorator(name: java.lang.String): scala.Boolean = js.native
  /**
    * Determines if the given named request decorator is available
    */
  def hasRequestDecorator(name: java.lang.String): scala.Boolean = js.native
  /**
    * Defines a HEAD route with the given mount path and handler
    */
  def head[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a HEAD route with the given mount path, options, and handler
    */
  def head[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Useful for testing http requests without running a sever
    */
  def inject(opts: HTTPInjectOptions): js.Promise[HTTPInjectResponse] = js.native
  /**
    * Useful for testing http requests without running a sever
    */
  def inject(
    opts: HTTPInjectOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ HTTPInjectResponse, scala.Unit]
  ): scala.Unit = js.native
  def inject(opts: java.lang.String): js.Promise[HTTPInjectResponse] = js.native
  def inject(
    opts: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ HTTPInjectResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Starts the server on the given port after all the plugins are loaded,
    * internally waits for the .ready() event. The callback is the same as the
    * Node core.
    */
  def listen(callback: js.Function2[/* err */ stdLib.Error, /* address */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def listen(options: ListenOptions): js.Promise[java.lang.String] = js.native
  def listen(
    options: ListenOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* address */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def listen(port: scala.Double): js.Promise[java.lang.String] = js.native
  def listen(port: scala.Double, address: java.lang.String): js.Promise[java.lang.String] = js.native
  def listen(port: scala.Double, address: java.lang.String, backlog: scala.Double): js.Promise[java.lang.String] = js.native
  def listen(
    port: scala.Double,
    address: java.lang.String,
    backlog: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* address */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def listen(
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* address */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def listen(
    port: scala.Double,
    callback: js.Function2[/* err */ stdLib.Error, /* address */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def listen(sockFile: java.lang.String): js.Promise[java.lang.String] = js.native
  def listen(
    sockFile: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* address */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Defines a OPTIONS route with the given mount path and handler
    */
  def options[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a OPTIONS route with the given mount path, options, and handler
    */
  def options[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a PATCH route with the given mount path and handler
    */
  def patch[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a PATCH route with the given mount path, options, and handler
    */
  def patch[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a POST route with the given mount path and handler
    */
  def post[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a POST route with the given mount path, options, and handler
    */
  def post[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Prints the representation of the internal radix tree used by the router
    */
  def printRoutes(): java.lang.String = js.native
  /**
    * Defines a PUT route with the given mount path and handler
    */
  def put[Query, Params, Headers, Body](
    url: java.lang.String,
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Defines a PUT route with the given mount path, options, and handler
    */
  def put[Query, Params, Headers, Body](
    url: java.lang.String,
    opts: RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body],
    handler: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body]
  ): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Registers a listener function that is invoked when all the plugins have
    * been loaded. It receives an error parameter if something went wrong.
    */
  def ready(): js.Promise[FastifyInstance[HttpServer, HttpRequest, HttpResponse]] = js.native
  def ready(readyListener: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def ready(readyListener: js.Function2[/* err */ stdLib.Error, /* done */ js.Function, scala.Unit]): scala.Unit = js.native
  def ready(
    readyListener: js.Function3[
      /* err */ stdLib.Error, 
      /* context */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
      /* done */ js.Function, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Registers a plugin
    */
  def register[T /* <: RegisterOptions[HttpServer, HttpRequest, HttpResponse] */](plugin: Plugin[HttpServer, HttpRequest, HttpResponse, T]): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  def register[T /* <: RegisterOptions[HttpServer, HttpRequest, HttpResponse] */](plugin: Plugin[HttpServer, HttpRequest, HttpResponse, T], opts: T): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Adds a route to the server
    */
  def route[Query, Params, Headers, Body](opts: RouteOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body]): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Set a function that will be called whenever an error happens
    */
  def setErrorHandler(
    handler: js.Function3[
      /* error */ FastifyError, 
      /* request */ FastifyRequest[HttpRequest, DefaultQuery, DefaultParams, DefaultHeaders, DefaultBody], 
      /* reply */ FastifyReply[HttpResponse], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Set the 404 handler
    */
  def setNotFoundHandler(
    handler: js.Function2[
      /* request */ FastifyRequest[HttpRequest, DefaultQuery, DefaultParams, DefaultHeaders, DefaultBody], 
      /* reply */ FastifyReply[HttpResponse], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Set the schema compiler for all routes.
    */
  def setSchemaCompiler(schemaCompiler: SchemaCompiler): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = js.native
  /**
    * Apply the given middleware to all incoming requests
    */
  def use(middleware: Middleware[HttpServer, HttpRequest, HttpResponse]): scala.Unit = js.native
  /**
    * Apply the given middleware to routes matching the given path
    */
  def use(path: java.lang.String, middleware: Middleware[HttpServer, HttpRequest, HttpResponse]): scala.Unit = js.native
}

