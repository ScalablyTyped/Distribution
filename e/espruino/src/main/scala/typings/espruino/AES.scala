package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Class containing AES encryption/decryption</p>
* <p><strong>Note:</strong> This library is currently only included in builds for the Espruino Pico and Espruino WiFi. For other boards you will have to make build your own firmware, and you may need to remove other features in order to make room.</p>
* 
* @url http://www.espruino.com/Reference#AES
*/
@js.native
trait AES extends /**
  * 
  * @return  
  */
Instantiable0[AES]

/**
* 
*/
@JSGlobal("AES")
@js.native
object AES extends js.Object {
  /**
    * 
    * @param passphrase 
    * @param key 
    * @param options 
    * @return  
    * @url http://www.espruino.com/Reference#l_AES_decrypt
    */
  def decrypt(passphrase: js.Any, key: js.Any, options: js.Any): ArrayBuffer = js.native
  /**
    * 
    * @param passphrase 
    * @param key 
    * @param options 
    * @return  
    * @url http://www.espruino.com/Reference#l_AES_encrypt
    */
  def encrypt(passphrase: js.Any, key: js.Any, options: js.Any): ArrayBuffer = js.native
}

