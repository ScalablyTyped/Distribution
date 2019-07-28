package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to scale pictures in a selected range.
  */
@js.native
trait ChangePictureScaleCommand extends CommandBase {
  /**
    * Executes the ChangePictureScaleCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param scale A Scale object specifying scaling of the picture.
    */
  def execute(scale: Scale): Boolean = js.native
  /**
    * Executes the ChangePictureScaleCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param x An integer number specifying the scaling value for the width of the picture as a percentage.
    * @param y An integer number specifying the scaling value for the height of the picture as a percentage.
    */
  def execute(x: Double, y: Double): Boolean = js.native
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any = js.native
}

