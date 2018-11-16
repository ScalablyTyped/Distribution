package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>This module allows access to read and write the STM32&#39;s flash memory.</p>
* <p>It should be used with extreme caution, as it is easy to overwrite parts of Flash
* memory belonging to Espruino or even its bootloader. If you damage the bootloader
* then you may need external hardware such as a USB-TTL converter to restore it. For
* more information on restoring the bootloader see <code>Advanced Reflashing</code> in your
* board&#39;s reference pages.</p>
* <p>To see which areas of memory you can and can&#39;t overwrite, look at the values
* reported by <code>process.memory()</code>.</p>
* 
* @url http://www.espruino.com/Reference#l_Flash_undefined
*/
@js.native
trait Flash
  extends /**
     * 
     * @return  
     */
ScalablyTyped.runtime.Instantiable0[Flash]

