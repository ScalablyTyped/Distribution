package typings.espruino

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("LoopbackA")
@js.native
/**
  * 
  * @return  
  */
class LoopbackA () extends Serial {
  /* CompleteClass */
  override def removeListener(event: String, listener: js.Any): js.Any = js.native
}

/**
* <p>A loopback serial device. Data sent to LoopbackA comes out of LoopbackB and vice versa</p>
* 
* @url http://www.espruino.com/Reference#l__global_LoopbackA
*/
@JSGlobal("LoopbackA")
@js.native
object LoopbackA extends TopLevel[Serial]

