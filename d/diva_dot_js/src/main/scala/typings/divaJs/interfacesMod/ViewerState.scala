package typings.divaJs.interfacesMod

import typings.divaJs.handlersMod.ViewHandler
import typings.divaJs.imageManifestMod.default
import typings.std.HTMLElement
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerState extends js.Object {
  var ID: String = js.native
  var activePageIndex: Double = js.native
  var currentPageIndices: js.Array[Double] = js.native
  var horizontalOffset: Double = js.native
  var horizontalPadding: Double = js.native
  var initialKeyScroll: Boolean = js.native
  var initialSpaceScroll: Boolean = js.native
  var innerElement: HTMLElement = js.native
  var innerObject: HTMLElement = js.native
  var isActiveDiva: Boolean = js.native
  var isScrollable: Boolean = js.native
  var isZooming: Boolean = js.native
  var loaded: Boolean = js.native
  var manifest: default = js.native
  var mobileWebkit: Boolean = js.native
  var numPages: Double = js.native
  var oldZoomLevel: Double = js.native
  var options: Options = js.native
  var outerElement: HTMLElement = js.native
  var outerObject: HTMLElement = js.native
  var pageOverlays: js.Object = js.native
   // new PageOverlayManager();
  var pageTools: js.Array[js.Object] = js.native
   // plugins as page tools
  var parentObject: HTMLElement = js.native
  var pendingManifestRequest: js.Promise[Response] = js.native
  var pluginInstances: js.Array[js.Object] = js.native
   // enabled plugins from the registr;
  var renderer: typings.divaJs.rendererMod.default = js.native
  var resizeTimer: Double = js.native
  var scrollbarWidth: Double = js.native
  var selector: String = js.native
  var throbberTimeoutID: Double = js.native
  var toolbar: js.Object = js.native
  var verticalOffset: Double = js.native
  var verticalPadding: Double = js.native
  var viewHandler: ViewHandler = js.native
  var viewport: typings.divaJs.viewportMod.default = js.native
  var viewportElement: HTMLElement = js.native
  var viewportObject: HTMLElement = js.native
  var zoomDuration: Double = js.native
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
  @scala.inline
  implicit class ViewerStateOps[Self <: ViewerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivePageIndex(value: Double): Self = this.set("activePageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPageIndicesVarargs(value: Double*): Self = this.set("currentPageIndices", js.Array(value :_*))
    @scala.inline
    def setCurrentPageIndices(value: js.Array[Double]): Self = this.set("currentPageIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalPadding(value: Double): Self = this.set("horizontalPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialKeyScroll(value: Boolean): Self = this.set("initialKeyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialSpaceScroll(value: Boolean): Self = this.set("initialSpaceScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerElement(value: HTMLElement): Self = this.set("innerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerObject(value: HTMLElement): Self = this.set("innerObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActiveDiva(value: Boolean): Self = this.set("isActiveDiva", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrollable(value: Boolean): Self = this.set("isScrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsZooming(value: Boolean): Self = this.set("isZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest(value: default): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileWebkit(value: Boolean): Self = this.set("mobileWebkit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPages(value: Double): Self = this.set("numPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldZoomLevel(value: Double): Self = this.set("oldZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterElement(value: HTMLElement): Self = this.set("outerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterObject(value: HTMLElement): Self = this.set("outerObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageOverlays(value: js.Object): Self = this.set("pageOverlays", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageToolsVarargs(value: js.Object*): Self = this.set("pageTools", js.Array(value :_*))
    @scala.inline
    def setPageTools(value: js.Array[js.Object]): Self = this.set("pageTools", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentObject(value: HTMLElement): Self = this.set("parentObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingManifestRequest(value: js.Promise[Response]): Self = this.set("pendingManifestRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginInstancesVarargs(value: js.Object*): Self = this.set("pluginInstances", js.Array(value :_*))
    @scala.inline
    def setPluginInstances(value: js.Array[js.Object]): Self = this.set("pluginInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: typings.divaJs.rendererMod.default): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeTimer(value: Double): Self = this.set("resizeTimer", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbarWidth(value: Double): Self = this.set("scrollbarWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrobberTimeoutID(value: Double): Self = this.set("throbberTimeoutID", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbar(value: js.Object): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalPadding(value: Double): Self = this.set("verticalPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewHandler(value: ViewHandler): Self = this.set("viewHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: typings.divaJs.viewportMod.default): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportElement(value: HTMLElement): Self = this.set("viewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportObject(value: HTMLElement): Self = this.set("viewportObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomDuration(value: Double): Self = this.set("zoomDuration", value.asInstanceOf[js.Any])
  }
  
}

