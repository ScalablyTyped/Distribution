package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFixing extends StObject {
  
  /**
    * Enables column fixing.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains properties that specify texts for column fixing commands in the context menu of a column header.
    */
  var texts: js.UndefOr[ColumnFixingTexts] = js.undefined
}
object ColumnFixing {
  
  inline def apply(): ColumnFixing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFixing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFixing] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTexts(value: ColumnFixingTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
  }
}
