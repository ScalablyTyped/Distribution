package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aborted[C] extends js.Object {
  var aborted: scala.Boolean
  var attempts: scala.Double
  var connection: atElasticElasticsearchLib.libConnectionMod.default
  var context: C
  var name: java.lang.String
  var request: Anon_IdOptions
  var sniff: js.UndefOr[Anon_Hosts] = js.undefined
}

object Anon_Aborted {
  @scala.inline
  def apply[C](
    aborted: scala.Boolean,
    attempts: scala.Double,
    connection: atElasticElasticsearchLib.libConnectionMod.default,
    context: C,
    name: java.lang.String,
    request: Anon_IdOptions,
    sniff: Anon_Hosts = null
  ): Anon_Aborted[C] = {
    val __obj = js.Dynamic.literal(aborted = aborted, attempts = attempts, connection = connection, context = context.asInstanceOf[js.Any], name = name, request = request)
    if (sniff != null) __obj.updateDynamic("sniff")(sniff)
    __obj.asInstanceOf[Anon_Aborted[C]]
  }
}

