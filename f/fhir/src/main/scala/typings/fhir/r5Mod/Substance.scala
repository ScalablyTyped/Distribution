package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Substance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _expiry: js.UndefOr[Element] = js.undefined
  
  var _instance: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The level of granularity is defined by the category concepts in the value set.   More fine-grained filtering can be performed using the metadata and/or terminology hierarchy in Substance.code.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This could be a reference to an externally defined code.  It could also be a locally assigned code (e.g. a formulary),  optionally with translations to the standard drug codes.
    */
  var code: CodeableReference
  
  /**
    * A description of the substance - its appearance, handling requirements, and other usage notes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * This identifier is associated with the kind of substance in contrast to the  Substance.instance.identifier which is associated with the package/container.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A substance can be composed of other substances.
    */
  var ingredient: js.UndefOr[js.Array[SubstanceIngredient]] = js.undefined
  
  /**
    * A boolean to indicate if this an instance of a substance or a kind of one (a definition).
    */
  var instance: Boolean
  
  /**
    * The amount of the substance.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Substance: typings.fhir.fhirStrings.Substance
  
  /**
    * A code to indicate if the substance is actively used.
    */
  var status: js.UndefOr[active | inactive | `entered-in-error`] = js.undefined
}
object Substance {
  
  inline def apply(code: CodeableReference, instance: Boolean): Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], resourceType = "Substance")
    __obj.asInstanceOf[Substance]
  }
  
  extension [Self <: Substance](x: Self) {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableReference): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredient(value: js.Array[SubstanceIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: SubstanceIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Substance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_expiry(value: Element): Self = StObject.set(x, "_expiry", value.asInstanceOf[js.Any])
    
    inline def set_expiryUndefined: Self = StObject.set(x, "_expiry", js.undefined)
    
    inline def set_instance(value: Element): Self = StObject.set(x, "_instance", value.asInstanceOf[js.Any])
    
    inline def set_instanceUndefined: Self = StObject.set(x, "_instance", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
