package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighlight extends IBase {
  
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.native
  
  /** [Method] Highlight the given series item
    * @param item Object Info about the item; same format as returned by #getItemForPoint.
    */
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.native
}
object IHighlight {
  
  @scala.inline
  def apply(): IHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHighlight]
  }
  
  @scala.inline
  implicit class IHighlightOps[Self <: IHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHighlight(value: js.Any): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setHighlightCfg(value: js.Any): Self = this.set("highlightCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightCfg: Self = this.set("highlightCfg", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("highlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    
    @scala.inline
    def setUnHighlightItem(value: () => Unit): Self = this.set("unHighlightItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnHighlightItem: Self = this.set("unHighlightItem", js.undefined)
  }
}
