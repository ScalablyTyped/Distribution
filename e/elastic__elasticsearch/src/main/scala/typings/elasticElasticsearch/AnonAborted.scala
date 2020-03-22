package typings.elasticElasticsearch

import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAborted[C] extends js.Object {
  var aborted: Boolean
  var attempts: Double
  var connection: default
  var context: C
  var name: String
  var request: AnonOptions
  var sniff: js.UndefOr[AnonHosts] = js.undefined
}

object AnonAborted {
  @scala.inline
  def apply[C](
    aborted: Boolean,
    attempts: Double,
    connection: default,
    context: C,
    name: String,
    request: AnonOptions,
    sniff: AnonHosts = null
  ): AnonAborted[C] = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (sniff != null) __obj.updateDynamic("sniff")(sniff.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAborted[C]]
  }
}

