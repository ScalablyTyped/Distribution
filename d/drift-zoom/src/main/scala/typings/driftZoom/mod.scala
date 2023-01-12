package typings.driftZoom

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drift-zoom", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Drift {
    def this(triggerEl: HTMLElement) = this()
    def this(triggerEl: HTMLElement, options: Options) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disable(): Unit = js.native
    
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /* CompleteClass */
    override val isShowing: Boolean = js.native
    
    /* CompleteClass */
    override def setZoomImageURL(imageURL: String): Unit = js.native
    
    /* CompleteClass */
    var zoomFactor: Double = js.native
  }
  
  trait Drift extends StObject {
    
    def destroy(): Unit
    
    def disable(): Unit
    
    def enable(): Unit
    
    val isShowing: Boolean
    
    def setZoomImageURL(imageURL: String): Unit
    
    var zoomFactor: Double
  }
  object Drift {
    
    inline def apply(
      destroy: () => Unit,
      disable: () => Unit,
      enable: () => Unit,
      isShowing: Boolean,
      setZoomImageURL: String => Unit,
      zoomFactor: Double
    ): Drift = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isShowing = isShowing.asInstanceOf[js.Any], setZoomImageURL = js.Any.fromFunction1(setZoomImageURL), zoomFactor = zoomFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Drift]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Drift] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setIsShowing(value: Boolean): Self = StObject.set(x, "isShowing", value.asInstanceOf[js.Any])
      
      inline def setSetZoomImageURL(value: String => Unit): Self = StObject.set(x, "setZoomImageURL", js.Any.fromFunction1(value))
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** @default document.body */
    var boundingBoxContainer: js.UndefOr[HTMLElement] = js.undefined
    
    /** @default false */
    var containInline: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var handleTouch: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var hoverBoundingBox: js.UndefOr[Boolean] = js.undefined
    
    /** @default 0 */
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    /** @default true */
    var injectBaseStyles: js.UndefOr[Boolean] = js.undefined
    
    /** @default document.body */
    var inlineContainer: js.UndefOr[HTMLElement] = js.undefined
    
    /** @default 0 */
    var inlineOffsetX: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var inlineOffsetY: js.UndefOr[Double] = js.undefined
    
    /** @default 375 */
    var inlinePane: js.UndefOr[Double] = js.undefined
    
    /** @default 'drift-' */
    var namespace: js.UndefOr[String | Null] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    /** @default document.body */
    var paneContainer: js.UndefOr[HTMLElement] = js.undefined
    
    /** @default false */
    var passive: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var showWhitespaceAtEdges: js.UndefOr[Boolean] = js.undefined
    
    /** @default 'data-zoom' */
    var sourceAttribute: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var touchBoundingBox: js.UndefOr[Boolean] = js.undefined
    
    /** @default 0 */
    var touchDelay: js.UndefOr[Double] = js.undefined
    
    /** @default 3 */
    var zoomFactor: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBoundingBoxContainer(value: HTMLElement): Self = StObject.set(x, "boundingBoxContainer", value.asInstanceOf[js.Any])
      
      inline def setBoundingBoxContainerUndefined: Self = StObject.set(x, "boundingBoxContainer", js.undefined)
      
      inline def setContainInline(value: Boolean): Self = StObject.set(x, "containInline", value.asInstanceOf[js.Any])
      
      inline def setContainInlineUndefined: Self = StObject.set(x, "containInline", js.undefined)
      
      inline def setHandleTouch(value: Boolean): Self = StObject.set(x, "handleTouch", value.asInstanceOf[js.Any])
      
      inline def setHandleTouchUndefined: Self = StObject.set(x, "handleTouch", js.undefined)
      
      inline def setHoverBoundingBox(value: Boolean): Self = StObject.set(x, "hoverBoundingBox", value.asInstanceOf[js.Any])
      
      inline def setHoverBoundingBoxUndefined: Self = StObject.set(x, "hoverBoundingBox", js.undefined)
      
      inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      inline def setInjectBaseStyles(value: Boolean): Self = StObject.set(x, "injectBaseStyles", value.asInstanceOf[js.Any])
      
      inline def setInjectBaseStylesUndefined: Self = StObject.set(x, "injectBaseStyles", js.undefined)
      
      inline def setInlineContainer(value: HTMLElement): Self = StObject.set(x, "inlineContainer", value.asInstanceOf[js.Any])
      
      inline def setInlineContainerUndefined: Self = StObject.set(x, "inlineContainer", js.undefined)
      
      inline def setInlineOffsetX(value: Double): Self = StObject.set(x, "inlineOffsetX", value.asInstanceOf[js.Any])
      
      inline def setInlineOffsetXUndefined: Self = StObject.set(x, "inlineOffsetX", js.undefined)
      
      inline def setInlineOffsetY(value: Double): Self = StObject.set(x, "inlineOffsetY", value.asInstanceOf[js.Any])
      
      inline def setInlineOffsetYUndefined: Self = StObject.set(x, "inlineOffsetY", js.undefined)
      
      inline def setInlinePane(value: Double): Self = StObject.set(x, "inlinePane", value.asInstanceOf[js.Any])
      
      inline def setInlinePaneUndefined: Self = StObject.set(x, "inlinePane", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideNull: Self = StObject.set(x, "onHide", null)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowNull: Self = StObject.set(x, "onShow", null)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPaneContainer(value: HTMLElement): Self = StObject.set(x, "paneContainer", value.asInstanceOf[js.Any])
      
      inline def setPaneContainerUndefined: Self = StObject.set(x, "paneContainer", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setShowWhitespaceAtEdges(value: Boolean): Self = StObject.set(x, "showWhitespaceAtEdges", value.asInstanceOf[js.Any])
      
      inline def setShowWhitespaceAtEdgesUndefined: Self = StObject.set(x, "showWhitespaceAtEdges", js.undefined)
      
      inline def setSourceAttribute(value: String): Self = StObject.set(x, "sourceAttribute", value.asInstanceOf[js.Any])
      
      inline def setSourceAttributeUndefined: Self = StObject.set(x, "sourceAttribute", js.undefined)
      
      inline def setTouchBoundingBox(value: Boolean): Self = StObject.set(x, "touchBoundingBox", value.asInstanceOf[js.Any])
      
      inline def setTouchBoundingBoxUndefined: Self = StObject.set(x, "touchBoundingBox", js.undefined)
      
      inline def setTouchDelay(value: Double): Self = StObject.set(x, "touchDelay", value.asInstanceOf[js.Any])
      
      inline def setTouchDelayUndefined: Self = StObject.set(x, "touchDelay", js.undefined)
      
      inline def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      inline def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
}
