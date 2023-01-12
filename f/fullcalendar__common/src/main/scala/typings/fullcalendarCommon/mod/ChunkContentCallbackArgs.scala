package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkContentCallbackArgs extends StObject {
  
  var clientHeight: Double | Null
  
  var clientWidth: Double | Null
  
  var expandRows: Boolean
  
  def reportRowHeightChange(rowEl: HTMLElement, isStable: Boolean): Unit
  
  var rowSyncHeights: js.Array[Double]
  
  var syncRowHeights: Boolean
  
  var tableColGroupNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  
  var tableMinWidth: CssDimValue
}
object ChunkContentCallbackArgs {
  
  inline def apply(
    expandRows: Boolean,
    reportRowHeightChange: (HTMLElement, Boolean) => Unit,
    rowSyncHeights: js.Array[Double],
    syncRowHeights: Boolean,
    tableColGroupNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    tableMinWidth: CssDimValue
  ): ChunkContentCallbackArgs = {
    val __obj = js.Dynamic.literal(expandRows = expandRows.asInstanceOf[js.Any], reportRowHeightChange = js.Any.fromFunction2(reportRowHeightChange), rowSyncHeights = rowSyncHeights.asInstanceOf[js.Any], syncRowHeights = syncRowHeights.asInstanceOf[js.Any], tableColGroupNode = tableColGroupNode.asInstanceOf[js.Any], tableMinWidth = tableMinWidth.asInstanceOf[js.Any], clientHeight = null, clientWidth = null)
    __obj.asInstanceOf[ChunkContentCallbackArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChunkContentCallbackArgs] (val x: Self) extends AnyVal {
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientHeightNull: Self = StObject.set(x, "clientHeight", null)
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setClientWidthNull: Self = StObject.set(x, "clientWidth", null)
    
    inline def setExpandRows(value: Boolean): Self = StObject.set(x, "expandRows", value.asInstanceOf[js.Any])
    
    inline def setReportRowHeightChange(value: (HTMLElement, Boolean) => Unit): Self = StObject.set(x, "reportRowHeightChange", js.Any.fromFunction2(value))
    
    inline def setRowSyncHeights(value: js.Array[Double]): Self = StObject.set(x, "rowSyncHeights", value.asInstanceOf[js.Any])
    
    inline def setRowSyncHeightsVarargs(value: Double*): Self = StObject.set(x, "rowSyncHeights", js.Array(value*))
    
    inline def setSyncRowHeights(value: Boolean): Self = StObject.set(x, "syncRowHeights", value.asInstanceOf[js.Any])
    
    inline def setTableColGroupNode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
    ): Self = StObject.set(x, "tableColGroupNode", value.asInstanceOf[js.Any])
    
    inline def setTableMinWidth(value: CssDimValue): Self = StObject.set(x, "tableMinWidth", value.asInstanceOf[js.Any])
  }
}
