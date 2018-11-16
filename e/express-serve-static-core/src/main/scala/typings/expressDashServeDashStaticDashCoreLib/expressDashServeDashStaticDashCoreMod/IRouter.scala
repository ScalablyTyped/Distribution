package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouter extends RequestHandler {
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
  var get_Original: IRouterMatcher[this.type] = js.native
  @JSName("head")
  var head_Original: IRouterMatcher[this.type] = js.native
  @JSName("lock")
  var lock_Original: IRouterMatcher[this.type] = js.native
  @JSName("m-search")
  var `m-search_Original`: IRouterMatcher[this.type] = js.native
  @JSName("merge")
  var merge_Original: IRouterMatcher[this.type] = js.native
  @JSName("mkactivity")
  var mkactivity_Original: IRouterMatcher[this.type] = js.native
  @JSName("mkcol")
  var mkcol_Original: IRouterMatcher[this.type] = js.native
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
  @JSName("search")
  var search_Original: IRouterMatcher[this.type] = js.native
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
  var use_Original: IRouterHandler[this.type] with IRouterMatcher[this.type] = js.native
  /**
       * Special-cased "all" method, applying the given route `path`,
       * middleware, and callback to _every_ HTTP method.
       */
  def all(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def checkout(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def connect(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def copy(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def delete(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def get(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def head(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def lock(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def `m-search`(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def merge(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def mkactivity(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def mkcol(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def move(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def notify(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def options(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
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
  def patch(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def post(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def propfind(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def proppatch(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def purge(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def put(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def report(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def route(prefix: PathParams): IRoute = js.native
  def search(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def subscribe(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def trace(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def unlock(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def unsubscribe(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def use(handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
  def use(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type = js.native
}

