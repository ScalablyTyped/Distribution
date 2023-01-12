package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefaults extends StObject {
  
  var LogDriver: js.UndefOr[Driver] = js.undefined
}
object TaskDefaults {
  
  inline def apply(): TaskDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskDefaults] (val x: Self) extends AnyVal {
    
    inline def setLogDriver(value: Driver): Self = StObject.set(x, "LogDriver", value.asInstanceOf[js.Any])
    
    inline def setLogDriverUndefined: Self = StObject.set(x, "LogDriver", js.undefined)
  }
}
