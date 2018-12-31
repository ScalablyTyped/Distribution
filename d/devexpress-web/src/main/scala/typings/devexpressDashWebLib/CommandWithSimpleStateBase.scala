package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for commands with a simple common command state.
  */
trait CommandWithSimpleStateBase extends CommandBase {
  /**
    * Gets information about the command state.
    */
  def getState(): SimpleCommandState
}

