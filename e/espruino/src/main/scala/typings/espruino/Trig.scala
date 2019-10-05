package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>This class exists in order to interface Espruino with fast-moving trigger wheels. Trigger wheels are physical discs with evenly spaced teeth cut into them, and often with one or two teeth next to each other missing. A sensor sends a signal whenever a tooth passed by, and this allows a device to measure not only RPM, but absolute position.</p>
* <p>This class is currently in testing - it is NOT AVAILABLE on normal boards.</p>
* 
* @url http://www.espruino.com/Reference#Trig
*/
@js.native
trait Trig extends /**
  * 
  * @return  
  */
Instantiable0[Trig]

/**
* 
*/
@JSGlobal("Trig")
@js.native
object Trig extends js.Object {
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
  def getErrors(): Double = js.native
  /**
    * <p>Get the position of the trigger wheel at the given time (from getTime)</p>
    * 
    * @param time 
    * @return  
    * @url http://www.espruino.com/Reference#l_Trig_getPosAtTime
    */
  def getPosAtTime(time: Double): Double = js.native
  /**
    * <p>Get the RPM of the trigger wheel</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Trig_getRPM
    */
  def getRPM(): Double = js.native
  /**
    * <p>Get the current state of a trigger</p>
    * 
    * @param num 
    * @return  
    * @url http://www.espruino.com/Reference#l_Trig_getTrigger
    */
  def getTrigger(num: Double): js.Any = js.native
  /**
    * <p>Disable a trigger</p>
    * 
    * @param num 
    * @url http://www.espruino.com/Reference#l_Trig_killTrigger
    */
  def killTrigger(num: Double): Unit = js.native
  /**
    * <p>Set a trigger for a certain point in the cycle</p>
    * 
    * @param num 
    * @param pos 
    * @param pins 
    * @param pulseLength 
    * @url http://www.espruino.com/Reference#l_Trig_setTrigger
    */
  def setTrigger(num: Double, pos: Double, pins: js.Any, pulseLength: Double): Unit = js.native
  /**
    * <p>Initialise the trigger class</p>
    * 
    * @param pin 
    * @param options 
    * @url http://www.espruino.com/Reference#l_Trig_setup
    */
  def setup(pin: Pin, options: js.Any): Unit = js.native
}

