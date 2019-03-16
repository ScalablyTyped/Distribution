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
  var ips: js.Array[java.lang.String]
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
    ips: js.Array[java.lang.String],
    log: Logger,
    params: Params,
    query: Query,
    raw: HttpRequest,
    req: HttpRequest
  ): FastifyRequest[HttpRequest, Query, Params, Headers, Body] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname, id = id, ip = ip, ips = ips, log = log, params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FastifyRequest[HttpRequest, Query, Params, Headers, Body]]
  }
}

