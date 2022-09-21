package typings.elm

import typings.elm.anon.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElmMain[P] extends StObject {
  
  def init(options: Flags): ElmApp[P]
}
object ElmMain {
  
  inline def apply[P](init: Flags => ElmApp[P]): ElmMain[P] = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[ElmMain[P]]
  }
  
  extension [Self <: ElmMain[?], P](x: Self & ElmMain[P]) {
    
    inline def setInit(value: Flags => ElmApp[P]): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
