package typings.extjs.Ext

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
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
  implicit class IToolTipMutableBuilder[Self <: IToolTip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: java.lang.String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
    
    @scala.inline
    def setAnchorToTarget(value: Boolean): Self = StObject.set(x, "anchorToTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorToTargetUndefined: Self = StObject.set(x, "anchorToTarget", js.undefined)
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setDelegate(value: java.lang.String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    @scala.inline
    def setDismissDelay(value: Double): Self = StObject.set(x, "dismissDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissDelayUndefined: Self = StObject.set(x, "dismissDelay", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    @scala.inline
    def setMouseOffset(value: Array): Self = StObject.set(x, "mouseOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseOffsetUndefined: Self = StObject.set(x, "mouseOffset", js.undefined)
    
    @scala.inline
    def setSetTarget(value: /* t */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTargetUndefined: Self = StObject.set(x, "setTarget", js.undefined)
    
    @scala.inline
    def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackMouseUndefined: Self = StObject.set(x, "trackMouse", js.undefined)
    
    @scala.inline
    def setTriggerElement(value: HTMLElement): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
  }
}
