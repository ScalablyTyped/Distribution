package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>The socket server created by <code>require(&#39;net&#39;).createServer</code></p>
* 
* @url http://www.espruino.com/Reference#Server
*/
@js.native
trait Server
  extends /**
     * 
     * @return  
     */
ScalablyTyped.runtime.Instantiable0[Server] {
  /**
       * <p>Stop listening for new connections</p>
       * 
       * @url http://www.espruino.com/Reference#l_Server_close
       */
  def close(): scala.Unit = js.native
  /**
       * <p>Start listening for new connections on the given port</p>
       * 
       * @param port 
       * @url http://www.espruino.com/Reference#l_Server_listen
       */
  def listen(port: scala.Double): scala.Unit = js.native
}

