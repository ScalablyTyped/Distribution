package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainResource
  extends StObject
     with Resource {
  
  /**
    * This should never be done when the content can be identified properly, as once identification is lost, it is extremely difficult (and context dependent) to restore it again. Contained resources may have profiles and tags In their meta elements, but SHALL NOT have security labels.
    */
  var contained: js.UndefOr[js.Array[FhirResource]] = js.undefined
  
  /**
    * There can be no stigma associated with the use of extensions by any application, project, or standard - regardless of the institution or jurisdiction that uses or defines the extensions.  The use of extensions is what allows the FHIR specification to retain a core level of simplicity for everyone.
    */
  var `extension`: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * There can be no stigma associated with the use of extensions by any application, project, or standard - regardless of the institution or jurisdiction that uses or defines the extensions.  The use of extensions is what allows the FHIR specification to retain a core level of simplicity for everyone.
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * Contained resources do not have narrative. Resources that are not contained SHOULD have a narrative. In some cases, a resource may only have text with little or no additional discrete data (as long as all minOccurs=1 elements are satisfied).  This may be necessary for data from legacy systems where information is captured as a "text blob" or where text is additionally entered raw or narrated and encoded information is added later.
    */
  var text: js.UndefOr[Narrative] = js.undefined
}
object DomainResource {
  
  inline def apply(resourceType: String): DomainResource = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainResource] (val x: Self) extends AnyVal {
    
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
