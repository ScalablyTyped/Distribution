package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableStyleProperties extends StObject {
  
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showColumnStripes: js.UndefOr[Boolean] = js.undefined
  
  /**
  	  * Highlight the first column (bold)
  	  * @default false
  	  */
  var showFirstColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
  	  * Highlight the last column (bold)
  	  * @default false
  	  */
  var showLastColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showRowStripes: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The colour theme of the table
  	 * @default 'TableStyleMedium2'
  	 */
  var theme: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any
  ] = js.undefined
}
object TableStyleProperties {
  
  @scala.inline
  def apply(): TableStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleProperties]
  }
  
  @scala.inline
  implicit class TableStylePropertiesMutableBuilder[Self <: TableStyleProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowColumnStripes(value: Boolean): Self = StObject.set(x, "showColumnStripes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColumnStripesUndefined: Self = StObject.set(x, "showColumnStripes", js.undefined)
    
    @scala.inline
    def setShowFirstColumn(value: Boolean): Self = StObject.set(x, "showFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFirstColumnUndefined: Self = StObject.set(x, "showFirstColumn", js.undefined)
    
    @scala.inline
    def setShowLastColumn(value: Boolean): Self = StObject.set(x, "showLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLastColumnUndefined: Self = StObject.set(x, "showLastColumn", js.undefined)
    
    @scala.inline
    def setShowRowStripes(value: Boolean): Self = StObject.set(x, "showRowStripes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowStripesUndefined: Self = StObject.set(x, "showRowStripes", js.undefined)
    
    @scala.inline
    def setTheme(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
