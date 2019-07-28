package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("net")
@js.native
object netNs extends js.Object {
  /**
    * <p>Create a socket connection</p>
    * 
    * @param options 
    * @param callback 
    * @return  
    * @url http://www.espruino.com/Reference#l_net_connect
    */
  def connect(options: js.Any, callback: js.Any): Socket = js.native
  /**
    * <p>Create a Server</p>
    * <p>When a request to the server is made, the callback is called. In the callback you can use the methods on the connection to send data. You can also add <code>connection.on(&#39;data&#39;,function() { ... })</code> to listen for received data</p>
    * 
    * @param callback 
    * @return  
    * @url http://www.espruino.com/Reference#l_net_createServer
    */
  def createServer(callback: js.Any): Server = js.native
}

