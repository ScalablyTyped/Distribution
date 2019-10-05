package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Class containing utility functions for accessing IO on the hexagonal badge</p>
* 
* @url http://www.espruino.com/Reference#Badge
*/
@js.native
trait Badge extends /**
  * 
  * @return  
  */
Instantiable0[Badge]

/**
* 
*/
@JSGlobal("Badge")
@js.native
object Badge extends js.Object {
  /**
    * <p>Capacitive sense - the higher the capacitance, the higher the number returned.</p>
    * <p>Supply a corner between 1 and 6, and a</p>
    * 
    * @param corner 
    * @return  
    * @url http://www.espruino.com/Reference#l_Badge_capSense
    */
  def capSense(corner: Double): Double = js.native
  /**
    * <p>Return an approximate battery percentage remaining based on
    * a normal CR2032 battery (2.8 - 2.2v)</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Badge_getBatteryPercentage
    */
  def getBatteryPercentage(): Double = js.native
  /**
    * <p>Set the LCD&#39;s contrast</p>
    * 
    * @param c 
    * @url http://www.espruino.com/Reference#l_Badge_setContrast
    */
  def setContrast(c: Double): Unit = js.native
}

