package typings.expressServeStaticCore.mod

import typings.expressServeStaticCore.expressServeStaticCoreStrings.all
import typings.expressServeStaticCore.expressServeStaticCoreStrings.delete
import typings.expressServeStaticCore.expressServeStaticCoreStrings.get
import typings.expressServeStaticCore.expressServeStaticCoreStrings.head
import typings.expressServeStaticCore.expressServeStaticCoreStrings.options
import typings.expressServeStaticCore.expressServeStaticCoreStrings.patch
import typings.expressServeStaticCore.expressServeStaticCoreStrings.post
import typings.expressServeStaticCore.expressServeStaticCoreStrings.put
import typings.qs.mod.ParsedQs
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouter
  extends RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] {
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    */
  @JSName("all")
  var all_Original: IRouterMatcher[this.type, all] = js.native
  @JSName("checkout")
  var checkout_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("connect")
  var connect_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("copy")
  var copy_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("delete")
  var delete_Original: IRouterMatcher[this.type, delete] = js.native
  @JSName("get")
  var get_Original: IRouterMatcher[this.type, get] = js.native
  @JSName("head")
  var head_Original: IRouterMatcher[this.type, head] = js.native
  @JSName("lock")
  var lock_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("m-search")
  var `m-search_Original`: IRouterMatcher[this.type, _] = js.native
  @JSName("merge")
  var merge_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("mkactivity")
  var mkactivity_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("mkcol")
  var mkcol_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("move")
  var move_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("notify")
  var notify_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("options")
  var options_Original: IRouterMatcher[this.type, options] = js.native
  @JSName("patch")
  var patch_Original: IRouterMatcher[this.type, patch] = js.native
  @JSName("post")
  var post_Original: IRouterMatcher[this.type, post] = js.native
  @JSName("propfind")
  var propfind_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("proppatch")
  var proppatch_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("purge")
  var purge_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("put")
  var put_Original: IRouterMatcher[this.type, put] = js.native
  @JSName("report")
  var report_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("search")
  var search_Original: IRouterMatcher[this.type, _] = js.native
  /**
    * Stack of configured routes
    */
  var stack: js.Array[_] = js.native
  @JSName("subscribe")
  var subscribe_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("trace")
  var trace_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("unlock")
  var unlock_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("unsubscribe")
  var unsubscribe_Original: IRouterMatcher[this.type, _] = js.native
  @JSName("use")
  var use_Original: IRouterHandler[this.type] with (IRouterMatcher[this.type, _]) = js.native
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
  def all[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def checkout(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def checkout[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def connect(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def connect[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def copy(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def copy[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def delete(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def delete[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def get(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def get[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def head(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def head[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def lock(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def lock[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def `m-search`(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def `m-search`[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def merge(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def merge[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def mkactivity(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def mkactivity[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def mkcol(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def mkcol[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def move(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def move[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def notify(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def notify[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def options(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def options[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
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
  def patch[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def post(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def post[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def propfind(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def propfind[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def proppatch(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def proppatch[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def purge(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def purge[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def put(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def put[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def report(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def report[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def route(prefix: PathParams): IRoute = js.native
  def search(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def search[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def subscribe(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def subscribe[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def trace(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def trace[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def unlock(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def unlock[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def unsubscribe(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def unsubscribe[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
  def use(
    handlers: ((RequestHandler[ParamsDictionary, _, _, ParsedQs]) | (RequestHandlerParams[ParamsDictionary, _, _, ParsedQs]))*
  ): this.type = js.native
  def use(path: PathParams, subApplication: Application): this.type = js.native
  // tslint:disable-next-line no-unnecessary-generics (This generic is meant to be passed explicitly.)
  def use[P /* <: Params */, ResBody, ReqBody, ReqQuery](
    path: PathParams,
    handlers: ((RequestHandler[P, ResBody, ReqBody, ReqQuery]) | (RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]))*
  ): this.type = js.native
}

