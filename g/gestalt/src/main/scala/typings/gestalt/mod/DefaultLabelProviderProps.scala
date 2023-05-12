package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultLabelProviderProps extends StObject {
  
  var children: Node
  
  var labels: js.UndefOr[typings.gestalt.anon.ComboBox | Null] = js.undefined
}
object DefaultLabelProviderProps {
  
  inline def apply(): DefaultLabelProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultLabelProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultLabelProviderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLabels(value: typings.gestalt.anon.ComboBox): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
