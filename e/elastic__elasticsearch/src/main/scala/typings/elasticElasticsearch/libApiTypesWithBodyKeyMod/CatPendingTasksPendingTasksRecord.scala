package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatPendingTasksPendingTasksRecord extends StObject {
  
  var insertOrder: js.UndefOr[String] = js.undefined
  
  var o: js.UndefOr[String] = js.undefined
  
  var p: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[String] = js.undefined
  
  var s: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var t: js.UndefOr[String] = js.undefined
  
  var timeInQueue: js.UndefOr[String] = js.undefined
}
object CatPendingTasksPendingTasksRecord {
  
  inline def apply(): CatPendingTasksPendingTasksRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatPendingTasksPendingTasksRecord]
  }
  
  extension [Self <: CatPendingTasksPendingTasksRecord](x: Self) {
    
    inline def setInsertOrder(value: String): Self = StObject.set(x, "insertOrder", value.asInstanceOf[js.Any])
    
    inline def setInsertOrderUndefined: Self = StObject.set(x, "insertOrder", js.undefined)
    
    inline def setO(value: String): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setTimeInQueue(value: String): Self = StObject.set(x, "timeInQueue", value.asInstanceOf[js.Any])
    
    inline def setTimeInQueueUndefined: Self = StObject.set(x, "timeInQueue", js.undefined)
  }
}
