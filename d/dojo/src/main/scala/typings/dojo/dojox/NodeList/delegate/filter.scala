package typings.dojo.dojox.NodeList.delegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * "masks" the built-in javascript filter() method (supported
  * in Dojo via dojo.filter) to support passing a simple
  * string filter in addition to supporting filtering function
  * objects.
  *
  * @param filter If a string, a CSS rule like ".thinger" or "div > span".
  */
@js.native
trait filter extends js.Object {
  def apply(filter: String): js.Any = js.native
  def apply(filter: js.Function): js.Any = js.native
}

