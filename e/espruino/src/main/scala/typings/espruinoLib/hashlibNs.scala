package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("hashlib")
@js.native
object hashlibNs extends js.Object {
  /**
       * 
       * @param message 
       * @return  
       * @url http://www.espruino.com/Reference#l_hashlib_sha224
       */
  def sha224(message: js.Any): espruinoLib.HASH = js.native
  /**
       * 
       * @param message 
       * @return  
       * @url http://www.espruino.com/Reference#l_hashlib_sha256
       */
  def sha256(message: js.Any): espruinoLib.HASH = js.native
}

