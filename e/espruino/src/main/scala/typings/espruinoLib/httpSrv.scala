package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>The HTTP server created by <code>require(&#39;http&#39;).createServer</code></p>
* 
* @url http://www.espruino.com/Reference#httpSrv
*/
@js.native
trait httpSrv
  extends /**
     * 
     * @return  
     */
org.scalablytyped.runtime.Instantiable0[httpSrv] {
  /**
       * <p>Stop listening for new HTTP connections</p>
       * 
       * @url http://www.espruino.com/Reference#l_httpSrv_close
       */
  def close(): scala.Unit = js.native
  /**
       * <p>Start listening for new HTTP connections on the given port</p>
       * 
       * @param port 
       * @url http://www.espruino.com/Reference#l_httpSrv_listen
       */
  def listen(port: scala.Double): scala.Unit = js.native
}

