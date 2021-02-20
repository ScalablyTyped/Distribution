package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert text at the current position in the document.
  */
@js.native
trait InsertTextCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTextCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A text to insert.
    * @param interval A position or interval where the text is inserted.
    * @param subDocumentId An integer value that specifies the sub-document.
    */
  def execute(text: String): Boolean = js.native
  def execute(text: String, interval: js.UndefOr[scala.Nothing], subDocumentId: Double): Boolean = js.native
  def execute(text: String, interval: Double): Boolean = js.native
  def execute(text: String, interval: Double, subDocumentId: Double): Boolean = js.native
  def execute(text: String, interval: Interval): Boolean = js.native
  def execute(text: String, interval: Interval, subDocumentId: Double): Boolean = js.native
}
