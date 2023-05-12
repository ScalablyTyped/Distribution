package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManufacturedItemDefinitionComponent
  extends StObject
     with BackboneElement {
  
  /**
    * The measurable amount of total quantity of all substances in the component, expressable in different ways (e.g. by mass or volume).
    */
  var amount: js.UndefOr[js.Array[Quantity]] = js.undefined
  
  /**
    * A component that this component contains or is made from.
    */
  var component: js.UndefOr[js.Array[ManufacturedItemDefinitionComponent]] = js.undefined
  
  /**
    * A reference to a constituent of the manufactured item as a whole, linked here so that its component location within the item can be indicated. This not where the item's ingredient are primarily stated (for which see Ingredient.for or ManufacturedItemDefinition.ingredient).
    */
  var constituent: js.UndefOr[js.Array[ManufacturedItemDefinitionComponentConstituent]] = js.undefined
  
  /**
    * The function of this component within the item e.g. delivers active ingredient, masks taste.
    */
  var function: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * General characteristics of this component.
    */
  var property: js.UndefOr[js.Array[ManufacturedItemDefinitionProperty]] = js.undefined
  
  /**
    * Defining type of the component e.g. shell, layer, ink.
    */
  var `type`: CodeableConcept
}
object ManufacturedItemDefinitionComponent {
  
  inline def apply(`type`: CodeableConcept): ManufacturedItemDefinitionComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturedItemDefinitionComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManufacturedItemDefinitionComponent] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: js.Array[Quantity]): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAmountVarargs(value: Quantity*): Self = StObject.set(x, "amount", js.Array(value*))
    
    inline def setComponent(value: js.Array[ManufacturedItemDefinitionComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: ManufacturedItemDefinitionComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setConstituent(value: js.Array[ManufacturedItemDefinitionComponentConstituent]): Self = StObject.set(x, "constituent", value.asInstanceOf[js.Any])
    
    inline def setConstituentUndefined: Self = StObject.set(x, "constituent", js.undefined)
    
    inline def setConstituentVarargs(value: ManufacturedItemDefinitionComponentConstituent*): Self = StObject.set(x, "constituent", js.Array(value*))
    
    inline def setFunction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setFunctionVarargs(value: CodeableConcept*): Self = StObject.set(x, "function", js.Array(value*))
    
    inline def setProperty(value: js.Array[ManufacturedItemDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: ManufacturedItemDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
