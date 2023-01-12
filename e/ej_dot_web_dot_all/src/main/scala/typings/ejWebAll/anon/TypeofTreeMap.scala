package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.TreeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTreeMap extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: TreeMap
}
object TypeofTreeMap {
  
  inline def apply(Locale: Any, fn: TreeMap): TypeofTreeMap = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTreeMap] (val x: Self) extends AnyVal {
    
    inline def setFn(value: TreeMap): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
