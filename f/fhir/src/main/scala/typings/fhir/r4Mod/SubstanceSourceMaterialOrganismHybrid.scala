package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterialOrganismHybrid
  extends StObject
     with BackboneElement {
  
  var _maternalOrganismId: js.UndefOr[Element] = js.undefined
  
  var _maternalOrganismName: js.UndefOr[Element] = js.undefined
  
  var _paternalOrganismId: js.UndefOr[Element] = js.undefined
  
  var _paternalOrganismName: js.UndefOr[Element] = js.undefined
  
  /**
    * The hybrid type of an organism shall be specified.
    */
  var hybridType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The identifier of the maternal species constituting the hybrid organism shall be specified based on a controlled vocabulary. For plants, the parents aren’t always known, and it is unlikely that it will be known which is maternal and which is paternal.
    */
  var maternalOrganismId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the maternal species constituting the hybrid organism shall be specified. For plants, the parents aren’t always known, and it is unlikely that it will be known which is maternal and which is paternal.
    */
  var maternalOrganismName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the paternal species constituting the hybrid organism shall be specified based on a controlled vocabulary.
    */
  var paternalOrganismId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the paternal species constituting the hybrid organism shall be specified.
    */
  var paternalOrganismName: js.UndefOr[String] = js.undefined
}
object SubstanceSourceMaterialOrganismHybrid {
  
  inline def apply(): SubstanceSourceMaterialOrganismHybrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSourceMaterialOrganismHybrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSourceMaterialOrganismHybrid] (val x: Self) extends AnyVal {
    
    inline def setHybridType(value: CodeableConcept): Self = StObject.set(x, "hybridType", value.asInstanceOf[js.Any])
    
    inline def setHybridTypeUndefined: Self = StObject.set(x, "hybridType", js.undefined)
    
    inline def setMaternalOrganismId(value: String): Self = StObject.set(x, "maternalOrganismId", value.asInstanceOf[js.Any])
    
    inline def setMaternalOrganismIdUndefined: Self = StObject.set(x, "maternalOrganismId", js.undefined)
    
    inline def setMaternalOrganismName(value: String): Self = StObject.set(x, "maternalOrganismName", value.asInstanceOf[js.Any])
    
    inline def setMaternalOrganismNameUndefined: Self = StObject.set(x, "maternalOrganismName", js.undefined)
    
    inline def setPaternalOrganismId(value: String): Self = StObject.set(x, "paternalOrganismId", value.asInstanceOf[js.Any])
    
    inline def setPaternalOrganismIdUndefined: Self = StObject.set(x, "paternalOrganismId", js.undefined)
    
    inline def setPaternalOrganismName(value: String): Self = StObject.set(x, "paternalOrganismName", value.asInstanceOf[js.Any])
    
    inline def setPaternalOrganismNameUndefined: Self = StObject.set(x, "paternalOrganismName", js.undefined)
    
    inline def set_maternalOrganismId(value: Element): Self = StObject.set(x, "_maternalOrganismId", value.asInstanceOf[js.Any])
    
    inline def set_maternalOrganismIdUndefined: Self = StObject.set(x, "_maternalOrganismId", js.undefined)
    
    inline def set_maternalOrganismName(value: Element): Self = StObject.set(x, "_maternalOrganismName", value.asInstanceOf[js.Any])
    
    inline def set_maternalOrganismNameUndefined: Self = StObject.set(x, "_maternalOrganismName", js.undefined)
    
    inline def set_paternalOrganismId(value: Element): Self = StObject.set(x, "_paternalOrganismId", value.asInstanceOf[js.Any])
    
    inline def set_paternalOrganismIdUndefined: Self = StObject.set(x, "_paternalOrganismId", js.undefined)
    
    inline def set_paternalOrganismName(value: Element): Self = StObject.set(x, "_paternalOrganismName", value.asInstanceOf[js.Any])
    
    inline def set_paternalOrganismNameUndefined: Self = StObject.set(x, "_paternalOrganismName", js.undefined)
  }
}
