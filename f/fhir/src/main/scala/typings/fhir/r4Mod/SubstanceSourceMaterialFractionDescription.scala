package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceSourceMaterialFractionDescription
  extends StObject
     with BackboneElement {
  
  var _fraction: js.UndefOr[Element] = js.undefined
  
  /**
    * This element is capturing information about the fraction of a plant part, or human plasma for fractionation.
    */
  var fraction: js.UndefOr[String] = js.undefined
  
  /**
    * The specific type of the material constituting the component. For Herbal preparations the particulars of the extracts (liquid/dry) is described in Specified Substance Group 1.
    */
  var materialType: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceSourceMaterialFractionDescription {
  
  inline def apply(): SubstanceSourceMaterialFractionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceSourceMaterialFractionDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceSourceMaterialFractionDescription] (val x: Self) extends AnyVal {
    
    inline def setFraction(value: String): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    inline def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
    
    inline def setMaterialType(value: CodeableConcept): Self = StObject.set(x, "materialType", value.asInstanceOf[js.Any])
    
    inline def setMaterialTypeUndefined: Self = StObject.set(x, "materialType", js.undefined)
    
    inline def set_fraction(value: Element): Self = StObject.set(x, "_fraction", value.asInstanceOf[js.Any])
    
    inline def set_fractionUndefined: Self = StObject.set(x, "_fraction", js.undefined)
  }
}
