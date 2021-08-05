package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropsOptionsArray
  extends StObject
     with ComponentPropsGaeaEdit {
  
  var key: String
}
object ComponentPropsOptionsArray {
  
  inline def apply(editable: Boolean, editor: String, field: String, hideTool: Boolean, key: String, label: String): ComponentPropsOptionsArray = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hideTool = hideTool.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPropsOptionsArray]
  }
  
  extension [Self <: ComponentPropsOptionsArray](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
