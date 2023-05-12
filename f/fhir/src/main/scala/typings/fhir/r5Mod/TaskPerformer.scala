package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * The actor or entity who performed the task.
    */
  var actor: Reference
  
  /**
    * A code or description of the performer of the task.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object TaskPerformer {
  
  inline def apply(actor: Reference): TaskPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskPerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
