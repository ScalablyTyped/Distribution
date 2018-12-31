package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>An actual socket connection - allowing transmit/receive of TCP data</p>
* 
* @url http://www.espruino.com/Reference#Socket
*/
@js.native
trait Socket
  extends /**
  * 
  * @return  
  */
org.scalablytyped.runtime.Instantiable0[Socket] {
  /**
    * <p>Return how many bytes are available to read. If there is already a listener for data, this will always return 0.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Socket_available
    */
  def available(): scala.Double = js.native
  /**
    * <p>Close this socket - optional data to append as an argument.</p>
    * <p>See <code>Socket.write</code> for more information about the data argument</p>
    * 
    * @param data 
    * @url http://www.espruino.com/Reference#l_Socket_end
    */
  def end(data: js.Any): scala.Unit = js.native
  /**
    * <p>Pipe this to a stream (an object with a &#39;write&#39; method)</p>
    * 
    * @param destination 
    * @param options 
    * @url http://www.espruino.com/Reference#l_Socket_pipe
    */
  def pipe(destination: js.Any, options: js.Any): scala.Unit = js.native
  /**
    * <p>Return a string containing characters that have been received</p>
    * 
    * @param chars 
    * @return  
    * @url http://www.espruino.com/Reference#l_Socket_read
    */
  def read(chars: scala.Double): js.Any = js.native
}

