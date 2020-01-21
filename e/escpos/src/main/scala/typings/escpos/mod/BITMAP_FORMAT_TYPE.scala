package typings.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escpos.escposStrings.S8
  - typings.escpos.escposStrings.D8
  - typings.escpos.escposStrings.S24
  - typings.escpos.escposStrings.D24
*/
trait BITMAP_FORMAT_TYPE extends js.Object

object BITMAP_FORMAT_TYPE {
  @scala.inline
  def D24: typings.escpos.escposStrings.D24 = this.cast("D24")
  @scala.inline
  def D8: typings.escpos.escposStrings.D8 = this.cast("D8")
  @scala.inline
  def S24: typings.escpos.escposStrings.S24 = this.cast("S24")
  @scala.inline
  def S8: typings.escpos.escposStrings.S8 = this.cast("S8")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

