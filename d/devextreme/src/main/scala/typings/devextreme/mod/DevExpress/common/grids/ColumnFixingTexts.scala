package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFixingTexts extends StObject {
  
  /**
    * Specifies text for the context menu item that fixes a column.
    */
  var fix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu subitem that fixes a column to the left edge of the UI component.
    */
  var leftPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu subitem that fixes a column to the right edge of the UI component.
    */
  var rightPosition: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu item that unfixes a column.
    */
  var unfix: js.UndefOr[String] = js.undefined
}
object ColumnFixingTexts {
  
  inline def apply(): ColumnFixingTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFixingTexts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFixingTexts] (val x: Self) extends AnyVal {
    
    inline def setFix(value: String): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setLeftPosition(value: String): Self = StObject.set(x, "leftPosition", value.asInstanceOf[js.Any])
    
    inline def setLeftPositionUndefined: Self = StObject.set(x, "leftPosition", js.undefined)
    
    inline def setRightPosition(value: String): Self = StObject.set(x, "rightPosition", value.asInstanceOf[js.Any])
    
    inline def setRightPositionUndefined: Self = StObject.set(x, "rightPosition", js.undefined)
    
    inline def setUnfix(value: String): Self = StObject.set(x, "unfix", value.asInstanceOf[js.Any])
    
    inline def setUnfixUndefined: Self = StObject.set(x, "unfix", js.undefined)
  }
}
