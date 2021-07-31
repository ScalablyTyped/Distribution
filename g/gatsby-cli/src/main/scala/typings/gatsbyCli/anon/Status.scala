package typings.gatsbyCli.anon

import typings.gatsbyCli.constantsMod.ActivityStatuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var id: String
  
  var status: ActivityStatuses
}
object Status {
  
  @scala.inline
  def apply(id: String, status: ActivityStatuses): Status = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ActivityStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
