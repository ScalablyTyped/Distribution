package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSwitchOptions
  extends StObject
     with EditorOptions[dxSwitch] {
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed when the UI component is switched off.
    */
  var switchedOffText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed when the UI component is switched on.
    */
  var switchedOnText: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value specifying whether the current switch state is &apos;On&apos; or &apos;Off&apos;.
    */
  @JSName("value")
  var value_dxSwitchOptions: js.UndefOr[Boolean] = js.undefined
}
object dxSwitchOptions {
  
  inline def apply(): dxSwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSwitchOptions]
  }
  
  extension [Self <: dxSwitchOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSwitchedOffText(value: String): Self = StObject.set(x, "switchedOffText", value.asInstanceOf[js.Any])
    
    inline def setSwitchedOffTextUndefined: Self = StObject.set(x, "switchedOffText", js.undefined)
    
    inline def setSwitchedOnText(value: String): Self = StObject.set(x, "switchedOnText", value.asInstanceOf[js.Any])
    
    inline def setSwitchedOnTextUndefined: Self = StObject.set(x, "switchedOnText", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
