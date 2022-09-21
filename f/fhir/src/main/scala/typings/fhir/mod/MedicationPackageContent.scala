package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationPackageContent
  extends StObject
     with BackboneElement {
  
  /**
    * The amount of the product that is in the package.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies one of the items in the package.
    */
  var item: Reference
}
object MedicationPackageContent {
  
  inline def apply(item: Reference): MedicationPackageContent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationPackageContent]
  }
  
  extension [Self <: MedicationPackageContent](x: Self) {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setItem(value: Reference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
