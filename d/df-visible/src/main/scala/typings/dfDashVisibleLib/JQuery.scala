package typings
package dfDashVisibleLib

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
  def visible(): scala.Boolean = js.native
  /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      * @param callback The callback parameter should be a function that looks like this:
      * function(object details) {...};
      */
  def visible(partial: scala.Boolean): scala.Boolean = js.native
  /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      * @param callback The callback parameter should be a function that looks like this:
      * function(object details) {...};
      */
  def visible(partial: scala.Boolean, hidden: scala.Boolean): scala.Boolean = js.native
  /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      * @param callback The callback parameter should be a function that looks like this:
      * function(object details) {...};
      */
  def visible(partial: scala.Boolean, hidden: scala.Boolean, direction: Direction): scala.Boolean = js.native
  /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      * @param callback The callback parameter should be a function that looks like this:
      * function(object details) {...};
      */
  def visible(partial: scala.Boolean, hidden: scala.Boolean, direction: Direction, container: JQuery): scala.Boolean = js.native
}

