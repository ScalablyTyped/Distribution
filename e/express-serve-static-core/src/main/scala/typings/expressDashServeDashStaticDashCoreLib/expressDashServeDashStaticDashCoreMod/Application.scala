package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.IRouter because Inheritance from two classes. Inlined param, param, all, all, all, all_Original, get, get, get, get_Original, post, post, post, post_Original, put, put, put, put_Original, delete, delete, delete, delete_Original, patch, patch, patch, patch_Original, options, options, options, options_Original, head, head, head, head_Original, checkout, checkout, checkout, checkout_Original, connect, connect, connect, connect_Original, copy, copy, copy, copy_Original, lock, lock, lock, lock_Original, merge, merge, merge, merge_Original, mkactivity, mkactivity, mkactivity, mkactivity_Original, mkcol, mkcol, mkcol, mkcol_Original, move, move, move, move_Original, `m-search`, `m-search`, `m-search`, `m-search_Original`, notify, notify, notify, notify_Original, propfind, propfind, propfind, propfind_Original, proppatch, proppatch, proppatch, proppatch_Original, purge, purge, purge, purge_Original, report, report, report, report_Original, search, search, search, search_Original, subscribe, subscribe, subscribe, subscribe_Original, trace, trace, trace, trace_Original, unlock, unlock, unlock, unlock_Original, unsubscribe, unsubscribe, unsubscribe, unsubscribe_Original, use, use, use, use, use, use_Original, route, stack */ @js.native
trait Application
  extends nodeLib.eventsMod.EventEmitter
     with expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Application {
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
  var get_Original: ((js.Function1[/* name */ java.lang.String, _]) with IRouterMatcher[this.type]) | IRouterMatcher[this.type] = js.native
  @JSName("head")
  var head_Original: IRouterMatcher[this.type] = js.native
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
  var mountpath: java.lang.String | js.Array[java.lang.String] = js.native
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
  var router: java.lang.String = js.native
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
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def apply(req: Request, res: Response): js.Any = js.native
  def apply(req: Request, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  def apply(req: nodeLib.httpMod.IncomingMessage, res: Response): js.Any = js.native
  def apply(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): js.Any = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    */
  def all(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    */
  def all(path: PathParams, subApplication: Application): this.type = js.native
  def checkout(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def checkout(path: PathParams, subApplication: Application): this.type = js.native
  def configure(
    env0: java.lang.String,
    env1: java.lang.String,
    env2: java.lang.String,
    env3: java.lang.String,
    env4: java.lang.String,
    fn: js.Function
  ): Application = js.native
  def configure(
    env0: java.lang.String,
    env1: java.lang.String,
    env2: java.lang.String,
    env3: java.lang.String,
    fn: js.Function
  ): Application = js.native
  def configure(env0: java.lang.String, env1: java.lang.String, env2: java.lang.String, fn: js.Function): Application = js.native
  def configure(env0: java.lang.String, env1: java.lang.String, fn: js.Function): Application = js.native
  def configure(env0: java.lang.String, fn: js.Function): Application = js.native
  /**
    * Configure callback for zero or more envs,
    * when no `env` is specified that callback will
    * be invoked for all environments. Any combination
    * can be used multiple times, in any order desired.
    *
    * Examples:
    *
    *    app.configure(function(){
    *      // executed for all envs
    *    });
    *
    *    app.configure('stage', function(){
    *      // executed staging env
    *    });
    *
    *    app.configure('stage', 'production', function(){
    *      // executed for stage and production
    *    });
    *
    * Note:
    *
    *  These callbacks are invoked immediately, and
    *  are effectively sugar for the following:
    *
    *     var env = process.env.NODE_ENV || 'development';
    *
    *      switch (env) {
    *        case 'development':
    *          ...
    *          break;
    *        case 'stage':
    *          ...
    *          break;
    *        case 'production':
    *          ...
    *          break;
    *      }
    */
  def configure(fn: js.Function): Application = js.native
  def connect(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def connect(path: PathParams, subApplication: Application): this.type = js.native
  def copy(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def copy(path: PathParams, subApplication: Application): this.type = js.native
  /**
    * Initialize application configuration.
    */
  def defaultConfiguration(): scala.Unit = js.native
  def delete(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def delete(path: PathParams, subApplication: Application): this.type = js.native
  /** Disable `setting`. */
  def disable(setting: java.lang.String): Application = js.native
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
  def disabled(setting: java.lang.String): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /** Enable `setting`. */
  def enable(setting: java.lang.String): Application = js.native
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
  def enabled(setting: java.lang.String): scala.Boolean = js.native
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
  def engine(ext: java.lang.String, fn: js.Function): Application = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def get(name: java.lang.String): js.Any = js.native
  def get(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def get(path: PathParams, subApplication: Application): this.type = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def head(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def head(path: PathParams, subApplication: Application): this.type = js.native
  /**
    * Initialize the server.
    *
    *   - setup default configuration
    *   - setup default middleware
    *   - setup route reflection methods
    */
  def init(): scala.Unit = js.native
  def listen(handle: js.Any): nodeLib.httpMod.Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): nodeLib.httpMod.Server = js.native
  def listen(path: java.lang.String): nodeLib.httpMod.Server = js.native
  def listen(path: java.lang.String, callback: js.Function): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, callback: js.Function): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): nodeLib.httpMod.Server = js.native
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
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double, callback: js.Function): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, callback: js.Function): nodeLib.httpMod.Server = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def lock(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def lock(path: PathParams, subApplication: Application): this.type = js.native
  def `m-search`(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def `m-search`(path: PathParams, subApplication: Application): this.type = js.native
  def merge(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def merge(path: PathParams, subApplication: Application): this.type = js.native
  def mkactivity(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def mkactivity(path: PathParams, subApplication: Application): this.type = js.native
  def mkcol(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def mkcol(path: PathParams, subApplication: Application): this.type = js.native
  def move(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def move(path: PathParams, subApplication: Application): this.type = js.native
  def notify(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def notify(path: PathParams, subApplication: Application): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def options(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def options(path: PathParams, subApplication: Application): this.type = js.native
  /**
    * Alternatively, you can pass only a callback, in which case you have the opportunity to alter the app.param()
    *
    * @deprecated since version 4.11
    */
  def param(
    callback: js.Function2[/* name */ java.lang.String, /* matcher */ stdLib.RegExp, RequestParamHandler]
  ): this.type = js.native
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
  def param(name: java.lang.String, handler: RequestParamHandler): this.type = js.native
  def param(name: js.Array[java.lang.String], handler: RequestParamHandler): this.type = js.native
  def patch(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def patch(path: PathParams, subApplication: Application): this.type = js.native
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
  def path(): java.lang.String = js.native
  def post(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def post(path: PathParams, subApplication: Application): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def propfind(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def propfind(path: PathParams, subApplication: Application): this.type = js.native
  def proppatch(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def proppatch(path: PathParams, subApplication: Application): this.type = js.native
  def purge(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def purge(path: PathParams, subApplication: Application): this.type = js.native
  def put(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def put(path: PathParams, subApplication: Application): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  def render(name: java.lang.String): scala.Unit = js.native
  def render(
    name: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def render(name: java.lang.String, options: js.Object): scala.Unit = js.native
  def render(
    name: java.lang.String,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def report(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def report(path: PathParams, subApplication: Application): this.type = js.native
  def route(prefix: PathParams): IRoute = js.native
  def search(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def search(path: PathParams, subApplication: Application): this.type = js.native
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
  def set(setting: java.lang.String, `val`: js.Any): Application = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def subscribe(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def subscribe(path: PathParams, subApplication: Application): this.type = js.native
  def trace(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def trace(path: PathParams, subApplication: Application): this.type = js.native
  def unlock(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def unlock(path: PathParams, subApplication: Application): this.type = js.native
  def unsubscribe(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def unsubscribe(path: PathParams, subApplication: Application): this.type = js.native
  def use(handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def use(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def use(path: PathParams, subApplication: Application): this.type = js.native
}

