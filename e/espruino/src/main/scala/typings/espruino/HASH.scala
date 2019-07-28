package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p><strong>Note:</strong> This class is currently only included in builds for the original Espruino boards.
* For other boards you will have to make build your own firmware.</p>
* 
* @url http://www.espruino.com/Reference#HASH
*/
@js.native
trait HASH extends /**
  * 
  * @return  
  */
Instantiable0[HASH] {
  /**
    * 
    * @param message 
    * @return  
    * @url http://www.espruino.com/Reference#l_HASH_digest
    */
  def digest(message: js.Any): js.Any = js.native
  /**
    * 
    * @param message 
    * @return  
    * @url http://www.espruino.com/Reference#l_HASH_hexdigest
    */
  def hexdigest(message: js.Any): js.Any = js.native
  /**
    * 
    * @param message 
    * @url http://www.espruino.com/Reference#l_HASH_update
    */
  def update(message: js.Any): Unit = js.native
}

