package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagingStudySeriesPerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Indicates who or what performed the series.
    */
  var actor: Reference
  
  /**
    * Distinguishes the type of involvement of the performer in the series.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object ImagingStudySeriesPerformer {
  
  inline def apply(actor: Reference): ImagingStudySeriesPerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeriesPerformer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagingStudySeriesPerformer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
