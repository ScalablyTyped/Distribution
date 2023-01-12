package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingSelectionPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Author – human or machine.
    */
  var actor: js.UndefOr[Reference] = js.undefined
  
  /**
    * Distinguishes the type of involvement of the performer.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object ImagingSelectionPerformer {
  
  inline def apply(): ImagingSelectionPerformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagingSelectionPerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingSelectionPerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
