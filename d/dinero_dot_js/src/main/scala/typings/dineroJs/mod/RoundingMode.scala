package typings.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dineroJs.dineroJsStrings.HALF_ODD
  - typings.dineroJs.dineroJsStrings.HALF_EVEN
  - typings.dineroJs.dineroJsStrings.HALF_UP
  - typings.dineroJs.dineroJsStrings.HALF_DOWN
  - typings.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO
  - typings.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO
*/
trait RoundingMode extends js.Object

object RoundingMode {
  @scala.inline
  def HALF_AWAY_FROM_ZERO: typings.dineroJs.dineroJsStrings.HALF_AWAY_FROM_ZERO = this.cast("HALF_AWAY_FROM_ZERO")
  @scala.inline
  def HALF_DOWN: typings.dineroJs.dineroJsStrings.HALF_DOWN = this.cast("HALF_DOWN")
  @scala.inline
  def HALF_EVEN: typings.dineroJs.dineroJsStrings.HALF_EVEN = this.cast("HALF_EVEN")
  @scala.inline
  def HALF_ODD: typings.dineroJs.dineroJsStrings.HALF_ODD = this.cast("HALF_ODD")
  @scala.inline
  def HALF_TOWARDS_ZERO: typings.dineroJs.dineroJsStrings.HALF_TOWARDS_ZERO = this.cast("HALF_TOWARDS_ZERO")
  @scala.inline
  def HALF_UP: typings.dineroJs.dineroJsStrings.HALF_UP = this.cast("HALF_UP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

