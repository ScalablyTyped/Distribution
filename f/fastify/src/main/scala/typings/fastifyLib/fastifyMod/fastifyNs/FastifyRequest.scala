package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * fastify's wrapped version of node.js IncomingMessage
  */
trait FastifyRequest[HttpRequest, Query, Params, Headers, Body] extends js.Object {
  var body: Body
  var headers: Headers
  var hostname: java.lang.String
  var id: js.Any
  var ip: java.lang.String
  var log: Logger
  var params: Params
  var query: Query
  var raw: HttpRequest
  var req: HttpRequest
}

object FastifyRequest {
  @scala.inline
  def apply[HttpRequest, Query, Params, Headers, Body](
    body: Body,
    headers: Headers,
    hostname: java.lang.String,
    id: js.Any,
    ip: java.lang.String,
    log: Logger,
    params: Params,
    query: Query,
    raw: HttpRequest,
    req: HttpRequest
  ): FastifyRequest[HttpRequest, Query, Params, Headers, Body] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyRequest[HttpRequest, Query, Params, Headers, Body]]
  }
}

