package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Route configuration options such as "url" and "method"
  */
@js.native
trait RouteOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] extends RouteShorthandOptions[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] {
  @JSName("handler")
  var handler_Original: RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body] = js.native
  var method: HTTPMethod | js.Array[HTTPMethod] = js.native
  var url: java.lang.String = js.native
  def handler(
    request: FastifyRequest[HttpRequest, Query, Params, Headers, Body],
    reply: FastifyReply[HttpResponse]
  ): scala.Unit | js.Promise[_] = js.native
}

