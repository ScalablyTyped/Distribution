package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var acceptHeader: String = js.native
  var adaptivePadding: Double = js.native
  var arrowScrollAmount: Double = js.native
  var blockMobileMove: Boolean = js.native
  var enableAutoTitle: Boolean = js.native
  var enableFilename: Boolean = js.native
  var enableFullscreen: Boolean = js.native
  var enableGotoPage: Boolean = js.native
  var enableGotoSuggestions: Boolean = js.native
  var enableGridControls: String = js.native
  var enableGridIcon: Boolean = js.native
  var enableImageTitles: Boolean = js.native
  var enableIndexAsLabel: Boolean = js.native
  var enableKeyScroll: Boolean = js.native
  var enableLinkIcon: Boolean = js.native
  var enableNonPagedVisibilityIcon: Boolean = js.native
  var enableSpaceScroll: Boolean = js.native
  var enableToolbar: Boolean = js.native
  var enableZoomControls: String = js.native
  var fillParentHeight: Boolean = js.native
  var fixedHeightGrid: Boolean = js.native
  var fixedPadding: Double = js.native
  var goDirectlyTo: Double = js.native
  var hashParamSuffix: String = js.native
  var inBookLayout: Boolean = js.native
  var inFullscreen: Boolean = js.native
  var inGrid: Boolean = js.native
  var maxPagesPerRow: Double = js.native
  var maxZoomLevel: Double = js.native
  var minPagesPerRow: Double = js.native
  var minZoomLevel: Double = js.native
  var objectData: js.Object | String = js.native
  var pageAliases: js.Object = js.native
  var pageLoadTimeout: Double = js.native
  var pagesPerRow: Double = js.native
  var showNonPagedPages: Boolean = js.native
  var throbberTimeout: Double = js.native
  var tileHeight: Double = js.native
  var tileWidth: Double = js.native
  var toolbarParentObject: js.Object = js.native
  var verticallyOriented: Boolean = js.native
  var viewportMargin: Double = js.native
  var zoomLevel: Double = js.native
  def onGotoSubmit(): js.Any = js.native
  def pageAliasFunction(): js.Any = js.native
}

object Options {
  @scala.inline
  def apply(
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
    onGotoSubmit: () => js.Any,
    pageAliasFunction: () => js.Any,
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAcceptHeader(value: String): Self = this.set("acceptHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdaptivePadding(value: Double): Self = this.set("adaptivePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowScrollAmount(value: Double): Self = this.set("arrowScrollAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockMobileMove(value: Boolean): Self = this.set("blockMobileMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableAutoTitle(value: Boolean): Self = this.set("enableAutoTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFilename(value: Boolean): Self = this.set("enableFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableFullscreen(value: Boolean): Self = this.set("enableFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGotoPage(value: Boolean): Self = this.set("enableGotoPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGotoSuggestions(value: Boolean): Self = this.set("enableGotoSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGridControls(value: String): Self = this.set("enableGridControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableGridIcon(value: Boolean): Self = this.set("enableGridIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableImageTitles(value: Boolean): Self = this.set("enableImageTitles", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableIndexAsLabel(value: Boolean): Self = this.set("enableIndexAsLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableKeyScroll(value: Boolean): Self = this.set("enableKeyScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableLinkIcon(value: Boolean): Self = this.set("enableLinkIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableNonPagedVisibilityIcon(value: Boolean): Self = this.set("enableNonPagedVisibilityIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSpaceScroll(value: Boolean): Self = this.set("enableSpaceScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableToolbar(value: Boolean): Self = this.set("enableToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableZoomControls(value: String): Self = this.set("enableZoomControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillParentHeight(value: Boolean): Self = this.set("fillParentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedHeightGrid(value: Boolean): Self = this.set("fixedHeightGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedPadding(value: Double): Self = this.set("fixedPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoDirectlyTo(value: Double): Self = this.set("goDirectlyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashParamSuffix(value: String): Self = this.set("hashParamSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setInBookLayout(value: Boolean): Self = this.set("inBookLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setInFullscreen(value: Boolean): Self = this.set("inFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setInGrid(value: Boolean): Self = this.set("inGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxPagesPerRow(value: Double): Self = this.set("maxPagesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinPagesPerRow(value: Double): Self = this.set("minPagesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectData(value: js.Object | String): Self = this.set("objectData", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnGotoSubmit(value: () => js.Any): Self = this.set("onGotoSubmit", js.Any.fromFunction0(value))
    @scala.inline
    def setPageAliasFunction(value: () => js.Any): Self = this.set("pageAliasFunction", js.Any.fromFunction0(value))
    @scala.inline
    def setPageAliases(value: js.Object): Self = this.set("pageAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageLoadTimeout(value: Double): Self = this.set("pageLoadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagesPerRow(value: Double): Self = this.set("pagesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNonPagedPages(value: Boolean): Self = this.set("showNonPagedPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrobberTimeout(value: Double): Self = this.set("throbberTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbarParentObject(value: js.Object): Self = this.set("toolbarParentObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticallyOriented(value: Boolean): Self = this.set("verticallyOriented", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportMargin(value: Double): Self = this.set("viewportMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
  }
  
}

