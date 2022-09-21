package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventorySizeTargeting extends StObject {
  
  /**
    * A list of inventory sizes to be excluded.
    */
  var excludedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.undefined
  
  /**
    * A list of inventory sizes to be included.
    */
  var targetedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.undefined
}
object SchemaInventorySizeTargeting {
  
  inline def apply(): SchemaInventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventorySizeTargeting]
  }
  
  extension [Self <: SchemaInventorySizeTargeting](x: Self) {
    
    inline def setExcludedInventorySizes(value: js.Array[SchemaAdSize]): Self = StObject.set(x, "excludedInventorySizes", value.asInstanceOf[js.Any])
    
    inline def setExcludedInventorySizesUndefined: Self = StObject.set(x, "excludedInventorySizes", js.undefined)
    
    inline def setExcludedInventorySizesVarargs(value: SchemaAdSize*): Self = StObject.set(x, "excludedInventorySizes", js.Array(value*))
    
    inline def setTargetedInventorySizes(value: js.Array[SchemaAdSize]): Self = StObject.set(x, "targetedInventorySizes", value.asInstanceOf[js.Any])
    
    inline def setTargetedInventorySizesUndefined: Self = StObject.set(x, "targetedInventorySizes", js.undefined)
    
    inline def setTargetedInventorySizesVarargs(value: SchemaAdSize*): Self = StObject.set(x, "targetedInventorySizes", js.Array(value*))
  }
}
