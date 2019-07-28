package typings.atElasticElasticsearch.libConnectionMod

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
    val __obj = js.Dynamic.literal(keepAlive = keepAlive, keepAliveMsecs = keepAliveMsecs, maxFreeSockets = maxFreeSockets, maxSockets = maxSockets)
  
    __obj.asInstanceOf[AgentOptions]
  }
}

