package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorMediaResizing extends StObject {
  
  /**
    * Specifies media types that can be resized. Currently, only images are supported.
    */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enables media resizing.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object dxHtmlEditorMediaResizing {
  
  inline def apply(): dxHtmlEditorMediaResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorMediaResizing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxHtmlEditorMediaResizing] (val x: Self) extends AnyVal {
    
    inline def setAllowedTargets(value: js.Array[String]): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargetsUndefined: Self = StObject.set(x, "allowedTargets", js.undefined)
    
    inline def setAllowedTargetsVarargs(value: String*): Self = StObject.set(x, "allowedTargets", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
