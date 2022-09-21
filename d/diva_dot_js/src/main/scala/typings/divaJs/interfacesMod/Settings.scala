package typings.divaJs.interfacesMod

import typings.divaJs.handlersMod.ViewHandler
import typings.divaJs.imageManifestMod.default
import typings.std.HTMLElement
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings
  extends StObject
     with Options
     with ViewerState
object Settings {
  
  inline def apply(
    ID: String,
    acceptHeader: String,
    activePageIndex: Double,
    adaptivePadding: Double,
    arrowScrollAmount: Double,
    blockMobileMove: Boolean,
    currentPageIndices: js.Array[Double],
    enableAutoTitle: Boolean,
    enableFilename: Boolean,
    enableFullscreen: Boolean,
    enableGotoPage: Boolean,
    enableGotoSuggestions: Boolean,
    enableGridControls: String,
    enableGridIcon: Boolean,
    enableImageTitles: Boolean,
    enableIndexAsLabel: Boolean,
    enableKeyScroll: Boolean,
    enableLinkIcon: Boolean,
    enableNonPagedVisibilityIcon: Boolean,
    enableSpaceScroll: Boolean,
    enableToolbar: Boolean,
    enableZoomControls: String,
    fillParentHeight: Boolean,
    fixedHeightGrid: Boolean,
    fixedPadding: Double,
    goDirectlyTo: Double,
    hashParamSuffix: String,
    horizontalOffset: Double,
    horizontalPadding: Double,
    inBookLayout: Boolean,
    inFullscreen: Boolean,
    inGrid: Boolean,
    initialKeyScroll: Boolean,
    initialSpaceScroll: Boolean,
    innerElement: HTMLElement,
    innerObject: HTMLElement,
    isActiveDiva: Boolean,
    isScrollable: Boolean,
    isZooming: Boolean,
    loaded: Boolean,
    manifest: default,
    maxPagesPerRow: Double,
    maxZoomLevel: Double,
    minPagesPerRow: Double,
    minZoomLevel: Double,
    mobileWebkit: Boolean,
    numPages: Double,
    objectData: js.Object | String,
    oldZoomLevel: Double,
    onGotoSubmit: () => Any,
    options: Options,
    outerElement: HTMLElement,
    outerObject: HTMLElement,
    pageAliasFunction: () => Any,
    pageAliases: js.Object,
    pageLoadTimeout: Double,
    pageOverlays: js.Object,
    pageTools: js.Array[js.Object],
    pagesPerRow: Double,
    parentObject: HTMLElement,
    pendingManifestRequest: js.Promise[Response],
    pluginInstances: js.Array[js.Object],
    renderer: typings.divaJs.rendererMod.default,
    resizeTimer: Double,
    scrollbarWidth: Double,
    selector: String,
    showNonPagedPages: Boolean,
    throbberTimeout: Double,
    throbberTimeoutID: Double,
    tileHeight: Double,
    tileWidth: Double,
    toolbar: js.Object,
    toolbarParentObject: js.Object,
    verticalOffset: Double,
    verticalPadding: Double,
    verticallyOriented: Boolean,
    viewHandler: ViewHandler,
    viewport: typings.divaJs.viewportMod.default,
    viewportElement: HTMLElement,
    viewportMargin: Double,
    viewportObject: HTMLElement,
    zoomDuration: Double,
    zoomLevel: Double
  ): Settings = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], acceptHeader = acceptHeader.asInstanceOf[js.Any], activePageIndex = activePageIndex.asInstanceOf[js.Any], adaptivePadding = adaptivePadding.asInstanceOf[js.Any], arrowScrollAmount = arrowScrollAmount.asInstanceOf[js.Any], blockMobileMove = blockMobileMove.asInstanceOf[js.Any], currentPageIndices = currentPageIndices.asInstanceOf[js.Any], enableAutoTitle = enableAutoTitle.asInstanceOf[js.Any], enableFilename = enableFilename.asInstanceOf[js.Any], enableFullscreen = enableFullscreen.asInstanceOf[js.Any], enableGotoPage = enableGotoPage.asInstanceOf[js.Any], enableGotoSuggestions = enableGotoSuggestions.asInstanceOf[js.Any], enableGridControls = enableGridControls.asInstanceOf[js.Any], enableGridIcon = enableGridIcon.asInstanceOf[js.Any], enableImageTitles = enableImageTitles.asInstanceOf[js.Any], enableIndexAsLabel = enableIndexAsLabel.asInstanceOf[js.Any], enableKeyScroll = enableKeyScroll.asInstanceOf[js.Any], enableLinkIcon = enableLinkIcon.asInstanceOf[js.Any], enableNonPagedVisibilityIcon = enableNonPagedVisibilityIcon.asInstanceOf[js.Any], enableSpaceScroll = enableSpaceScroll.asInstanceOf[js.Any], enableToolbar = enableToolbar.asInstanceOf[js.Any], enableZoomControls = enableZoomControls.asInstanceOf[js.Any], fillParentHeight = fillParentHeight.asInstanceOf[js.Any], fixedHeightGrid = fixedHeightGrid.asInstanceOf[js.Any], fixedPadding = fixedPadding.asInstanceOf[js.Any], goDirectlyTo = goDirectlyTo.asInstanceOf[js.Any], hashParamSuffix = hashParamSuffix.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], horizontalPadding = horizontalPadding.asInstanceOf[js.Any], inBookLayout = inBookLayout.asInstanceOf[js.Any], inFullscreen = inFullscreen.asInstanceOf[js.Any], inGrid = inGrid.asInstanceOf[js.Any], initialKeyScroll = initialKeyScroll.asInstanceOf[js.Any], initialSpaceScroll = initialSpaceScroll.asInstanceOf[js.Any], innerElement = innerElement.asInstanceOf[js.Any], innerObject = innerObject.asInstanceOf[js.Any], isActiveDiva = isActiveDiva.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], isZooming = isZooming.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], maxPagesPerRow = maxPagesPerRow.asInstanceOf[js.Any], maxZoomLevel = maxZoomLevel.asInstanceOf[js.Any], minPagesPerRow = minPagesPerRow.asInstanceOf[js.Any], minZoomLevel = minZoomLevel.asInstanceOf[js.Any], mobileWebkit = mobileWebkit.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], objectData = objectData.asInstanceOf[js.Any], oldZoomLevel = oldZoomLevel.asInstanceOf[js.Any], onGotoSubmit = js.Any.fromFunction0(onGotoSubmit), options = options.asInstanceOf[js.Any], outerElement = outerElement.asInstanceOf[js.Any], outerObject = outerObject.asInstanceOf[js.Any], pageAliasFunction = js.Any.fromFunction0(pageAliasFunction), pageAliases = pageAliases.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pageOverlays = pageOverlays.asInstanceOf[js.Any], pageTools = pageTools.asInstanceOf[js.Any], pagesPerRow = pagesPerRow.asInstanceOf[js.Any], parentObject = parentObject.asInstanceOf[js.Any], pendingManifestRequest = pendingManifestRequest.asInstanceOf[js.Any], pluginInstances = pluginInstances.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resizeTimer = resizeTimer.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showNonPagedPages = showNonPagedPages.asInstanceOf[js.Any], throbberTimeout = throbberTimeout.asInstanceOf[js.Any], throbberTimeoutID = throbberTimeoutID.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], toolbarParentObject = toolbarParentObject.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any], viewHandler = viewHandler.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], viewportMargin = viewportMargin.asInstanceOf[js.Any], viewportObject = viewportObject.asInstanceOf[js.Any], zoomDuration = zoomDuration.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}
