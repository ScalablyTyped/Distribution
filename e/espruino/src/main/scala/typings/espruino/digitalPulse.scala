package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("digitalPulse")
@js.native
object digitalPulse extends js.Object {
  /**
  * <p>Pulse the pin with the value for the given time in milliseconds. It uses a hardware timer to produce accurate pulses, and returns immediately (before the pulse has finished). Use <code>digitalPulse(A0,1,0)</code> to wait until a previous pulse has finished.</p>
  * <p>eg. <code>digitalPulse(A0,1,5);</code> pulses A0 high for 5ms. <code>digitalPulse(A0,1,[5,2,4]);</code> pulses A0 high for 5ms, low for 2ms, and high for 4ms</p>
  * <p> <strong>Note:</strong> if you didn&#39;t call <code>pinMode</code> beforehand then this function will also reset pin&#39;s state to <code>&quot;output&quot;</code></p>
  * <p>digitalPulse is for SHORT pulses that need to be very accurate. If you&#39;re doing anything over a few milliseconds, use setTimeout instead.</p>
  * 
  * @param pin 
  * @param value 
  * @param time 
  * @url http://www.espruino.com/Reference#l__global_digitalPulse
  */
  def apply(pin: Pin, value: Boolean, time: js.Any): Unit = js.native
}

