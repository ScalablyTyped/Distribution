package typings.elm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElmComponent[P] extends StObject {
  
  var ports: P
}
object ElmComponent {
  
  @scala.inline
  def apply[P](ports: P): ElmComponent[P] = {
    val __obj = js.Dynamic.literal(ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElmComponent[P]]
  }
  
  @scala.inline
  implicit class ElmComponentMutableBuilder[Self <: ElmComponent[?], P] (val x: Self & ElmComponent[P]) extends AnyVal {
    
    @scala.inline
    def setPorts(value: P): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
