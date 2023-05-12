package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HrefUndefined extends StObject {
  
  var href: scala.Unit
}
object HrefUndefined {
  
  inline def apply(href: scala.Unit): HrefUndefined = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HrefUndefined] (val x: Self) extends AnyVal {
    
    inline def setHref(value: scala.Unit): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
