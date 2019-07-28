package typings.espruino

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Create a waveform class. This allows high speed input and output of waveforms. It has an internal variable called <code>buffer</code> (as well as <code>buffer2</code> when double-buffered - see <code>options</code> below) which contains the data to input/output.</p>
* <p>When double-buffered, a &#39;buffer&#39; event will be emitted each time a buffer is finished with (the argument is that buffer). When the recording stops, a &#39;finish&#39; event will be emitted (with the first argument as the buffer).</p>
* 
* @url http://www.espruino.com/Reference#l_Waveform_Waveform
*/
@js.native
trait Waveform
  extends /**
  * 
  * @param samples 
  * @param options 
  * @return  
  */
Instantiable2[/* samples */ Double, /* options */ js.Any, js.Any] {
  /**
    * <p>Will start inputting the waveform on the given pin that supports analog. If not repeating, it&#39;ll emit a <code>finish</code> event when it is done.</p>
    * 
    * @param output 
    * @param freq 
    * @param options 
    * @url http://www.espruino.com/Reference#l_Waveform_startInput
    */
  def startInput(output: Pin, freq: Double, options: js.Any): Unit = js.native
  /**
    * <p>Will start outputting the waveform on the given pin - the pin must have previously been initialised with analogWrite. If not repeating, it&#39;ll emit a <code>finish</code> event when it is done.</p>
    * 
    * @param output 
    * @param freq 
    * @param options 
    * @url http://www.espruino.com/Reference#l_Waveform_startOutput
    */
  def startOutput(output: Pin, freq: Double, options: js.Any): Unit = js.native
  /**
    * <p>Stop a waveform that is currently outputting</p>
    * 
    * @url http://www.espruino.com/Reference#l_Waveform_stop
    */
  def stop(): Unit = js.native
}

