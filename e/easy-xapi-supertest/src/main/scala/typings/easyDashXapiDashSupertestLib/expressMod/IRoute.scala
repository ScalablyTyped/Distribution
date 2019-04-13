package typings
package easyDashXapiDashSupertestLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute extends js.Object {
  var path: java.lang.String
  var stack: js.Any
  def all(handler: RequestHandler*): IRoute
  def delete(handler: RequestHandler*): IRoute
  def get(handler: RequestHandler*): IRoute
  def options(handler: RequestHandler*): IRoute
  def patch(handler: RequestHandler*): IRoute
  def post(handler: RequestHandler*): IRoute
  def put(handler: RequestHandler*): IRoute
}

object IRoute {
  @scala.inline
  def apply(
    all: /* repeated */ RequestHandler => IRoute,
    delete: /* repeated */ RequestHandler => IRoute,
    get: /* repeated */ RequestHandler => IRoute,
    options: /* repeated */ RequestHandler => IRoute,
    patch: /* repeated */ RequestHandler => IRoute,
    path: java.lang.String,
    post: /* repeated */ RequestHandler => IRoute,
    put: /* repeated */ RequestHandler => IRoute,
    stack: js.Any
  ): IRoute = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), options = js.Any.fromFunction1(options), patch = js.Any.fromFunction1(patch), path = path, post = js.Any.fromFunction1(post), put = js.Any.fromFunction1(put), stack = stack)
  
    __obj.asInstanceOf[IRoute]
  }
}

