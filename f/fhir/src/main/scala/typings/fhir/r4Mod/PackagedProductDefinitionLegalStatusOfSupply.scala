package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagedProductDefinitionLegalStatusOfSupply
  extends StObject
     with BackboneElement {
  
  /**
    * The actual status of supply. In what situation this package type may be supplied for use.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The place where the legal status of supply applies. When not specified, this indicates it is unknown in this context.
    */
  var jurisdiction: js.UndefOr[CodeableConcept] = js.undefined
}
object PackagedProductDefinitionLegalStatusOfSupply {
  
  inline def apply(): PackagedProductDefinitionLegalStatusOfSupply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagedProductDefinitionLegalStatusOfSupply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagedProductDefinitionLegalStatusOfSupply] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setJurisdiction(value: CodeableConcept): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
  }
}
