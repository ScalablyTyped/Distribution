package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionNameNamePart
  extends StObject
     with BackboneElement {
  
  var _part: js.UndefOr[Element] = js.undefined
  
  /**
    * A fragment of a product name.
    */
  var part: String
  
  /**
    * Identifying type for this part of the name (e.g. strength part).
    */
  var `type`: CodeableConcept
}
object MedicinalProductDefinitionNameNamePart {
  
  inline def apply(part: String, `type`: CodeableConcept): MedicinalProductDefinitionNameNamePart = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionNameNamePart]
  }
  
  extension [Self <: MedicinalProductDefinitionNameNamePart](x: Self) {
    
    inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_part(value: Element): Self = StObject.set(x, "_part", value.asInstanceOf[js.Any])
    
    inline def set_partUndefined: Self = StObject.set(x, "_part", js.undefined)
  }
}
