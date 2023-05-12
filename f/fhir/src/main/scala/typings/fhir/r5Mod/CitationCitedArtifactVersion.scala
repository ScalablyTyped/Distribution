package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationCitedArtifactVersion
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * When referencing a baseCitation, one may inherit any data from the referenced Citation Resource and consider any data in the current Citation Resource as superceding to be version-specific.
    */
  var baseCitation: js.UndefOr[Reference] = js.undefined
  
  /**
    * The version number or other version identifier.
    */
  var value: String
}
object CitationCitedArtifactVersion {
  
  inline def apply(value: String): CitationCitedArtifactVersion = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationCitedArtifactVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CitationCitedArtifactVersion] (val x: Self) extends AnyVal {
    
    inline def setBaseCitation(value: Reference): Self = StObject.set(x, "baseCitation", value.asInstanceOf[js.Any])
    
    inline def setBaseCitationUndefined: Self = StObject.set(x, "baseCitation", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
