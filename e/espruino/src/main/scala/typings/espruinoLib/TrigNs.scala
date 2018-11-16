package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("Trig")
@js.native
object TrigNs extends js.Object {
  /**
       * <p>Get the current error flags from the trigger wheel - and zero them</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Trig_getErrorArray
       */
  def getErrorArray(): js.Any = js.native
  /**
       * <p>Get the current error flags from the trigger wheel - and zero them</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Trig_getErrors
       */
  def getErrors(): scala.Double = js.native
  /**
       * <p>Get the position of the trigger wheel at the given time (from getTime)</p>
       * 
       * @param time 
       * @return  
       * @url http://www.espruino.com/Reference#l_Trig_getPosAtTime
       */
  def getPosAtTime(time: scala.Double): scala.Double = js.native
  /**
       * <p>Get the RPM of the trigger wheel</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Trig_getRPM
       */
  def getRPM(): scala.Double = js.native
  /**
       * <p>Get the current state of a trigger</p>
       * 
       * @param num 
       * @return  
       * @url http://www.espruino.com/Reference#l_Trig_getTrigger
       */
  def getTrigger(num: scala.Double): js.Any = js.native
  /**
       * <p>Disable a trigger</p>
       * 
       * @param num 
       * @url http://www.espruino.com/Reference#l_Trig_killTrigger
       */
  def killTrigger(num: scala.Double): scala.Unit = js.native
  /**
       * <p>Set a trigger for a certain point in the cycle</p>
       * 
       * @param num 
       * @param pos 
       * @param pins 
       * @param pulseLength 
       * @url http://www.espruino.com/Reference#l_Trig_setTrigger
       */
  def setTrigger(num: scala.Double, pos: scala.Double, pins: js.Any, pulseLength: scala.Double): scala.Unit = js.native
  /**
       * <p>Initialise the trigger class</p>
       * 
       * @param pin 
       * @param options 
       * @url http://www.espruino.com/Reference#l_Trig_setup
       */
  def setup(pin: espruinoLib.Pin, options: js.Any): scala.Unit = js.native
}

