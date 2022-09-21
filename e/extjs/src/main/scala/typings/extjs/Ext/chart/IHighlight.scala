package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHighlight
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[Any] = js.undefined
  
  /** [Method] Highlight the given series item
    * @param item Object Info about the item; same format as returned by #getItemForPoint.
    */
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IHighlight {
  
  inline def apply(): IHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlight]
  }
  
  extension [Self <: IHighlight](x: Self) {
    
    inline def setHighlight(value: Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightCfg(value: Any): Self = StObject.set(x, "highlightCfg", value.asInstanceOf[js.Any])
    
    inline def setHighlightCfgUndefined: Self = StObject.set(x, "highlightCfg", js.undefined)
    
    inline def setHighlightItem(value: /* item */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
    
    inline def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
  }
}
