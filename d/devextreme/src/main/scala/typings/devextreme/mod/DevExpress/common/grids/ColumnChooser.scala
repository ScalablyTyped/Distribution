package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnChooser extends StObject {
  
  /**
    * Specifies whether searching is enabled in the column chooser.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies text displayed by the column chooser when it is empty.
    */
  var emptyPanelText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a user can open the column chooser.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the height of the column chooser.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how a user manages columns using the column chooser.
    */
  var mode: js.UndefOr[ColumnChooserMode] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between when a user finishes typing in the column chooser&apos;s search panel, and when the search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the sort order of column headers.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  /**
    * Specifies the title of the column chooser.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the width of the column chooser.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ColumnChooser {
  
  inline def apply(): ColumnChooser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnChooser] (val x: Self) extends AnyVal {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setEmptyPanelText(value: String): Self = StObject.set(x, "emptyPanelText", value.asInstanceOf[js.Any])
    
    inline def setEmptyPanelTextUndefined: Self = StObject.set(x, "emptyPanelText", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMode(value: ColumnChooserMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
