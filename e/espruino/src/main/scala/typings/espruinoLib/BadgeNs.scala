package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("Badge")
@js.native
object BadgeNs extends js.Object {
  /**
       * <p>Capacitive sense - the higher the capacitance, the higher the number returned.</p>
       * <p>Supply a corner between 1 and 6, and a</p>
       * 
       * @param corner 
       * @return  
       * @url http://www.espruino.com/Reference#l_Badge_capSense
       */
  def capSense(corner: scala.Double): scala.Double = js.native
  /**
       * <p>Return an approximate battery percentage remaining based on
       * a normal CR2032 battery (2.8 - 2.2v)</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Badge_getBatteryPercentage
       */
  def getBatteryPercentage(): scala.Double = js.native
  /**
       * <p>Set the LCD&#39;s contrast</p>
       * 
       * @param c 
       * @url http://www.espruino.com/Reference#l_Badge_setContrast
       */
  def setContrast(c: scala.Double): scala.Unit = js.native
}

