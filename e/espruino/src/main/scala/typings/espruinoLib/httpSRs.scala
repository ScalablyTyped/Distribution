package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>The HTTP server response</p>
* 
* @url http://www.espruino.com/Reference#httpSRs
*/
@js.native
trait httpSRs
  extends /**
  * 
  * @return  
  */
org.scalablytyped.runtime.Instantiable0[httpSRs] {
  /**
    * <p>See <code>Socket.write</code> for more information about the data argument</p>
    * 
    * @param data 
    * @url http://www.espruino.com/Reference#l_httpSRs_end
    */
  def end(data: js.Any): scala.Unit = js.native
  /**
    * <p>This function writes the <code>data</code> argument as a string. Data that is passed in
    * (including arrays) will be converted to a string with the normal JavaScript 
    * <code>toString</code> method. For more information about sending binary data see <code>Socket.write</code></p>
    * 
    * @param data 
    * @return  
    * @url http://www.espruino.com/Reference#l_httpSRs_write
    */
  def write(data: js.Any): scala.Boolean = js.native
  /**
    * 
    * @param statusCode 
    * @param headers 
    * @url http://www.espruino.com/Reference#l_httpSRs_writeHead
    */
  def writeHead(statusCode: scala.Double, headers: js.Any): scala.Unit = js.native
}

