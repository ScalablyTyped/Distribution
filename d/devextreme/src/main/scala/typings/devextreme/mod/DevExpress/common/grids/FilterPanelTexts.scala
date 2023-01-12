package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPanelTexts extends StObject {
  
  /**
    * The text of the &apos;Clear&apos; link.
    */
  var clearFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The text of the &apos;Create Filter&apos; link.
    */
  var createFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The hint of the checkbox that applies the filter.
    */
  var filterEnabledHint: js.UndefOr[String] = js.undefined
}
object FilterPanelTexts {
  
  inline def apply(): FilterPanelTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPanelTexts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterPanelTexts] (val x: Self) extends AnyVal {
    
    inline def setClearFilter(value: String): Self = StObject.set(x, "clearFilter", value.asInstanceOf[js.Any])
    
    inline def setClearFilterUndefined: Self = StObject.set(x, "clearFilter", js.undefined)
    
    inline def setCreateFilter(value: String): Self = StObject.set(x, "createFilter", value.asInstanceOf[js.Any])
    
    inline def setCreateFilterUndefined: Self = StObject.set(x, "createFilter", js.undefined)
    
    inline def setFilterEnabledHint(value: String): Self = StObject.set(x, "filterEnabledHint", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledHintUndefined: Self = StObject.set(x, "filterEnabledHint", js.undefined)
  }
}
