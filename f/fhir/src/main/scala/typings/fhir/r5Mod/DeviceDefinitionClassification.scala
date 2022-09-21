package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionClassification
  extends StObject
     with BackboneElement {
  
  /**
    * Further information qualifying this classification of the device model.
    */
  var justification: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * A classification or risk class of the device model.
    */
  var `type`: CodeableConcept
}
object DeviceDefinitionClassification {
  
  inline def apply(`type`: CodeableConcept): DeviceDefinitionClassification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionClassification]
  }
  
  extension [Self <: DeviceDefinitionClassification](x: Self) {
    
    inline def setJustification(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setJustificationVarargs(value: RelatedArtifact*): Self = StObject.set(x, "justification", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
