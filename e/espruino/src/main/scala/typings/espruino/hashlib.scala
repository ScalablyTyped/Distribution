package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("hashlib")
@js.native
object hashlib extends js.Object {
  /**
  * <p><strong>Note:</strong> This library is currently only included in builds for the original Espruino boards.
  * For other boards you will have to make build your own firmware.</p>
  * 
  * @url http://www.espruino.com/Reference#l_hashlib_undefined
  */
  def apply(): Unit = js.native
  /**
    * 
    * @param message 
    * @return  
    * @url http://www.espruino.com/Reference#l_hashlib_sha224
    */
  def sha224(message: js.Any): HASH = js.native
  /**
    * 
    * @param message 
    * @return  
    * @url http://www.espruino.com/Reference#l_hashlib_sha256
    */
  def sha256(message: js.Any): HASH = js.native
}

