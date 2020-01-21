package typings.escpos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escpos.escposStrings.UPC_A
  - typings.escpos.escposStrings.UPC_E
  - typings.escpos.escposStrings.EAN13
  - typings.escpos.escposStrings.EAN8
  - typings.escpos.escposStrings.CODE39
  - typings.escpos.escposStrings.ITF
  - typings.escpos.escposStrings.NW7
  - typings.escpos.escposStrings.CODE93
  - typings.escpos.escposStrings.CODE128
*/
trait BARCODE_TYPE extends js.Object

object BARCODE_TYPE {
  @scala.inline
  def CODE128: typings.escpos.escposStrings.CODE128 = this.cast("CODE128")
  @scala.inline
  def CODE39: typings.escpos.escposStrings.CODE39 = this.cast("CODE39")
  @scala.inline
  def CODE93: typings.escpos.escposStrings.CODE93 = this.cast("CODE93")
  @scala.inline
  def EAN13: typings.escpos.escposStrings.EAN13 = this.cast("EAN13")
  @scala.inline
  def EAN8: typings.escpos.escposStrings.EAN8 = this.cast("EAN8")
  @scala.inline
  def ITF: typings.escpos.escposStrings.ITF = this.cast("ITF")
  @scala.inline
  def NW7: typings.escpos.escposStrings.NW7 = this.cast("NW7")
  @scala.inline
  def UPC_A: typings.escpos.escposStrings.UPC_A = this.cast("UPC_A")
  @scala.inline
  def UPC_E: typings.escpos.escposStrings.UPC_E = this.cast("UPC_E")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

