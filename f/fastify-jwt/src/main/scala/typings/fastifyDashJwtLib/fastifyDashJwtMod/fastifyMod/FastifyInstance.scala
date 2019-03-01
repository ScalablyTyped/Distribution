package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyInstance[HttpServer, HttpRequest, HttpResponse] extends js.Object {
  var jwt: Jwt
}

object FastifyInstance {
  @scala.inline
  def apply[HttpServer, HttpRequest, HttpResponse](jwt: Jwt): FastifyInstance[HttpServer, HttpRequest, HttpResponse] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jwt")(jwt)
    __obj.asInstanceOf[FastifyInstance[HttpServer, HttpRequest, HttpResponse]]
  }
}

