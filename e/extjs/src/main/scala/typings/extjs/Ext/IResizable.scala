package typings.extjs.Ext

import typings.extjs.Ext.resizer.IResizeTracker
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResizable extends IObservable {
  
  /** [Config Option] (Ext.Element/Ext.util.Region) */
  var constrainTo: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.Element) */
  var el: js.UndefOr[IElement] = js.native
  
  /** [Method] Returns the element that was configured with the el or target config property
    * @returns Ext.Element element
    */
  var getEl: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns the element or component that was configured with the target config property
    * @returns Ext.Element/Ext.Component
    */
  var getTarget: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (String) */
  var handles: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var heightIncrement: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.native
  
  /** [Property] (Ext.Element/Ext.Component) */
  var originalTarget: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var preserveRatio: js.UndefOr[Boolean] = js.native
  
  /** [Method] Perform a manual resize and fires the resize event
    * @param width Number
    * @param height Number
    */
  var resizeTo: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Property] (Ext.resizer.ResizeTracker) */
  var resizeTracker: js.UndefOr[IResizeTracker] = js.native
  
  /** [Config Option] (Ext.Element/Ext.Component) */
  var target: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var widthIncrement: js.UndefOr[Double] = js.native
}
object IResizable {
  
  @scala.inline
  def apply(): IResizable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizable]
  }
  
  @scala.inline
  implicit class IResizableMutableBuilder[Self <: IResizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstrainTo(value: js.Any): Self = StObject.set(x, "constrainTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    @scala.inline
    def setEl(value: IElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setGetEl(value: () => IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    @scala.inline
    def setGetTarget(value: () => _): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    @scala.inline
    def setHandles(value: java.lang.String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightIncrement(value: Double): Self = StObject.set(x, "heightIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightIncrementUndefined: Self = StObject.set(x, "heightIncrement", js.undefined)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOriginalTarget(value: js.Any): Self = StObject.set(x, "originalTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalTargetUndefined: Self = StObject.set(x, "originalTarget", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setPreserveRatio(value: Boolean): Self = StObject.set(x, "preserveRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveRatioUndefined: Self = StObject.set(x, "preserveRatio", js.undefined)
    
    @scala.inline
    def setResizeTo(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "resizeTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
    
    @scala.inline
    def setResizeTracker(value: IResizeTracker): Self = StObject.set(x, "resizeTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTrackerUndefined: Self = StObject.set(x, "resizeTracker", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthIncrement(value: Double): Self = StObject.set(x, "widthIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthIncrementUndefined: Self = StObject.set(x, "widthIncrement", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
