package typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- js.Function because Inheritance from two classes. Inlined length, call, bind
- typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler because Inheritance from two classes. Inlined `<apply>`
- typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.IRouter because Inheritance from two classes. Inlined param, param, all, all, all, all_Original, get, get, get, get_Original, post, post, post, post_Original, put, put, put, put_Original, delete, delete, delete, delete_Original, patch, patch, patch, patch_Original, options, options, options, options_Original, head, head, head, head_Original, checkout, checkout, checkout, checkout_Original, connect, connect, connect, connect_Original, copy, copy, copy, copy_Original, lock, lock, lock, lock_Original, merge, merge, merge, merge_Original, mkactivity, mkactivity, mkactivity, mkactivity_Original, mkcol, mkcol, mkcol, mkcol_Original, move, move, move, move_Original, `m-search`, `m-search`, `m-search`, `m-search_Original`, notify, notify, notify, notify_Original, propfind, propfind, propfind, propfind_Original, proppatch, proppatch, proppatch, proppatch_Original, purge, purge, purge, purge_Original, report, report, report, report_Original, search, search, search, search_Original, subscribe, subscribe, subscribe, subscribe_Original, trace, trace, trace, trace_Original, unlock, unlock, unlock, unlock_Original, unsubscribe, unsubscribe, unsubscribe, unsubscribe_Original, use, use, use, use, use, use_Original, route, stack */ @js.native
trait Application
  extends EventEmitter
     with typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Application {
  /**
    * Used to get all registered routes in Express Application
    */
  var _router: js.Any = js.native
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    */
  @JSName("all")
  var all_Original: IRouterMatcher[this.type] = js.native
  @JSName("checkout")
  var checkout_Original: IRouterMatcher[this.type] = js.native
  @JSName("connect")
  var connect_Original: IRouterMatcher[this.type] = js.native
  @JSName("copy")
  var copy_Original: IRouterMatcher[this.type] = js.native
  @JSName("delete")
  var delete_Original: IRouterMatcher[this.type] = js.native
  @JSName("get")
  var get_Original: ((js.Function1[/* name */ String, _]) with IRouterMatcher[this.type]) | IRouterMatcher[this.type] = js.native
  @JSName("head")
  var head_Original: IRouterMatcher[this.type] = js.native
  var length: Int = js.native
  var locals: js.Any = js.native
  @JSName("lock")
  var lock_Original: IRouterMatcher[this.type] = js.native
  @JSName("m-search")
  var `m-search_Original`: IRouterMatcher[this.type] = js.native
  var map: js.Any = js.native
  @JSName("merge")
  var merge_Original: IRouterMatcher[this.type] = js.native
  @JSName("mkactivity")
  var mkactivity_Original: IRouterMatcher[this.type] = js.native
  @JSName("mkcol")
  var mkcol_Original: IRouterMatcher[this.type] = js.native
  /**
    * The app.mountpath property contains one or more path patterns on which a sub-app was mounted.
    */
  var mountpath: String | js.Array[String] = js.native
  @JSName("move")
  var move_Original: IRouterMatcher[this.type] = js.native
  @JSName("notify")
  var notify_Original: IRouterMatcher[this.type] = js.native
  @JSName("options")
  var options_Original: IRouterMatcher[this.type] = js.native
  @JSName("patch")
  var patch_Original: IRouterMatcher[this.type] = js.native
  @JSName("post")
  var post_Original: IRouterMatcher[this.type] = js.native
  @JSName("propfind")
  var propfind_Original: IRouterMatcher[this.type] = js.native
  @JSName("proppatch")
  var proppatch_Original: IRouterMatcher[this.type] = js.native
  @JSName("purge")
  var purge_Original: IRouterMatcher[this.type] = js.native
  @JSName("put")
  var put_Original: IRouterMatcher[this.type] = js.native
  @JSName("report")
  var report_Original: IRouterMatcher[this.type] = js.native
  var resource: js.Any = js.native
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
  @JSName("search")
  var search_Original: IRouterMatcher[this.type] = js.native
  var settings: js.Any = js.native
  /**
    * Stack of configured routes
    */
  var stack: js.Array[_] = js.native
  @JSName("subscribe")
  var subscribe_Original: IRouterMatcher[this.type] = js.native
  @JSName("trace")
  var trace_Original: IRouterMatcher[this.type] = js.native
  @JSName("unlock")
  var unlock_Original: IRouterMatcher[this.type] = js.native
  @JSName("unsubscribe")
  var unsubscribe_Original: IRouterMatcher[this.type] = js.native
  @JSName("use")
  var use_Original: (IRouterHandler[this.type] with IRouterMatcher[this.type]) | ApplicationRequestHandler[this.type] = js.native
  def apply(T0: /* req */ Request[ParamsDictionary], T1: /* res */ Response, T2: /* next */ NextFunction): js.Any = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def apply(req: Request[ParamsDictionary], res: Response): js.Any = js.native
  def apply(req: Request[ParamsDictionary], res: ServerResponse): js.Any = js.native
  def apply(req: IncomingMessage, res: Response): js.Any = js.native
  def apply(req: IncomingMessage, res: ServerResponse): js.Any = js.native
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
  def all[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def bind(thisArg: js.Any, argArray: js.Dynamic*): js.Any = js.native
  def call(thisArg: js.Any, argArray: js.Dynamic*): js.Any = js.native
  def checkout(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def checkout[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def connect(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def connect[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def copy(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def copy[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  /**
    * Initialize application configuration.
    */
  def defaultConfiguration(): Unit = js.native
  def delete(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def delete[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
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
      /* callback */ js.Function2[/* e */ js.Any, /* rendered */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  def get(name: String): js.Any = js.native
  def get(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def get[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def head(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def head[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  /**
    * Initialize the server.
    *
    *   - setup default configuration
    *   - setup default middleware
    *   - setup route reflection methods
    */
  def init(): Unit = js.native
  def listen(): Server = js.native
  def listen(callback: js.Function1[/* repeated */ js.Any, Unit]): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(path: String): Server = js.native
  def listen(path: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, callback: js.Function1[/* repeated */ js.Any, Unit]): Server = js.native
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
  def listen(
    port: Double,
    hostname: String,
    backlog: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): Server = js.native
  def listen(port: Double, hostname: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Server = js.native
  def lock(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def lock[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def `m-search`(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def `m-search`[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def merge(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def merge[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def mkactivity(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def mkactivity[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def mkcol(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def mkcol[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def move(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def move[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def notify(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def notify[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def options(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def options[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
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
  def patch[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
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
  def post[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def propfind(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def propfind[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def proppatch(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def proppatch[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def purge(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def purge[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def put(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def put[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
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
  def report(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def report[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def route(prefix: PathParams): IRoute = js.native
  def search(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def search[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
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
  def subscribe(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def subscribe[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def trace(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def trace[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def unlock(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def unlock[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def unsubscribe(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def unsubscribe[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
  def use(handlers: (RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary])*): this.type = js.native
  def use(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def use[P /* <: Params */](path: PathParams, handlers: (RequestHandler[P] | RequestHandlerParams[P])*): this.type = js.native
}

