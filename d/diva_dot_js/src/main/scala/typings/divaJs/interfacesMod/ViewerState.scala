package typings.divaJs.interfacesMod

import typings.divaJs.handlersMod.ViewHandler
import typings.divaJs.imageManifestMod.default
import typings.std.HTMLElement
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerState extends js.Object {
  var ID: String
  var activePageIndex: Double
  var currentPageIndices: js.Array[Double]
  var horizontalOffset: Double
  var horizontalPadding: Double
  var initialKeyScroll: Boolean
  var initialSpaceScroll: Boolean
  var innerElement: HTMLElement
  var innerObject: HTMLElement
  var isActiveDiva: Boolean
  var isScrollable: Boolean
  var isZooming: Boolean
  var loaded: Boolean
  var manifest: default
  var mobileWebkit: Boolean
  var numPages: Double
  var oldZoomLevel: Double
  var options: Options
  var outerElement: HTMLElement
  var outerObject: HTMLElement
  var pageOverlays: js.Object
   // new PageOverlayManager();
  var pageTools: js.Array[js.Object]
   // plugins as page tools
  var parentObject: HTMLElement
  var pendingManifestRequest: js.Promise[Response]
  var pluginInstances: js.Array[js.Object]
   // enabled plugins from the registr;
  var renderer: typings.divaJs.rendererMod.default
  var resizeTimer: Double
  var scrollbarWidth: Double
  var selector: String
  var throbberTimeoutID: Double
  var toolbar: js.Object
  var verticalOffset: Double
  var verticalPadding: Double
  var viewHandler: ViewHandler
  var viewport: typings.divaJs.viewportMod.default
  var viewportElement: HTMLElement
  var viewportObject: HTMLElement
  var zoomDuration: Double
}

object ViewerState {
  @scala.inline
  def apply(
    ID: String,
    activePageIndex: Double,
    currentPageIndices: js.Array[Double],
    horizontalOffset: Double,
    horizontalPadding: Double,
    initialKeyScroll: Boolean,
    initialSpaceScroll: Boolean,
    innerElement: HTMLElement,
    innerObject: HTMLElement,
    isActiveDiva: Boolean,
    isScrollable: Boolean,
    isZooming: Boolean,
    loaded: Boolean,
    manifest: default,
    mobileWebkit: Boolean,
    numPages: Double,
    oldZoomLevel: Double,
    options: Options,
    outerElement: HTMLElement,
    outerObject: HTMLElement,
    pageOverlays: js.Object,
    pageTools: js.Array[js.Object],
    parentObject: HTMLElement,
    pendingManifestRequest: js.Promise[Response],
    pluginInstances: js.Array[js.Object],
    renderer: typings.divaJs.rendererMod.default,
    resizeTimer: Double,
    scrollbarWidth: Double,
    selector: String,
    throbberTimeoutID: Double,
    toolbar: js.Object,
    verticalOffset: Double,
    verticalPadding: Double,
    viewHandler: ViewHandler,
    viewport: typings.divaJs.viewportMod.default,
    viewportElement: HTMLElement,
    viewportObject: HTMLElement,
    zoomDuration: Double
  ): ViewerState = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], activePageIndex = activePageIndex.asInstanceOf[js.Any], currentPageIndices = currentPageIndices.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], horizontalPadding = horizontalPadding.asInstanceOf[js.Any], initialKeyScroll = initialKeyScroll.asInstanceOf[js.Any], initialSpaceScroll = initialSpaceScroll.asInstanceOf[js.Any], innerElement = innerElement.asInstanceOf[js.Any], innerObject = innerObject.asInstanceOf[js.Any], isActiveDiva = isActiveDiva.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], isZooming = isZooming.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], mobileWebkit = mobileWebkit.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], oldZoomLevel = oldZoomLevel.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outerElement = outerElement.asInstanceOf[js.Any], outerObject = outerObject.asInstanceOf[js.Any], pageOverlays = pageOverlays.asInstanceOf[js.Any], pageTools = pageTools.asInstanceOf[js.Any], parentObject = parentObject.asInstanceOf[js.Any], pendingManifestRequest = pendingManifestRequest.asInstanceOf[js.Any], pluginInstances = pluginInstances.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resizeTimer = resizeTimer.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], throbberTimeoutID = throbberTimeoutID.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any], viewHandler = viewHandler.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], viewportObject = viewportObject.asInstanceOf[js.Any], zoomDuration = zoomDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerState]
  }
}

