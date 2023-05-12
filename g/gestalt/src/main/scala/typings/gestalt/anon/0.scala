package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def dangerouslyDisableOnNavigation(): Unit
}
object `0` {
  
  inline def apply(dangerouslyDisableOnNavigation: () => Unit): `0` = {
    val __obj = js.Dynamic.literal(dangerouslyDisableOnNavigation = js.Any.fromFunction0(dangerouslyDisableOnNavigation))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setDangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
  }
}
