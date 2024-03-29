package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngineHttpQueue extends StObject {
  
  var appEngineRoutingOverride: AppEngineRouting
}
object AppEngineHttpQueue {
  
  inline def apply(appEngineRoutingOverride: AppEngineRouting): AppEngineHttpQueue = {
    val __obj = js.Dynamic.literal(appEngineRoutingOverride = appEngineRoutingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpQueue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppEngineHttpQueue] (val x: Self) extends AnyVal {
    
    inline def setAppEngineRoutingOverride(value: AppEngineRouting): Self = StObject.set(x, "appEngineRoutingOverride", value.asInstanceOf[js.Any])
  }
}
