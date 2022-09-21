package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagedProductDefinitionPackageContainedItem
  extends StObject
     with BackboneElement {
  
  /**
    * The number of this type of item within this packaging.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The actual item(s) of medication, as manufactured, or a device (typically, but not necessarily, a co-packaged one), or other medically related item (such as food, biologicals, raw materials, medical fluids, gases etc.), as contained in the package. This also allows another whole packaged product to be included, which is solely for the case where a package of other entire packages is wanted - such as a wholesale or distribution pack (for layers within one package, use PackagedProductDefinition.package.package).
    */
  var item: CodeableReference
}
object PackagedProductDefinitionPackageContainedItem {
  
  inline def apply(item: CodeableReference): PackagedProductDefinitionPackageContainedItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagedProductDefinitionPackageContainedItem]
  }
  
  extension [Self <: PackagedProductDefinitionPackageContainedItem](x: Self) {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setItem(value: CodeableReference): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
