package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetGridProperties extends StObject {
  
  var columnCount: js.UndefOr[Double] = js.undefined
  
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.undefined
  
  var frozenColumnCount: js.UndefOr[Double] = js.undefined
  
  var frozenRowCount: js.UndefOr[Double] = js.undefined
  
  var hideGridlines: js.UndefOr[Boolean] = js.undefined
  
  var rowCount: js.UndefOr[Double] = js.undefined
  
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.undefined
}
object WorksheetGridProperties {
  
  inline def apply(): WorksheetGridProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetGridProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorksheetGridProperties] (val x: Self) extends AnyVal {
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setColumnGroupControlAfter(value: Boolean): Self = StObject.set(x, "columnGroupControlAfter", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupControlAfterUndefined: Self = StObject.set(x, "columnGroupControlAfter", js.undefined)
    
    inline def setFrozenColumnCount(value: Double): Self = StObject.set(x, "frozenColumnCount", value.asInstanceOf[js.Any])
    
    inline def setFrozenColumnCountUndefined: Self = StObject.set(x, "frozenColumnCount", js.undefined)
    
    inline def setFrozenRowCount(value: Double): Self = StObject.set(x, "frozenRowCount", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowCountUndefined: Self = StObject.set(x, "frozenRowCount", js.undefined)
    
    inline def setHideGridlines(value: Boolean): Self = StObject.set(x, "hideGridlines", value.asInstanceOf[js.Any])
    
    inline def setHideGridlinesUndefined: Self = StObject.set(x, "hideGridlines", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRowGroupControlAfter(value: Boolean): Self = StObject.set(x, "rowGroupControlAfter", value.asInstanceOf[js.Any])
    
    inline def setRowGroupControlAfterUndefined: Self = StObject.set(x, "rowGroupControlAfter", js.undefined)
  }
}
