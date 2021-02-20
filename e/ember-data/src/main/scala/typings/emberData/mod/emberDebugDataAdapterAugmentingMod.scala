package typings.emberData.mod

import typings.emberData.mod.DS.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberDebugDataAdapterAugmentingMod {
  
  @js.native
  trait DataAdapter extends StObject {
    
    var store: Store = js.native
  }
  object DataAdapter {
    
    @scala.inline
    def apply(store: Store): DataAdapter = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataAdapter]
    }
    
    @scala.inline
    implicit class DataAdapterMutableBuilder[Self <: DataAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
