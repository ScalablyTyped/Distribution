package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAction extends StObject {
  
  def action(): Unit
  
  var id: String | Double
  
  var text: String
}
object ChartAction {
  
  inline def apply(action: () => Unit, id: String | Double, text: String): ChartAction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
