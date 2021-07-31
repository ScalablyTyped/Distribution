package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHighlight
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Highlight the given series item
    * @param item Object Info about the item; same format as returned by #getItemForPoint.
    */
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IHighlight {
  
  @scala.inline
  def apply(): IHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlight]
  }
  
  @scala.inline
  implicit class IHighlightMutableBuilder[Self <: IHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCfg(value: js.Any): Self = StObject.set(x, "highlightCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCfgUndefined: Self = StObject.set(x, "highlightCfg", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: () => Unit): Self = StObject.set(x, "unHighlightItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnHighlightItemUndefined: Self = StObject.set(x, "unHighlightItem", js.undefined)
  }
}
