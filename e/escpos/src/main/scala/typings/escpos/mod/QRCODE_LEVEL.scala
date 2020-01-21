package typings.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escpos.escposStrings.L
  - typings.escpos.escposStrings.M
  - typings.escpos.escposStrings.Q
  - typings.escpos.escposStrings.H
*/
trait QRCODE_LEVEL extends js.Object

object QRCODE_LEVEL {
  @scala.inline
  def H: typings.escpos.escposStrings.H = this.cast("H")
  @scala.inline
  def L: typings.escpos.escposStrings.L = this.cast("L")
  @scala.inline
  def M: typings.escpos.escposStrings.M = this.cast("M")
  @scala.inline
  def Q: typings.escpos.escposStrings.Q = this.cast("Q")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

