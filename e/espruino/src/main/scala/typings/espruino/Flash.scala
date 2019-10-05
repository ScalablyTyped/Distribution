package typings.espruino

import org.scalablytyped.runtime.Instantiable0
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
trait Flash extends /**
  * 
  * @return  
  */
Instantiable0[Flash]

/**
* 
*/
@JSGlobal("Flash")
@js.native
object Flash extends js.Object {
  /**
    * <p>Erase a page of flash memory</p>
    * 
    * @param addr 
    * @url http://www.espruino.com/Reference#l_Flash_erasePage
    */
  def erasePage(addr: js.Any): Unit = js.native
  /**
    * <p>This method returns an array of objects of the form <code>{addr : #, length : #}</code>, representing
    * contiguous areas of flash memory in the chip that are not used for anything.</p>
    * <p>The memory areas returned are on page boundaries. This means that you can
    * safely erase the page containing any address here, and you won&#39;t risk
    * deleting part of the Espruino firmware.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Flash_getFree
    */
  def getFree(): js.Any = js.native
  /**
    * <p>Returns the start and length of the flash page containing the given address.</p>
    * 
    * @param addr 
    * @return  
    * @url http://www.espruino.com/Reference#l_Flash_getPage
    */
  def getPage(addr: Double): js.Any = js.native
  /**
    * <p>Read flash memory from the given address</p>
    * 
    * @param length 
    * @param addr 
    * @return  
    * @url http://www.espruino.com/Reference#l_Flash_read
    */
  def read(length: Double, addr: Double): js.Any = js.native
  /**
    * <p>Write data into memory at the given address - IN MULTIPLES OF 4 BYTES.</p>
    * <p>In flash memory you may only turn bits that are 1 into bits that are 0. If
    * you&#39;re writing data into an area that you have already written (so <code>read</code>
    * doesn&#39;t return all <code>0xFF</code>) you&#39;ll need to call <code>erasePage</code> to clear the
    * entire page.</p>
    * 
    * @param data 
    * @param addr 
    * @url http://www.espruino.com/Reference#l_Flash_write
    */
  def write(data: js.Any, addr: Double): Unit = js.native
}

