package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var acceptHeader: String
  
  var adaptivePadding: Double
  
  var arrowScrollAmount: Double
  
  var blockMobileMove: Boolean
  
  var enableAutoTitle: Boolean
  
  var enableFilename: Boolean
  
  var enableFullscreen: Boolean
  
  var enableGotoPage: Boolean
  
  var enableGotoSuggestions: Boolean
  
  var enableGridControls: String
  
  var enableGridIcon: Boolean
  
  var enableImageTitles: Boolean
  
  var enableIndexAsLabel: Boolean
  
  var enableKeyScroll: Boolean
  
  var enableLinkIcon: Boolean
  
  var enableNonPagedVisibilityIcon: Boolean
  
  var enableSpaceScroll: Boolean
  
  var enableToolbar: Boolean
  
  var enableZoomControls: String
  
  var fillParentHeight: Boolean
  
  var fixedHeightGrid: Boolean
  
  var fixedPadding: Double
  
  var goDirectlyTo: Double
  
  var hashParamSuffix: String
  
  var inBookLayout: Boolean
  
  var inFullscreen: Boolean
  
  var inGrid: Boolean
  
  var maxPagesPerRow: Double
  
  var maxZoomLevel: Double
  
  var minPagesPerRow: Double
  
  var minZoomLevel: Double
  
  var objectData: js.Object | String
  
  def onGotoSubmit(): Any
  
  def pageAliasFunction(): Any
  
  var pageAliases: js.Object
  
  var pageLoadTimeout: Double
  
  var pagesPerRow: Double
  
  var showNonPagedPages: Boolean
  
  var throbberTimeout: Double
  
  var tileHeight: Double
  
  var tileWidth: Double
  
  var toolbarParentObject: js.Object
  
  var verticallyOriented: Boolean
  
  var viewportMargin: Double
  
  var zoomLevel: Double
}
object Options {
  
  inline def apply(
    acceptHeader: String,
    adaptivePadding: Double,
    arrowScrollAmount: Double,
    blockMobileMove: Boolean,
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
    inBookLayout: Boolean,
    inFullscreen: Boolean,
    inGrid: Boolean,
    maxPagesPerRow: Double,
    maxZoomLevel: Double,
    minPagesPerRow: Double,
    minZoomLevel: Double,
    objectData: js.Object | String,
    onGotoSubmit: () => Any,
    pageAliasFunction: () => Any,
    pageAliases: js.Object,
    pageLoadTimeout: Double,
    pagesPerRow: Double,
    showNonPagedPages: Boolean,
    throbberTimeout: Double,
    tileHeight: Double,
    tileWidth: Double,
    toolbarParentObject: js.Object,
    verticallyOriented: Boolean,
    viewportMargin: Double,
    zoomLevel: Double
  ): Options = {
    val __obj = js.Dynamic.literal(acceptHeader = acceptHeader.asInstanceOf[js.Any], adaptivePadding = adaptivePadding.asInstanceOf[js.Any], arrowScrollAmount = arrowScrollAmount.asInstanceOf[js.Any], blockMobileMove = blockMobileMove.asInstanceOf[js.Any], enableAutoTitle = enableAutoTitle.asInstanceOf[js.Any], enableFilename = enableFilename.asInstanceOf[js.Any], enableFullscreen = enableFullscreen.asInstanceOf[js.Any], enableGotoPage = enableGotoPage.asInstanceOf[js.Any], enableGotoSuggestions = enableGotoSuggestions.asInstanceOf[js.Any], enableGridControls = enableGridControls.asInstanceOf[js.Any], enableGridIcon = enableGridIcon.asInstanceOf[js.Any], enableImageTitles = enableImageTitles.asInstanceOf[js.Any], enableIndexAsLabel = enableIndexAsLabel.asInstanceOf[js.Any], enableKeyScroll = enableKeyScroll.asInstanceOf[js.Any], enableLinkIcon = enableLinkIcon.asInstanceOf[js.Any], enableNonPagedVisibilityIcon = enableNonPagedVisibilityIcon.asInstanceOf[js.Any], enableSpaceScroll = enableSpaceScroll.asInstanceOf[js.Any], enableToolbar = enableToolbar.asInstanceOf[js.Any], enableZoomControls = enableZoomControls.asInstanceOf[js.Any], fillParentHeight = fillParentHeight.asInstanceOf[js.Any], fixedHeightGrid = fixedHeightGrid.asInstanceOf[js.Any], fixedPadding = fixedPadding.asInstanceOf[js.Any], goDirectlyTo = goDirectlyTo.asInstanceOf[js.Any], hashParamSuffix = hashParamSuffix.asInstanceOf[js.Any], inBookLayout = inBookLayout.asInstanceOf[js.Any], inFullscreen = inFullscreen.asInstanceOf[js.Any], inGrid = inGrid.asInstanceOf[js.Any], maxPagesPerRow = maxPagesPerRow.asInstanceOf[js.Any], maxZoomLevel = maxZoomLevel.asInstanceOf[js.Any], minPagesPerRow = minPagesPerRow.asInstanceOf[js.Any], minZoomLevel = minZoomLevel.asInstanceOf[js.Any], objectData = objectData.asInstanceOf[js.Any], onGotoSubmit = js.Any.fromFunction0(onGotoSubmit), pageAliasFunction = js.Any.fromFunction0(pageAliasFunction), pageAliases = pageAliases.asInstanceOf[js.Any], pageLoadTimeout = pageLoadTimeout.asInstanceOf[js.Any], pagesPerRow = pagesPerRow.asInstanceOf[js.Any], showNonPagedPages = showNonPagedPages.asInstanceOf[js.Any], throbberTimeout = throbberTimeout.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], toolbarParentObject = toolbarParentObject.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any], viewportMargin = viewportMargin.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setAcceptHeader(value: String): Self = StObject.set(x, "acceptHeader", value.asInstanceOf[js.Any])
    
