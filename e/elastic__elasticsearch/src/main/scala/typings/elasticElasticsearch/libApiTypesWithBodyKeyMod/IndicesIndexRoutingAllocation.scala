package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexRoutingAllocation extends StObject {
  
  var disk: js.UndefOr[IndicesIndexRoutingAllocationDisk] = js.undefined
  
  var enable: js.UndefOr[IndicesIndexRoutingAllocationOptions] = js.undefined
  
  var include: js.UndefOr[IndicesIndexRoutingAllocationInclude] = js.undefined
  
  var initial_recovery: js.UndefOr[IndicesIndexRoutingAllocationInitialRecovery] = js.undefined
}
object IndicesIndexRoutingAllocation {
  
  inline def apply(): IndicesIndexRoutingAllocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexRoutingAllocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexRoutingAllocation] (val x: Self) extends AnyVal {
    
    inline def setDisk(value: IndicesIndexRoutingAllocationDisk): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setEnable(value: IndicesIndexRoutingAllocationOptions): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setInclude(value: IndicesIndexRoutingAllocationInclude): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setInitial_recovery(value: IndicesIndexRoutingAllocationInitialRecovery): Self = StObject.set(x, "initial_recovery", value.asInstanceOf[js.Any])
    
    inline def setInitial_recoveryUndefined: Self = StObject.set(x, "initial_recovery", js.undefined)
  }
}
