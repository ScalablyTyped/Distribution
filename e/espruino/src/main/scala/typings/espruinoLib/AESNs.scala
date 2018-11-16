package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("AES")
@js.native
object AESNs extends js.Object {
  /**
       * 
       * @param passphrase 
       * @param key 
       * @param options 
       * @return  
       * @url http://www.espruino.com/Reference#l_AES_decrypt
       */
  def decrypt(passphrase: js.Any, key: js.Any, options: js.Any): stdLib.ArrayBuffer = js.native
  /**
       * 
       * @param passphrase 
       * @param key 
       * @param options 
       * @return  
       * @url http://www.espruino.com/Reference#l_AES_encrypt
       */
  def encrypt(passphrase: js.Any, key: js.Any, options: js.Any): stdLib.ArrayBuffer = js.native
}

