package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Class containing utility functions for the Seeed WIO LTE board</p>
* 
* @url http://www.espruino.com/Reference#WioLTE
*/
@js.native
trait WioLTE extends /**
  * 
  * @return  
  */
Instantiable0[WioLTE]

/**
* 
*/
@JSGlobal("WioLTE")
@js.native
object WioLTE extends js.Object {
  /**
    * <p>Set the WIO&#39;s LED</p>
    * 
    * @url http://www.espruino.com/Reference#l_WioLTE_LED
    */
  @js.native
  trait LED extends /**
    * 
    * @param red 
    * @param green 
    * @param blue 
    * @return  
    */
  Instantiable3[/* red */ Double, /* green */ Double, /* blue */ Double, LED]
  
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
  def setGrovePower(onoff: Boolean): Unit = js.native
  /**
    * <p>Turn power to the WIO&#39;s LED on or off.</p>
    * <p>Turning the LED on won&#39;t immediately display a color - that must be done with <code>WioLTE.LED(r,g,b)</code></p>
    * 
    * @param onoff 
    * @url http://www.espruino.com/Reference#l_WioLTE_setLEDPower
    */
  def setLEDPower(onoff: Boolean): Unit = js.native
}

