package typings.ejWebAll.anon

import typings.ejWebAll.ej.DropDownTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropDownTree extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: DropDownTree
}
object TypeofDropDownTree {
  
  inline def apply(Locale: Any, fn: DropDownTree): TypeofDropDownTree = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDropDownTree]
  }
  
  extension [Self <: TypeofDropDownTree](x: Self) {
    
    inline def setFn(value: DropDownTree): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
