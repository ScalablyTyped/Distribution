package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIAL_PIN_TYPE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L515-L524
@JSImport("firmata", "SERIAL_PIN_TYPE")
@js.native
object SERIAL_PIN_TYPE extends js.Object {
  @js.native
  sealed trait RES_RX0
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_RX1
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_RX2
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_RX3
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_TX0
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_TX1
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_TX2
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  @js.native
  sealed trait RES_TX3
    extends firmataLib.firmataMod.SERIAL_PIN_TYPE
  
  /* 0x00 */ val RES_RX0: RES_RX0 with scala.Double = js.native
  /* 0x02 */ val RES_RX1: RES_RX1 with scala.Double = js.native
  /* 0x04 */ val RES_RX2: RES_RX2 with scala.Double = js.native
  /* 0x06 */ val RES_RX3: RES_RX3 with scala.Double = js.native
  /* 0x01 */ val RES_TX0: RES_TX0 with scala.Double = js.native
  /* 0x03 */ val RES_TX1: RES_TX1 with scala.Double = js.native
  /* 0x05 */ val RES_TX2: RES_TX2 with scala.Double = js.native
  /* 0x07 */ val RES_TX3: RES_TX3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.SERIAL_PIN_TYPE with scala.Double] = js.native
}

