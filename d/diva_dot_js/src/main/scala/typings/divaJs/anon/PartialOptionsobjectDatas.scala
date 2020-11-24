package typings.divaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<diva.js.diva.js/interfaces.Options> & {  objectData :string | object} */
@js.native
trait PartialOptionsobjectDatas extends js.Object {
  
  var acceptHeader: js.UndefOr[String] = js.native
  
  var adaptivePadding: js.UndefOr[Double] = js.native
  
  var arrowScrollAmount: js.UndefOr[Double] = js.native
  
  var blockMobileMove: js.UndefOr[Boolean] = js.native
  
  var enableAutoTitle: js.UndefOr[Boolean] = js.native
  
  var enableFilename: js.UndefOr[Boolean] = js.native
  
  var enableFullscreen: js.UndefOr[Boolean] = js.native
  
  var enableGotoPage: js.UndefOr[Boolean] = js.native
  
  var enableGotoSuggestions: js.UndefOr[Boolean] = js.native
  
  var enableGridControls: js.UndefOr[String] = js.native
  
  var enableGridIcon: js.UndefOr[Boolean] = js.native
  
  var enableImageTitles: js.UndefOr[Boolean] = js.native
  
  var enableIndexAsLabel: js.UndefOr[Boolean] = js.native
  
  var enableKeyScroll: js.UndefOr[Boolean] = js.native
  
  var enableLinkIcon: js.UndefOr[Boolean] = js.native
  
  var enableNonPagedVisibilityIcon: js.UndefOr[Boolean] = js.native
  
  var enableSpaceScroll: js.UndefOr[Boolean] = js.native
  
  var enableToolbar: js.UndefOr[Boolean] = js.native
  
  var enableZoomControls: js.UndefOr[String] = js.native
  
  var fillParentHeight: js.UndefOr[Boolean] = js.native
  
  var fixedHeightGrid: js.UndefOr[Boolean] = js.native
  
  var fixedPadding: js.UndefOr[Double] = js.native
  
  var goDirectlyTo: js.UndefOr[Double] = js.native
  
  var hashParamSuffix: js.UndefOr[String] = js.native
  
  var inBookLayout: js.UndefOr[Boolean] = js.native
  
  var inFullscreen: js.UndefOr[Boolean] = js.native
  
  var inGrid: js.UndefOr[Boolean] = js.native
  
  var maxPagesPerRow: js.UndefOr[Double] = js.native
  
  var maxZoomLevel: js.UndefOr[Double] = js.native
  
  var minPagesPerRow: js.UndefOr[Double] = js.native
  
  var minZoomLevel: js.UndefOr[Double] = js.native
  
  var objectData: (js.UndefOr[js.Object | String]) with (String | js.Object) = js.native
  
  var onGotoSubmit: js.UndefOr[js.Function0[_]] = js.native
  
  var pageAliasFunction: js.UndefOr[js.Function0[_]] = js.native
  
  var pageAliases: js.UndefOr[js.Object] = js.native
  
  var pageLoadTimeout: js.UndefOr[Double] = js.native
  
  var pagesPerRow: js.UndefOr[Double] = js.native
  
  var showNonPagedPages: js.UndefOr[Boolean] = js.native
  
  var throbberTimeout: js.UndefOr[Double] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var toolbarParentObject: js.UndefOr[js.Object] = js.native
  
  var verticallyOriented: js.UndefOr[Boolean] = js.native
  
  var viewportMargin: js.UndefOr[Double] = js.native
  
  var zoomLevel: js.UndefOr[Double] = js.native
}
object PartialOptionsobjectDatas {
  
  @scala.inline
  def apply(objectData: (js.UndefOr[js.Object | String]) with (String | js.Object)): PartialOptionsobjectDatas = {
    val __obj = js.Dynamic.literal(objectData = objectData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsobjectDatas]
  }
  
