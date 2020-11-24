package typings.extjs.Ext

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToolTip
  extends typings.extjs.Ext.tip.ITip {
  
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var anchorOffset: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var anchorToTarget: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var dismissDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var hideDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number[]) */
  var mouseOffset: js.UndefOr[Array] = js.native
  
  /** [Method] Binds this ToolTip to the specified element
    * @param t String/HTMLElement/Ext.Element The Element, HtmlElement, or ID of an element to bind to
    */
  var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var showDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var trackMouse: js.UndefOr[Boolean] = js.native
  
  /** [Property] (HTMLElement) */
  var triggerElement: js.UndefOr[HTMLElement] = js.native
}
object IToolTip {
  
  @scala.inline
  def apply(): IToolTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolTip]
  }
  
  @scala.inline
  implicit class IToolTipOps[Self <: IToolTip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: java.lang.String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAnchorOffset(value: Double): Self = this.set("anchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorOffset: Self = this.set("anchorOffset", js.undefined)
    
    @scala.inline
    def setAnchorToTarget(value: Boolean): Self = this.set("anchorToTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorToTarget: Self = this.set("anchorToTarget", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setDelegate(value: java.lang.String): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    
    @scala.inline
    def setDismissDelay(value: Double): Self = this.set("dismissDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissDelay: Self = this.set("dismissDelay", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDelay: Self = this.set("hideDelay", js.undefined)
    
    @scala.inline
    def setMouseOffset(value: Array): Self = this.set("mouseOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseOffset: Self = this.set("mouseOffset", js.undefined)
    
    @scala.inline
    def setSetTarget(value: /* t */ js.UndefOr[js.Any] => Unit): Self = this.set("setTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTarget: Self = this.set("setTarget", js.undefined)
    
    @scala.inline
    def setShowDelay(value: Double): Self = this.set("showDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDelay: Self = this.set("showDelay", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTrackMouse(value: Boolean): Self = this.set("trackMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackMouse: Self = this.set("trackMouse", js.undefined)
    
    @scala.inline
    def setTriggerElement(value: HTMLElement): Self = this.set("triggerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerElement: Self = this.set("triggerElement", js.undefined)
  }
}
