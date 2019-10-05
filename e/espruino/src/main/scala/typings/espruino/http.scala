package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("http")
@js.native
object http extends js.Object {
  /**
  * <p>This library allows you to create http servers and make http requests</p>
  * <p>In order to use this, you will need an extra module to get network connectivity such as the <a href="/CC3000">TI CC3000</a> or <a href="/WIZnet">WIZnet W5500</a>.</p>
  * <p>This is designed to be a cut-down version of the <a href="http://nodejs.org/api/http.html">node.js library</a>. Please see the <a href="/Internet">Internet</a> page for more information on how to use it.</p>
  * 
  * @url http://www.espruino.com/Reference#l_http_undefined
  */
  def apply(): Unit = js.native
  /**
    * <p>Create an HTTP Server</p>
    * <p>When a request to the server is made, the callback is called. In the callback you can use the methods on the response (httpSRs) to send data. You can also add <code>request.on(&#39;data&#39;,function() { ... })</code> to listen for POSTed data</p>
    * 
    * @param callback 
    * @return  
    * @url http://www.espruino.com/Reference#l_http_createServer
    */
  def createServer(callback: js.Any): httpSrv = js.native
}

