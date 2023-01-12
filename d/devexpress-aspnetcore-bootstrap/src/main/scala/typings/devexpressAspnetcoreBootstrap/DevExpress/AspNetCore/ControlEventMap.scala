package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlEventMap extends StObject {
  
  var init: EventArgs
}
object ControlEventMap {
  
  inline def apply(init: EventArgs): ControlEventMap = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlEventMap] (val x: Self) extends AnyVal {
    
    inline def setInit(value: EventArgs): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
  }
}
