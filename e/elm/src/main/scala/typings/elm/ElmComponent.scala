package typings.elm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElmComponent[P] extends StObject {
  
  var ports: P
}
object ElmComponent {
  
  inline def apply[P](ports: P): ElmComponent[P] = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElmComponent[P]]
  }
  
  extension [Self <: ElmComponent[?], P](x: Self & ElmComponent[P]) {
    
    inline def setPorts(value: P): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
