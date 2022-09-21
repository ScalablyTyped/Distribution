package typings.ejWebAll.anon

import typings.ejWebAll.ej.ListView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofListView extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: ListView
}
object TypeofListView {
  
  inline def apply(Locale: Any, fn: ListView): TypeofListView = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListView]
  }
  
  extension [Self <: TypeofListView](x: Self) {
    
    inline def setFn(value: ListView): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
