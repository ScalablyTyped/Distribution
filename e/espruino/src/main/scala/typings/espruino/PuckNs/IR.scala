package typings.espruino.PuckNs

import org.scalablytyped.runtime.Instantiable3
import typings.espruino.Pin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p>Transmit the given set of IR pulses - data should be an array of pulse times
  * in milliseconds (as <code>[on, off, on, off, on, etc]</code>).</p>
  * <p>For example <code>Puck.IR(pulseTimes)</code> - see <a href="http://www.espruino.com/Puck.js+Infrared">http://www.espruino.com/Puck.js+Infrared</a>
  * for a full example.</p>
  * <p>You can also attach an external LED to Puck.js, in which case
  * you can just execute <code>Puck.IR(pulseTimes, led_cathode, led_anode)</code></p>
  * 
  * @url http://www.espruino.com/Reference#l_Puck_IR
  */
@js.native
trait IR
  extends /**
  * 
  * @param data 
  * @param cathode 
  * @param anode 
  * @return  
  */
Instantiable3[/* data */ js.Any, /* cathode */ Pin, /* anode */ Pin, IR]

