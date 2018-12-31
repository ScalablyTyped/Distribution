package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("http")
@js.native
object httpNs extends js.Object {
  /**
    * <p>Create an HTTP Server</p>
    * <p>When a request to the server is made, the callback is called. In the callback you can use the methods on the response (httpSRs) to send data. You can also add <code>request.on(&#39;data&#39;,function() { ... })</code> to listen for POSTed data</p>
    * 
    * @param callback 
    * @return  
    * @url http://www.espruino.com/Reference#l_http_createServer
    */
  def createServer(callback: js.Any): espruinoLib.httpSrv = js.native
}

