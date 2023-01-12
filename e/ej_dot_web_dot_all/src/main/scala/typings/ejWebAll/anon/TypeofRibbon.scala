package typings.ejWebAll.anon

import typings.ejWebAll.ej.Ribbon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRibbon extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Ribbon
}
object TypeofRibbon {
  
  inline def apply(Locale: Any, fn: Ribbon): TypeofRibbon = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRibbon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRibbon] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Ribbon): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
