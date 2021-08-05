package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/interchange.html#javascript-reference
trait Interchange extends StObject {
  
  def destroy(): Unit
  
  def replace(path: String): Unit
}
object Interchange {
  
  inline def apply(destroy: () => Unit, replace: String => Unit): Interchange = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), replace = js.Any.fromFunction1(replace))
    __obj.asInstanceOf[Interchange]
  }
  
  extension [Self <: Interchange](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
  }
}
