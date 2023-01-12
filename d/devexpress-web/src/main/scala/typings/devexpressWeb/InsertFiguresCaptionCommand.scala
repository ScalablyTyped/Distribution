package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a caption for a figure.
  */
trait InsertFiguresCaptionCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertFiguresCaptionCommand command.
    */
  def execute(): Boolean
}
object InsertFiguresCaptionCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFiguresCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFiguresCaptionCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertFiguresCaptionCommand] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
