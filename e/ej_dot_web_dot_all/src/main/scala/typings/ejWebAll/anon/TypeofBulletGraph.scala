package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.BulletGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBulletGraph extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: BulletGraph
}
object TypeofBulletGraph {
  
  inline def apply(Locale: Any, fn: BulletGraph): TypeofBulletGraph = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBulletGraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBulletGraph] (val x: Self) extends AnyVal {
    
    inline def setFn(value: BulletGraph): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
