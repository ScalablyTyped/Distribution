package typings.ejWebAll.anon

import typings.ejWebAll.ej.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTab extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Tab
}
object TypeofTab {
  
  inline def apply(Locale: Any, fn: Tab): TypeofTab = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTab] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Tab): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
