package typings.glidejsGlide.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Removable extends StObject {
  
  def remove(): Unit
}
object Removable {
  
  inline def apply(remove: () => Unit): Removable = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Removable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Removable] (val x: Self) extends AnyVal {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
