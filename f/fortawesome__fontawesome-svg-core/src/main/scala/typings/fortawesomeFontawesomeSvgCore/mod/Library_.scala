package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library_ extends StObject {
  
  def add(definitions: IconDefinitionOrPack*): Unit = js.native
  
  def reset(): Unit = js.native
}
object Library_ {
  
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => Unit, reset: () => Unit): Library_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Library_]
  }
  
  @scala.inline
  implicit class Library_MutableBuilder[Self <: Library_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: /* repeated */ IconDefinitionOrPack => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
