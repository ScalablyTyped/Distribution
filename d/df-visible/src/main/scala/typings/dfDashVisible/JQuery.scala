package typings.dfDashVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    * @param callback The callback parameter should be a function that looks like this:
    * function(object details) {...};
    */
  def visible(): Boolean = js.native
  def visible(partial: Boolean): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Direction): Boolean = js.native
  def visible(partial: Boolean, hidden: Boolean, direction: Direction, container: JQuery): Boolean = js.native
}

