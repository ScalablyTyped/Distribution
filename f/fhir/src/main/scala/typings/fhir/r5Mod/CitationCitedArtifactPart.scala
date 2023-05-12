package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactPart
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * When referencing a baseCitation, one may inherit any data from the referenced Citation Resource and consider any data in the current Citation Resource as superceding to be specific to the citation of the specified part. For example, the part-specific Citation may have additional contributorship data that supercedes the contributorship data for the full citation when there is a need to uniquely report the contributorship for an image or supplement associated with the fuller citation record.
    */
  var baseCitation: js.UndefOr[Reference] = js.undefined
  
  /**
    * The kind of component.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The specification of the component.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CitationCitedArtifactPart {
  
  inline def apply(): CitationCitedArtifactPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CitationCitedArtifactPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactPart] (val x: Self) extends AnyVal {
    
    inline def setBaseCitation(value: Reference): Self = StObject.set(x, "baseCitation", value.asInstanceOf[js.Any])
    
    inline def setBaseCitationUndefined: Self = StObject.set(x, "baseCitation", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
