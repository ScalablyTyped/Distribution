package typings.expressServeStaticCore

import org.scalablytyped.runtime.StringDictionary
import typings.expressServeStaticCore.expressServeStaticCoreBooleans.`false`
import typings.expressServeStaticCore.expressServeStaticCoreStrings.`set-cookie`
import typings.expressServeStaticCore.expressServeStaticCoreStrings.all
import typings.expressServeStaticCore.expressServeStaticCoreStrings.delete
import typings.expressServeStaticCore.expressServeStaticCoreStrings.get
import typings.expressServeStaticCore.expressServeStaticCoreStrings.head
import typings.expressServeStaticCore.expressServeStaticCoreStrings.lax
import typings.expressServeStaticCore.expressServeStaticCoreStrings.none
import typings.expressServeStaticCore.expressServeStaticCoreStrings.options
import typings.expressServeStaticCore.expressServeStaticCoreStrings.patch
import typings.expressServeStaticCore.expressServeStaticCoreStrings.post
import typings.expressServeStaticCore.expressServeStaticCoreStrings.put
import typings.expressServeStaticCore.expressServeStaticCoreStrings.router
import typings.expressServeStaticCore.expressServeStaticCoreStrings.strict
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.rangeParser.mod.Options
import typings.rangeParser.mod.Ranges
import typings.rangeParser.mod.Result
import typings.std.Date
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notifyAll, wait, wait, wait, clone, finalize
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - js.Function because Inheritance from two classes. Inlined call, length, bind, args
  - typings.expressServeStaticCore.mod.RequestHandler because Inheritance from two classes. Inlined apply
  - typings.expressServeStaticCore.mod.IRouter because Inheritance from two classes. Inlined param, param, all, all, all, all_Original, get, get, get, get_Original, post, post, post, post_Original, put, put, put, put_Original, delete, delete, delete, delete_Original, patch, patch, patch, patch_Original, options, options, options, options_Original, head, head, head, head_Original, checkout, checkout, checkout, checkout_Original, connect, connect, connect, connect_Original, copy, copy, copy, copy_Original, lock, lock, lock, lock_Original, merge, merge, merge, merge_Original, mkactivity, mkactivity, mkactivity, mkactivity_Original, mkcol, mkcol, mkcol, mkcol_Original, move, move, move, move_Original, `m-search`, `m-search`, `m-search`, `m-search_Original`, notify, notify, notify, notify_Original, propfind, propfind, propfind, propfind_Original, proppatch, proppatch, proppatch, proppatch_Original, purge, purge, purge, purge_Original, report, report, report, report_Original, search, search, search, search_Original, subscribe, subscribe, subscribe, subscribe_Original, trace, trace, trace, trace_Original, unlock, unlock, unlock, unlock_Original, unsubscribe, unsubscribe, unsubscribe, unsubscribe_Original, use, use, use, use, use, use_Original, route, stack */ @js.native
  trait Application
    extends EventEmitter
       with typings.expressServeStaticCore.mod.global.Express.Application {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def apply(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any = js.native
    def apply(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any = js.native
    def apply(req: IncomingMessage, res: Response[js.Any, Double]): js.Any = js.native
    def apply(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    
    /**
      * Used to get all registered routes in Express Application
      */
    var _router: js.Any = js.native
    
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      */
    def all(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      */
    def all[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      */
    @JSName("all")
    var all_Original: IRouterMatcher[this.type, all] = js.native
    
    def apply(
      arg1: /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs],
      arg2: /* res */ Response[js.Any, Double],
      arg3: /* next */ NextFunction
    ): js.Any = js.native
    
    val args: String = js.native
    
    def bind(thisArg: js.Any, argArray: js.Any): js.Dynamic = js.native
    
    def call(thisArg: js.Any, argArray: js.Any): js.Dynamic = js.native
    
    def checkout(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def checkout[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("checkout")
    var checkout_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def connect(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def connect[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("connect")
    var connect_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def copy(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def copy[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("copy")
    var copy_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    /**
      * Initialize application configuration.
      */
    def defaultConfiguration(): Unit = js.native
    
    def delete(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def delete[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("delete")
    var delete_Original: IRouterMatcher[this.type, delete] = js.native
    
    /** Disable `setting`. */
    def disable(setting: String): this.type = js.native
    
    /**
      * Check if `setting` is disabled.
      *
      *    app.disabled('foo')
      *    // => true
      *
      *    app.enable('foo')
      *    app.disabled('foo')
      *    // => false
      */
    def disabled(setting: String): Boolean = js.native
    
    /** Enable `setting`. */
    def enable(setting: String): this.type = js.native
    
    /**
      * Check if `setting` is enabled (truthy).
      *
      *    app.enabled('foo')
      *    // => false
      *
      *    app.enable('foo')
      *    app.enabled('foo')
      *    // => true
      */
    def enabled(setting: String): Boolean = js.native
    
    /**
      * Register the given template engine callback `fn`
      * as `ext`.
      *
      * By default will `require()` the engine based on the
      * file extension. For example if you try to render
      * a "foo.jade" file Express will invoke the following internally:
      *
      *     app.engine('jade', require('jade').__express);
      *
      * For engines that do not provide `.__express` out of the box,
      * or if you wish to "map" a different extension to the template engine
      * you may use this method. For example mapping the EJS template engine to
      * ".html" files:
      *
      *     app.engine('html', require('ejs').renderFile);
      *
      * In this case EJS provides a `.renderFile()` method with
      * the same signature that Express expects: `(path, options, callback)`,
      * though note that it aliases this method as `ejs.__express` internally
      * so if you're using ".ejs" extensions you dont need to do anything.
      *
      * Some template engines do not follow this convention, the
      * [Consolidate.js](https://github.com/visionmedia/consolidate.js)
      * library was created to map all of node's popular template
      * engines to follow this convention, thus allowing them to
      * work seamlessly within Express.
      */
    def engine(
      ext: String,
      fn: js.Function3[
          /* path */ String, 
          /* options */ js.Object, 
          /* callback */ js.Function2[/* e */ js.Any, /* rendered */ js.UndefOr[String], Unit], 
          Unit
        ]
    ): this.type = js.native
    
    def get(name: String): js.Any = js.native
    def get(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def get[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("get")
    var get_Original: ((js.Function1[/* name */ String, js.Any]) & (IRouterMatcher[this.type, js.Any])) | (IRouterMatcher[this.type, get]) = js.native
    
    def head(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def head[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("head")
    var head_Original: IRouterMatcher[this.type, head] = js.native
    
    /**
      * Initialize the server.
      *
      *   - setup default configuration
      *   - setup default middleware
      *   - setup route reflection methods
      */
    def init(): Unit = js.native
    
    val length: Int = js.native
    
    def listen(): Server = js.native
    def listen(callback: js.Function0[Unit]): Server = js.native
    def listen(handle: js.Any): Server = js.native
    def listen(handle: js.Any, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(path: String): Server = js.native
    def listen(path: String, callback: js.Function0[Unit]): Server = js.native
    def listen(port: Double): Server = js.native
    def listen(port: Double, callback: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: String): Server = js.native
    /**
      * Listen for connections.
      *
      * A node `http.Server` is returned, with this
      * application (which is a `Function`) as its
      * callback. If you wish to create both an HTTP
      * and HTTPS server you may do so with the "http"
      * and "https" modules as shown here:
      *
      *    var http = require('http')
      *      , https = require('https')
      *      , express = require('express')
      *      , app = express();
      *
      *    http.createServer(app).listen(80);
      *    https.createServer({ ... }, app).listen(443);
      */
    def listen(port: Double, hostname: String, backlog: Double): Server = js.native
    def listen(port: Double, hostname: String, backlog: Double, callback: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: String, callback: js.Function0[Unit]): Server = js.native
    
    var locals: Record[String, js.Any] = js.native
    
    def lock(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def lock[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("lock")
    var lock_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def `m-search`(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def `m-search`[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("m-search")
    var `m-search_Original`: IRouterMatcher[this.type, js.Any] = js.native
    
    var map: js.Any = js.native
    
    def merge(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def merge[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("merge")
    var merge_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def mkactivity(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def mkactivity[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("mkactivity")
    var mkactivity_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def mkcol(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def mkcol[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("mkcol")
    var mkcol_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    /**
      * The app.mountpath property contains one or more path patterns on which a sub-app was mounted.
      */
    var mountpath: String | js.Array[String] = js.native
    
    def move(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def move[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("move")
    var move_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def notify(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def notify[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("notify")
    var notify_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def options(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def options[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("options")
    var options_Original: IRouterMatcher[this.type, options] = js.native
    
    /**
      * Alternatively, you can pass only a callback, in which case you have the opportunity to alter the app.param()
      *
      * @deprecated since version 4.11
      */
    def param(callback: js.Function2[/* name */ String, /* matcher */ RegExp, RequestParamHandler]): this.type = js.native
    /**
      * Map the given param placeholder `name`(s) to the given callback(s).
      *
      * Parameter mapping is used to provide pre-conditions to routes
      * which use normalized placeholders. For example a _:user_id_ parameter
      * could automatically load a user's information from the database without
      * any additional code,
      *
      * The callback uses the samesignature as middleware, the only differencing
      * being that the value of the placeholder is passed, in this case the _id_
      * of the user. Once the `next()` function is invoked, just like middleware
      * it will continue on to execute the route, or subsequent parameter functions.
      *
      *      app.param('user_id', function(req, res, next, id){
      *        User.find(id, function(err, user){
      *          if (err) {
      *            next(err);
      *          } else if (user) {
      *            req.user = user;
      *            next();
      *          } else {
      *            next(new Error('failed to load user'));
      *          }
      *        });
      *      });
      */
    def param(name: String, handler: RequestParamHandler): this.type = js.native
    def param(name: js.Array[String], handler: RequestParamHandler): this.type = js.native
    
    def patch(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def patch[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("patch")
    var patch_Original: IRouterMatcher[this.type, patch] = js.native
    
    /**
      * Return the app's absolute pathname
      * based on the parent(s) that have
      * mounted it.
      *
      * For example if the application was
      * mounted as "/admin", which itself
      * was mounted as "/blog" then the
      * return value would be "/blog/admin".
      */
    def path(): String = js.native
    
    def post(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def post[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("post")
    var post_Original: IRouterMatcher[this.type, post] = js.native
    
    def propfind(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def propfind[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("propfind")
    var propfind_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def proppatch(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def proppatch[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("proppatch")
    var proppatch_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def purge(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def purge[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("purge")
    var purge_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def put(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def put[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("put")
    var put_Original: IRouterMatcher[this.type, put] = js.native
    
    /**
      * Render the given view `name` name with `options`
      * and a callback accepting an error and the
      * rendered template string.
      *
      * Example:
      *
      *    app.render('email', { name: 'Tobi' }, function(err, html){
      *      // ...
      *    })
      */
    def render(name: String): Unit = js.native
    def render(name: String, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
    def render(name: String, options: js.Object): Unit = js.native
    def render(name: String, options: js.Object, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
    def render(name: String, options: Unit, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
    
    def report(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def report[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("report")
    var report_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    var resource: js.Any = js.native
    
    def route(prefix: PathParams): IRoute = js.native
    
    var router: String = js.native
    
    /**
      * The app.routes object houses all of the routes defined mapped by the
      * associated HTTP verb. This object may be used for introspection
      * capabilities, for example Express uses this internally not only for
      * routing but to provide default OPTIONS behaviour unless app.options()
      * is used. Your application or framework may also remove routes by
      * simply by removing them from this object.
      */
    var routes: js.Any = js.native
    
    def search(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def search[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("search")
    var search_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    /**
      * Assign `setting` to `val`, or return `setting`'s value.
      *
      *    app.set('foo', 'bar');
      *    app.get('foo');
      *    // => "bar"
      *    app.set('foo', ['bar', 'baz']);
      *    app.get('foo');
      *    // => ["bar", "baz"]
      *
      * Mounted servers inherit their parent server's settings.
      */
    def set(setting: String, `val`: js.Any): this.type = js.native
    
    var settings: js.Any = js.native
    
    /**
      * Stack of configured routes
      */
    var stack: js.Array[js.Any] = js.native
    
    def subscribe(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def subscribe[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("subscribe")
    var subscribe_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def trace(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def trace[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("trace")
    var trace_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def unlock(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def unlock[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("unlock")
    var unlock_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def unsubscribe(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def unsubscribe[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def use(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type = js.native
    def use(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def use[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("use")
    var use_Original: (IRouterHandler[this.type] & (IRouterMatcher[this.type, js.Any])) | ApplicationRequestHandler[this.type] = js.native
  }
  
  type ApplicationRequestHandler[T] = IRouterHandler[T] & (IRouterMatcher[T, js.Any]) & (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs], T])
  
  trait ByteRange extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object ByteRange {
    
    inline def apply(end: Double, start: Double): ByteRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteRange]
    }
    
    extension [Self <: ByteRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait CookieOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
    
    var expires: js.UndefOr[Date] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* val */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type Errback = js.Function1[/* err */ Error, Unit]
  
  type ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery] = js.Function4[
    /* err */ js.Any, 
    /* req */ Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ Response[ResBody, Double], 
    /* next */ NextFunction, 
    js.Any
  ]
  
  @js.native
  trait Express extends Application {
    
    var request: Request[ParamsDictionary, js.Any, js.Any, ParsedQs] = js.native
    
    var response: Response[js.Any, Double] = js.native
  }
  
  type Handler = RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]
  
  trait IRoute extends StObject {
    
    def all(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("all")
    var all_Original: IRouterHandler[this.type]
    
    def checkout(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("checkout")
    var checkout_Original: IRouterHandler[this.type]
    
    def copy(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("copy")
    var copy_Original: IRouterHandler[this.type]
    
    def delete(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("delete")
    var delete_Original: IRouterHandler[this.type]
    
    def get(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("get")
    var get_Original: IRouterHandler[this.type]
    
    def head(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("head")
    var head_Original: IRouterHandler[this.type]
    
    def lock(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("lock")
    var lock_Original: IRouterHandler[this.type]
    
    def `m-search`(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("m-search")
    var `m-search_Original`: IRouterHandler[this.type]
    
    def merge(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("merge")
    var merge_Original: IRouterHandler[this.type]
    
    def mkactivity(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("mkactivity")
    var mkactivity_Original: IRouterHandler[this.type]
    
    def mkcol(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("mkcol")
    var mkcol_Original: IRouterHandler[this.type]
    
    def move(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("move")
    var move_Original: IRouterHandler[this.type]
    
    def notify(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("notify")
    var notify_Original: IRouterHandler[this.type]
    
    def options(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("options")
    var options_Original: IRouterHandler[this.type]
    
    def patch(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("patch")
    var patch_Original: IRouterHandler[this.type]
    
    var path: String
    
    def post(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("post")
    var post_Original: IRouterHandler[this.type]
    
    def purge(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("purge")
    var purge_Original: IRouterHandler[this.type]
    
    def put(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("put")
    var put_Original: IRouterHandler[this.type]
    
    def report(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("report")
    var report_Original: IRouterHandler[this.type]
    
    def search(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("search")
    var search_Original: IRouterHandler[this.type]
    
    var stack: js.Any
    
    def subscribe(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("subscribe")
    var subscribe_Original: IRouterHandler[this.type]
    
    def trace(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("trace")
    var trace_Original: IRouterHandler[this.type]
    
    def unlock(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("unlock")
    var unlock_Original: IRouterHandler[this.type]
    
    def unsubscribe(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type
    @JSName("unsubscribe")
    var unsubscribe_Original: IRouterHandler[this.type]
  }
  object IRoute {
    
    inline def apply(
      all: IRouterHandler[IRoute],
      checkout: IRouterHandler[IRoute],
      copy: IRouterHandler[IRoute],
      delete: IRouterHandler[IRoute],
      get: IRouterHandler[IRoute],
      head: IRouterHandler[IRoute],
      lock: IRouterHandler[IRoute],
      `m-search`: IRouterHandler[IRoute],
      merge: IRouterHandler[IRoute],
      mkactivity: IRouterHandler[IRoute],
      mkcol: IRouterHandler[IRoute],
      move: IRouterHandler[IRoute],
      notify_ : IRouterHandler[IRoute],
      options: IRouterHandler[IRoute],
      patch: IRouterHandler[IRoute],
      path: String,
      post: IRouterHandler[IRoute],
      purge: IRouterHandler[IRoute],
      put: IRouterHandler[IRoute],
      report: IRouterHandler[IRoute],
      search: IRouterHandler[IRoute],
      stack: js.Any,
      subscribe: IRouterHandler[IRoute],
      trace: IRouterHandler[IRoute],
      unlock: IRouterHandler[IRoute],
      unsubscribe: IRouterHandler[IRoute]
    ): IRoute = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], checkout = checkout.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], mkactivity = mkactivity.asInstanceOf[js.Any], mkcol = mkcol.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], unsubscribe = unsubscribe.asInstanceOf[js.Any])
      __obj.updateDynamic("m-search")(`m-search`.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRoute]
    }
    
    extension [Self <: IRoute](x: Self) {
      
      inline def setAll(value: IRouterHandler[IRoute]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setCheckout(value: IRouterHandler[IRoute]): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: IRouterHandler[IRoute]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: IRouterHandler[IRoute]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setGet(value: IRouterHandler[IRoute]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setHead(value: IRouterHandler[IRoute]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setLock(value: IRouterHandler[IRoute]): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def `setM-search`(value: IRouterHandler[IRoute]): Self = StObject.set(x, "m-search", value.asInstanceOf[js.Any])
      
      inline def setMerge(value: IRouterHandler[IRoute]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMkactivity(value: IRouterHandler[IRoute]): Self = StObject.set(x, "mkactivity", value.asInstanceOf[js.Any])
      
      inline def setMkcol(value: IRouterHandler[IRoute]): Self = StObject.set(x, "mkcol", value.asInstanceOf[js.Any])
      
      inline def setMove(value: IRouterHandler[IRoute]): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setNotify_(value: IRouterHandler[IRoute]): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IRouterHandler[IRoute]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: IRouterHandler[IRoute]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPost(value: IRouterHandler[IRoute]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPurge(value: IRouterHandler[IRoute]): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
      
      inline def setPut(value: IRouterHandler[IRoute]): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
      
      inline def setReport(value: IRouterHandler[IRoute]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: IRouterHandler[IRoute]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: IRouterHandler[IRoute]): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: IRouterHandler[IRoute]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setUnlock(value: IRouterHandler[IRoute]): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe(value: IRouterHandler[IRoute]): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRouter
    extends RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] {
    
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      */
    def all(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      */
    def all[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    /**
      * Special-cased "all" method, applying the given route `path`,
      * middleware, and callback to _every_ HTTP method.
      */
    @JSName("all")
    var all_Original: IRouterMatcher[this.type, all] = js.native
    
    def checkout(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def checkout[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("checkout")
    var checkout_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def connect(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def connect[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("connect")
    var connect_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def copy(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def copy[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("copy")
    var copy_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def delete(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def delete[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("delete")
    var delete_Original: IRouterMatcher[this.type, delete] = js.native
    
    def get(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def get[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("get")
    var get_Original: IRouterMatcher[this.type, get] = js.native
    
    def head(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def head[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("head")
    var head_Original: IRouterMatcher[this.type, head] = js.native
    
    def lock(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def lock[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("lock")
    var lock_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def `m-search`(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def `m-search`[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("m-search")
    var `m-search_Original`: IRouterMatcher[this.type, js.Any] = js.native
    
    def merge(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def merge[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("merge")
    var merge_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def mkactivity(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def mkactivity[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("mkactivity")
    var mkactivity_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def mkcol(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def mkcol[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("mkcol")
    var mkcol_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def move(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def move[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("move")
    var move_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def notify(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def notify[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("notify")
    var notify_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def options(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def options[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("options")
    var options_Original: IRouterMatcher[this.type, options] = js.native
    
    /**
      * Alternatively, you can pass only a callback, in which case you have the opportunity to alter the app.param()
      *
      * @deprecated since version 4.11
      */
    def param(callback: js.Function2[/* name */ String, /* matcher */ RegExp, RequestParamHandler]): this.type = js.native
    /**
      * Map the given param placeholder `name`(s) to the given callback(s).
      *
      * Parameter mapping is used to provide pre-conditions to routes
      * which use normalized placeholders. For example a _:user_id_ parameter
      * could automatically load a user's information from the database without
      * any additional code,
      *
      * The callback uses the samesignature as middleware, the only differencing
      * being that the value of the placeholder is passed, in this case the _id_
      * of the user. Once the `next()` function is invoked, just like middleware
      * it will continue on to execute the route, or subsequent parameter functions.
      *
      *      app.param('user_id', function(req, res, next, id){
      *        User.find(id, function(err, user){
      *          if (err) {
      *            next(err);
      *          } else if (user) {
      *            req.user = user;
      *            next();
      *          } else {
      *            next(new Error('failed to load user'));
      *          }
      *        });
      *      });
      */
    def param(name: String, handler: RequestParamHandler): this.type = js.native
    
    def patch(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def patch[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("patch")
    var patch_Original: IRouterMatcher[this.type, patch] = js.native
    
    def post(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def post[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("post")
    var post_Original: IRouterMatcher[this.type, post] = js.native
    
    def propfind(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def propfind[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("propfind")
    var propfind_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def proppatch(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def proppatch[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("proppatch")
    var proppatch_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def purge(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def purge[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("purge")
    var purge_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def put(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def put[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("put")
    var put_Original: IRouterMatcher[this.type, put] = js.native
    
    def report(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def report[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("report")
    var report_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def route(prefix: PathParams): IRoute = js.native
    
    def search(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def search[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("search")
    var search_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    /**
      * Stack of configured routes
      */
    var stack: js.Array[js.Any] = js.native
    
    def subscribe(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def subscribe[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("subscribe")
    var subscribe_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def trace(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def trace[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("trace")
    var trace_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def unlock(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def unlock[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("unlock")
    var unlock_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def unsubscribe(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def unsubscribe[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: IRouterMatcher[this.type, js.Any] = js.native
    
    def use(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): this.type = js.native
    def use(path: PathParams, subApplication: Application): this.type = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def use[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): this.type = js.native
    @JSName("use")
    var use_Original: IRouterHandler[this.type] & (IRouterMatcher[this.type, js.Any]) = js.native
  }
  
  @js.native
  trait IRouterHandler[T] extends StObject {
    
    def apply(
      handlers: ((RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any, ParsedQs]))*
    ): T = js.native
  }
  
  @js.native
  trait IRouterMatcher[T, Method /* <: all | get | post | put | delete | patch | options | head */] extends StObject {
    
    def apply(path: PathParams, subApplication: Application): T = js.native
    // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
    def apply[P, ResBody, ReqBody, ReqQuery](
      path: PathParams,
      handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
    ): T = js.native
  }
  
  trait MediaType extends StObject {
    
    var quality: Double
    
    var subtype: String
    
    var `type`: String
    
    var value: String
  }
  object MediaType {
    
    inline def apply(quality: Double, subtype: String, `type`: String, value: String): MediaType = {
      val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    extension [Self <: MediaType](x: Self) {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NextFunction extends StObject {
    
    def apply(): Unit = js.native
    /**
      * "Break-out" of a router by calling {next('router')};
      * @see {https://expressjs.com/en/guide/using-middleware.html#middleware.router}
      */
    def apply(deferToNext: router): Unit = js.native
    def apply(err: js.Any): Unit = js.native
  }
  
  type Params = ParamsDictionary | ParamsArray
  
  type ParamsArray = js.Array[String]
  
  type ParamsDictionary = StringDictionary[String]
  
  type PathParams = String | RegExp | (js.Array[String | RegExp])
  
  type Query = ParsedQs
  
  @js.native
  trait Request[P, ResBody, ReqBody, ReqQuery]
    extends IncomingMessage
       with typings.expressServeStaticCore.mod.global.Express.Request {
    
    /**
      * Return an array of Accepted media types
      * ordered from highest quality to lowest.
      */
    var accepted: js.Array[MediaType] = js.native
    
    /**
      * Check if the given `type(s)` is acceptable, returning
      * the best match when true, otherwise `undefined`, in which
      * case you should respond with 406 "Not Acceptable".
      *
      * The `type` value may be a single mime type string
      * such as "application/json", the extension name
      * such as "json", a comma-delimted list such as "json, html, text/plain",
      * or an array `["json", "html", "text/plain"]`. When a list
      * or array is given the _best_ match, if any is returned.
      *
      * Examples:
      *
      *     // Accept: text/html
      *     req.accepts('html');
      *     // => "html"
      *
      *     // Accept: text/ *, application/json
      *     req.accepts('html');
      *     // => "html"
      *     req.accepts('text/html');
      *     // => "text/html"
      *     req.accepts('json, text');
      *     // => "json"
      *     req.accepts('application/json');
      *     // => "application/json"
      *
      *     // Accept: text/ *, application/json
      *     req.accepts('image/png');
      *     req.accepts('png');
      *     // => undefined
      *
      *     // Accept: text/ *;q=.5, application/json
      *     req.accepts(['html', 'json']);
      *     req.accepts('html, json');
      *     // => "json"
      */
    def accepts(): js.Array[String] = js.native
    def accepts(`type`: String*): String | `false` = js.native
    def accepts(`type`: String): String | `false` = js.native
    def accepts(`type`: js.Array[String]): String | `false` = js.native
    
    /**
      * Returns the first accepted charset of the specified character sets,
      * based on the request's Accept-Charset HTTP header field.
      * If none of the specified charsets is accepted, returns false.
      *
      * For more information, or if you have issues or concerns, see accepts.
      */
    def acceptsCharsets(): js.Array[String] = js.native
    def acceptsCharsets(charset: String*): String | `false` = js.native
    def acceptsCharsets(charset: String): String | `false` = js.native
    def acceptsCharsets(charset: js.Array[String]): String | `false` = js.native
    
    /**
      * Returns the first accepted encoding of the specified encodings,
      * based on the request's Accept-Encoding HTTP header field.
      * If none of the specified encodings is accepted, returns false.
      *
      * For more information, or if you have issues or concerns, see accepts.
      */
    def acceptsEncodings(): js.Array[String] = js.native
    def acceptsEncodings(encoding: String*): String | `false` = js.native
    def acceptsEncodings(encoding: String): String | `false` = js.native
    def acceptsEncodings(encoding: js.Array[String]): String | `false` = js.native
    
    /**
      * Returns the first accepted language of the specified languages,
      * based on the request's Accept-Language HTTP header field.
      * If none of the specified languages is accepted, returns false.
      *
      * For more information, or if you have issues or concerns, see accepts.
      */
    def acceptsLanguages(): js.Array[String] = js.native
    def acceptsLanguages(lang: String*): String | `false` = js.native
    def acceptsLanguages(lang: String): String | `false` = js.native
    def acceptsLanguages(lang: js.Array[String]): String | `false` = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Application = js.native
    
    var baseUrl: String = js.native
    
    //body: { username: string; password: string; remember: boolean; title: string; };
    var body: ReqBody = js.native
    
    //cookies: { string; remember: boolean; };
    var cookies: js.Any = js.native
    
    /**
      * Check if the request is fresh, aka
      * Last-Modified and/or the ETag
      * still match.
      */
    var fresh: Boolean = js.native
    
    def get(name: String): js.UndefOr[String] = js.native
    /**
      * Return request header.
      *
      * The `Referrer` header field is special-cased,
      * both `Referrer` and `Referer` are interchangeable.
      *
      * Examples:
      *
      *     req.get('Content-Type');
      *     // => "text/plain"
      *
      *     req.get('content-type');
      *     // => "text/plain"
      *
      *     req.get('Something');
      *     // => undefined
      *
      * Aliased as `req.header()`.
      */
    @JSName("get")
    def get_setcookie(name: `set-cookie`): js.UndefOr[js.Array[String]] = js.native
    
    def header(name: String): js.UndefOr[String] = js.native
    @JSName("header")
    def header_setcookie(name: `set-cookie`): js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @deprecated Use hostname instead.
      */
    var host: String = js.native
    
    /**
      * Parse the "Host" header field hostname.
      */
    var hostname: String = js.native
    
    /**
      * Return the remote address, or when
      * "trust proxy" is `true` return
      * the upstream addr.
      */
    var ip: String = js.native
    
    /**
      * When "trust proxy" is `true`, parse
      * the "X-Forwarded-For" ip address list.
      *
      * For example if the value were "client, proxy1, proxy2"
      * you would receive the array `["client", "proxy1", "proxy2"]`
      * where "proxy2" is the furthest down-stream.
      */
    var ips: js.Array[String] = js.native
    
    /**
      * Check if the incoming request contains the "Content-Type"
      * header field, and it contains the give mime `type`.
      *
      * Examples:
      *
      *      // With Content-Type: text/html; charset=utf-8
      *      req.is('html');
      *      req.is('text/html');
      *      req.is('text/ *');
      *      // => true
      *
      *      // When Content-Type is application/json
      *      req.is('json');
      *      req.is('application/json');
      *      req.is('application/ *');
      *      // => true
      *
      *      req.is('html');
      *      // => false
      */
    def is(`type`: String): String | `false` | Null = js.native
    def is(`type`: js.Array[String]): String | `false` | Null = js.native
    
    var next: js.UndefOr[NextFunction] = js.native
    
    var originalUrl: String = js.native
    
    /**
      * @deprecated since 4.11 Use either req.params, req.body or req.query, as applicable.
      *
      * Return the value of param `name` when present or `defaultValue`.
      *
      *  - Checks route placeholders, ex: _/user/:id_
      *  - Checks body params, ex: id=12, {"id":12}
      *  - Checks query string params, ex: ?id=12
      *
      * To utilize request bodies, `req.body`
      * should be an object. This can be done by using
      * the `connect.bodyParser()` middleware.
      */
    def param(name: String): String = js.native
    def param(name: String, defaultValue: js.Any): String = js.native
    
    var params: P = js.native
    
    /**
      * Short-hand for `url.parse(req.url).pathname`.
      */
    var path: String = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    /**
      * Return the protocol string "http" or "https"
      * when requested with TLS. When the "trust proxy"
      * setting is enabled the "X-Forwarded-Proto" header
      * field will be trusted. If you're running behind
      * a reverse proxy that supplies https for you this
      * may be enabled.
      */
    var protocol: String = js.native
    
    var query: ReqQuery = js.native
    
    /**
      * Parse Range header field, capping to the given `size`.
      *
      * Unspecified ranges such as "0-" require knowledge of your resource length. In
      * the case of a byte range this is of course the total number of bytes.
      * If the Range header field is not given `undefined` is returned.
      * If the Range header field is given, return value is a result of range-parser.
      * See more ./types/range-parser/index.d.ts
      *
      * NOTE: remember that ranges are inclusive, so for example "Range: users=0-3"
      * should respond with 4 users when available, not 3.
      *
      */
    def range(size: Double): js.UndefOr[Ranges | Result] = js.native
    def range(size: Double, options: Options): js.UndefOr[Ranges | Result] = js.native
    
    /**
      * After middleware.init executed, Request will contain res and next properties
      * See: express/lib/middleware/init.js
      */
    var res: js.UndefOr[Response[ResBody, Double]] = js.native
    
    var route: js.Any = js.native
    
    /**
      * Short-hand for:
      *
      *    req.protocol == 'https'
      */
    var secure: Boolean = js.native
    
    var signedCookies: js.Any = js.native
    
    /**
      * Check if the request is stale, aka
      * "Last-Modified" and / or the "ETag" for the
      * resource has changed.
      */
    var stale: Boolean = js.native
    
    /**
      * Return subdomains as an array.
      *
      * Subdomains are the dot-separated parts of the host before the main domain of
      * the app. By default, the domain of the app is assumed to be the last two
      * parts of the host. This can be changed by setting "subdomain offset".
      *
      * For example, if the domain is "tobi.ferrets.example.com":
      * If "subdomain offset" is not set, req.subdomains is `["ferrets", "tobi"]`.
      * If "subdomain offset" is 3, req.subdomains is `["tobi"]`.
      */
    var subdomains: js.Array[String] = js.native
    
    /**
      * Check if the request was an _XMLHttpRequest_.
      */
    var xhr: Boolean = js.native
  }
  
  type RequestHandler[P, ResBody, ReqBody, ReqQuery] = js.Function3[
    /* req */ Request[P, ResBody, ReqBody, ReqQuery], 
    /* res */ Response[ResBody, Double], 
    /* next */ NextFunction, 
    js.Any
  ]
  
  type RequestHandlerParams[P, ResBody, ReqBody, ReqQuery] = (RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]) | (js.Array[
    (RequestHandler[P, js.Any, js.Any, ParsedQs]) | (ErrorRequestHandler[P, js.Any, js.Any, ParsedQs])
  ])
  
  type RequestParamHandler = js.Function5[
    /* req */ Request[ParamsDictionary, js.Any, js.Any, ParsedQs], 
    /* res */ Response[js.Any, Double], 
    /* next */ NextFunction, 
    /* value */ js.Any, 
    /* name */ String, 
    js.Any
  ]
  
  type RequestRanges = Ranges
  
  @js.native
  trait Response[ResBody, StatusCode /* <: Double */]
    extends ServerResponse
       with typings.expressServeStaticCore.mod.global.Express.Response {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Application = js.native
    
    /**
      * Appends the specified value to the HTTP response header field.
      * If the header is not already set, it creates the header with the specified value.
      * The value parameter can be a string or an array.
      *
      * Note: calling res.set() after res.append() will reset the previously-set header value.
      *
      * @since 4.11.0
      */
    def append(field: String): this.type = js.native
    def append(field: String, value: String): this.type = js.native
    def append(field: String, value: js.Array[String]): this.type = js.native
    
    /**
      * Set _Content-Disposition_ header to _attachment_ with optional `filename`.
      */
    def attachment(): this.type = js.native
    def attachment(filename: String): this.type = js.native
    
    var charset: String = js.native
    
    /** Clear cookie `name`. */
    def clearCookie(name: String): this.type = js.native
    def clearCookie(name: String, options: js.Any): this.type = js.native
    
    /**
      * Set _Content-Type_ response header with `type` through `mime.lookup()`
      * when it does not contain "/", or set the Content-Type to `type` otherwise.
      *
      * Examples:
      *
      *     res.type('.html');
      *     res.type('html');
      *     res.type('json');
      *     res.type('application/json');
      *     res.type('png');
      */
    def contentType(`type`: String): this.type = js.native
    
    /**
      * Set cookie `name` to `val`, with the given `options`.
      *
      * Options:
      *
      *    - `maxAge`   max-age in milliseconds, converted to `expires`
      *    - `signed`   sign the cookie
      *    - `path`     defaults to "/"
      *
      * Examples:
      *
      *    // "Remember Me" for 15 minutes
      *    res.cookie('rememberme', '1', { expires: new Date(Date.now() + 900000), httpOnly: true });
      *
      *    // save as above
      *    res.cookie('rememberme', '1', { maxAge: 900000, httpOnly: true })
      */
    def cookie(name: String, `val`: String, options: CookieOptions): this.type = js.native
    def cookie(name: String, `val`: js.Any): this.type = js.native
    def cookie(name: String, `val`: js.Any, options: CookieOptions): this.type = js.native
    
    /**
      * Transfer the file at the given `path` as an attachment.
      *
      * Optionally providing an alternate attachment `filename`,
      * and optional callback `fn(err)`. The callback is invoked
      * when the data transfer is complete, or when an error has
      * ocurred. Be sure to check `res.headersSent` if you plan to respond.
      *
      * The optional options argument passes through to the underlying
      * res.sendFile() call, and takes the exact same parameters.
      *
      * This method uses `res.sendfile()`.
      */
    def download(path: String): Unit = js.native
    def download(path: String, filename: String): Unit = js.native
    def download(path: String, filename: String, fn: Errback): Unit = js.native
    def download(path: String, filename: String, options: js.Any): Unit = js.native
    def download(path: String, filename: String, options: js.Any, fn: Errback): Unit = js.native
    def download(path: String, fn: Errback): Unit = js.native
    
    /**
      * Respond to the Acceptable formats using an `obj`
      * of mime-type callbacks.
      *
      * This method uses `req.accepted`, an array of
      * acceptable types ordered by their quality values.
      * When "Accept" is not present the _first_ callback
      * is invoked, otherwise the first match is used. When
      * no match is performed the server responds with
      * 406 "Not Acceptable".
      *
      * Content-Type is set for you, however if you choose
      * you may alter this within the callback using `res.type()`
      * or `res.set('Content-Type', ...)`.
      *
      *    res.format({
      *      'text/plain': function(){
      *        res.send('hey');
      *      },
      *
      *      'text/html': function(){
      *        res.send('<p>hey</p>');
      *      },
      *
      *      'appliation/json': function(){
      *        res.send({ message: 'hey' });
      *      }
      *    });
      *
      * In addition to canonicalized MIME types you may
      * also use extnames mapped to these types:
      *
      *    res.format({
      *      text: function(){
      *        res.send('hey');
      *      },
      *
      *      html: function(){
      *        res.send('<p>hey</p>');
      *      },
      *
      *      json: function(){
      *        res.send({ message: 'hey' });
      *      }
      *    });
      *
      * By default Express passes an `Error`
      * with a `.status` of 406 to `next(err)`
      * if a match is not made. If you provide
      * a `.default` callback it will be invoked
      * instead.
      */
    def format(obj: js.Any): this.type = js.native
    
    /** Get value for header `field`. */
    def get(field: String): String = js.native
    
    def header(field: String): this.type = js.native
    def header(field: String, value: String): this.type = js.native
    def header(field: String, value: js.Array[String]): this.type = js.native
    def header(field: js.Any): this.type = js.native
    
    /**
      * Send JSON response.
      *
      * Examples:
      *
      *     res.json(null);
      *     res.json({ user: 'tj' });
      *     res.status(500).json('oh noes!');
      *     res.status(404).json('I dont have that');
      */
    def json(): this.type = js.native
    def json(body: ResBody): this.type = js.native
    /**
      * Send JSON response.
      *
      * Examples:
      *
      *     res.json(null);
      *     res.json({ user: 'tj' });
      *     res.status(500).json('oh noes!');
      *     res.status(404).json('I dont have that');
      */
    @JSName("json")
    var json_Original: Send[ResBody, this.type] = js.native
    
    /**
      * Send JSON response with JSONP callback support.
      *
      * Examples:
      *
      *     res.jsonp(null);
      *     res.jsonp({ user: 'tj' });
      *     res.status(500).jsonp('oh noes!');
      *     res.status(404).jsonp('I dont have that');
      */
    def jsonp(): this.type = js.native
    def jsonp(body: ResBody): this.type = js.native
    /**
      * Send JSON response with JSONP callback support.
      *
      * Examples:
      *
      *     res.jsonp(null);
      *     res.jsonp({ user: 'tj' });
      *     res.status(500).jsonp('oh noes!');
      *     res.status(404).jsonp('I dont have that');
      */
    @JSName("jsonp")
    var jsonp_Original: Send[ResBody, this.type] = js.native
    
    /**
      * Set Link header field with the given `links`.
      *
      * Examples:
      *
      *    res.links({
      *      next: 'http://api.example.com/users?page=2',
      *      last: 'http://api.example.com/users?page=5'
      *    });
      */
    def links(links: js.Any): this.type = js.native
    
    var locals: Record[String, js.Any] = js.native
    
    /**
      * Set the location header to `url`.
      *
      * The given `url` can also be the name of a mapped url, for
      * example by default express supports "back" which redirects
      * to the _Referrer_ or _Referer_ headers or "/".
      *
      * Examples:
      *
      *    res.location('/foo/bar').;
      *    res.location('http://example.com');
      *    res.location('../login'); // /blog/post/1 -> /blog/login
      *
      * Mounting:
      *
      *   When an application is mounted and `res.location()`
      *   is given a path that does _not_ lead with "/" it becomes
      *   relative to the mount-point. For example if the application
      *   is mounted at "/blog", the following would become "/blog/login".
      *
      *      res.location('login');
      *
      *   While the leading slash would result in a location of "/login":
      *
      *      res.location('/login');
      */
    def location(url: String): this.type = js.native
    
    def redirect(status: Double, url: String): Unit = js.native
    /**
      * Redirect to the given `url` with optional response `status`
      * defaulting to 302.
      *
      * The resulting `url` is determined by `res.location()`, so
      * it will play nicely with mounted apps, relative paths,
      * `"back"` etc.
      *
      * Examples:
      *
      *    res.redirect('/foo/bar');
      *    res.redirect('http://example.com');
      *    res.redirect(301, 'http://example.com');
      *    res.redirect('http://example.com', 301);
      *    res.redirect('../login'); // /blog/post/1 -> /blog/login
      */
    def redirect(url: String): Unit = js.native
    def redirect(url: String, status: Double): Unit = js.native
    
    /**
      * Render `view` with the given `options` and optional callback `fn`.
      * When a callback function is given a response will _not_ be made
      * automatically, otherwise a response of _200_ and _text/html_ is given.
      *
      * Options:
      *
      *  - `cache`     boolean hinting to the engine it should cache
      *  - `filename`  filename of the view being rendered
      */
    def render(view: String): Unit = js.native
    def render(view: String, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
    def render(view: String, options: js.Object): Unit = js.native
    def render(view: String, options: js.Object, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
    def render(view: String, options: Unit, callback: js.Function2[/* err */ Error, /* html */ String, Unit]): Unit = js.native
    
    /**
      * After middleware.init executed, Response will contain req property
      * See: express/lib/middleware/init.js
      */
    var req: js.UndefOr[Request[ParamsDictionary, js.Any, js.Any, ParsedQs]] = js.native
    
    /**
      * Send a response.
      *
      * Examples:
      *
      *     res.send(new Buffer('wahoo'));
      *     res.send({ some: 'json' });
      *     res.send('<p>some html</p>');
      *     res.status(404).send('Sorry, cant find that');
      */
    def send(): this.type = js.native
    def send(body: ResBody): this.type = js.native
    
    /**
      * Transfer the file at the given `path`.
      *
      * Automatically sets the _Content-Type_ response header field.
      * The callback `fn(err)` is invoked when the transfer is complete
      * or when an error occurs. Be sure to check `res.headersSent`
      * if you wish to attempt responding, as the header and some data
      * may have already been transferred.
      *
      * Options:
      *
      *   - `maxAge`   defaulting to 0 (can be string converted by `ms`)
      *   - `root`     root directory for relative filenames
      *   - `headers`  object of headers to serve with file
      *   - `dotfiles` serve dotfiles, defaulting to false; can be `"allow"` to send them
      *
      * Other options are passed along to `send`.
      *
      * Examples:
      *
      *  The following example illustrates how `res.sendFile()` may
      *  be used as an alternative for the `static()` middleware for
      *  dynamic situations. The code backing `res.sendFile()` is actually
      *  the same code, so HTTP cache support etc is identical.
      *
      *     app.get('/user/:uid/photos/:file', function(req, res){
      *       var uid = req.params.uid
      *         , file = req.params.file;
      *
      *       req.user.mayViewFilesFrom(uid, function(yes){
      *         if (yes) {
      *           res.sendFile('/uploads/' + uid + '/' + file);
      *         } else {
      *           res.send(403, 'Sorry! you cant see that.');
      *         }
      *       });
      *     });
      *
      * @api public
      */
    def sendFile(path: String): Unit = js.native
    def sendFile(path: String, fn: Errback): Unit = js.native
    def sendFile(path: String, options: js.Any): Unit = js.native
    def sendFile(path: String, options: js.Any, fn: Errback): Unit = js.native
    
    /**
      * Set the response HTTP status code to `statusCode` and send its string representation as the response body.
      * @link http://expressjs.com/4x/api.html#res.sendStatus
      *
      * Examples:
      *
      *    res.sendStatus(200); // equivalent to res.status(200).send('OK')
      *    res.sendStatus(403); // equivalent to res.status(403).send('Forbidden')
      *    res.sendStatus(404); // equivalent to res.status(404).send('Not Found')
      *    res.sendStatus(500); // equivalent to res.status(500).send('Internal Server Error')
      */
    def sendStatus(code: StatusCode): this.type = js.native
    
    /**
      * Send a response.
      *
      * Examples:
      *
      *     res.send(new Buffer('wahoo'));
      *     res.send({ some: 'json' });
      *     res.send('<p>some html</p>');
      *     res.status(404).send('Sorry, cant find that');
      */
    @JSName("send")
    var send_Original: Send[ResBody, this.type] = js.native
    
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String): Unit = js.native
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String, fn: Errback): Unit = js.native
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String, options: js.Any): Unit = js.native
    /**
      * @deprecated Use sendFile instead.
      */
    def sendfile(path: String, options: js.Any, fn: Errback): Unit = js.native
    
    def set(field: String): this.type = js.native
    def set(field: String, value: String): this.type = js.native
    def set(field: String, value: js.Array[String]): this.type = js.native
    /**
      * Set header `field` to `val`, or pass
      * an object of header fields.
      *
      * Examples:
      *
      *    res.set('Foo', ['bar', 'baz']);
      *    res.set('Accept', 'application/json');
      *    res.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
      *
      * Aliased as `res.header()`.
      */
    def set(field: js.Any): this.type = js.native
    
    /**
      * Set status `code`.
      */
    def status(code: StatusCode): this.type = js.native
    
    /**
      * Set _Content-Type_ response header with `type` through `mime.lookup()`
      * when it does not contain "/", or set the Content-Type to `type` otherwise.
      *
      * Examples:
      *
      *     res.type('.html');
      *     res.type('html');
      *     res.type('json');
      *     res.type('application/json');
      *     res.type('png');
      */
    def `type`(`type`: String): this.type = js.native
    
    /**
      * Adds the field to the Vary response header, if it is not there already.
      * Examples:
      *
      *     res.vary('User-Agent').render('docs');
      *
      */
    def vary(field: String): this.type = js.native
  }
  
  type Router = IRouter
  
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
  
  object global {
    
    object Express {
      
      trait Application extends StObject
      
      // These open interfaces may be extended in an application-specific manner via declaration merging.
      // See for example method-override.d.ts (https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/method-override/index.d.ts)
      trait Request extends StObject
      
      trait Response extends StObject
    }
  }
}
