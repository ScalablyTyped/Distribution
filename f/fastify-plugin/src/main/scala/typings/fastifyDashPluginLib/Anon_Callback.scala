package typings
package fastifyDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[HttpServer, HttpRequest, HttpResponse, T] extends js.Object {
  @JSName("default")
  var default_Original: fastifyLib.fastifyMod.fastifyNs.Plugin[HttpServer, HttpRequest, HttpResponse, T] = js.native
  def default(
    instance: fastifyLib.fastifyMod.fastifyNs.FastifyInstance[HttpServer, HttpRequest, HttpResponse],
    opts: T,
    callback: js.Function1[/* err */ js.UndefOr[fastifyLib.fastifyMod.fastifyNs.FastifyError], scala.Unit]
  ): scala.Unit = js.native
}

