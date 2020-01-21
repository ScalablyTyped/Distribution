package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.be
  - typings.fridaGum.fridaGumStrings.le
*/
trait Endian extends js.Object

object Endian {
  @scala.inline
  def be: typings.fridaGum.fridaGumStrings.be = this.cast("be")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def le: typings.fridaGum.fridaGumStrings.le = this.cast("le")
}

