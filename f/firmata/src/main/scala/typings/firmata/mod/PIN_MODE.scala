package typings.firmata.mod

import typings.firmata.firmataInts.`0x00`
import typings.firmata.firmataInts.`0x01`
import typings.firmata.firmataInts.`0x02`
import typings.firmata.firmataInts.`0x03`
import typings.firmata.firmataInts.`0x04`
import typings.firmata.firmataInts.`0x05`
import typings.firmata.firmataInts.`0x06`
import typings.firmata.firmataInts.`0x07`
import typings.firmata.firmataInts.`0x08`
import typings.firmata.firmataInts.`0x0A`
import typings.firmata.firmataInts.`0x0B`
import typings.firmata.firmataInts.`0x10`
import typings.firmata.firmataInts.`0x75`
import typings.firmata.firmataInts.`0x7F`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
/* Rewritten from type alias, can be one of: 
  - typings.firmata.firmataInts.`0x00`
  - typings.firmata.firmataInts.`0x01`
  - typings.firmata.firmataInts.`0x02`
  - typings.firmata.firmataInts.`0x03`
  - typings.firmata.firmataInts.`0x04`
  - typings.firmata.firmataInts.`0x05`
  - typings.firmata.firmataInts.`0x06`
  - typings.firmata.firmataInts.`0x07`
  - typings.firmata.firmataInts.`0x08`
  - typings.firmata.firmataInts.`0x0A`
  - typings.firmata.firmataInts.`0x0B`
  - typings.firmata.firmataInts.`0x7F`
  - typings.firmata.firmataInts.`0x75`
  - typings.firmata.firmataInts.`0x10`
*/
trait PIN_MODE extends StObject
object PIN_MODE {
  
  inline def ANALOG: `0x02` = 0x02.asInstanceOf[`0x02`]
  
  inline def I2C: `0x06` = 0x06.asInstanceOf[`0x06`]
  
  inline def IGNORE: `0x7F` = 0x7F.asInstanceOf[`0x7F`]
  
  inline def INPUT: `0x00` = 0x00.asInstanceOf[`0x00`]
  
  inline def ONEWIRE: `0x07` = 0x07.asInstanceOf[`0x07`]
  
  inline def OUTPUT: `0x01` = 0x01.asInstanceOf[`0x01`]
  
  inline def PING_READ: `0x75` = 0x75.asInstanceOf[`0x75`]
  
  inline def PULLUP: `0x0B` = 0x0B.asInstanceOf[`0x0B`]
  
  inline def PWM: `0x03` = 0x03.asInstanceOf[`0x03`]
  
  inline def SERIAL: `0x0A` = 0x0A.asInstanceOf[`0x0A`]
  
  inline def SERVO: `0x04` = 0x04.asInstanceOf[`0x04`]
  
  inline def SHIFT: `0x05` = 0x05.asInstanceOf[`0x05`]
  
  inline def STEPPER: `0x08` = 0x08.asInstanceOf[`0x08`]
  
  inline def UNKNOWN: `0x10` = 0x10.asInstanceOf[`0x10`]
}
