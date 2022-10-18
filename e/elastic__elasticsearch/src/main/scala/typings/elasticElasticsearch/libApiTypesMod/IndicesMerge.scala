package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMerge extends StObject {
  
  var scheduler: js.UndefOr[IndicesMergeScheduler] = js.undefined
}
object IndicesMerge {
  
  inline def apply(): IndicesMerge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesMerge]
  }
  
  extension [Self <: IndicesMerge](x: Self) {
    
    inline def setScheduler(value: IndicesMergeScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
  }
}
