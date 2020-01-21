package typings.fundamentalReact.inputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fundamentalReact.fundamentalReactStrings.text
  - typings.fundamentalReact.fundamentalReactStrings.number
  - typings.fundamentalReact.fundamentalReactStrings.search
*/
trait InputGroupTypes extends js.Object

object InputGroupTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.fundamentalReact.fundamentalReactStrings.number = this.cast("number")
  @scala.inline
  def search: typings.fundamentalReact.fundamentalReactStrings.search = this.cast("search")
  @scala.inline
  def text: typings.fundamentalReact.fundamentalReactStrings.text = this.cast("text")
}

