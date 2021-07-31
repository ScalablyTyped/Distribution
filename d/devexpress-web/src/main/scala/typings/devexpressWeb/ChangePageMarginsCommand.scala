package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change page margin settings.
  */
@js.native
trait ChangePageMarginsCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangePageMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param left The margin settings object or the left margin in twips.
    * @param top The top margin in twips.
    * @param right The right margin in twips.
    * @param bottom The bottom margin in twips.
    */
  def execute(): Boolean = js.native
  def execute(left: Double): Boolean = js.native
  def execute(left: Double, top: Double): Boolean = js.native
  def execute(left: Double, top: Double, right: Double): Boolean = js.native
  def execute(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Double, top: Double, right: Unit, bottom: Double): Boolean = js.native
  def execute(left: Double, top: Unit, right: Double): Boolean = js.native
  def execute(left: Double, top: Unit, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Double, top: Unit, right: Unit, bottom: Double): Boolean = js.native
  def execute(left: Unit, top: Double): Boolean = js.native
  def execute(left: Unit, top: Double, right: Double): Boolean = js.native
  def execute(left: Unit, top: Double, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Unit, top: Double, right: Unit, bottom: Double): Boolean = js.native
  def execute(left: Unit, top: Unit, right: Double): Boolean = js.native
  def execute(left: Unit, top: Unit, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Unit, top: Unit, right: Unit, bottom: Double): Boolean = js.native
  def execute(left: Margins): Boolean = js.native
  def execute(left: Margins, top: Double): Boolean = js.native
  def execute(left: Margins, top: Double, right: Double): Boolean = js.native
  def execute(left: Margins, top: Double, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Margins, top: Double, right: Unit, bottom: Double): Boolean = js.native
  def execute(left: Margins, top: Unit, right: Double): Boolean = js.native
  def execute(left: Margins, top: Unit, right: Double, bottom: Double): Boolean = js.native
  def execute(left: Margins, top: Unit, right: Unit, bottom: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins] = js.native
}
