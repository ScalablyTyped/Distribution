package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkGraphElement extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Array[ElkLabel]] = js.undefined
  
  var layoutOptions: js.UndefOr[LayoutOptions] = js.undefined
}
object ElkGraphElement {
  
  inline def apply(): ElkGraphElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElkGraphElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkGraphElement] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(value: js.Array[ElkLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: ElkLabel*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLayoutOptions(value: LayoutOptions): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
    
    inline def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
  }
}
