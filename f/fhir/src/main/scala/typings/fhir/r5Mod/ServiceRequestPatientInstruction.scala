package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceRequestPatientInstruction
  extends StObject
     with BackboneElement {
  
  var _instructionMarkdown: js.UndefOr[Element] = js.undefined
  
  /**
    * Instructions in terms that are understood by the patient or consumer.
    */
  var instructionMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * Instructions in terms that are understood by the patient or consumer.
    */
  var instructionReference: js.UndefOr[Reference] = js.undefined
}
object ServiceRequestPatientInstruction {
  
  inline def apply(): ServiceRequestPatientInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceRequestPatientInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceRequestPatientInstruction] (val x: Self) extends AnyVal {
    
    inline def setInstructionMarkdown(value: String): Self = StObject.set(x, "instructionMarkdown", value.asInstanceOf[js.Any])
    
    inline def setInstructionMarkdownUndefined: Self = StObject.set(x, "instructionMarkdown", js.undefined)
    
    inline def setInstructionReference(value: Reference): Self = StObject.set(x, "instructionReference", value.asInstanceOf[js.Any])
    
    inline def setInstructionReferenceUndefined: Self = StObject.set(x, "instructionReference", js.undefined)
    
    inline def set_instructionMarkdown(value: Element): Self = StObject.set(x, "_instructionMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_instructionMarkdownUndefined: Self = StObject.set(x, "_instructionMarkdown", js.undefined)
  }
}
