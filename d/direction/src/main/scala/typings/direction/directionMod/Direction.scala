package typings.direction.directionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.direction.directionStrings.ltr
  - typings.direction.directionStrings.rtl
  - typings.direction.directionStrings.neutral
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ltr: typings.direction.directionStrings.ltr = this.cast("ltr")
  @scala.inline
  def neutral: typings.direction.directionStrings.neutral = this.cast("neutral")
  @scala.inline
  def rtl: typings.direction.directionStrings.rtl = this.cast("rtl")
}

