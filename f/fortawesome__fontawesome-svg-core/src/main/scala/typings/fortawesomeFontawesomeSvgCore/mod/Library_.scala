package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library_ extends StObject {
  
  def add(definitions: IconDefinitionOrPack*): Unit
  
  def reset(): Unit
}
object Library_ {
  
  inline def apply(add: /* repeated */ IconDefinitionOrPack => Unit, reset: () => Unit): Library_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Library_]
  }
  
  extension [Self <: Library_](x: Self) {
    
    inline def setAdd(value: /* repeated */ IconDefinitionOrPack => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
