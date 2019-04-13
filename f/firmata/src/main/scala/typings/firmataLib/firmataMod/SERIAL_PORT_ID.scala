package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIAL_PORT_ID extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L497-L512
@JSImport("firmata", "SERIAL_PORT_ID")
@js.native
object SERIAL_PORT_ID extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL0
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL1
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL2
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL3
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL0
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL1
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL2
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL3
    extends firmataLib.firmataMod.SERIAL_PORT_ID
  
  /* 0x08 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 0x00 */ val HW_SERIAL0: HW_SERIAL0 with scala.Double = js.native
  /* 0x01 */ val HW_SERIAL1: HW_SERIAL1 with scala.Double = js.native
  /* 0x02 */ val HW_SERIAL2: HW_SERIAL2 with scala.Double = js.native
  /* 0x03 */ val HW_SERIAL3: HW_SERIAL3 with scala.Double = js.native
  /* 0x08 */ val SW_SERIAL0: SW_SERIAL0 with scala.Double = js.native
  /* 0x09 */ val SW_SERIAL1: SW_SERIAL1 with scala.Double = js.native
  /* 0x10 */ val SW_SERIAL2: SW_SERIAL2 with scala.Double = js.native
  /* 0x11 */ val SW_SERIAL3: SW_SERIAL3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.SERIAL_PORT_ID with scala.Double] = js.native
}

