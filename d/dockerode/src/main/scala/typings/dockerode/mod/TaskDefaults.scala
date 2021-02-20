package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefaults extends StObject {
  
  var LogDriver: js.UndefOr[Driver] = js.native
}
object TaskDefaults {
  
  @scala.inline
  def apply(): TaskDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefaults]
  }
  
  @scala.inline
  implicit class TaskDefaultsMutableBuilder[Self <: TaskDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogDriver(value: Driver): Self = StObject.set(x, "LogDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogDriverUndefined: Self = StObject.set(x, "LogDriver", js.undefined)
  }
}
