package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFilterTexts extends StObject {
  
  /**
    * Specifies text for the button that closes the popup menu without applying a filter.
    */
  var cancel: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a name for the item that represents empty values in the popup menu.
    */
  var emptyValue: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the button that applies the specified filter.
    */
  var ok: js.UndefOr[String] = js.undefined
}
object HeaderFilterTexts {
  
  inline def apply(): HeaderFilterTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFilterTexts]
  }
  
  extension [Self <: HeaderFilterTexts](x: Self) {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setEmptyValue(value: String): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
  }
}
