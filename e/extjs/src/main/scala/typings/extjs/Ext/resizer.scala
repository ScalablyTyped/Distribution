package typings.extjs.Ext

import typings.extjs.Ext.dd.IDragTracker
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizer {
  
  trait IBorderSplitter
    extends StObject
       with ISplitter
  object IBorderSplitter {
    
    inline def apply(): IBorderSplitter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBorderSplitter]
    }
  }
  
  trait IBorderSplitterTracker
    extends StObject
       with ISplitterTracker
  object IBorderSplitterTracker {
    
    inline def apply(): IBorderSplitterTracker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBorderSplitterTracker]
    }
  }
  
  trait IHandle
    extends StObject
       with IComponent
  object IHandle {
    
    inline def apply(): IHandle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHandle]
    }
  }
  
  trait IResizeTracker
    extends StObject
       with IDragTracker {
    
    /** [Method] Create a proxy for this resizer
      * @param target Ext.Component/Ext.Element The target
      * @returns Ext.Element A proxy element
      */
    var createProxy: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], IElement]] = js.undefined
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onBeforeStart")
    var onBeforeStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onDrag")
    var onDrag_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onEnd")
    var onEnd_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onStart")
    var onStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IResizeTracker {
    
    inline def apply(): IResizeTracker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeTracker]
    }
    
    extension [Self <: IResizeTracker](x: Self) {
      
      inline def setCreateProxy(value: /* target */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "createProxy", js.Any.fromFunction1(value))
      
      inline def setCreateProxyUndefined: Self = StObject.set(x, "createProxy", js.undefined)
      
      inline def setOnBeforeStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onBeforeStart", js.Any.fromFunction1(value))
      
      inline def setOnBeforeStartUndefined: Self = StObject.set(x, "onBeforeStart", js.undefined)
      
      inline def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  trait IResizer
    extends StObject
       with IObservable {
    
    /** [Config Option] (Ext.Element/Ext.util.Region) */
    var constrainTo: js.UndefOr[js.Any] = js.undefined
    
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
    var getTarget: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
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
    var originalTarget: js.UndefOr[js.Any] = js.undefined
    
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
    var target: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var transparent: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var width: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var widthIncrement: js.UndefOr[Double] = js.undefined
  }
  object IResizer {
    
    inline def apply(): IResizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizer]
    }
    
    extension [Self <: IResizer](x: Self) {
      
      inline def setConstrainTo(value: js.Any): Self = StObject.set(x, "constrainTo", value.asInstanceOf[js.Any])
      
      inline def setConstrainToUndefined: Self = StObject.set(x, "constrainTo", js.undefined)
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setEl(value: IElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setGetEl(value: () => IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
      
      inline def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
      
      inline def setGetTarget(value: () => js.Any): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
      
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
      
      inline def setOriginalTarget(value: js.Any): Self = StObject.set(x, "originalTarget", value.asInstanceOf[js.Any])
      
      inline def setOriginalTargetUndefined: Self = StObject.set(x, "originalTarget", js.undefined)
      
      inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setPreserveRatio(value: Boolean): Self = StObject.set(x, "preserveRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveRatioUndefined: Self = StObject.set(x, "preserveRatio", js.undefined)
      
      inline def setResizeTo(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "resizeTo", js.Any.fromFunction2(value))
      
      inline def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
      
      inline def setResizeTracker(value: IResizeTracker): Self = StObject.set(x, "resizeTracker", value.asInstanceOf[js.Any])
      
      inline def setResizeTrackerUndefined: Self = StObject.set(x, "resizeTracker", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthIncrement(value: Double): Self = StObject.set(x, "widthIncrement", value.asInstanceOf[js.Any])
      
      inline def setWidthIncrementUndefined: Self = StObject.set(x, "widthIncrement", js.undefined)
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ISplitter
    extends StObject
       with IComponent {
    
    /** [Config Option] (Boolean) */
    var collapseOnDblClick: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String/Ext.panel.Panel) */
    var collapseTarget: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var collapsedCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var defaultSplitMax: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var defaultSplitMin: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the config object with an xclass property for the splitter tracker  */
    var getTrackerConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Template method called when this Component s DOM structure is created  */
    @JSName("onRender")
    var onRender_ISplitter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (String) */
    var orientation: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var performCollapse: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Work around IE bug
      * @returns Ext.Component this
      */
    @JSName("setSize")
    var setSize_ISplitter: js.UndefOr[js.Function0[IComponent]] = js.undefined
    
    /** [Config Option] (Number) */
    var size: js.UndefOr[Double] = js.undefined
  }
  object ISplitter {
    
    inline def apply(): ISplitter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplitter]
    }
    
    extension [Self <: ISplitter](x: Self) {
      
      inline def setCollapseOnDblClick(value: Boolean): Self = StObject.set(x, "collapseOnDblClick", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnDblClickUndefined: Self = StObject.set(x, "collapseOnDblClick", js.undefined)
      
      inline def setCollapseTarget(value: js.Any): Self = StObject.set(x, "collapseTarget", value.asInstanceOf[js.Any])
      
      inline def setCollapseTargetUndefined: Self = StObject.set(x, "collapseTarget", js.undefined)
      
      inline def setCollapsedCls(value: java.lang.String): Self = StObject.set(x, "collapsedCls", value.asInstanceOf[js.Any])
      
      inline def setCollapsedClsUndefined: Self = StObject.set(x, "collapsedCls", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDefaultSplitMax(value: Double): Self = StObject.set(x, "defaultSplitMax", value.asInstanceOf[js.Any])
      
      inline def setDefaultSplitMaxUndefined: Self = StObject.set(x, "defaultSplitMax", js.undefined)
      
      inline def setDefaultSplitMin(value: Double): Self = StObject.set(x, "defaultSplitMin", value.asInstanceOf[js.Any])
      
      inline def setDefaultSplitMinUndefined: Self = StObject.set(x, "defaultSplitMin", js.undefined)
      
      inline def setGetTrackerConfig(value: () => Unit): Self = StObject.set(x, "getTrackerConfig", js.Any.fromFunction0(value))
      
      inline def setGetTrackerConfigUndefined: Self = StObject.set(x, "getTrackerConfig", js.undefined)
      
      inline def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setOrientation(value: java.lang.String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPerformCollapse(value: Boolean): Self = StObject.set(x, "performCollapse", value.asInstanceOf[js.Any])
      
      inline def setPerformCollapseUndefined: Self = StObject.set(x, "performCollapse", js.undefined)
      
      inline def setSetSize(value: () => IComponent): Self = StObject.set(x, "setSize", js.Any.fromFunction0(value))
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ISplitterTracker
    extends StObject
       with IDragTracker {
    
    /** [Method] ensure the tracker is enabled store boxes of previous and next components and calculate the constrain region
      * @param e Object
      */
    @JSName("onBeforeStart")
    var onBeforeStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Track the proxy and set the proper XY coordinates while constraining the drag
      * @param e Object
      */
    @JSName("onDrag")
    var onDrag_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] perform the resize and remove the proxy class from the splitter el
      * @param e Object
      */
    @JSName("onEnd")
    var onEnd_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] We move the splitter el
      * @param e Object
      */
    @JSName("onStart")
    var onStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ISplitterTracker {
    
    inline def apply(): ISplitterTracker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplitterTracker]
    }
    
    extension [Self <: ISplitterTracker](x: Self) {
      
      inline def setOnBeforeStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onBeforeStart", js.Any.fromFunction1(value))
      
      inline def setOnBeforeStartUndefined: Self = StObject.set(x, "onBeforeStart", js.undefined)
      
      inline def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
