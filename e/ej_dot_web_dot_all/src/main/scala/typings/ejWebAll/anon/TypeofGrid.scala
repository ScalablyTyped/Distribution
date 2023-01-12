package typings.ejWebAll.anon

import typings.ejWebAll.ej.Grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGrid extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Grid
}
object TypeofGrid {
  
  inline def apply(Locale: Any, fn: Grid): TypeofGrid = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofGrid] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Grid): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
