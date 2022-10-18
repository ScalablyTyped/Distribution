package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DontPurgeData extends StObject {
  
  var dontPurgeData: js.UndefOr[Boolean] = js.undefined
  
  var queue: js.UndefOr[AsyncQueue] = js.undefined
  
  var schemaVersion: js.UndefOr[Double] = js.undefined
  
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}
object DontPurgeData {
  
  inline def apply(): DontPurgeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DontPurgeData]
  }
  
  extension [Self <: DontPurgeData](x: Self) {
    
    inline def setDontPurgeData(value: Boolean): Self = StObject.set(x, "dontPurgeData", value.asInstanceOf[js.Any])
    
    inline def setDontPurgeDataUndefined: Self = StObject.set(x, "dontPurgeData", js.undefined)
    
    inline def setQueue(value: AsyncQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setSchemaVersion(value: Double): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    inline def setSynchronizeTabs(value: Boolean): Self = StObject.set(x, "synchronizeTabs", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeTabsUndefined: Self = StObject.set(x, "synchronizeTabs", js.undefined)
  }
}
