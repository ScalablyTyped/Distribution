package typings.fundamentalReact.badgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.pill
  - typings.fundamentalReact.fundamentalReactStrings.filled
*/
trait BadgeModifiers extends js.Object

object BadgeModifiers {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filled: typings.fundamentalReact.fundamentalReactStrings.filled = this.cast("filled")
  @scala.inline
  def pill: typings.fundamentalReact.fundamentalReactStrings.pill = this.cast("pill")
}

