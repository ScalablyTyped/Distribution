package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkPort
  extends StObject
     with ElkShape {
  
  @JSName("id")
  var id_ElkPort: String
}
object ElkPort {
  
  inline def apply(id: String): ElkPort = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElkPort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkPort] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
