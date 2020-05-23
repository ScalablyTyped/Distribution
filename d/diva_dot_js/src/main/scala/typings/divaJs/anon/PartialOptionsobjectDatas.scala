package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<diva.js.diva.js/interfaces.Options> & {  objectData  :string | object} */
trait PartialOptionsobjectDatas extends js.Object {
  var acceptHeader: js.UndefOr[String] = js.undefined
  var adaptivePadding: js.UndefOr[Double] = js.undefined
  var arrowScrollAmount: js.UndefOr[Double] = js.undefined
  var blockMobileMove: js.UndefOr[Boolean] = js.undefined
  var enableAutoTitle: js.UndefOr[Boolean] = js.undefined
  var enableFilename: js.UndefOr[Boolean] = js.undefined
  var enableFullscreen: js.UndefOr[Boolean] = js.undefined
  var enableGotoPage: js.UndefOr[Boolean] = js.undefined
  var enableGotoSuggestions: js.UndefOr[Boolean] = js.undefined
  var enableGridControls: js.UndefOr[String] = js.undefined
  var enableGridIcon: js.UndefOr[Boolean] = js.undefined
  var enableImageTitles: js.UndefOr[Boolean] = js.undefined
  var enableIndexAsLabel: js.UndefOr[Boolean] = js.undefined
  var enableKeyScroll: js.UndefOr[Boolean] = js.undefined
  var enableLinkIcon: js.UndefOr[Boolean] = js.undefined
  var enableNonPagedVisibilityIcon: js.UndefOr[Boolean] = js.undefined
  var enableSpaceScroll: js.UndefOr[Boolean] = js.undefined
  var enableToolbar: js.UndefOr[Boolean] = js.undefined
  var enableZoomControls: js.UndefOr[String] = js.undefined
  var fillParentHeight: js.UndefOr[Boolean] = js.undefined
  var fixedHeightGrid: js.UndefOr[Boolean] = js.undefined
  var fixedPadding: js.UndefOr[Double] = js.undefined
  var goDirectlyTo: js.UndefOr[Double] = js.undefined
  var hashParamSuffix: js.UndefOr[String] = js.undefined
  var inBookLayout: js.UndefOr[Boolean] = js.undefined
  var inFullscreen: js.UndefOr[Boolean] = js.undefined
  var inGrid: js.UndefOr[Boolean] = js.undefined
  var maxPagesPerRow: js.UndefOr[Double] = js.undefined
  var maxZoomLevel: js.UndefOr[Double] = js.undefined
  var minPagesPerRow: js.UndefOr[Double] = js.undefined
  var minZoomLevel: js.UndefOr[Double] = js.undefined
  var objectData: js.UndefOr[(js.Object | String) with (String | js.Object)] = js.undefined
  var onGotoSubmit: js.UndefOr[js.Function0[_]] = js.undefined
  var pageAliasFunction: js.UndefOr[js.Function0[_]] = js.undefined
  var pageAliases: js.UndefOr[js.Object] = js.undefined
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  var pagesPerRow: js.UndefOr[Double] = js.undefined
  var showNonPagedPages: js.UndefOr[Boolean] = js.undefined
  var throbberTimeout: js.UndefOr[Double] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var toolbarParentObject: js.UndefOr[js.Object] = js.undefined
  var verticallyOriented: js.UndefOr[Boolean] = js.undefined
  var viewportMargin: js.UndefOr[Double] = js.undefined
  var zoomLevel: js.UndefOr[Double] = js.undefined
}

