package typings.ejWebAll.anon

import typings.ejWebAll.ej.TagCloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTagCloud extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: TagCloud
}
object TypeofTagCloud {
  
  inline def apply(Locale: Any, fn: TagCloud): TypeofTagCloud = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTagCloud]
  }
  
  extension [Self <: TypeofTagCloud](x: Self) {
    
    inline def setFn(value: TagCloud): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
