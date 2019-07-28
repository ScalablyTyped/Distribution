package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert numeration to a paragraph making it a numbering list item.
  */
@js.native
trait InsertNumerationCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertNumerationCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param abstractNumberingListIndex An integer value specifying index of abstract numbering list.
    */
  def execute(abstractNumberingListIndex: Double): Boolean = js.native
  /**
    * Executes the InsertNumerationCommand command by applying the specified settings.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param numberingListIndex An integer value specifying an index of the numbering list.
    * @param isAbstractNumberingList true, to insert an abstract numbering list; otherwise, false.
    */
  def execute(numberingListIndex: Double, isAbstractNumberingList: Boolean): Boolean = js.native
}

