package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.inspectModeCanceled
import typings.devtoolsProtocol.devtoolsProtocolStrings.inspectNodeRequested
import typings.devtoolsProtocol.devtoolsProtocolStrings.nodeHighlightRequested
import typings.devtoolsProtocol.devtoolsProtocolStrings.screenshotRequested
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestResponse
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestResponse
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestResponse
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightNodeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightQuadRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightRectRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightSourceOrderRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectNodeRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.NodeHighlightRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.ScreenshotRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetInspectModeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetPausedInDebuggerMessageRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowAdHighlightsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowContainerQueryOverlaysRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowDebugBordersRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowFPSCounterRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowFlexOverlaysRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowGridOverlaysRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowHingeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowHitTestBordersRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowIsolatedElementsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowLayoutShiftRegionsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowPaintRectsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowScrollBottleneckRectsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowScrollSnapOverlaysRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowViewportSizeOnResizeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowWebVitalsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayApi extends StObject {
  
  /**
    * Disables domain notifications.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * For Persistent Grid testing.
    */
  def getGridHighlightObjectsForTest(params: GetGridHighlightObjectsForTestRequest): js.Promise[GetGridHighlightObjectsForTestResponse] = js.native
  
  /**
    * For testing.
    */
  def getHighlightObjectForTest(params: GetHighlightObjectForTestRequest): js.Promise[GetHighlightObjectForTestResponse] = js.native
  
  /**
    * For Source Order Viewer testing.
    */
  def getSourceOrderHighlightObjectForTest(params: GetSourceOrderHighlightObjectForTestRequest): js.Promise[GetSourceOrderHighlightObjectForTestResponse] = js.native
  
  /**
    * Hides any highlight.
    */
  def hideHighlight(): js.Promise[Unit] = js.native
  
  /**
    * Highlights owner element of the frame with given id.
    * Deprecated: Doesn't work reliablity and cannot be fixed due to process
    * separatation (the owner node might be in a different process). Determine
    * the owner node in the client and use highlightNode.
    */
  def highlightFrame(params: HighlightFrameRequest): js.Promise[Unit] = js.native
  
  /**
    * Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or
    * objectId must be specified.
    */
  def highlightNode(params: HighlightNodeRequest): js.Promise[Unit] = js.native
  
  /**
    * Highlights given quad. Coordinates are absolute with respect to the main frame viewport.
    */
  def highlightQuad(params: HighlightQuadRequest): js.Promise[Unit] = js.native
  
  /**
    * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
    */
  def highlightRect(params: HighlightRectRequest): js.Promise[Unit] = js.native
  
  /**
    * Highlights the source order of the children of the DOM node with given id or with the given
    * JavaScript object wrapper. Either nodeId or objectId must be specified.
    */
  def highlightSourceOrder(params: HighlightSourceOrderRequest): js.Promise[Unit] = js.native
  
  /**
    * Fired when user cancels the inspect mode.
    */
  @JSName("on")
  def on_inspectModeCanceled(event: inspectModeCanceled, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when the node should be inspected. This happens after call to `setInspectMode` or when
    * user manually inspects an element.
    */
  @JSName("on")
  def on_inspectNodeRequested(event: inspectNodeRequested, listener: js.Function1[/* params */ InspectNodeRequestedEvent, Unit]): Unit = js.native
  /**
    * Fired when the node should be highlighted. This happens after call to `setInspectMode`.
    */
  @JSName("on")
  def on_nodeHighlightRequested(
    event: nodeHighlightRequested,
    listener: js.Function1[/* params */ NodeHighlightRequestedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when user asks to capture screenshot of some area on the page.
    */
  @JSName("on")
  def on_screenshotRequested(event: screenshotRequested, listener: js.Function1[/* params */ ScreenshotRequestedEvent, Unit]): Unit = js.native
  
  /**
    * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted.
    * Backend then generates 'inspectNodeRequested' event upon element selection.
    */
  def setInspectMode(params: SetInspectModeRequest): js.Promise[Unit] = js.native
  
  def setPausedInDebuggerMessage(params: SetPausedInDebuggerMessageRequest): js.Promise[Unit] = js.native
  
  /**
    * Highlights owner element of all frames detected to be ads.
    */
  def setShowAdHighlights(params: SetShowAdHighlightsRequest): js.Promise[Unit] = js.native
  
  def setShowContainerQueryOverlays(params: SetShowContainerQueryOverlaysRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that backend shows debug borders on layers
    */
  def setShowDebugBorders(params: SetShowDebugBordersRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that backend shows the FPS counter
    */
  def setShowFPSCounter(params: SetShowFPSCounterRequest): js.Promise[Unit] = js.native
  
  def setShowFlexOverlays(params: SetShowFlexOverlaysRequest): js.Promise[Unit] = js.native
  
  /**
    * Highlight multiple elements with the CSS Grid overlay.
    */
  def setShowGridOverlays(params: SetShowGridOverlaysRequest): js.Promise[Unit] = js.native
  
  /**
    * Add a dual screen device hinge
    */
  def setShowHinge(params: SetShowHingeRequest): js.Promise[Unit] = js.native
  
  /**
    * Deprecated, no longer has any effect.
    */
  def setShowHitTestBorders(params: SetShowHitTestBordersRequest): js.Promise[Unit] = js.native
  
  /**
    * Show elements in isolation mode with overlays.
    */
  def setShowIsolatedElements(params: SetShowIsolatedElementsRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that backend shows layout shift regions
    */
  def setShowLayoutShiftRegions(params: SetShowLayoutShiftRegionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that backend shows paint rectangles
    */
  def setShowPaintRects(params: SetShowPaintRectsRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests that backend shows scroll bottleneck rects
    */
  def setShowScrollBottleneckRects(params: SetShowScrollBottleneckRectsRequest): js.Promise[Unit] = js.native
  
  def setShowScrollSnapOverlays(params: SetShowScrollSnapOverlaysRequest): js.Promise[Unit] = js.native
  
  /**
    * Paints viewport size upon main frame resize.
    */
  def setShowViewportSizeOnResize(params: SetShowViewportSizeOnResizeRequest): js.Promise[Unit] = js.native
  
  /**
    * Request that backend shows an overlay with web vital metrics.
    */
  def setShowWebVitals(params: SetShowWebVitalsRequest): js.Promise[Unit] = js.native
}
