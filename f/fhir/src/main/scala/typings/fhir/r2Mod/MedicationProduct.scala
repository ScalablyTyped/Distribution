package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationProduct
  extends StObject
     with BackboneElement {
  
  /**
    * Information about a group of medication produced or packaged from one production run.
    */
  var batch: js.UndefOr[js.Array[MedicationProductBatch]] = js.undefined
  
  /**
    * Describes the form of the item.  Powder; tablets; carton.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies a particular constituent of interest in the product.
    */
  var ingredient: js.UndefOr[js.Array[MedicationProductIngredient]] = js.undefined
}
object MedicationProduct {
  
  inline def apply(): MedicationProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationProduct] (val x: Self) extends AnyVal {
    
    inline def setBatch(value: js.Array[MedicationProductBatch]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setBatchVarargs(value: MedicationProductBatch*): Self = StObject.set(x, "batch", js.Array(value*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setIngredient(value: js.Array[MedicationProductIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: MedicationProductIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
  }
}