    inline def setAdaptivePadding(value: Double): Self = StObject.set(x, "adaptivePadding", value.asInstanceOf[js.Any])
    
    inline def setArrowScrollAmount(value: Double): Self = StObject.set(x, "arrowScrollAmount", value.asInstanceOf[js.Any])
    
    inline def setBlockMobileMove(value: Boolean): Self = StObject.set(x, "blockMobileMove", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoTitle(value: Boolean): Self = StObject.set(x, "enableAutoTitle", value.asInstanceOf[js.Any])
    
    inline def setEnableFilename(value: Boolean): Self = StObject.set(x, "enableFilename", value.asInstanceOf[js.Any])
    
    inline def setEnableFullscreen(value: Boolean): Self = StObject.set(x, "enableFullscreen", value.asInstanceOf[js.Any])
    
    inline def setEnableGotoPage(value: Boolean): Self = StObject.set(x, "enableGotoPage", value.asInstanceOf[js.Any])
    
    inline def setEnableGotoSuggestions(value: Boolean): Self = StObject.set(x, "enableGotoSuggestions", value.asInstanceOf[js.Any])
    
    inline def setEnableGridControls(value: String): Self = StObject.set(x, "enableGridControls", value.asInstanceOf[js.Any])
    
    inline def setEnableGridIcon(value: Boolean): Self = StObject.set(x, "enableGridIcon", value.asInstanceOf[js.Any])
    
    inline def setEnableImageTitles(value: Boolean): Self = StObject.set(x, "enableImageTitles", value.asInstanceOf[js.Any])
    
    inline def setEnableIndexAsLabel(value: Boolean): Self = StObject.set(x, "enableIndexAsLabel", value.asInstanceOf[js.Any])
    
    inline def setEnableKeyScroll(value: Boolean): Self = StObject.set(x, "enableKeyScroll", value.asInstanceOf[js.Any])
    
    inline def setEnableLinkIcon(value: Boolean): Self = StObject.set(x, "enableLinkIcon", value.asInstanceOf[js.Any])
    
    inline def setEnableNonPagedVisibilityIcon(value: Boolean): Self = StObject.set(x, "enableNonPagedVisibilityIcon", value.asInstanceOf[js.Any])
    
    inline def setEnableSpaceScroll(value: Boolean): Self = StObject.set(x, "enableSpaceScroll", value.asInstanceOf[js.Any])
    
    inline def setEnableToolbar(value: Boolean): Self = StObject.set(x, "enableToolbar", value.asInstanceOf[js.Any])
    
    inline def setEnableZoomControls(value: String): Self = StObject.set(x, "enableZoomControls", value.asInstanceOf[js.Any])
    
    inline def setFillParentHeight(value: Boolean): Self = StObject.set(x, "fillParentHeight", value.asInstanceOf[js.Any])
    
    inline def setFixedHeightGrid(value: Boolean): Self = StObject.set(x, "fixedHeightGrid", value.asInstanceOf[js.Any])
    
    inline def setFixedPadding(value: Double): Self = StObject.set(x, "fixedPadding", value.asInstanceOf[js.Any])
    
    inline def setGoDirectlyTo(value: Double): Self = StObject.set(x, "goDirectlyTo", value.asInstanceOf[js.Any])
    
    inline def setHashParamSuffix(value: String): Self = StObject.set(x, "hashParamSuffix", value.asInstanceOf[js.Any])
    
    inline def setInBookLayout(value: Boolean): Self = StObject.set(x, "inBookLayout", value.asInstanceOf[js.Any])
    
    inline def setInFullscreen(value: Boolean): Self = StObject.set(x, "inFullscreen", value.asInstanceOf[js.Any])
    
    inline def setInGrid(value: Boolean): Self = StObject.set(x, "inGrid", value.asInstanceOf[js.Any])
    
    inline def setMaxPagesPerRow(value: Double): Self = StObject.set(x, "maxPagesPerRow", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinPagesPerRow(value: Double): Self = StObject.set(x, "minPagesPerRow", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setObjectData(value: js.Object | String): Self = StObject.set(x, "objectData", value.asInstanceOf[js.Any])
    
    inline def setOnGotoSubmit(value: () => Any): Self = StObject.set(x, "onGotoSubmit", js.Any.fromFunction0(value))
    
    inline def setPageAliasFunction(value: () => Any): Self = StObject.set(x, "pageAliasFunction", js.Any.fromFunction0(value))
    
    inline def setPageAliases(value: js.Object): Self = StObject.set(x, "pageAliases", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPagesPerRow(value: Double): Self = StObject.set(x, "pagesPerRow", value.asInstanceOf[js.Any])
    
    inline def setShowNonPagedPages(value: Boolean): Self = StObject.set(x, "showNonPagedPages", value.asInstanceOf[js.Any])
    
    inline def setThrobberTimeout(value: Double): Self = StObject.set(x, "throbberTimeout", value.asInstanceOf[js.Any])
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setToolbarParentObject(value: js.Object): Self = StObject.set(x, "toolbarParentObject", value.asInstanceOf[js.Any])
    
    inline def setVerticallyOriented(value: Boolean): Self = StObject.set(x, "verticallyOriented", value.asInstanceOf[js.Any])
    
    inline def setViewportMargin(value: Double): Self = StObject.set(x, "viewportMargin", value.asInstanceOf[js.Any])
    
    inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
  }
}
