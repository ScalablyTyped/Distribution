package typings.fundamentalReact.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.standard
  - typings.fundamentalReact.fundamentalReactStrings.positive
  - typings.fundamentalReact.fundamentalReactStrings.negative
  - typings.fundamentalReact.fundamentalReactStrings.medium
*/
trait ButtonTypes extends js.Object

object ButtonTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def medium: typings.fundamentalReact.fundamentalReactStrings.medium = this.cast("medium")
  @scala.inline
  def negative: typings.fundamentalReact.fundamentalReactStrings.negative = this.cast("negative")
  @scala.inline
  def positive: typings.fundamentalReact.fundamentalReactStrings.positive = this.cast("positive")
  @scala.inline
  def standard: typings.fundamentalReact.fundamentalReactStrings.standard = this.cast("standard")
}

