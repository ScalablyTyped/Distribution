package typings
package easyDashXDashHeadersLib.expressMod.eNs

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
    all: js.Function1[/* repeated */ RequestHandler, IRoute],
    delete: js.Function1[/* repeated */ RequestHandler, IRoute],
    get: js.Function1[/* repeated */ RequestHandler, IRoute],
    options: js.Function1[/* repeated */ RequestHandler, IRoute],
    patch: js.Function1[/* repeated */ RequestHandler, IRoute],
    path: java.lang.String,
    post: js.Function1[/* repeated */ RequestHandler, IRoute],
    put: js.Function1[/* repeated */ RequestHandler, IRoute],
    stack: js.Any
  ): IRoute = {
    val __obj = js.Dynamic.literal(all = all, delete = delete, get = get, options = options, patch = patch, path = path, post = post, put = put, stack = stack)
  
    __obj.asInstanceOf[IRoute]
  }
}

