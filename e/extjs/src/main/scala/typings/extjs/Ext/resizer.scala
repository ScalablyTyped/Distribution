package typings.extjs.Ext

import typings.extjs.Ext.dd.IDragTracker
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizer {
  
  @js.native
  trait IBorderSplitter extends ISplitter
  object IBorderSplitter {
    
    @scala.inline
    def apply(): IBorderSplitter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBorderSplitter]
    }
  }
  
  @js.native
  trait IBorderSplitterTracker extends ISplitterTracker
  object IBorderSplitterTracker {
    
    @scala.inline
    def apply(): IBorderSplitterTracker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBorderSplitterTracker]
    }
  }
  
  @js.native
  trait IHandle extends IComponent
  object IHandle {
    
    @scala.inline
    def apply(): IHandle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHandle]
    }
  }
  
  @js.native
  trait IResizeTracker extends IDragTracker {
    
    /** [Method] Create a proxy for this resizer
      * @param target Ext.Component/Ext.Element The target
      * @returns Ext.Element A proxy element
      */
    var createProxy: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], IElement]] = js.native
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onBeforeStart")
    var onBeforeStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onDrag")
    var onDrag_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onEnd")
    var onEnd_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Template method which should be overridden by each DragTracker instance
      * @param e Object
      */
    @JSName("onStart")
    var onStart_IResizeTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IResizeTracker {
    
    @scala.inline
    def apply(): IResizeTracker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeTracker]
    }
    
    @scala.inline
    implicit class IResizeTrackerMutableBuilder[Self <: IResizeTracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateProxy(value: /* target */ js.UndefOr[js.Any] => IElement): Self = StObject.set(x, "createProxy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateProxyUndefined: Self = StObject.set(x, "createProxy", js.undefined)
      
      @scala.inline
      def setOnBeforeStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onBeforeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeStartUndefined: Self = StObject.set(x, "onBeforeStart", js.undefined)
      
      @scala.inline
      def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  @js.native
  trait IResizer extends IObservable {
    
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
  object IResizer {
    
    @scala.inline
    def apply(): IResizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizer]
    }
    
    @scala.inline
    implicit class IResizerMutableBuilder[Self <: IResizer] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait ISplitter extends IComponent {
    
    /** [Config Option] (Boolean) */
    var collapseOnDblClick: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/Ext.panel.Panel) */
    var collapseTarget: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var collapsedCls: js.UndefOr[java.lang.String] = js.native
    
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
    var orientation: js.UndefOr[java.lang.String] = js.native
    
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
    implicit class ISplitterMutableBuilder[Self <: ISplitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseOnDblClick(value: Boolean): Self = StObject.set(x, "collapseOnDblClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnDblClickUndefined: Self = StObject.set(x, "collapseOnDblClick", js.undefined)
      
      @scala.inline
      def setCollapseTarget(value: js.Any): Self = StObject.set(x, "collapseTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseTargetUndefined: Self = StObject.set(x, "collapseTarget", js.undefined)
      
      @scala.inline
      def setCollapsedCls(value: java.lang.String): Self = StObject.set(x, "collapsedCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedClsUndefined: Self = StObject.set(x, "collapsedCls", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDefaultSplitMax(value: Double): Self = StObject.set(x, "defaultSplitMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSplitMaxUndefined: Self = StObject.set(x, "defaultSplitMax", js.undefined)
      
      @scala.inline
      def setDefaultSplitMin(value: Double): Self = StObject.set(x, "defaultSplitMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSplitMinUndefined: Self = StObject.set(x, "defaultSplitMin", js.undefined)
      
      @scala.inline
      def setGetTrackerConfig(value: () => Unit): Self = StObject.set(x, "getTrackerConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTrackerConfigUndefined: Self = StObject.set(x, "getTrackerConfig", js.undefined)
      
      @scala.inline
      def setOnRender(value: () => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setOrientation(value: java.lang.String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPerformCollapse(value: Boolean): Self = StObject.set(x, "performCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformCollapseUndefined: Self = StObject.set(x, "performCollapse", js.undefined)
      
      @scala.inline
      def setSetSize(value: () => IComponent): Self = StObject.set(x, "setSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ISplitterTracker extends IDragTracker {
    
    /** [Method] ensure the tracker is enabled store boxes of previous and next components and calculate the constrain region
      * @param e Object
      */
    @JSName("onBeforeStart")
    var onBeforeStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Track the proxy and set the proper XY coordinates while constraining the drag
      * @param e Object
      */
    @JSName("onDrag")
    var onDrag_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] perform the resize and remove the proxy class from the splitter el
      * @param e Object
      */
    @JSName("onEnd")
    var onEnd_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] We move the splitter el
      * @param e Object
      */
    @JSName("onStart")
    var onStart_ISplitterTracker: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object ISplitterTracker {
    
    @scala.inline
    def apply(): ISplitterTracker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplitterTracker]
    }
    
    @scala.inline
    implicit class ISplitterTrackerMutableBuilder[Self <: ISplitterTracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBeforeStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onBeforeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeStartUndefined: Self = StObject.set(x, "onBeforeStart", js.undefined)
      
      @scala.inline
      def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
}
