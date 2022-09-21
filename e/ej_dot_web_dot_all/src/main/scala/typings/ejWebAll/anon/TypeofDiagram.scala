package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Diagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDiagram extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Diagram
}
object TypeofDiagram {
  
  inline def apply(Locale: Any, fn: Diagram): TypeofDiagram = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDiagram]
  }
  
  extension [Self <: TypeofDiagram](x: Self) {
    
    inline def setFn(value: Diagram): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
