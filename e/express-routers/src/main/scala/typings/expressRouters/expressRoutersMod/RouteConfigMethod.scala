package typings.expressRouters.expressRoutersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressRouters.expressRoutersStrings.GET
  - typings.expressRouters.expressRoutersStrings.POST
  - typings.expressRouters.expressRoutersStrings.PUT
  - typings.expressRouters.expressRoutersStrings.PATCH
  - typings.expressRouters.expressRoutersStrings.DELETE
*/
trait RouteConfigMethod extends js.Object

object RouteConfigMethod {
  @scala.inline
  def DELETE: typings.expressRouters.expressRoutersStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.expressRouters.expressRoutersStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.expressRouters.expressRoutersStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.expressRouters.expressRoutersStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.expressRouters.expressRoutersStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

