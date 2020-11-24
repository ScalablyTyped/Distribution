package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.IAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBufferedRenderer extends IAbstractPlugin {
  
  /** [Method] Initialize this as a plugin
    * @param grid Object
    */
  @JSName("init")
  var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var numFromEdge: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var percentageFromEdge: js.UndefOr[Double] = js.native
  
  /** [Property] (Number) */
  var position: js.UndefOr[Double] = js.native
  
  /** [Method] Scrolls to and optionlly selects the specified row index in the total dataset
    * @param recordIdx Number The zero-based position in the dataset to scroll to.
    * @param doSelect Boolean Pass as true to select the specified row.
    * @param callback Function A function to call when the row has been scrolled to.
    * @param scope Object The scope (this reference) in which to execute the callback. Defaults to this BufferedRenderer.
    */
  var scrollTo: js.UndefOr[
    js.Function4[
      /* recordIdx */ js.UndefOr[Double], 
      /* doSelect */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Number) */
  var scrollToLoadBuffer: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var synchronousRender: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var variableRowHeight: js.UndefOr[Boolean] = js.native
}
object IBufferedRenderer {
  
  @scala.inline
  def apply(): IBufferedRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBufferedRenderer]
  }
  
  @scala.inline
  implicit class IBufferedRendererOps[Self <: IBufferedRenderer] (val x: Self) extends AnyVal {
    
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
    def setInit(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setLeadingBufferZone(value: Double): Self = this.set("leadingBufferZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingBufferZone: Self = this.set("leadingBufferZone", js.undefined)
    
    @scala.inline
    def setNumFromEdge(value: Double): Self = this.set("numFromEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFromEdge: Self = this.set("numFromEdge", js.undefined)
    
    @scala.inline
    def setPercentageFromEdge(value: Double): Self = this.set("percentageFromEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentageFromEdge: Self = this.set("percentageFromEdge", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setScrollTo(
      value: (/* recordIdx */ js.UndefOr[Double], /* doSelect */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("scrollTo", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
    
    @scala.inline
    def setScrollToLoadBuffer(value: Double): Self = this.set("scrollToLoadBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToLoadBuffer: Self = this.set("scrollToLoadBuffer", js.undefined)
    
    @scala.inline
    def setSynchronousRender(value: Boolean): Self = this.set("synchronousRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronousRender: Self = this.set("synchronousRender", js.undefined)
    
    @scala.inline
    def setTrailingBufferZone(value: Double): Self = this.set("trailingBufferZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingBufferZone: Self = this.set("trailingBufferZone", js.undefined)
    
    @scala.inline
    def setVariableRowHeight(value: Boolean): Self = this.set("variableRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableRowHeight: Self = this.set("variableRowHeight", js.undefined)
  }
}
