package typings.escpos.escposMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escpos.escposStrings.LF
  - typings.escpos.escposStrings.GLF
  - typings.escpos.escposStrings.FF
  - typings.escpos.escposStrings.CR
  - typings.escpos.escposStrings.HT
  - typings.escpos.escposStrings.VT
*/
trait FEED_CONTROL_TYPE extends js.Object

object FEED_CONTROL_TYPE {
  @scala.inline
  def CR: typings.escpos.escposStrings.CR = this.cast("CR")
  @scala.inline
  def FF: typings.escpos.escposStrings.FF = this.cast("FF")
  @scala.inline
  def GLF: typings.escpos.escposStrings.GLF = this.cast("GLF")
  @scala.inline
  def HT: typings.escpos.escposStrings.HT = this.cast("HT")
  @scala.inline
  def LF: typings.escpos.escposStrings.LF = this.cast("LF")
  @scala.inline
  def VT: typings.escpos.escposStrings.VT = this.cast("VT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

