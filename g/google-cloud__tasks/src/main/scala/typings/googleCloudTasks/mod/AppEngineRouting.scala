package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppEngineRouting extends StObject {
  
  var host: String = js.native
  
  var instance: String = js.native
  
  var service: String = js.native
  
  var version: String = js.native
}
object AppEngineRouting {
  
  @scala.inline
  def apply(host: String, instance: String, service: String, version: String): AppEngineRouting = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineRouting]
  }
  
  @scala.inline
  implicit class AppEngineRoutingMutableBuilder[Self <: AppEngineRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
