package typings
package easyDashXapiDashSupertestLib.expressMod.eNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("post")(post)
    __obj.updateDynamic("put")(put)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[IRoute]
  }
}

