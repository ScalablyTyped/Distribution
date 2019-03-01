package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the state of a command.
  */
trait CommandState[T] extends SimpleCommandState {
  /**
    * Gets the command state value.
    * Value: A T object specifying the command state value.
    */
  var value: T
}

object CommandState {
  @scala.inline
  def apply[T](enabled: scala.Boolean, value: T, visible: scala.Boolean): CommandState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CommandState[T]]
  }
}

