package typings.extjs.Ext

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToolTip
  extends StObject
     with typings.extjs.Ext.tip.ITip {
  
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var anchorOffset: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var anchorToTarget: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var dismissDelay: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var hideDelay: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number[]) */
  var mouseOffset: js.UndefOr[Array] = js.undefined
  
  /** [Method] Binds this ToolTip to the specified element
    * @param t String/HTMLElement/Ext.Element The Element, HtmlElement, or ID of an element to bind to
    */
  var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var showDelay: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var trackMouse: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (HTMLElement) */
  var triggerElement: js.UndefOr[HTMLElement] = js.undefined
}
object IToolTip {
  
  inline def apply(): IToolTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolTip]
  }
  
  extension [Self <: IToolTip](x: Self) {
    
    inline def setAnchor(value: java.lang.String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
    
    inline def setAnchorToTarget(value: Boolean): Self = StObject.set(x, "anchorToTarget", value.asInstanceOf[js.Any])
    
    inline def setAnchorToTargetUndefined: Self = StObject.set(x, "anchorToTarget", js.undefined)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setDelegate(value: java.lang.String): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDismissDelay(value: Double): Self = StObject.set(x, "dismissDelay", value.asInstanceOf[js.Any])
    
    inline def setDismissDelayUndefined: Self = StObject.set(x, "dismissDelay", js.undefined)
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    inline def setMouseOffset(value: Array): Self = StObject.set(x, "mouseOffset", value.asInstanceOf[js.Any])
    
    inline def setMouseOffsetUndefined: Self = StObject.set(x, "mouseOffset", js.undefined)
    
    inline def setSetTarget(value: /* t */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTarget", js.Any.fromFunction1(value))
    
    inline def setSetTargetUndefined: Self = StObject.set(x, "setTarget", js.undefined)
    
    inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
    
    inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
    
    inline def setTrackMouseUndefined: Self = StObject.set(x, "trackMouse", js.undefined)
    
    inline def setTriggerElement(value: HTMLElement): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
    
    inline def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
  }
}
