package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.BulletGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBulletGraph extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: BulletGraph
}
object TypeofBulletGraph {
  
  inline def apply(Locale: js.Any, fn: BulletGraph): TypeofBulletGraph = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBulletGraph]
  }
  
  extension [Self <: TypeofBulletGraph](x: Self) {
    
    inline def setFn(value: BulletGraph): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
