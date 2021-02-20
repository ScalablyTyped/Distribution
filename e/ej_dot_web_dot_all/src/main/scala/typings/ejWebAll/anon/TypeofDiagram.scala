package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.Diagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDiagram extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Diagram = js.native
}
object TypeofDiagram {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Diagram): TypeofDiagram = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDiagram]
  }
  
  @scala.inline
  implicit class TypeofDiagramMutableBuilder[Self <: TypeofDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Diagram): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
