package typings.easyXHeaders.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http", "Agent")
@js.native
class Agent () extends js.Object {
  def this(opts: AgentOptions) = this()
  
  /**
  		 * Destroy any sockets that are currently in use by the agent.
  		 * It is usually not necessary to do this. However, if you are using an agent with KeepAlive enabled,
  		 * then it is best to explicitly shut down the agent when you know that it will no longer be used. Otherwise,
  		 * sockets may hang open for quite a long time before the server terminates them.
  		 */
  def destroy(): Unit = js.native
  
  var maxSockets: Double = js.native
  
  var requests: js.Any = js.native
  
  var sockets: js.Any = js.native
}
