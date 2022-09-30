package typings.dexie.mod

import typings.dexie.anon.Bound
import typings.dexie.anon.Open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieOptions extends StObject {
  
  var IDBKeyRange: js.UndefOr[Bound] = js.undefined
  
  var addons: js.UndefOr[js.Array[js.Function1[/* db */ Dexie, Unit]]] = js.undefined
  
  var allowEmptyDB: js.UndefOr[Boolean] = js.undefined
  
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  
  var chromeTransactionDurability: js.UndefOr[ChromeTransactionDurability] = js.undefined
  
  var indexedDB: js.UndefOr[Open] = js.undefined
  
  var modifyChunkSize: js.UndefOr[Double] = js.undefined
}
object DexieOptions {
  
  inline def apply(): DexieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DexieOptions]
  }
  
  extension [Self <: DexieOptions](x: Self) {
    
    inline def setAddons(value: js.Array[js.Function1[/* db */ Dexie, Unit]]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    inline def setAddonsUndefined: Self = StObject.set(x, "addons", js.undefined)
    
    inline def setAddonsVarargs(value: (js.Function1[/* db */ Dexie, Unit])*): Self = StObject.set(x, "addons", js.Array(value*))
    
    inline def setAllowEmptyDB(value: Boolean): Self = StObject.set(x, "allowEmptyDB", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyDBUndefined: Self = StObject.set(x, "allowEmptyDB", js.undefined)
    
    inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    inline def setChromeTransactionDurability(value: ChromeTransactionDurability): Self = StObject.set(x, "chromeTransactionDurability", value.asInstanceOf[js.Any])
    
    inline def setChromeTransactionDurabilityUndefined: Self = StObject.set(x, "chromeTransactionDurability", js.undefined)
    
    inline def setIDBKeyRange(value: Bound): Self = StObject.set(x, "IDBKeyRange", value.asInstanceOf[js.Any])
    
    inline def setIDBKeyRangeUndefined: Self = StObject.set(x, "IDBKeyRange", js.undefined)
    
    inline def setIndexedDB(value: Open): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
    
    inline def setIndexedDBUndefined: Self = StObject.set(x, "indexedDB", js.undefined)
    
    inline def setModifyChunkSize(value: Double): Self = StObject.set(x, "modifyChunkSize", value.asInstanceOf[js.Any])
    
    inline def setModifyChunkSizeUndefined: Self = StObject.set(x, "modifyChunkSize", js.undefined)
  }
}
