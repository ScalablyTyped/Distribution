package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aborted[TContext] extends js.Object {
  var aborted: Boolean
  var attempts: Double
  var connection: default
  var context: TContext
  var name: String
  var request: Options
  var sniff: js.UndefOr[Hosts] = js.undefined
}

object Aborted {
  @scala.inline
  def apply[TContext](
    aborted: Boolean,
    attempts: Double,
    connection: default,
    context: TContext,
    name: String,
    request: Options,
    sniff: Hosts = null
  ): Aborted[TContext] = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (sniff != null) __obj.updateDynamic("sniff")(sniff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted[TContext]]
  }
}

