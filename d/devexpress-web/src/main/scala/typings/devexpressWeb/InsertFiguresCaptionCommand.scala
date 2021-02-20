package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a caption for a figure.
  */
@js.native
trait InsertFiguresCaptionCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertFiguresCaptionCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertFiguresCaptionCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFiguresCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFiguresCaptionCommand]
  }
  
  @scala.inline
  implicit class InsertFiguresCaptionCommandMutableBuilder[Self <: InsertFiguresCaptionCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
