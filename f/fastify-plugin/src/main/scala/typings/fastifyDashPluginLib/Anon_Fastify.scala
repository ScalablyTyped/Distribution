package typings
package fastifyDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fastify extends js.Object {
  var fastify: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reply: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var request: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Fastify {
  @scala.inline
  def apply(
    fastify: js.Array[java.lang.String] = null,
    reply: js.Array[java.lang.String] = null,
    request: js.Array[java.lang.String] = null
  ): Anon_Fastify = {
    val __obj = js.Dynamic.literal()
    if (fastify != null) __obj.updateDynamic("fastify")(fastify)
    if (reply != null) __obj.updateDynamic("reply")(reply)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Anon_Fastify]
  }
}

