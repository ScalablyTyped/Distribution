package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinTokens extends StObject {
  
  var Manager: String
  
  var Worker: String
}
object JoinTokens {
  
  inline def apply(Manager: String, Worker: String): JoinTokens = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any], Worker = Worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinTokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinTokens] (val x: Self) extends AnyVal {
    
    inline def setManager(value: String): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
    
    inline def setWorker(value: String): Self = StObject.set(x, "Worker", value.asInstanceOf[js.Any])
  }
}
