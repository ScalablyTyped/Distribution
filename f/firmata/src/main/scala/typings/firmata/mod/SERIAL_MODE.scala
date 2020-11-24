package typings.firmata.mod

import typings.firmata.firmataNumbers.`0x00`
import typings.firmata.firmataNumbers.`0x01`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
/* Rewritten from type alias, can be one of: 
  - typings.firmata.firmataNumbers.`0x00`
  - typings.firmata.firmataNumbers.`0x01`
*/
trait SERIAL_MODE extends js.Object
object SERIAL_MODE {
  
  @scala.inline
  def CONTINUOUS_READ: `0x00` = 0x00.asInstanceOf[`0x00`]
  
  @scala.inline
  def STOP_READING: `0x01` = 0x01.asInstanceOf[`0x01`]
}
