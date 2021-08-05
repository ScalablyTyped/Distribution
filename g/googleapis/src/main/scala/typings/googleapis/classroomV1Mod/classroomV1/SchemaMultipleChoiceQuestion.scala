package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional details for multiple-choice questions.
  */
trait SchemaMultipleChoiceQuestion extends StObject {
  
  /**
    * Possible choices.
    */
  var choices: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaMultipleChoiceQuestion {
  
  inline def apply(): SchemaMultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultipleChoiceQuestion]
  }
  
  extension [Self <: SchemaMultipleChoiceQuestion](x: Self) {
    
    inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
  }
}