object PartialOptionsobjectDatas {
  @scala.inline
  def apply(
    acceptHeader: String = null,
    adaptivePadding: js.UndefOr[Double] = js.undefined,
    arrowScrollAmount: js.UndefOr[Double] = js.undefined,
    blockMobileMove: js.UndefOr[Boolean] = js.undefined,
    enableAutoTitle: js.UndefOr[Boolean] = js.undefined,
    enableFilename: js.UndefOr[Boolean] = js.undefined,
    enableFullscreen: js.UndefOr[Boolean] = js.undefined,
    enableGotoPage: js.UndefOr[Boolean] = js.undefined,
    enableGotoSuggestions: js.UndefOr[Boolean] = js.undefined,
    enableGridControls: String = null,
    enableGridIcon: js.UndefOr[Boolean] = js.undefined,
    enableImageTitles: js.UndefOr[Boolean] = js.undefined,
    enableIndexAsLabel: js.UndefOr[Boolean] = js.undefined,
    enableKeyScroll: js.UndefOr[Boolean] = js.undefined,
    enableLinkIcon: js.UndefOr[Boolean] = js.undefined,
    enableNonPagedVisibilityIcon: js.UndefOr[Boolean] = js.undefined,
    enableSpaceScroll: js.UndefOr[Boolean] = js.undefined,
    enableToolbar: js.UndefOr[Boolean] = js.undefined,
    enableZoomControls: String = null,
    fillParentHeight: js.UndefOr[Boolean] = js.undefined,
    fixedHeightGrid: js.UndefOr[Boolean] = js.undefined,
    fixedPadding: js.UndefOr[Double] = js.undefined,
    goDirectlyTo: js.UndefOr[Double] = js.undefined,
    hashParamSuffix: String = null,
    inBookLayout: js.UndefOr[Boolean] = js.undefined,
    inFullscreen: js.UndefOr[Boolean] = js.undefined,
    inGrid: js.UndefOr[Boolean] = js.undefined,
    maxPagesPerRow: js.UndefOr[Double] = js.undefined,
    maxZoomLevel: js.UndefOr[Double] = js.undefined,
    minPagesPerRow: js.UndefOr[Double] = js.undefined,
    minZoomLevel: js.UndefOr[Double] = js.undefined,
    objectData: (js.Object | String) with (String | js.Object) = null,
    onGotoSubmit: () => _ = null,
    pageAliasFunction: () => _ = null,
    pageAliases: js.Object = null,
    pageLoadTimeout: js.UndefOr[Double] = js.undefined,
    pagesPerRow: js.UndefOr[Double] = js.undefined,
    showNonPagedPages: js.UndefOr[Boolean] = js.undefined,
    throbberTimeout: js.UndefOr[Double] = js.undefined,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileWidth: js.UndefOr[Double] = js.undefined,
    toolbarParentObject: js.Object = null,
    verticallyOriented: js.UndefOr[Boolean] = js.undefined,
    viewportMargin: js.UndefOr[Double] = js.undefined,
    zoomLevel: js.UndefOr[Double] = js.undefined
  ): PartialOptionsobjectDatas = {
    val __obj = js.Dynamic.literal()
    if (acceptHeader != null) __obj.updateDynamic("acceptHeader")(acceptHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptivePadding)) __obj.updateDynamic("adaptivePadding")(adaptivePadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowScrollAmount)) __obj.updateDynamic("arrowScrollAmount")(arrowScrollAmount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockMobileMove)) __obj.updateDynamic("blockMobileMove")(blockMobileMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoTitle)) __obj.updateDynamic("enableAutoTitle")(enableAutoTitle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFilename)) __obj.updateDynamic("enableFilename")(enableFilename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullscreen)) __obj.updateDynamic("enableFullscreen")(enableFullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGotoPage)) __obj.updateDynamic("enableGotoPage")(enableGotoPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGotoSuggestions)) __obj.updateDynamic("enableGotoSuggestions")(enableGotoSuggestions.get.asInstanceOf[js.Any])
    if (enableGridControls != null) __obj.updateDynamic("enableGridControls")(enableGridControls.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridIcon)) __obj.updateDynamic("enableGridIcon")(enableGridIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImageTitles)) __obj.updateDynamic("enableImageTitles")(enableImageTitles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableIndexAsLabel)) __obj.updateDynamic("enableIndexAsLabel")(enableIndexAsLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyScroll)) __obj.updateDynamic("enableKeyScroll")(enableKeyScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkIcon)) __obj.updateDynamic("enableLinkIcon")(enableLinkIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNonPagedVisibilityIcon)) __obj.updateDynamic("enableNonPagedVisibilityIcon")(enableNonPagedVisibilityIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSpaceScroll)) __obj.updateDynamic("enableSpaceScroll")(enableSpaceScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToolbar)) __obj.updateDynamic("enableToolbar")(enableToolbar.get.asInstanceOf[js.Any])
    if (enableZoomControls != null) __obj.updateDynamic("enableZoomControls")(enableZoomControls.asInstanceOf[js.Any])
    if (!js.isUndefined(fillParentHeight)) __obj.updateDynamic("fillParentHeight")(fillParentHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeightGrid)) __obj.updateDynamic("fixedHeightGrid")(fixedHeightGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedPadding)) __obj.updateDynamic("fixedPadding")(fixedPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(goDirectlyTo)) __obj.updateDynamic("goDirectlyTo")(goDirectlyTo.get.asInstanceOf[js.Any])
    if (hashParamSuffix != null) __obj.updateDynamic("hashParamSuffix")(hashParamSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(inBookLayout)) __obj.updateDynamic("inBookLayout")(inBookLayout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inFullscreen)) __obj.updateDynamic("inFullscreen")(inFullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inGrid)) __obj.updateDynamic("inGrid")(inGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPagesPerRow)) __obj.updateDynamic("maxPagesPerRow")(maxPagesPerRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoomLevel)) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPagesPerRow)) __obj.updateDynamic("minPagesPerRow")(minPagesPerRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomLevel)) __obj.updateDynamic("minZoomLevel")(minZoomLevel.get.asInstanceOf[js.Any])
    if (objectData != null) __obj.updateDynamic("objectData")(objectData.asInstanceOf[js.Any])
    if (onGotoSubmit != null) __obj.updateDynamic("onGotoSubmit")(js.Any.fromFunction0(onGotoSubmit))
    if (pageAliasFunction != null) __obj.updateDynamic("pageAliasFunction")(js.Any.fromFunction0(pageAliasFunction))
    if (pageAliases != null) __obj.updateDynamic("pageAliases")(pageAliases.asInstanceOf[js.Any])
    if (!js.isUndefined(pageLoadTimeout)) __obj.updateDynamic("pageLoadTimeout")(pageLoadTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagesPerRow)) __obj.updateDynamic("pagesPerRow")(pagesPerRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNonPagedPages)) __obj.updateDynamic("showNonPagedPages")(showNonPagedPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throbberTimeout)) __obj.updateDynamic("throbberTimeout")(throbberTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (toolbarParentObject != null) __obj.updateDynamic("toolbarParentObject")(toolbarParentObject.asInstanceOf[js.Any])
    if (!js.isUndefined(verticallyOriented)) __obj.updateDynamic("verticallyOriented")(verticallyOriented.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportMargin)) __obj.updateDynamic("viewportMargin")(viewportMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomLevel)) __obj.updateDynamic("zoomLevel")(zoomLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsobjectDatas]
  }
}

