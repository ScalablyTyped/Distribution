package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttHeaderFilterTexts extends StObject {
  
  /**
    * Specifies text for the &apos;Cancel&apos; button in the popup window.
    */
  var cancel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the &apos;(Blank)&apos; item in the popup window.
    */
  var emptyValue: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the &apos;OK&apos; button in the popup window.
    */
  var ok: js.UndefOr[String] = js.undefined
}
object dxGanttHeaderFilterTexts {
  
  inline def apply(): dxGanttHeaderFilterTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttHeaderFilterTexts]
  }
  
  extension [Self <: dxGanttHeaderFilterTexts](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setEmptyValue(value: String): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
  }
}
