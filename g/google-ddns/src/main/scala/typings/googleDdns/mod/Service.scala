package typings.googleDdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-ddns", "Service")
@js.native
class Service protected () extends js.Object {
  def this(options: ServiceOptions) = this()
  
  /**
    * Start the service time interval.
    */
  def start(): Unit = js.native
}
