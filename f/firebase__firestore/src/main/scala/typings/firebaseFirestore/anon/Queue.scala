package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueMod.AsyncQueue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue extends StObject {
  
  var dontPurgeData: js.UndefOr[Boolean] = js.undefined
  
  var queue: js.UndefOr[AsyncQueue] = js.undefined
  
  var schemaVersion: js.UndefOr[Double] = js.undefined
  
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}
object Queue {
  
  inline def apply(): Queue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
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
