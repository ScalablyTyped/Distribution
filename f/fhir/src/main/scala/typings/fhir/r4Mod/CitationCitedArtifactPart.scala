package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactPart
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The citation for the full article or artifact.
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
  
  extension [Self <: CitationCitedArtifactPart](x: Self) {
    
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
