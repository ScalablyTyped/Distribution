package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert numeration to a paragraph making it a numbering list item.
  */
@js.native
trait InsertNumerationCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the ChangePageMarginsCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param numberingListIndex The list index.
    * @param isAbstractNumberingList true, for abstract lists; otherwise, false.
    */
  def execute(numberingListIndex: Double): Boolean = js.native
  def execute(numberingListIndex: Double, isAbstractNumberingList: Boolean): Boolean = js.native
}
