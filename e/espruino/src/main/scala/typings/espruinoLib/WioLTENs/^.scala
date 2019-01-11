package typings
package espruinoLib.WioLTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WioLTE")
@js.native
object ^ extends js.Object {
  /**
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_A4
    */
  var A4: js.Any = js.native
  /**
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_A6
    */
  var A6: js.Any = js.native
  /**
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_D20
    */
  var D20: js.Any = js.native
  /**
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_D38
    */
  var D38: js.Any = js.native
  /**
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_I2C
    */
  var I2C: js.Any = js.native
  /**
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_UART
    */
  var UART: js.Any = js.native
  /**
    * <p>Set the power of Grove connectors, except for <code>D38</code> and <code>D39</code> which are always on.</p>
    * 
    * @param onoff 
    * @url http://www.espruino.com/Reference#l_WioLTE_setGrovePower
    */
  def setGrovePower(onoff: scala.Boolean): scala.Unit = js.native
  /**
    * <p>Turn power to the WIO&#39;s LED on or off.</p>
    * <p>Turning the LED on won&#39;t immediately display a color - that must be done with <code>WioLTE.LED(r,g,b)</code></p>
    * 
    * @param onoff 
    * @url http://www.espruino.com/Reference#l_WioLTE_setLEDPower
    */
  def setLEDPower(onoff: scala.Boolean): scala.Unit = js.native
}

