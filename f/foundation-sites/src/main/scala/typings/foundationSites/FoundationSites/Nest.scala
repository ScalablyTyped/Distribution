package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nest extends StObject {
  
  def Burn(menu: js.Any, `type`: js.Any): Unit = js.native
  
  def Feather(menu: js.Any, `type`: js.Any): Unit = js.native
}
object Nest {
  
  @scala.inline
  def apply(Burn: (js.Any, js.Any) => Unit, Feather: (js.Any, js.Any) => Unit): Nest = {
    val __obj = js.Dynamic.literal(Burn = js.Any.fromFunction2(Burn), Feather = js.Any.fromFunction2(Feather))
    __obj.asInstanceOf[Nest]
  }
  
  @scala.inline
  implicit class NestMutableBuilder[Self <: Nest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBurn(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "Burn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeather(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "Feather", js.Any.fromFunction2(value))
  }
}
