package typings.elasticElasticsearch.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var keepAlive: Boolean
  var keepAliveMsecs: Double
  var maxFreeSockets: Double
  var maxSockets: Double
}

object AgentOptions {
  @scala.inline
  def apply(keepAlive: Boolean, keepAliveMsecs: Double, maxFreeSockets: Double, maxSockets: Double): AgentOptions = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive.asInstanceOf[js.Any], keepAliveMsecs = keepAliveMsecs.asInstanceOf[js.Any], maxFreeSockets = maxFreeSockets.asInstanceOf[js.Any], maxSockets = maxSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
}

