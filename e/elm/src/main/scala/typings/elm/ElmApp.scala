package typings.elm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElmApp[P] extends StObject {
  
  var ports: P
}
object ElmApp {
  
  inline def apply[P](ports: P): ElmApp[P] = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElmApp[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElmApp[?], P] (val x: Self & ElmApp[P]) extends AnyVal {
    
    inline def setPorts(value: P): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
