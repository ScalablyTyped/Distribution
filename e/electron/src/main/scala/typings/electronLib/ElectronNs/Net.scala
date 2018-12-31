package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Net extends EventEmitter {
  def request(options: java.lang.String): ClientRequest = js.native
  // Docs: http://electronjs.org/docs/api/net
  /**
    * Creates a ClientRequest instance using the provided options which are directly
    * forwarded to the ClientRequest constructor. The net.request method would be used
    * to issue both secure and insecure HTTP requests according to the specified
    * protocol scheme in the options object.
    */
  def request(options: js.Any): ClientRequest = js.native
}

