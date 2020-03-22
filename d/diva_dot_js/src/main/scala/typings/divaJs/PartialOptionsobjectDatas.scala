package typings.divaJs

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
    adaptivePadding: Int | Double = null,
    arrowScrollAmount: Int | Double = null,
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
    fixedPadding: Int | Double = null,
    goDirectlyTo: Int | Double = null,
    hashParamSuffix: String = null,
    inBookLayout: js.UndefOr[Boolean] = js.undefined,
    inFullscreen: js.UndefOr[Boolean] = js.undefined,
    inGrid: js.UndefOr[Boolean] = js.undefined,
    maxPagesPerRow: Int | Double = null,
    maxZoomLevel: Int | Double = null,
    minPagesPerRow: Int | Double = null,
    minZoomLevel: Int | Double = null,
    objectData: (js.Object | String) with (String | js.Object) = null,
    onGotoSubmit: () => _ = null,
    pageAliasFunction: () => _ = null,
    pageAliases: js.Object = null,
    pageLoadTimeout: Int | Double = null,
    pagesPerRow: Int | Double = null,
    showNonPagedPages: js.UndefOr[Boolean] = js.undefined,
    throbberTimeout: Int | Double = null,
    tileHeight: Int | Double = null,
    tileWidth: Int | Double = null,
    toolbarParentObject: js.Object = null,
    verticallyOriented: js.UndefOr[Boolean] = js.undefined,
    viewportMargin: Int | Double = null,
    zoomLevel: Int | Double = null
  ): PartialOptionsobjectDatas = {
    val __obj = js.Dynamic.literal()
    if (acceptHeader != null) __obj.updateDynamic("acceptHeader")(acceptHeader.asInstanceOf[js.Any])
    if (adaptivePadding != null) __obj.updateDynamic("adaptivePadding")(adaptivePadding.asInstanceOf[js.Any])
    if (arrowScrollAmount != null) __obj.updateDynamic("arrowScrollAmount")(arrowScrollAmount.asInstanceOf[js.Any])
    if (!js.isUndefined(blockMobileMove)) __obj.updateDynamic("blockMobileMove")(blockMobileMove.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoTitle)) __obj.updateDynamic("enableAutoTitle")(enableAutoTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFilename)) __obj.updateDynamic("enableFilename")(enableFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullscreen)) __obj.updateDynamic("enableFullscreen")(enableFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGotoPage)) __obj.updateDynamic("enableGotoPage")(enableGotoPage.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGotoSuggestions)) __obj.updateDynamic("enableGotoSuggestions")(enableGotoSuggestions.asInstanceOf[js.Any])
    if (enableGridControls != null) __obj.updateDynamic("enableGridControls")(enableGridControls.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridIcon)) __obj.updateDynamic("enableGridIcon")(enableGridIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImageTitles)) __obj.updateDynamic("enableImageTitles")(enableImageTitles.asInstanceOf[js.Any])
    if (!js.isUndefined(enableIndexAsLabel)) __obj.updateDynamic("enableIndexAsLabel")(enableIndexAsLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyScroll)) __obj.updateDynamic("enableKeyScroll")(enableKeyScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinkIcon)) __obj.updateDynamic("enableLinkIcon")(enableLinkIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNonPagedVisibilityIcon)) __obj.updateDynamic("enableNonPagedVisibilityIcon")(enableNonPagedVisibilityIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSpaceScroll)) __obj.updateDynamic("enableSpaceScroll")(enableSpaceScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(enableToolbar)) __obj.updateDynamic("enableToolbar")(enableToolbar.asInstanceOf[js.Any])
    if (enableZoomControls != null) __obj.updateDynamic("enableZoomControls")(enableZoomControls.asInstanceOf[js.Any])
    if (!js.isUndefined(fillParentHeight)) __obj.updateDynamic("fillParentHeight")(fillParentHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeightGrid)) __obj.updateDynamic("fixedHeightGrid")(fixedHeightGrid.asInstanceOf[js.Any])
    if (fixedPadding != null) __obj.updateDynamic("fixedPadding")(fixedPadding.asInstanceOf[js.Any])
    if (goDirectlyTo != null) __obj.updateDynamic("goDirectlyTo")(goDirectlyTo.asInstanceOf[js.Any])
    if (hashParamSuffix != null) __obj.updateDynamic("hashParamSuffix")(hashParamSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(inBookLayout)) __obj.updateDynamic("inBookLayout")(inBookLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(inFullscreen)) __obj.updateDynamic("inFullscreen")(inFullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(inGrid)) __obj.updateDynamic("inGrid")(inGrid.asInstanceOf[js.Any])
    if (maxPagesPerRow != null) __obj.updateDynamic("maxPagesPerRow")(maxPagesPerRow.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minPagesPerRow != null) __obj.updateDynamic("minPagesPerRow")(minPagesPerRow.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (objectData != null) __obj.updateDynamic("objectData")(objectData.asInstanceOf[js.Any])
    if (onGotoSubmit != null) __obj.updateDynamic("onGotoSubmit")(js.Any.fromFunction0(onGotoSubmit))
    if (pageAliasFunction != null) __obj.updateDynamic("pageAliasFunction")(js.Any.fromFunction0(pageAliasFunction))
    if (pageAliases != null) __obj.updateDynamic("pageAliases")(pageAliases.asInstanceOf[js.Any])
    if (pageLoadTimeout != null) __obj.updateDynamic("pageLoadTimeout")(pageLoadTimeout.asInstanceOf[js.Any])
    if (pagesPerRow != null) __obj.updateDynamic("pagesPerRow")(pagesPerRow.asInstanceOf[js.Any])
    if (!js.isUndefined(showNonPagedPages)) __obj.updateDynamic("showNonPagedPages")(showNonPagedPages.asInstanceOf[js.Any])
    if (throbberTimeout != null) __obj.updateDynamic("throbberTimeout")(throbberTimeout.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (toolbarParentObject != null) __obj.updateDynamic("toolbarParentObject")(toolbarParentObject.asInstanceOf[js.Any])
    if (!js.isUndefined(verticallyOriented)) __obj.updateDynamic("verticallyOriented")(verticallyOriented.asInstanceOf[js.Any])
    if (viewportMargin != null) __obj.updateDynamic("viewportMargin")(viewportMargin.asInstanceOf[js.Any])
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsobjectDatas]
  }
}

