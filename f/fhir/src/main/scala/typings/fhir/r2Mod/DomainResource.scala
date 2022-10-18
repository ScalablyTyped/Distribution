package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainResource
  extends StObject
     with Resource {
  
  /**
    * These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope.
    */
  var contained: js.UndefOr[js.Array[FhirResource]] = js.undefined
  
  /**
    * May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension.
    */
  var `extension`: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety.
    */
  var text: js.UndefOr[Narrative] = js.undefined
}
object DomainResource {
  
  inline def apply(resourceType: String): DomainResource = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainResource]
  }
  
  extension [Self <: DomainResource](x: Self) {
    
    inline def setContained(value: js.Array[FhirResource]): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
    
    inline def setContainedUndefined: Self = StObject.set(x, "contained", js.undefined)
    
    inline def setContainedVarargs(value: FhirResource*): Self = StObject.set(x, "contained", js.Array(value*))
    
    inline def setExtension(value: js.Array[Extension]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: Extension*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setModifierExtension(value: js.Array[Extension]): Self = StObject.set(x, "modifierExtension", value.asInstanceOf[js.Any])
    
    inline def setModifierExtensionUndefined: Self = StObject.set(x, "modifierExtension", js.undefined)
    
    inline def setModifierExtensionVarargs(value: Extension*): Self = StObject.set(x, "modifierExtension", js.Array(value*))
    
    inline def setText(value: Narrative): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
