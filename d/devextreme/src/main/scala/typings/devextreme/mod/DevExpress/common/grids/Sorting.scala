package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.SingleMultipleOrNone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorting extends StObject {
  
  /**
    * Specifies text for the context menu item that sets an ascending sort order in a column.
    */
  var ascendingText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu item that clears sorting settings for a column.
    */
  var clearText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the context menu item that sets a descending sort order in a column.
    */
  var descendingText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the sorting mode.
    */
  var mode: js.UndefOr[SingleMultipleOrNone] = js.undefined
  
  /**
    * Specifies whether to display sort indexes in column headers. Applies only when sorting.mode is &apos;multiple&apos; and data is sorted by two or more columns.
    */
  var showSortIndexes: js.UndefOr[Boolean] = js.undefined
}
object Sorting {
  
  inline def apply(): Sorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sorting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sorting] (val x: Self) extends AnyVal {
    
    inline def setAscendingText(value: String): Self = StObject.set(x, "ascendingText", value.asInstanceOf[js.Any])
    
    inline def setAscendingTextUndefined: Self = StObject.set(x, "ascendingText", js.undefined)
    
    inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    inline def setDescendingText(value: String): Self = StObject.set(x, "descendingText", value.asInstanceOf[js.Any])
    
    inline def setDescendingTextUndefined: Self = StObject.set(x, "descendingText", js.undefined)
    
    inline def setMode(value: SingleMultipleOrNone): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setShowSortIndexes(value: Boolean): Self = StObject.set(x, "showSortIndexes", value.asInstanceOf[js.Any])
    
    inline def setShowSortIndexesUndefined: Self = StObject.set(x, "showSortIndexes", js.undefined)
  }
}
