package typings.extjs.Ext

import typings.extjs.Ext.resizer.IResizeTracker
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResizable
  extends StObject
     with IObservable {
  
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.Element) */
  var el: js.UndefOr[IElement] = js.undefined
  
  /** [Method] Returns the element that was configured with the el or target config property
    * @returns Ext.Element element
    */
  var getEl: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Returns the element or component that was configured with the target config property
    * @returns Ext.Element/Ext.Component
    */
  var getTarget: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (String) */
  var handles: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Perform a manual resize and fires the resize event
    * @param width Number
    * @param height Number
    */
  var resizeTo: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.undefined
  
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[IResizeTracker] = js.undefined
  
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[Double] = js.undefined
}
object IResizable {
  
  inline def apply(): IResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizable]
  }
  
  extension [Self <: IResizable](x: Self) {
    
    inline def setConstrainTo(value: Any): Self = StObject.set(x, "constrainTo", value.asInstanceOf[js.Any])
    
    inline def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    inline def setEl(value: IElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setGetEl(value: () => IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
    
    inline def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    inline def setGetTarget(value: () => Any): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    inline def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    inline def setHandles(value: java.lang.String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightIncrement(value: Double): Self = StObject.set(x, "heightIncrement", value.asInstanceOf[js.Any])
    
    inline def setHeightIncrementUndefined: Self = StObject.set(x, "heightIncrement", js.undefined)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOriginalTarget(value: Any): Self = StObject.set(x, "originalTarget", value.asInstanceOf[js.Any])
    
    inline def setOriginalTargetUndefined: Self = StObject.set(x, "originalTarget", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setPreserveRatio(value: Boolean): Self = StObject.set(x, "preserveRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveRatioUndefined: Self = StObject.set(x, "preserveRatio", js.undefined)
    
    inline def setResizeTo(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "resizeTo", js.Any.fromFunction2(value))
    
    inline def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
    
    inline def setResizeTracker(value: IResizeTracker): Self = StObject.set(x, "resizeTracker", value.asInstanceOf[js.Any])
    
    inline def setResizeTrackerUndefined: Self = StObject.set(x, "resizeTracker", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthIncrement(value: Double): Self = StObject.set(x, "widthIncrement", value.asInstanceOf[js.Any])
    
    inline def setWidthIncrementUndefined: Self = StObject.set(x, "widthIncrement", js.undefined)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
