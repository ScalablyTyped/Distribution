package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.inspectModeCanceled
import typings.devtoolsProtocol.devtoolsProtocolStrings.inspectNodeRequested
import typings.devtoolsProtocol.devtoolsProtocolStrings.nodeHighlightRequested
import typings.devtoolsProtocol.devtoolsProtocolStrings.screenshotRequested
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestResponse
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightNodeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightQuadRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightRectRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectNodeRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.NodeHighlightRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.ScreenshotRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetInspectModeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetPausedInDebuggerMessageRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowAdHighlightsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowDebugBordersRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowFPSCounterRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowHingeRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowHitTestBordersRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowLayoutShiftRegionsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowPaintRectsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowScrollBottleneckRectsRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowViewportSizeOnResizeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayApi extends js.Object {
  /**
    * Disables domain notifications.
    */
  def disable(): js.Promise[Unit] = js.native
  /**
    * Enables domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  /**
    * For testing.
    */
  def getHighlightObjectForTest(params: GetHighlightObjectForTestRequest): js.Promise[GetHighlightObjectForTestResponse] = js.native
  /**
    * Hides any highlight.
    */
  def hideHighlight(): js.Promise[Unit] = js.native
  /**
    * Highlights owner element of the frame with given id.
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
  /**
    * Requests that backend shows debug borders on layers
    */
  def setShowDebugBorders(params: SetShowDebugBordersRequest): js.Promise[Unit] = js.native
  /**
    * Requests that backend shows the FPS counter
    */
  def setShowFPSCounter(params: SetShowFPSCounterRequest): js.Promise[Unit] = js.native
  /**
    * Add a dual screen device hinge
    */
  def setShowHinge(params: SetShowHingeRequest): js.Promise[Unit] = js.native
  /**
    * Requests that backend shows hit-test borders on layers
    */
  def setShowHitTestBorders(params: SetShowHitTestBordersRequest): js.Promise[Unit] = js.native
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
  /**
    * Paints viewport size upon main frame resize.
    */
  def setShowViewportSizeOnResize(params: SetShowViewportSizeOnResizeRequest): js.Promise[Unit] = js.native
}

