package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/toggler.html#javascript-reference
trait Toggler extends StObject {
  
  def toggle(): Unit
}
object Toggler {
  
  inline def apply(toggle: () => Unit): Toggler = {
    val __obj = js.Dynamic.literal(toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Toggler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toggler] (val x: Self) extends AnyVal {
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
