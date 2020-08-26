package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change page margin settings.
  */
@js.native
trait ChangePageMarginsCommand extends CommandBase {
  /**
    * Executes the ChangePageMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param left The margin settings object or the left margin in twips.
    * @param top The top margin in twips.
    * @param right The right margin in twips.
    * @param bottom The bottom margin in twips.
    */
  def execute(): Boolean = js.native
  def execute(
    left: js.UndefOr[scala.Nothing],
    top: js.UndefOr[scala.Nothing],
    right: js.UndefOr[scala.Nothing],
    bottom: Double
  ): Boolean = js.native
  def execute(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double): Boolean = js.native
  def execute(left: js.UndefOr[scala.Nothing], top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Boolean = js.native
  def execute(left: js.UndefOr[scala.Nothing], top: Double): Boolean = js.native
  def execute(left: js.UndefOr[scala.Nothing], top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Boolean = js.native
  def execute(left: js.UndefOr[scala.Nothing], top: Double, right: Double): Boolean = js.native
  def execute(left: js.UndefOr[scala.Nothing], top: Double, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Double): Boolean = js.native
  def execute(left: Double, top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double): Boolean = js.native
  def execute(left: Double, top: js.UndefOr[scala.Nothing], right: Double): Boolean = js.native
  def execute(left: Double, top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Boolean = js.native
  def execute(left: Double, top: Double): Boolean = js.native
  def execute(left: Double, top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Boolean = js.native
  def execute(left: Double, top: Double, right: Double): Boolean = js.native
  def execute(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Margins): Boolean = js.native
  def execute(left: Margins, top: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], bottom: Double): Boolean = js.native
  def execute(left: Margins, top: js.UndefOr[scala.Nothing], right: Double): Boolean = js.native
  def execute(left: Margins, top: js.UndefOr[scala.Nothing], right: Double, bottom: Double): Boolean = js.native
  def execute(left: Margins, top: Double): Boolean = js.native
  def execute(left: Margins, top: Double, right: js.UndefOr[scala.Nothing], bottom: Double): Boolean = js.native
  def execute(left: Margins, top: Double, right: Double): Boolean = js.native
  def execute(left: Margins, top: Double, right: Double, bottom: Double): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins] = js.native
}

