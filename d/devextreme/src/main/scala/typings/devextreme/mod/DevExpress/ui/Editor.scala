package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor[TProperties]
  extends StObject
     with Widget[TProperties] {
  
  /**
    * Resets the value property to the default value.
    */
  def reset(): Unit = js.native
}
object Editor {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type EditorInstance = Editor[Properties]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Properties = devextreme.devextreme.DevExpress.ui.EditorOptions<devextreme.devextreme.DevExpress.ui.Editor.EditorInstance>
  }}}
  to avoid circular code involving: 
  - devextreme.devextreme.DevExpress.ui.Editor.EditorInstance
  - devextreme.devextreme.DevExpress.ui.Editor.Properties
  */
  trait Properties
    extends StObject
       with EditorOptions[EditorInstance]
  object Properties {
    
    inline def apply(): Properties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Properties]
    }
  }
  
  trait ValueChangedInfo extends StObject {
    
    val previousValue: js.UndefOr[Any] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object ValueChangedInfo {
    
    inline def apply(): ValueChangedInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueChangedInfo]
    }
    
    extension [Self <: ValueChangedInfo](x: Self) {
      
      inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
