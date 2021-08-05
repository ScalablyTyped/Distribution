package typings.extjs.Ext

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tip {
  
  trait IQuickTip
    extends StObject
       with typings.extjs.Ext.tip.IToolTip {
    
    /** [Method] Hides a visible tip or cancels an impending show for a particular element
      * @param el String/HTMLElement/Ext.Element The element that is the target of the tip or ID of the element.
      */
    var cancelShow: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var interceptTitles: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Configures a new quick tip instance and assigns it to a target element
      * @param config Object The config object with the following properties:
      */
    var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Removes this quick tip from its element and destroys it
      * @param el String/HTMLElement/Ext.Element The element from which the quick tip is to be removed or ID of the element.
      */
    var unregister: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IQuickTip {
    
    inline def apply(): typings.extjs.Ext.tip.IQuickTip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.tip.IQuickTip]
    }
    
    extension [Self <: typings.extjs.Ext.tip.IQuickTip](x: Self) {
      
      inline def setCancelShow(value: /* el */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "cancelShow", js.Any.fromFunction1(value))
      
      inline def setCancelShowUndefined: Self = StObject.set(x, "cancelShow", js.undefined)
      
      inline def setInterceptTitles(value: Boolean): Self = StObject.set(x, "interceptTitles", value.asInstanceOf[js.Any])
      
      inline def setInterceptTitlesUndefined: Self = StObject.set(x, "interceptTitles", js.undefined)
      
      inline def setRegister(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setUnregister(value: /* el */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
      
      inline def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
    }
  }
  
  type IQuickTipManager = IBase
  
  trait ITip
    extends StObject
       with typings.extjs.Ext.panel.IPanel {
    
    /** [Config Option] (Boolean) */
    var constrainPosition: js.UndefOr[Boolean] = js.undefined
  }
  object ITip {
    
    inline def apply(): typings.extjs.Ext.tip.ITip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.tip.ITip]
    }
    
    extension [Self <: typings.extjs.Ext.tip.ITip](x: Self) {
      
      inline def setConstrainPosition(value: Boolean): Self = StObject.set(x, "constrainPosition", value.asInstanceOf[js.Any])
      
      inline def setConstrainPositionUndefined: Self = StObject.set(x, "constrainPosition", js.undefined)
    }
  }
  
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
    var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var showDelay: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (HTMLElement/Ext.Element/String) */
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var trackMouse: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (HTMLElement) */
    var triggerElement: js.UndefOr[HTMLElement] = js.undefined
  }
  object IToolTip {
    
    inline def apply(): typings.extjs.Ext.tip.IToolTip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.tip.IToolTip]
    }
    
    extension [Self <: typings.extjs.Ext.tip.IToolTip](x: Self) {
      
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
      
      inline def setSetTarget(value: /* t */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTarget", js.Any.fromFunction1(value))
      
      inline def setSetTargetUndefined: Self = StObject.set(x, "setTarget", js.undefined)
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTrackMouse(value: Boolean): Self = StObject.set(x, "trackMouse", value.asInstanceOf[js.Any])
      
      inline def setTrackMouseUndefined: Self = StObject.set(x, "trackMouse", js.undefined)
      
      inline def setTriggerElement(value: HTMLElement): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
      
      inline def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
    }
  }
  
  trait QuickTipManager extends StObject
}
