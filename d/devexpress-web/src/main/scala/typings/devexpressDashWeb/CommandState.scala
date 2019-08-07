package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the state of a command.
  */
@JSGlobal("CommandState")
@js.native
class CommandState[T] () extends SimpleCommandState {
  /**
    * Specifies a command value.
    */
  var value: T = js.native
}

