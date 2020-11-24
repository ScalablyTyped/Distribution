package typings.extjs.Ext.resizer

import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISplitter extends IComponent {
  
  /** [Config Option] (Boolean) */
  var collapseOnDblClick: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Ext.panel.Panel) */
  var collapseTarget: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var defaultSplitMax: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var defaultSplitMin: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the config object with an xclass property for the splitter tracker  */
  var getTrackerConfig: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_ISplitter: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (String) */
  var orientation: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var performCollapse: js.UndefOr[Boolean] = js.native
  
  /** [Method] Work around IE bug
    * @returns Ext.Component this
    */
  @JSName("setSize")
  var setSize_ISplitter: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Config Option] (Number) */
  var size: js.UndefOr[Double] = js.native
}
object ISplitter {
  
  @scala.inline
  def apply(): ISplitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISplitter]
  }
  
  @scala.inline
  implicit class ISplitterOps[Self <: ISplitter] (val x: Self) extends AnyVal {
    
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
    def setCollapseOnDblClick(value: Boolean): Self = this.set("collapseOnDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseOnDblClick: Self = this.set("collapseOnDblClick", js.undefined)
    
    @scala.inline
    def setCollapseTarget(value: js.Any): Self = this.set("collapseTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseTarget: Self = this.set("collapseTarget", js.undefined)
    
    @scala.inline
    def setCollapsedCls(value: String): Self = this.set("collapsedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedCls: Self = this.set("collapsedCls", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setDefaultSplitMax(value: Double): Self = this.set("defaultSplitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSplitMax: Self = this.set("defaultSplitMax", js.undefined)
    
    @scala.inline
    def setDefaultSplitMin(value: Double): Self = this.set("defaultSplitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSplitMin: Self = this.set("defaultSplitMin", js.undefined)
    
    @scala.inline
    def setGetTrackerConfig(value: () => Unit): Self = this.set("getTrackerConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTrackerConfig: Self = this.set("getTrackerConfig", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPerformCollapse(value: Boolean): Self = this.set("performCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformCollapse: Self = this.set("performCollapse", js.undefined)
    
    @scala.inline
    def setSetSize(value: () => IComponent): Self = this.set("setSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
