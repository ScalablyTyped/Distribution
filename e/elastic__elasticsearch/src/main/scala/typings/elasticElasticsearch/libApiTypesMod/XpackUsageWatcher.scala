package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageWatcher
  extends StObject
     with XpackUsageBase {
  
  var count: XpackUsageCounter
  
  var execution: XpackUsageWatcherActions
  
  var watch: XpackUsageWatcherWatch
}
object XpackUsageWatcher {
  
  inline def apply(
    available: Boolean,
    count: XpackUsageCounter,
    enabled: Boolean,
    execution: XpackUsageWatcherActions,
    watch: XpackUsageWatcherWatch
  ): XpackUsageWatcher = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageWatcher]
  }
  
  extension [Self <: XpackUsageWatcher](x: Self) {
    
    inline def setCount(value: XpackUsageCounter): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setExecution(value: XpackUsageWatcherActions): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: XpackUsageWatcherWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
