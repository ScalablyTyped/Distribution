package typings.dexie.mod

import typings.dexie.anon.TypeofIDBKeyRange
import typings.std.IDBFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexieDOMDependencies extends StObject {
  
  var IDBKeyRange: TypeofIDBKeyRange
  
  var indexedDB: IDBFactory
}
object DexieDOMDependencies {
  
  inline def apply(IDBKeyRange: TypeofIDBKeyRange, indexedDB: IDBFactory): DexieDOMDependencies = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[DexieDOMDependencies]
  }
  
  extension [Self <: DexieDOMDependencies](x: Self) {
    
    inline def setIDBKeyRange(value: TypeofIDBKeyRange): Self = StObject.set(x, "IDBKeyRange", value.asInstanceOf[js.Any])
    
    inline def setIndexedDB(value: IDBFactory): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
  }
}
