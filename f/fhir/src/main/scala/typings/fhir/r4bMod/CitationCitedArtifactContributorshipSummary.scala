package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactContributorshipSummary
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Used to code the producer or rule for creating the display string.
    */
  var source: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The format for the display string.
    */
  var style: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Used most commonly to express an author list or a contributorship statement.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The display string for the author list, contributor list, or contributorship statement.
    */
  var value: String
}
object CitationCitedArtifactContributorshipSummary {
  
  inline def apply(value: String): CitationCitedArtifactContributorshipSummary = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactContributorshipSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactContributorshipSummary] (val x: Self) extends AnyVal {
    
    inline def setSource(value: CodeableConcept): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStyle(value: CodeableConcept): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
