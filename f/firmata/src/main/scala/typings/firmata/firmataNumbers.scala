package typings.firmata

import typings.firmata.mod.I2C_MODE
import typings.firmata.mod.PIN_MODE
import typings.firmata.mod.PIN_STATE
import typings.firmata.mod.PULLUP_STATE
import typings.firmata.mod.REPORTING
import typings.firmata.mod.SERIAL_MODE
import typings.firmata.mod.SERIAL_PIN_TYPE
import typings.firmata.mod.SERIAL_PORT_ID
import typings.firmata.mod.STEPPER_DIRECTION
import typings.firmata.mod.STEPPER_RUN_STATE
import typings.firmata.mod.STEPPER_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firmataNumbers {
  @js.native
  sealed trait `0`
    extends I2C_MODE
       with PIN_STATE
       with PULLUP_STATE
       with REPORTING
       with STEPPER_DIRECTION
       with STEPPER_RUN_STATE
  
  @js.native
  sealed trait `0x00`
    extends PIN_MODE
       with SERIAL_MODE
       with SERIAL_PIN_TYPE
       with SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x01`
    extends PIN_MODE
       with SERIAL_MODE
       with SERIAL_PIN_TYPE
       with SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x02`
    extends PIN_MODE
       with SERIAL_PIN_TYPE
       with SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x03`
    extends PIN_MODE
       with SERIAL_PIN_TYPE
       with SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x04`
    extends PIN_MODE
       with SERIAL_PIN_TYPE
  
  @js.native
  sealed trait `0x05`
    extends PIN_MODE
       with SERIAL_PIN_TYPE
  
  @js.native
  sealed trait `0x06`
    extends PIN_MODE
       with SERIAL_PIN_TYPE
  
  @js.native
  sealed trait `0x07`
    extends PIN_MODE
       with SERIAL_PIN_TYPE
  
  @js.native
  sealed trait `0x08`
    extends PIN_MODE
       with SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x09` extends SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x0A` extends PIN_MODE
  
  @js.native
  sealed trait `0x0B` extends PIN_MODE
  
  @js.native
  sealed trait `0x10`
    extends PIN_MODE
       with SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x11` extends SERIAL_PORT_ID
  
  @js.native
  sealed trait `0x75` extends PIN_MODE
  
  @js.native
  sealed trait `0x7F` extends PIN_MODE
  
  @js.native
  sealed trait `1`
    extends I2C_MODE
       with PIN_STATE
       with PULLUP_STATE
       with REPORTING
       with STEPPER_DIRECTION
       with STEPPER_RUN_STATE
       with STEPPER_TYPE
  
  @js.native
  sealed trait `2`
    extends I2C_MODE
       with STEPPER_RUN_STATE
       with STEPPER_TYPE
  
  @js.native
  sealed trait `3`
    extends I2C_MODE
       with STEPPER_RUN_STATE
  
  @js.native
  sealed trait `4` extends STEPPER_TYPE
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `0x00`: `0x00` = 0x00.asInstanceOf[`0x00`]
  @scala.inline
  def `0x01`: `0x01` = 0x01.asInstanceOf[`0x01`]
  @scala.inline
  def `0x02`: `0x02` = 0x02.asInstanceOf[`0x02`]
  @scala.inline
  def `0x03`: `0x03` = 0x03.asInstanceOf[`0x03`]
  @scala.inline
  def `0x04`: `0x04` = 0x04.asInstanceOf[`0x04`]
  @scala.inline
  def `0x05`: `0x05` = 0x05.asInstanceOf[`0x05`]
  @scala.inline
  def `0x06`: `0x06` = 0x06.asInstanceOf[`0x06`]
  @scala.inline
  def `0x07`: `0x07` = 0x07.asInstanceOf[`0x07`]
  @scala.inline
  def `0x08`: `0x08` = 0x08.asInstanceOf[`0x08`]
  @scala.inline
  def `0x09`: `0x09` = 0x09.asInstanceOf[`0x09`]
  @scala.inline
  def `0x0A`: `0x0A` = 0x0A.asInstanceOf[`0x0A`]
  @scala.inline
  def `0x0B`: `0x0B` = 0x0B.asInstanceOf[`0x0B`]
  @scala.inline
  def `0x10`: `0x10` = 0x10.asInstanceOf[`0x10`]
  @scala.inline
  def `0x11`: `0x11` = 0x11.asInstanceOf[`0x11`]
  @scala.inline
  def `0x75`: `0x75` = 0x75.asInstanceOf[`0x75`]
  @scala.inline
  def `0x7F`: `0x7F` = 0x7F.asInstanceOf[`0x7F`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
}