  @scala.inline
  implicit class PartialOptionsobjectDatasOps[Self <: PartialOptionsobjectDatas] (val x: Self) extends AnyVal {
    
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
    def setObjectData(value: (js.UndefOr[js.Object | String]) with (String | js.Object)): Self = this.set("objectData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptHeader(value: String): Self = this.set("acceptHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptHeader: Self = this.set("acceptHeader", js.undefined)
    
    @scala.inline
    def setAdaptivePadding(value: Double): Self = this.set("adaptivePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptivePadding: Self = this.set("adaptivePadding", js.undefined)
    
    @scala.inline
    def setArrowScrollAmount(value: Double): Self = this.set("arrowScrollAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowScrollAmount: Self = this.set("arrowScrollAmount", js.undefined)
    
    @scala.inline
    def setBlockMobileMove(value: Boolean): Self = this.set("blockMobileMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockMobileMove: Self = this.set("blockMobileMove", js.undefined)
    
    @scala.inline
    def setEnableAutoTitle(value: Boolean): Self = this.set("enableAutoTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoTitle: Self = this.set("enableAutoTitle", js.undefined)
    
    @scala.inline
    def setEnableFilename(value: Boolean): Self = this.set("enableFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFilename: Self = this.set("enableFilename", js.undefined)
    
    @scala.inline
    def setEnableFullscreen(value: Boolean): Self = this.set("enableFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFullscreen: Self = this.set("enableFullscreen", js.undefined)
    
    @scala.inline
    def setEnableGotoPage(value: Boolean): Self = this.set("enableGotoPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGotoPage: Self = this.set("enableGotoPage", js.undefined)
    
    @scala.inline
    def setEnableGotoSuggestions(value: Boolean): Self = this.set("enableGotoSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGotoSuggestions: Self = this.set("enableGotoSuggestions", js.undefined)
    
    @scala.inline
    def setEnableGridControls(value: String): Self = this.set("enableGridControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGridControls: Self = this.set("enableGridControls", js.undefined)
    
    @scala.inline
    def setEnableGridIcon(value: Boolean): Self = this.set("enableGridIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGridIcon: Self = this.set("enableGridIcon", js.undefined)
    
    @scala.inline
    def setEnableImageTitles(value: Boolean): Self = this.set("enableImageTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableImageTitles: Self = this.set("enableImageTitles", js.undefined)
    
    @scala.inline
    def setEnableIndexAsLabel(value: Boolean): Self = this.set("enableIndexAsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIndexAsLabel: Self = this.set("enableIndexAsLabel", js.undefined)
    
    @scala.inline
    def setEnableKeyScroll(value: Boolean): Self = this.set("enableKeyScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableKeyScroll: Self = this.set("enableKeyScroll", js.undefined)
    
    @scala.inline
    def setEnableLinkIcon(value: Boolean): Self = this.set("enableLinkIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLinkIcon: Self = this.set("enableLinkIcon", js.undefined)
    
    @scala.inline
    def setEnableNonPagedVisibilityIcon(value: Boolean): Self = this.set("enableNonPagedVisibilityIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNonPagedVisibilityIcon: Self = this.set("enableNonPagedVisibilityIcon", js.undefined)
    
    @scala.inline
    def setEnableSpaceScroll(value: Boolean): Self = this.set("enableSpaceScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSpaceScroll: Self = this.set("enableSpaceScroll", js.undefined)
    
    @scala.inline
    def setEnableToolbar(value: Boolean): Self = this.set("enableToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableToolbar: Self = this.set("enableToolbar", js.undefined)
    
    @scala.inline
    def setEnableZoomControls(value: String): Self = this.set("enableZoomControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableZoomControls: Self = this.set("enableZoomControls", js.undefined)
    
    @scala.inline
    def setFillParentHeight(value: Boolean): Self = this.set("fillParentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillParentHeight: Self = this.set("fillParentHeight", js.undefined)
    
    @scala.inline
    def setFixedHeightGrid(value: Boolean): Self = this.set("fixedHeightGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeightGrid: Self = this.set("fixedHeightGrid", js.undefined)
    
    @scala.inline
    def setFixedPadding(value: Double): Self = this.set("fixedPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPadding: Self = this.set("fixedPadding", js.undefined)
    
    @scala.inline
    def setGoDirectlyTo(value: Double): Self = this.set("goDirectlyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoDirectlyTo: Self = this.set("goDirectlyTo", js.undefined)
    
    @scala.inline
    def setHashParamSuffix(value: String): Self = this.set("hashParamSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashParamSuffix: Self = this.set("hashParamSuffix", js.undefined)
    
    @scala.inline
    def setInBookLayout(value: Boolean): Self = this.set("inBookLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInBookLayout: Self = this.set("inBookLayout", js.undefined)
    
    @scala.inline
    def setInFullscreen(value: Boolean): Self = this.set("inFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInFullscreen: Self = this.set("inFullscreen", js.undefined)
    
    @scala.inline
    def setInGrid(value: Boolean): Self = this.set("inGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInGrid: Self = this.set("inGrid", js.undefined)
    
    @scala.inline
    def setMaxPagesPerRow(value: Double): Self = this.set("maxPagesPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPagesPerRow: Self = this.set("maxPagesPerRow", js.undefined)
    
    @scala.inline
    def setMaxZoomLevel(value: Double): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    
    @scala.inline
    def setMinPagesPerRow(value: Double): Self = this.set("minPagesPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPagesPerRow: Self = this.set("minPagesPerRow", js.undefined)
    
    @scala.inline
    def setMinZoomLevel(value: Double): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    
    @scala.inline
    def setOnGotoSubmit(value: () => _): Self = this.set("onGotoSubmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnGotoSubmit: Self = this.set("onGotoSubmit", js.undefined)
    
    @scala.inline
    def setPageAliasFunction(value: () => _): Self = this.set("pageAliasFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePageAliasFunction: Self = this.set("pageAliasFunction", js.undefined)
    
    @scala.inline
    def setPageAliases(value: js.Object): Self = this.set("pageAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageAliases: Self = this.set("pageAliases", js.undefined)
    
    @scala.inline
    def setPageLoadTimeout(value: Double): Self = this.set("pageLoadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLoadTimeout: Self = this.set("pageLoadTimeout", js.undefined)
    
    @scala.inline
    def setPagesPerRow(value: Double): Self = this.set("pagesPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagesPerRow: Self = this.set("pagesPerRow", js.undefined)
    
    @scala.inline
    def setShowNonPagedPages(value: Boolean): Self = this.set("showNonPagedPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNonPagedPages: Self = this.set("showNonPagedPages", js.undefined)
    
    @scala.inline
    def setThrobberTimeout(value: Double): Self = this.set("throbberTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrobberTimeout: Self = this.set("throbberTimeout", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    
    @scala.inline
    def setToolbarParentObject(value: js.Object): Self = this.set("toolbarParentObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarParentObject: Self = this.set("toolbarParentObject", js.undefined)
    
    @scala.inline
    def setVerticallyOriented(value: Boolean): Self = this.set("verticallyOriented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticallyOriented: Self = this.set("verticallyOriented", js.undefined)
    
    @scala.inline
    def setViewportMargin(value: Double): Self = this.set("viewportMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportMargin: Self = this.set("viewportMargin", js.undefined)
    
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
}
