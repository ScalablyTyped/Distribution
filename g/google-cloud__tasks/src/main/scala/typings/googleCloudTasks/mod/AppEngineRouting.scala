package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngineRouting extends StObject {
  
  var host: String
  
  var instance: String
  
  var service: String
  
  var version: String
}
object AppEngineRouting {
  
  inline def apply(host: String, instance: String, service: String, version: String): AppEngineRouting = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineRouting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppEngineRouting] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
