package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to convert the text of all selected sentences to sentence case.
  */
trait MakeTextSentenceCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MakeTextSentenceCaseCommand command.
    */
  def execute(): Boolean
}
object MakeTextSentenceCaseCommand {
  
  inline def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextSentenceCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextSentenceCaseCommand]
  }
  
  extension [Self <: MakeTextSentenceCaseCommand](x: Self) {
    
    inline def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
