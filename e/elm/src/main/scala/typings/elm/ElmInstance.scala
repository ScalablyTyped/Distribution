package typings.elm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElmInstance[P] extends StObject {
  
  var Main: ElmMain[P]
}
object ElmInstance {
  
  inline def apply[P](Main: ElmMain[P]): ElmInstance[P] = {
    val __obj = js.Dynamic.literal(Main = Main.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElmInstance[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElmInstance[?], P] (val x: Self & ElmInstance[P]) extends AnyVal {
    
    inline def setMain(value: ElmMain[P]): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
  }
}
