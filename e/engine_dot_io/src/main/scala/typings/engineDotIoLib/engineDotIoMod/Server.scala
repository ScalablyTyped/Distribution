package typings
package engineDotIoLib.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The main server/manager. Inherits from EventEmitter.
	 */
@JSImport("engine.io", "Server")
@js.native
class Server ()
  extends engineDotIoLib.engineDotIoMod.engineNs.Server {
  /**
  		 * Initializes the server
  		 */
  def this(opts: engineDotIoLib.engineDotIoMod.engineNs.ServerOptions) = this()
}

