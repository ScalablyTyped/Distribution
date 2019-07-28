package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>The HTTP server request</p>
* 
* @url http://www.espruino.com/Reference#httpSRq
*/
@js.native
trait httpSRq extends /**
  * 
  * @return  
  */
Instantiable0[httpSRq] {
  /**
    * <p>Return how many bytes are available to read. If there is already a listener for data, this will always return 0.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_httpSRq_available
    */
  def available(): Double = js.native
  /**
    * <p>Pipe this to a stream (an object with a &#39;write&#39; method)</p>
    * 
    * @param destination 
    * @param options 
    * @url http://www.espruino.com/Reference#l_httpSRq_pipe
    */
  def pipe(destination: js.Any, options: js.Any): Unit = js.native
  /**
    * <p>Return a string containing characters that have been received</p>
    * 
    * @param chars 
    * @return  
    * @url http://www.espruino.com/Reference#l_httpSRq_read
    */
  def read(chars: Double): js.Any = js.native
}

