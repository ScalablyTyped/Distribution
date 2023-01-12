package typings.ejWebAll.anon

import typings.ejWebAll.ej.TreeGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreeGrid extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: TreeGrid
}
object TypeofTreeGrid {
  
  inline def apply(Locale: Any, fn: TreeGrid): TypeofTreeGrid = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTreeGrid] (val x: Self) extends AnyVal {
    
    inline def setFn(value: TreeGrid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
