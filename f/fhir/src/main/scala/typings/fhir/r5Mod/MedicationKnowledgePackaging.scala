package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgePackaging
  extends StObject
     with BackboneElement {
  
  /**
    * The cost of the packaged medication.
    */
  var cost: js.UndefOr[js.Array[MedicationKnowledgeCost]] = js.undefined
  
  /**
    * A reference to a PackagedProductDefinition that provides the details of the product that is in the packaging and is being priced.
    */
  var packagedProduct: js.UndefOr[Reference] = js.undefined
}
object MedicationKnowledgePackaging {
  
  inline def apply(): MedicationKnowledgePackaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgePackaging]
  }
  
  extension [Self <: MedicationKnowledgePackaging](x: Self) {
    
    inline def setCost(value: js.Array[MedicationKnowledgeCost]): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCostVarargs(value: MedicationKnowledgeCost*): Self = StObject.set(x, "cost", js.Array(value*))
    
    inline def setPackagedProduct(value: Reference): Self = StObject.set(x, "packagedProduct", value.asInstanceOf[js.Any])
    
    inline def setPackagedProductUndefined: Self = StObject.set(x, "packagedProduct", js.undefined)
  }
}
