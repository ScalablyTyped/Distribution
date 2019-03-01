package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastifyRequest[HttpRequest, Query, Params, Headers, Body] extends js.Object {
  def jwtVerify(): js.Promise[_] = js.native
  def jwtVerify(callback: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback): js.Promise[_] = js.native
}

