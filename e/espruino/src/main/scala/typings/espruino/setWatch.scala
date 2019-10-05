package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setWatch")
@js.native
object setWatch extends js.Object {
  /**
  * <p>Call the function specified when the pin changes. Watches set with <code>setWatch</code> can be removed using <code>clearWatch</code>.</p>
  * <p>The function may also take an argument, which is an object of type <code>{state:bool, time:float, lastTime:float}</code>.</p>
  * <ul>
  * <li><code>state</code> is whether the pin is currently a <code>1</code> or a <code>0</code></li>
  * <li><code>time</code> is the time in seconds at which the pin changed state</li>
  * <li><code>lastTime</code> is the time in seconds at which the <strong>pin last changed state</strong>. When using <code>edge:&#39;rising&#39;</code> or <code>edge:&#39;falling&#39;</code>, this is not the same as when the function was last called.</li>
  * </ul>
  * <p>For instance, if you want to measure the length of a positive pulse you could use <code>setWatch(function(e) { console.log(e.time-e.lastTime); }, BTN, { repeat:true, edge:&#39;falling&#39; });</code>.
  * This will only be called on the falling edge of the pulse, but will be able to measure the width of the pulse because <code>e.lastTime</code> is the time of the rising edge.</p>
  * <p>Internally, an interrupt writes the time of the pin&#39;s state change into a queue, and the function
  * supplied to <code>setWatch</code> is executed only from the main message loop. However, if the callback is a
  * native function <code>void (bool state)</code> then you can add <code>irq:true</code> to options, which will cause the
  * function to be called from within the IRQ. When doing this, interrupts will happen on both edges
  * and there will be no debouncing.</p>
  * <p><strong>Note:</strong> The STM32 chip (used in the <a href="/EspruinoBoard">Espruino Board</a> and <a href="/Pico">Pico</a>) cannot
  * watch two pins with the same number - eg <code>A0</code> and <code>B0</code>.</p>
  * 
  * @param function 
  * @param pin 
  * @param options 
  * @return  
  * @url http://www.espruino.com/Reference#l__global_setWatch
  */
  def apply(f: js.Function1[/* a */ js.UndefOr[js.Any], _], pin: Pin, options: js.Any): js.Any = js.native
}

