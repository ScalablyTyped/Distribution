package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a simple state common to most of the client commands.
  */
trait SimpleCommandState extends js.Object {
  /**
    * Gets a value indicating whether the command's UI element is enabled (within the ribbon and context menu).
    * Value: true, if the command's related UI element is enabled; otherwise, false.
    */
  var enabled: scala.Boolean
  /**
    * Gets a value indicating whether the command's UI element is visible.
    * Value: true, if the command's related UI element is visible; otherwise, false.
    */
  var visible: scala.Boolean
}

object SimpleCommandState {
  @scala.inline
  def apply(enabled: scala.Boolean, visible: scala.Boolean): SimpleCommandState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SimpleCommandState]
  }
}

