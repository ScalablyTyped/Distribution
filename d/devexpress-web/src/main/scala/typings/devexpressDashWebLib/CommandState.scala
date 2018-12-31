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

