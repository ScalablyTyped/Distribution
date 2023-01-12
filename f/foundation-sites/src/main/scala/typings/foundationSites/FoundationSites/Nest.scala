package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nest extends StObject {
  
  def Burn(menu: Any, `type`: Any): Unit
  
  def Feather(menu: Any, `type`: Any): Unit
}
object Nest {
  
  inline def apply(Burn: (Any, Any) => Unit, Feather: (Any, Any) => Unit): Nest = {
    val __obj = js.Dynamic.literal(Burn = js.Any.fromFunction2(Burn), Feather = js.Any.fromFunction2(Feather))
    __obj.asInstanceOf[Nest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nest] (val x: Self) extends AnyVal {
    
    inline def setBurn(value: (Any, Any) => Unit): Self = StObject.set(x, "Burn", js.Any.fromFunction2(value))
    
    inline def setFeather(value: (Any, Any) => Unit): Self = StObject.set(x, "Feather", js.Any.fromFunction2(value))
  }
}
