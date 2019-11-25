package typings.escpos.escposMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.escpos.escposStrings.LT
  - typings.escpos.escposStrings.CT
  - typings.escpos.escposStrings.RT
*/
trait TXT_ALIGN extends js.Object

object TXT_ALIGN {
  @scala.inline
  def CT: typings.escpos.escposStrings.CT = this.cast("CT")
  @scala.inline
  def LT: typings.escpos.escposStrings.LT = this.cast("LT")
  @scala.inline
  def RT: typings.escpos.escposStrings.RT = this.cast("RT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

