package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a caption for a figure.
  */
trait InsertFiguresCaptionCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertFiguresCaptionCommand command.
    */
  def execute(): Boolean
}

object InsertFiguresCaptionCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFiguresCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFiguresCaptionCommand]
  }
}

