package typings.ejWebAll.anon

import typings.ejWebAll.ej.Scroller
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScroller extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Scroller
}
object TypeofScroller {
  
  inline def apply(Locale: Any, fn: Scroller): TypeofScroller = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofScroller]
  }
  
  extension [Self <: TypeofScroller](x: Self) {
    
    inline def setFn(value: Scroller): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
