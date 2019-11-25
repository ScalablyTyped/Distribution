package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.libConnectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aborted[C] extends js.Object {
  var aborted: Boolean
  var attempts: Double
  var connection: default
  var context: C
  var name: String
  var request: Anon_IdOptions
  var sniff: js.UndefOr[Anon_Hosts] = js.undefined
}

object Anon_Aborted {
  @scala.inline
  def apply[C](
    aborted: Boolean,
    attempts: Double,
    connection: default,
    context: C,
    name: String,
    request: Anon_IdOptions,
    sniff: Anon_Hosts = null
  ): Anon_Aborted[C] = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (sniff != null) __obj.updateDynamic("sniff")(sniff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aborted[C]]
  }
}

