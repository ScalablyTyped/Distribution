package typings.director

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.director.anon.Allow
import typings.director.anon.Method
import typings.director.anon.Only
import typings.director.anon.RemoveContentHeaders
import typings.director.directorBooleans.`false`
import typings.director.directorNumbers.`304`
import typings.director.directorNumbers.`400`
import typings.director.directorNumbers.`401`
import typings.director.directorNumbers.`403`
import typings.director.directorNumbers.`404`
import typings.director.directorNumbers.`405`
import typings.director.directorNumbers.`406`
import typings.director.directorNumbers.`501`
import typings.director.directorStrings.`method not allowedDot`
import typings.director.directorStrings.backward
import typings.director.directorStrings.forward
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("director", "AbstractRouterBase")
  @js.native
  abstract class AbstractRouterBase[ThisType] () extends StObject {
    def this(routes: RoutingTable[ThisType]) = this()
    
    /**
      * Configures this instance with the specified `options`.
      * @param options Options to configure this instance with
      */
    def configure(): this.type = js.native
    def configure(options: RoutingOptions[ThisType]): this.type = js.native
    
    /**
      * Mounts the sanitized `routes` onto the root context for this instance.
      * @param routes Routes to mount onto this instance
      * @param path Path within the Routing Table to insert the routes into
      */
    def mount(routes: RoutingTable[ThisType]): Unit = js.native
    def mount(routes: RoutingTable[ThisType], path: BaseOrArray[String]): Unit = js.native
    
    /**
      * Sets up a `params` function which replaces any instance of `token`,
      * inside of a given `str` with `matcher`. This is very useful if you have a
      * common regular expression throughout your code base which you wish to be
      * more DRY.
      * @param token Token which to replace (e.g. `:dog`, 'cat')
      * @param matcher Target to replace the token with
      */
    def param(token: String, matcher: String): this.type = js.native
    def param(token: String, matcher: js.Function2[/* substring */ String, /* repeated */ Any, String]): this.type = js.native
    def param(token: String, matcher: js.RegExp): this.type = js.native
    
    /**
      * Evalutes the `routesFn` in the given `path` scope.
      * @param path Nested scope in which to path
      * @param routesFn Function to evaluate in the new scope
      */
    def path(path: String, routesFn: js.ThisFunction1[/* this */ this.type, /* self */ this.type, Unit]): Unit = js.native
    def path(path: js.RegExp, routesFn: js.ThisFunction1[/* this */ this.type, /* self */ this.type, Unit]): Unit = js.native
    
    /**
      * Adds a new `route` to this instance for the given `method` and `path`.
      *
      * This is an alias for `.on(method, path, route)`.
      * @param method Method to use
      * @param path Path to set this route on
      * @param route Handler for the specified method and path
      */
    def route(method: BaseOrArray[String], path: BaseOrArray[String | js.RegExp], route: RouteEntry[ThisType]): Unit = js.native
    /**
      * Adds a new `route` to this instance for the given `path`, using `"on"` as
      * the method.
      *
      * This is an alias for `.on(path, route)`.
      * @param path Path to set this route on
      * @param route Handler for the specified path
      */
    def route(path: BaseOrArray[String | js.RegExp], route: RouteEntry[ThisType]): Unit = js.native
  }
  
  @JSImport("director", "Router")
  @js.native
  open class Router () extends AbstractRouterBase[Router] {
    def this(routes: RoutingTable[Router]) = this()
    
    /**
      * Finds a set of functions on the traversal towards `method` and `path` in
      * the core routing table, then invokes them based on settings in this
      * instance.
      * @param method Method to dispatch
      * @param path Path to dispatch
      * @param callback (Optional) Continuation to respond to for async scenarios
      * @return Whether a route was matched for the given `method` and `path`
      */
    def dispatch(method: String, path: String): Boolean = js.native
    def dispatch(method: String, path: String, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Boolean = js.native
    
    /**
      * Adds a new `route` to this instance for the given `method` and `path`.
      * @param method Method to use
      * @param path Path to set this route on
      * @param route Handler for the specified method and path
      */
    def on(method: BaseOrArray[String], path: BaseOrArray[String | js.RegExp], route: RouteEntry[Router]): Unit = js.native
    /**
      * Adds a new `route` to this instance for the given `path`, using `"on"` as
      * the method.
      * @param path Path to set this route on
      * @param route Handler for the specified path
      */
    def on(path: BaseOrArray[String | js.RegExp], route: RouteEntry[Router]): Unit = js.native
  }
  
  object cli {
    
    /**
      * Server-side CLI Router class for Node.js
      */
    @JSImport("director", "cli.Router")
    @js.native
    open class Router[TTY] () extends AbstractRouterBase[CliRouterContext[TTY]] {
      def this(routes: RoutingTable[CliRouterContext[TTY]]) = this()
      
      /**
        * Finds a set of functions on the traversal towards `method` and `path` in
        * the core routing table, then invokes them based on settings in this
        * instance.
        * @param method Method to dispatch
        * @param path Path to dispatch
        * @param tty Path to dispatch
        * @param callback (Optional) Continuation to respond to for async scenarios
        * @return Whether a route was matched for the given `method` and `path`
        */
      def dispatch(method: String, path: String): Boolean = js.native
      def dispatch(method: String, path: String, tty: TTY): Boolean = js.native
      def dispatch(method: String, path: String, tty: TTY, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Boolean = js.native
      def dispatch(method: String, path: String, tty: Unit, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Boolean = js.native
      
      /**
        * Adds a new `route` to this instance for the specified `method` and `path`.
        * @param method Method to use
        * @param path Path to set this route on
        * @param route Handler for the specified method and path
        */
      def on(
        method: BaseOrArray[String],
        path: BaseOrArray[String | js.RegExp],
        route: RouteEntry[CliRouterContext[TTY]]
      ): Unit = js.native
      /**
        * Adds a new `route` to this instance for the given `path`, using `"on"`
        * as the method.
        * @param path Path to set this route on
        * @param route Handler for the specified path
        */
      def on(path: BaseOrArray[String | js.RegExp], route: RouteEntry[CliRouterContext[TTY]]): Unit = js.native
    }
    
    /**
      * Type of the `this` object for CLI route handlers.
      */
    trait CliRouterContext[TTY] extends StObject {
      
      var cmd: String
      
      var tty: TTY
    }
    object CliRouterContext {
      
      inline def apply[TTY](cmd: String, tty: TTY): CliRouterContext[TTY] = {
        val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any])
        __obj.asInstanceOf[CliRouterContext[TTY]]
      }
      
      extension [Self <: CliRouterContext[?], TTY](x: Self & CliRouterContext[TTY]) {
        
        inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
        
        inline def setTty(value: TTY): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object http {
    
    @JSImport("director", "http")
    @js.native
    val ^ : js.Any = js.native
    
    /** Exception class for erroneous requests */
    @JSImport("director", "http.BadRequest")
    @js.native
    open class BadRequest ()
      extends StObject
         with Error {
      
      var body: typings.director.anon.Error = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `400` = js.native
    }
    
    @JSImport("director", "http.Forbidden")
    @js.native
    open class Forbidden ()
      extends StObject
         with Error {
      
      var body: typings.director.anon.Error = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `403` = js.native
    }
    
    inline def GeneratedHelperMethod(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def GeneratedHelperMethod(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Adds a new `route` to this instance for a specific method and `path`.
      * @param path Path to set this route on
      * @param options Additional options for this route
      * @param route Handler for the method and path
      */
    inline def GeneratedHelperMethod(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Adds a new `route` to this instance for a specific method and `path`.
      * @param path Path to set this route on
      * @param route Handler for the method and path
      */
    inline def GeneratedHelperMethod(path: String, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def GeneratedHelperMethod(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def GeneratedHelperMethod(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def GeneratedHelperMethod(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def GeneratedHelperMethod(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(path.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Adds a new `route` to this instance for a specific method and an empty
      * `path`.
      * @param route Handler for the method and path
      */
    inline def GeneratedHelperMethod(route: RouteEntry[HttpRouterContext]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_GeneratedHelperMethod")(route.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("director", "http.MethodNotAllowed")
    @js.native
    open class MethodNotAllowed protected ()
      extends StObject
         with Error {
      /**
        * @param allowed Allowed HTTP methods
        */
      def this(allowed: String) = this()
      
      var body: typings.director.anon.Error = js.native
      
      var headers: Allow = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      @JSName("message")
      var message_MethodNotAllowed: `method not allowedDot` = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `405` = js.native
    }
    
    @JSImport("director", "http.NotAcceptable")
    @js.native
    open class NotAcceptable ()
      extends StObject
         with Error {
      
      var body: Only = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `406` = js.native
    }
    
    @JSImport("director", "http.NotAuthorized")
    @js.native
    open class NotAuthorized ()
      extends StObject
         with Error {
      
      var body: typings.director.anon.Error = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `401` = js.native
    }
    
    @JSImport("director", "http.NotFound")
    @js.native
    open class NotFound ()
      extends StObject
         with Error {
      
      var body: typings.director.anon.Error = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `404` = js.native
    }
    
    @JSImport("director", "http.NotImplemented")
    @js.native
    open class NotImplemented ()
      extends StObject
         with Error {
      
      var body: typings.director.anon.Error = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var status: `501` = js.native
    }
    
    // HTTP Error classes
    // Defined in /lib/director/http/responses.js
    @JSImport("director", "http.NotModified")
    @js.native
    open class NotModified ()
      extends StObject
         with Error {
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var options: RemoveContentHeaders = js.native
      
      var status: `304` = js.native
    }
    
    /**
      * Server-side HTTP Router class for Node.js
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ key in director.director.http.HttpRouterGeneratedMethodNames ]: {None (this : director.director.http.Router, path : string | std.RegExp, options : director.director.http.HttpRouteHandlerOptions | undefined | null, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : string | std.RegExp, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void}} */ @JSImport("director", "http.Router")
    @js.native
    open class Router () extends AbstractRouterBase[HttpRouterContext] {
      def this(routes: RoutingTable[HttpRouterContext]) = this()
      
      def acl(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def acl(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def after(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def after(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      /**
        * Ask the router to attach objects or manipulate `this` object on which
        * the function passed to the http router will get applied.
        * @param func Function to execute on `this` before applying to router
        *    function
        */
      // Note: This type definition does not yet support attaching arbitrary
      // properties to the Router object. Please use type assertions to work
      // around this limitation.
      def attach(func: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
      
      def `baseline-control`(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `baseline-control`(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def before(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def before(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def checkin(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkin(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def checkout(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def checkout(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def configure(options: HttpRoutingOptions): this.type = js.native
      
      def connect(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def connect(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def copy(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def copy(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def delete(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def delete(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      /**
        * Finds a set of functions on the traversal towards `method` and `path`
        * in the core routing table then invokes them based on settings in this
        * instance.
        *
        * Note: `HEAD` requests are dispatched to `get` routes.
        * @param req Incoming request to dispatch
        * @param res Outgoing response to dispatch
        * @param callback (Optional) Continuation to respond to for async
        *      scenarios
        * @return Whether a route was matched for the given request
        */
      def dispatch(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Boolean = js.native
      def dispatch(
        req: IncomingMessage,
        res: ServerResponse[IncomingMessage],
        callback: js.Function3[
              /* err */ js.UndefOr[Any], 
              /* req */ js.UndefOr[IncomingMessage], 
              /* res */ js.UndefOr[ServerResponse[IncomingMessage]], 
              Unit
            ]
      ): Boolean = js.native
      
      def get(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def get(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def label(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def label(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def lock(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def lock(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def merge(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def merge(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def mkactivity(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkactivity(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def mkcol(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkcol(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def mkworkspace(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def mkworkspace(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def move(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def move(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def on(method: BaseOrArray[String], path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def on(method: BaseOrArray[String], path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      /**
        * Adds a new `route` to this instance for the given `method` and `path`.
        * @param method Method to use
        * @param path Path to set this route on
        * @param options Additional options for this route
        * @param route Handler for the specified method and path
        */
      def on(
        method: BaseOrArray[String],
        path: String,
        options: HttpRouteHandlerOptions,
        route: RouteEntry[HttpRouterContext]
      ): Unit = js.native
      /**
        * Adds a new `route` to this instance for the given `method` and `path`.
        * @param method Method to use
        * @param path Path to set this route on
        * @param route Handler for the specified method and path
        */
      def on(method: BaseOrArray[String], path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def on(method: BaseOrArray[String], path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def on(method: BaseOrArray[String], path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def on(
        method: BaseOrArray[String],
        path: js.RegExp,
        options: HttpRouteHandlerOptions,
        route: RouteEntry[HttpRouterContext]
      ): Unit = js.native
      def on(method: BaseOrArray[String], path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def options(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def options(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      // Generated helper methods
      // These are dynamically added via `Router.extend()`
      def options(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      // Generated helper methods
      // These are dynamically added via `Router.extend()`
      def options(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def options(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def options(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def options(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def options(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      // Generated helper methods
      // These are dynamically added via `Router.extend()`
      def options(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def orderpatch(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def orderpatch(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def patch(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def patch(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def post(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def post(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def propfind(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def propfind(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def proppatch(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def proppatch(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def put(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def put(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def report(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def report(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def search(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def search(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def trace(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def trace(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def uncheckout(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def uncheckout(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def unlock(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def unlock(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def update(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def update(route: RouteEntry[HttpRouterContext]): Unit = js.native
      
      def `version-control`(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
      def `version-control`(route: RouteEntry[HttpRouterContext]): Unit = js.native
    }
    
    // HTTP methods
    // Defined in /lib/director/http/methods.js
    @JSImport("director", "http.methods")
    @js.native
    val methods: js.Array[Any] = js.native
    
    trait HttpRouteHandlerOptions extends StObject {
      
      /**
        * Patterns to test against the `content-type` of the incoming request.
        */
      var accept: js.UndefOr[BaseOrArray[String | js.RegExp]] = js.undefined
      
      /**
        * If set to `true`, the router will not buffer the request for this
        * route.
        * This can be used when you want to manually buffer the request.
        */
      var stream: js.UndefOr[Boolean] = js.undefined
    }
    object HttpRouteHandlerOptions {
      
      inline def apply(): HttpRouteHandlerOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HttpRouteHandlerOptions]
      }
      
      extension [Self <: HttpRouteHandlerOptions](x: Self) {
        
        inline def setAccept(value: BaseOrArray[String | js.RegExp]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        inline def setAcceptVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "accept", js.Array(value*))
        
        inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
        
        inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      }
    }
    
    /**
      * Type of the `this` object for HTTP route handlers.
      */
    trait HttpRouterContext extends StObject {
      
      var req: IncomingMessage
      
      var res: ServerResponse[IncomingMessage]
    }
    object HttpRouterContext {
      
      inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): HttpRouterContext = {
        val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpRouterContext]
      }
      
      extension [Self <: HttpRouterContext](x: Self) {
        
        inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
        
        inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Names of helper methods dynamically exposed by the HTTP Router.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.director.directorStrings.options
      - typings.director.directorStrings.get
      - typings.director.directorStrings.post
      - typings.director.directorStrings.put
      - typings.director.directorStrings.delete
      - typings.director.directorStrings.trace
      - typings.director.directorStrings.connect
      - typings.director.directorStrings.propfind
      - typings.director.directorStrings.proppatch
      - typings.director.directorStrings.mkcol
      - typings.director.directorStrings.copy
      - typings.director.directorStrings.move
      - typings.director.directorStrings.lock
      - typings.director.directorStrings.unlock
      - typings.director.directorStrings.`version-control`
      - typings.director.directorStrings.report
      - typings.director.directorStrings.checkout
      - typings.director.directorStrings.checkin
      - typings.director.directorStrings.uncheckout
      - typings.director.directorStrings.mkworkspace
      - typings.director.directorStrings.update
      - typings.director.directorStrings.label
      - typings.director.directorStrings.merge
      - typings.director.directorStrings.`baseline-control`
      - typings.director.directorStrings.mkactivity
      - typings.director.directorStrings.orderpatch
      - typings.director.directorStrings.acl
      - typings.director.directorStrings.search
      - typings.director.directorStrings.patch
      - typings.director.directorStrings.before
      - typings.director.directorStrings.after
    */
    trait HttpRouterGeneratedMethodNames extends StObject
    
    /**
      * Helper interface that checks if any dynamically generated helper methods
      * were accidentally omitted from the definition of `director.http.Router`.
      */
    type HttpRouterGeneratedMethodsCheck = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in director.director.http.HttpRouterGeneratedMethodNames ]: {None (this : director.director.http.Router, path : string, options : director.director.http.HttpRouteHandlerOptions, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : std.RegExp, options : director.director.http.HttpRouteHandlerOptions, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : string, options : undefined, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : std.RegExp, options : undefined, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : string, options : null, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : std.RegExp, options : null, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : string, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, path : std.RegExp, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void, None (this : director.director.http.Router, route : director.director.RouteEntry<director.director.http.HttpRouterContext>): void}}
      */ typings.director.directorStrings.HttpRouterGeneratedMethodsCheck & TopLevel[Any]
    
    trait HttpRoutingOptions
      extends StObject
         with RoutingOptions[HttpRouterContext] {
      
      /**
        * If set to `true`, the router will perform routing immediately instead
        * of waiting for the `end` event, buffering and parsing the entire
        * request body.
        * This can be used when you want to manually buffer the request.
        */
      var stream: js.UndefOr[Boolean] = js.undefined
    }
    object HttpRoutingOptions {
      
      inline def apply(): HttpRoutingOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HttpRoutingOptions]
      }
      
      extension [Self <: HttpRoutingOptions](x: Self) {
        
        inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
        
        inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      }
    }
  }
  
  type BaseOrArray[T] = T | js.Array[T]
  
  @js.native
  trait Handler[ThisType] extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type RouteEntry[ThisType] = BaseOrArray[Handler[ThisType]]
  
  trait RoutingOptions[ThisType] extends StObject {
    
    /**
      * (_Client Only_)
      * A function (or list of functions) to call when a given route is no longer
      * the active route.
      */
    var after: js.UndefOr[RouteEntry[ThisType]] = js.undefined
    
    /**
      * Controls async routing. Default is `false`.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  A function (or list of functions) to call before every call to
      * `router.dispatch()` when a route is found.
      */
    var before: js.UndefOr[RouteEntry[ThisType]] = js.undefined
    
    /**
      * (_Client Only_)
      * If `html5history` is enabled, the `window.location` hash by default is
      * converted to a route upon `Router.init()` since with canonical URIs the
      * router can not know if it should convert the hash to a route or not.
      * Setting this to `false` disables the hash conversion on router
      * initialisation.
      */
    var convert_hash_in_init: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Character separator between route fragments. Default is `/`.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * (_Client Only_)
      * If set to `true` and client supports `pushState()`, then uses HTML5
      * History API instead of hash fragments.
      */
    var html5history: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to call if no route is found on a call to `router.dispatch()`.
      */
    var notfound: js.UndefOr[Handler[Method]] = js.undefined
    
    /**
      * A function (or list of functions) to call on every call to
      * `router.dispatch()` when a route is found.
      */
    var on: js.UndefOr[RouteEntry[ThisType]] = js.undefined
    
    /**
      * Controls route recursion.
      * Default is `false` client-side, and `"backward"` server-side.
      */
    var recurse: js.UndefOr[forward | backward | `false`] = js.undefined
    
    // Client-only options
    /**
      * (_Client Only_)
      * An object to which string-based routes will be bound. This can be
      * especially useful for late-binding to route functions (such as async
      * client-side requires).
      */
    var resource: js.UndefOr[StringDictionary[Handler[ThisType]]] = js.undefined
    
    /**
      * (_Client Only_)
      * If `html5history` is enabled, the route handler by default is executed
      * upon `Router.init()` since with real URIs the router can not know if it
      * should call a route handler or not. Setting this to `false` disables the
      * route handler initial execution.
      */
    var run_handler_in_init: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `false`, then trailing slashes (or other delimiters) are
      * allowed in routes. Default is `true`.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RoutingOptions {
    
    inline def apply[ThisType](): RoutingOptions[ThisType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutingOptions[ThisType]]
    }
    
    extension [Self <: RoutingOptions[?], ThisType](x: Self & RoutingOptions[ThisType]) {
      
      inline def setAfter(value: RouteEntry[ThisType]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: Handler[ThisType]*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBefore(value: RouteEntry[ThisType]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: Handler[ThisType]*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setConvert_hash_in_init(value: Boolean): Self = StObject.set(x, "convert_hash_in_init", value.asInstanceOf[js.Any])
      
      inline def setConvert_hash_in_initUndefined: Self = StObject.set(x, "convert_hash_in_init", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setHtml5history(value: Boolean): Self = StObject.set(x, "html5history", value.asInstanceOf[js.Any])
      
      inline def setHtml5historyUndefined: Self = StObject.set(x, "html5history", js.undefined)
      
      inline def setNotfound(value: Handler[Method]): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
      
      inline def setNotfoundUndefined: Self = StObject.set(x, "notfound", js.undefined)
      
      inline def setOn(value: RouteEntry[ThisType]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOnVarargs(value: Handler[ThisType]*): Self = StObject.set(x, "on", js.Array(value*))
      
      inline def setRecurse(value: forward | backward | `false`): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
      
      inline def setResource(value: StringDictionary[Handler[ThisType]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setRun_handler_in_init(value: Boolean): Self = StObject.set(x, "run_handler_in_init", value.asInstanceOf[js.Any])
      
      inline def setRun_handler_in_initUndefined: Self = StObject.set(x, "run_handler_in_init", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait RoutingTable[ThisType]
    extends StObject
       with /* route */ StringDictionary[RouteEntry[ThisType] | RoutingTable[ThisType]]
  object RoutingTable {
    
    inline def apply[ThisType](): RoutingTable[ThisType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutingTable[ThisType]]
    }
  }
}
