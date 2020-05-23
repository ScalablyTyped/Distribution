package typings.fridaGum.global

import typings.fridaGum.UInt64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an unsigned 64-bit value.
  */
@JSGlobal("UInt64")
@js.native
class UInt64_ protected () extends UInt64 {
  /**
    * Creates a new UInt64 from `v`, which is either a string containing the value in decimal, or hexadecimal
    * if prefixed with “0x”, or a number. You may use the uint64(v) short-hand for brevity.
    */
  def this(v: String) = this()
  def this(v: Double) = this()
  def this(v: UInt64) = this()
}

