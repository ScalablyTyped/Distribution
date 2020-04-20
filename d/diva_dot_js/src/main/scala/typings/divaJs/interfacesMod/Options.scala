package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  def onGotoSubmit(): js.Any
  def pageAliasFunction(): js.Any
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
}

