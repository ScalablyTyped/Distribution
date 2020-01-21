package typings.easyXHeaders.expressMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouter[T] extends RequestHandler {
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    *
    * @param path
    * @param fn
    */
  @JSName("all")
  var all_Original: IRouterMatcher[T] = js.native
  @JSName("delete")
  var delete_Original: IRouterMatcher[T] = js.native
  @JSName("get")
  var get_Original: IRouterMatcher[T] = js.native
  @JSName("options")
  var options_Original: IRouterMatcher[T] = js.native
  @JSName("patch")
  var patch_Original: IRouterMatcher[T] = js.native
  @JSName("post")
  var post_Original: IRouterMatcher[T] = js.native
  @JSName("put")
  var put_Original: IRouterMatcher[T] = js.native
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    *
    * @param path
    * @param fn
    */
  def all(name: String, handlers: RequestHandler*): T = js.native
  /**
    * Special-cased "all" method, applying the given route `path`,
    * middleware, and callback to _every_ HTTP method.
    *
    * @param path
    * @param fn
    */
  def all(name: RegExp, handlers: RequestHandler*): T = js.native
  def delete(name: String, handlers: RequestHandler*): T = js.native
  def delete(name: RegExp, handlers: RequestHandler*): T = js.native
  def get(name: String, handlers: RequestHandler*): T = js.native
  def get(name: RegExp, handlers: RequestHandler*): T = js.native
  def options(name: String, handlers: RequestHandler*): T = js.native
  def options(name: RegExp, handlers: RequestHandler*): T = js.native
  // Alternatively, you can pass only a callback, in which case you have the opportunity to alter the app.param() API
  def param(callback: js.Function2[/* name */ String, /* matcher */ RegExp, RequestParamHandler]): T = js.native
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
    *
    * @param name
    * @param fn
    */
  def param(name: String, handler: RequestParamHandler): T = js.native
  def param(name: String, mapper: js.Function1[/* param */ js.Any, _]): T = js.native
  def param(name: String, matcher: RegExp): T = js.native
  def patch(name: String, handlers: RequestHandler*): T = js.native
  def patch(name: RegExp, handlers: RequestHandler*): T = js.native
  def post(name: String, handlers: RequestHandler*): T = js.native
  def post(name: RegExp, handlers: RequestHandler*): T = js.native
  def put(name: String, handlers: RequestHandler*): T = js.native
  def put(name: RegExp, handlers: RequestHandler*): T = js.native
  def route(path: String): IRoute = js.native
  def use(handler: RequestHandler*): T = js.native
  def use(handler: ErrorRequestHandler): T = js.native
  def use(path: String, handler: RequestHandler*): T = js.native
  def use(path: String, handler: ErrorRequestHandler): T = js.native
}

