package typings.divaJs.interfacesMod

import typings.divaJs.handlersMod.ViewHandler
import typings.divaJs.imageManifestMod.default
import typings.std.HTMLElement
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerState extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ViewerState] (val x: Self) extends AnyVal {
    
    inline def setActivePageIndex(value: Double): Self = StObject.set(x, "activePageIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageIndices(value: js.Array[Double]): Self = StObject.set(x, "currentPageIndices", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageIndicesVarargs(value: Double*): Self = StObject.set(x, "currentPageIndices", js.Array(value*))
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPadding(value: Double): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setInitialKeyScroll(value: Boolean): Self = StObject.set(x, "initialKeyScroll", value.asInstanceOf[js.Any])
    
    inline def setInitialSpaceScroll(value: Boolean): Self = StObject.set(x, "initialSpaceScroll", value.asInstanceOf[js.Any])
    
    inline def setInnerElement(value: HTMLElement): Self = StObject.set(x, "innerElement", value.asInstanceOf[js.Any])
    
    inline def setInnerObject(value: HTMLElement): Self = StObject.set(x, "innerObject", value.asInstanceOf[js.Any])
    
    inline def setIsActiveDiva(value: Boolean): Self = StObject.set(x, "isActiveDiva", value.asInstanceOf[js.Any])
    
    inline def setIsScrollable(value: Boolean): Self = StObject.set(x, "isScrollable", value.asInstanceOf[js.Any])
    
    inline def setIsZooming(value: Boolean): Self = StObject.set(x, "isZooming", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: default): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setMobileWebkit(value: Boolean): Self = StObject.set(x, "mobileWebkit", value.asInstanceOf[js.Any])
    
    inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
    
    inline def setOldZoomLevel(value: Double): Self = StObject.set(x, "oldZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOuterElement(value: HTMLElement): Self = StObject.set(x, "outerElement", value.asInstanceOf[js.Any])
    
    inline def setOuterObject(value: HTMLElement): Self = StObject.set(x, "outerObject", value.asInstanceOf[js.Any])
    
    inline def setPageOverlays(value: js.Object): Self = StObject.set(x, "pageOverlays", value.asInstanceOf[js.Any])
    
    inline def setPageTools(value: js.Array[js.Object]): Self = StObject.set(x, "pageTools", value.asInstanceOf[js.Any])
    
    inline def setPageToolsVarargs(value: js.Object*): Self = StObject.set(x, "pageTools", js.Array(value*))
    
    inline def setParentObject(value: HTMLElement): Self = StObject.set(x, "parentObject", value.asInstanceOf[js.Any])
    
    inline def setPendingManifestRequest(value: js.Promise[Response]): Self = StObject.set(x, "pendingManifestRequest", value.asInstanceOf[js.Any])
    
    inline def setPluginInstances(value: js.Array[js.Object]): Self = StObject.set(x, "pluginInstances", value.asInstanceOf[js.Any])
    
    inline def setPluginInstancesVarargs(value: js.Object*): Self = StObject.set(x, "pluginInstances", js.Array(value*))
    
    inline def setRenderer(value: typings.divaJs.rendererMod.default): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setResizeTimer(value: Double): Self = StObject.set(x, "resizeTimer", value.asInstanceOf[js.Any])
    
    inline def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setThrobberTimeoutID(value: Double): Self = StObject.set(x, "throbberTimeoutID", value.asInstanceOf[js.Any])
    
    inline def setToolbar(value: js.Object): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
    
    inline def setViewHandler(value: ViewHandler): Self = StObject.set(x, "viewHandler", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: typings.divaJs.viewportMod.default): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: HTMLElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setViewportObject(value: HTMLElement): Self = StObject.set(x, "viewportObject", value.asInstanceOf[js.Any])
    
    inline def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
  }
}
