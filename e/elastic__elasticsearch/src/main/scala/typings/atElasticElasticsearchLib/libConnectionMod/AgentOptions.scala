package typings
package atElasticElasticsearchLib.libConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var keepAlive: scala.Boolean
  var keepAliveMsecs: scala.Double
  var maxFreeSockets: scala.Double
  var maxSockets: scala.Double
}

object AgentOptions {
  @scala.inline
  def apply(
    keepAlive: scala.Boolean,
    keepAliveMsecs: scala.Double,
    maxFreeSockets: scala.Double,
    maxSockets: scala.Double
  ): AgentOptions = {
    val __obj = js.Dynamic.literal(keepAlive = keepAlive, keepAliveMsecs = keepAliveMsecs, maxFreeSockets = maxFreeSockets, maxSockets = maxSockets)
  
    __obj.asInstanceOf[AgentOptions]
  }
}

