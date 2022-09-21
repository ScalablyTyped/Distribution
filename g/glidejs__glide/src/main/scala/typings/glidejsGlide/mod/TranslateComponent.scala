package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateComponent
  extends StObject
     with Component {
  
  def remove(): Unit
  
  def set(value: Double): Unit
}
object TranslateComponent {
  
  inline def apply(remove: () => Unit, set: Double => Unit): TranslateComponent = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[TranslateComponent]
  }
  
  extension [Self <: TranslateComponent](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
