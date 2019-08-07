package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to scale pictures in a selected range.
  */
@JSGlobal("ChangePictureScaleCommand")
@js.native
class ChangePictureScaleCommand () extends CommandBase {
  /**
    * Executes the ChangePictureScaleCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param scale The picture scale.
    * @param x The picture scale object or the x-scale factor as a percent.
    * @param y The y-scale factor as a percent.
    */
  def execute(x: Double): Boolean = js.native
  def execute(x: Double, y: Double): Boolean = js.native
  def execute(x: Scale): Boolean = js.native
  def execute(x: Scale, y: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Scale] = js.native
}

