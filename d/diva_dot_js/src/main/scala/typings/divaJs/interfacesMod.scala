package typings.divaJs

import typings.divaJs.anon.Ahei
import typings.divaJs.anon.D
import typings.divaJs.anon.H
import typings.divaJs.handlersMod.ViewHandler
import typings.divaJs.imageManifestMod.default
import typings.std.HTMLElement
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait Dimensions extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Dimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManifestData extends StObject {
    
    var dims: Ahei = js.native
    
    var item_title: String = js.native
    
    var max_zoom: Double = js.native
    
    var metadata: js.Object = js.native
    
    var paged: Boolean = js.native
    
    var pgs: js.Array[Page] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object ManifestData {
    
    @scala.inline
    def apply(
      dims: Ahei,
      item_title: String,
      max_zoom: Double,
      metadata: js.Object,
      paged: Boolean,
      pgs: js.Array[Page]
    ): ManifestData = {
      val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any], item_title = item_title.asInstanceOf[js.Any], max_zoom = max_zoom.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], pgs = pgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManifestData]
    }
    
    @scala.inline
    implicit class ManifestDataMutableBuilder[Self <: ManifestData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDims(value: Ahei): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_title(value: String): Self = StObject.set(x, "item_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_zoom(value: Double): Self = StObject.set(x, "max_zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaged(value: Boolean): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgs(value: js.Array[Page]): Self = StObject.set(x, "pgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPgsVarargs(value: Page*): Self = StObject.set(x, "pgs", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(left: Double, top: Double): Offset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
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
    
    def onGotoSubmit(): js.Any = js.native
    
    def pageAliasFunction(): js.Any = js.native
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptHeader(value: String): Self = StObject.set(x, "acceptHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdaptivePadding(value: Double): Self = StObject.set(x, "adaptivePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowScrollAmount(value: Double): Self = StObject.set(x, "arrowScrollAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockMobileMove(value: Boolean): Self = StObject.set(x, "blockMobileMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoTitle(value: Boolean): Self = StObject.set(x, "enableAutoTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFilename(value: Boolean): Self = StObject.set(x, "enableFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFullscreen(value: Boolean): Self = StObject.set(x, "enableFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGotoPage(value: Boolean): Self = StObject.set(x, "enableGotoPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGotoSuggestions(value: Boolean): Self = StObject.set(x, "enableGotoSuggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGridControls(value: String): Self = StObject.set(x, "enableGridControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGridIcon(value: Boolean): Self = StObject.set(x, "enableGridIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableImageTitles(value: Boolean): Self = StObject.set(x, "enableImageTitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableIndexAsLabel(value: Boolean): Self = StObject.set(x, "enableIndexAsLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyScroll(value: Boolean): Self = StObject.set(x, "enableKeyScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLinkIcon(value: Boolean): Self = StObject.set(x, "enableLinkIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableNonPagedVisibilityIcon(value: Boolean): Self = StObject.set(x, "enableNonPagedVisibilityIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSpaceScroll(value: Boolean): Self = StObject.set(x, "enableSpaceScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableToolbar(value: Boolean): Self = StObject.set(x, "enableToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableZoomControls(value: String): Self = StObject.set(x, "enableZoomControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillParentHeight(value: Boolean): Self = StObject.set(x, "fillParentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeightGrid(value: Boolean): Self = StObject.set(x, "fixedHeightGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedPadding(value: Double): Self = StObject.set(x, "fixedPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoDirectlyTo(value: Double): Self = StObject.set(x, "goDirectlyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashParamSuffix(value: String): Self = StObject.set(x, "hashParamSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInBookLayout(value: Boolean): Self = StObject.set(x, "inBookLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFullscreen(value: Boolean): Self = StObject.set(x, "inFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInGrid(value: Boolean): Self = StObject.set(x, "inGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPagesPerRow(value: Double): Self = StObject.set(x, "maxPagesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPagesPerRow(value: Double): Self = StObject.set(x, "minPagesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomLevel(value: Double): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectData(value: js.Object | String): Self = StObject.set(x, "objectData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnGotoSubmit(value: () => js.Any): Self = StObject.set(x, "onGotoSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPageAliasFunction(value: () => js.Any): Self = StObject.set(x, "pageAliasFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPageAliases(value: js.Object): Self = StObject.set(x, "pageAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesPerRow(value: Double): Self = StObject.set(x, "pagesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNonPagedPages(value: Boolean): Self = StObject.set(x, "showNonPagedPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrobberTimeout(value: Double): Self = StObject.set(x, "throbberTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarParentObject(value: js.Object): Self = StObject.set(x, "toolbarParentObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticallyOriented(value: Boolean): Self = StObject.set(x, "verticallyOriented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportMargin(value: Double): Self = StObject.set(x, "viewportMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Page extends StObject {
    
    var api: Double = js.native
    
    var canvas: String = js.native
    
    var d: H = js.native
    
    var f: String = js.native
    
    var facingPages: Boolean = js.native
    
    var il: String = js.native
    
    var l: String = js.native
    
    var m: Double = js.native
    
    var otherImages: D = js.native
    
    var paged: Boolean = js.native
    
    var url: String = js.native
    
    var xoffset: Double = js.native
    
    var yoffset: Double = js.native
  }
  object Page {
    
    @scala.inline
    def apply(
      api: Double,
      canvas: String,
      d: H,
      f: String,
      facingPages: Boolean,
      il: String,
      l: String,
      m: Double,
      otherImages: D,
      paged: Boolean,
      url: String,
      xoffset: Double,
      yoffset: Double
    ): Page = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], facingPages = facingPages.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], otherImages = otherImages.asInstanceOf[js.Any], paged = paged.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: Double): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvas(value: String): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: H): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacingPages(value: Boolean): Self = StObject.set(x, "facingPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIl(value: String): Self = StObject.set(x, "il", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherImages(value: D): Self = StObject.set(x, "otherImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaged(value: Boolean): Self = StObject.set(x, "paged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageGroup extends StObject {
    
    var dimensions: Dimensions = js.native
    
    var index: Double = js.native
    
    var padding: Offset = js.native
    
    var pages: js.Array[Double] = js.native
    
    var region: Region = js.native
  }
  object PageGroup {
    
    @scala.inline
    def apply(dimensions: Dimensions, index: Double, padding: Offset, pages: js.Array[Double], region: Region): PageGroup = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageGroup]
    }
    
    @scala.inline
    implicit class PageGroupMutableBuilder[Self <: PageGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: Offset): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: js.Array[Double]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: Double*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageInfo extends StObject {
    
    var dimensions: Dimensions = js.native
    
    var group: PageGroup = js.native
    
    var groupOffset: Offset = js.native
    
    var index: Double = js.native
  }
  object PageInfo {
    
    @scala.inline
    def apply(dimensions: Dimensions, group: PageGroup, groupOffset: Offset, index: Double): PageInfo = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupOffset = groupOffset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageInfo]
    }
    
    @scala.inline
    implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: PageGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOffset(value: Offset): Self = StObject.set(x, "groupOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Region extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Region {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Region = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RendererConfig extends StObject {
    
    var maxZoomLevel: Double | Null = js.native
    
    var padding: Offset = js.native
    
    var pageLayouts: js.Object = js.native
    
    var verticallyOriented: Boolean = js.native
  }
  object RendererConfig {
    
    @scala.inline
    def apply(padding: Offset, pageLayouts: js.Object, verticallyOriented: Boolean): RendererConfig = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], pageLayouts = pageLayouts.asInstanceOf[js.Any], verticallyOriented = verticallyOriented.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererConfig]
    }
    
    @scala.inline
    implicit class RendererConfigMutableBuilder[Self <: RendererConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxZoomLevel(value: Double): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomLevelNull: Self = StObject.set(x, "maxZoomLevel", null)
      
      @scala.inline
      def setPadding(value: Offset): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLayouts(value: js.Object): Self = StObject.set(x, "pageLayouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticallyOriented(value: Boolean): Self = StObject.set(x, "verticallyOriented", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Options with ViewerState
  
  @js.native
  trait SourceProvider extends StObject {
    
    var cols: Double = js.native
    
    var rows: Double = js.native
    
    var titles: js.Array[typings.divaJs.anon.Dimensions] = js.native
    
    var zoomLevel: Double = js.native
  }
  object SourceProvider {
    
    @scala.inline
    def apply(cols: Double, rows: Double, titles: js.Array[typings.divaJs.anon.Dimensions], zoomLevel: Double): SourceProvider = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceProvider]
    }
    
    @scala.inline
    implicit class SourceProviderMutableBuilder[Self <: SourceProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitles(value: js.Array[typings.divaJs.anon.Dimensions]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlesVarargs(value: typings.divaJs.anon.Dimensions*): Self = StObject.set(x, "titles", js.Array(value :_*))
      
      @scala.inline
      def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var f: Boolean = js.native
    
    var i: Boolean | String = js.native
    
    var n: Double = js.native
    
    var p: Boolean | Double = js.native
    
    var v: String = js.native
    
    var x: Boolean | Double = js.native
    
    var y: Boolean | Double = js.native
    
    var z: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      f: Boolean,
      i: Boolean | String,
      n: Double,
      p: Boolean | Double,
      v: String,
      x: Boolean | Double,
      y: Boolean | Double,
      z: Double
    ): State = {
      val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Boolean | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Boolean | Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Boolean | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Boolean | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewerState extends StObject {
    
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
    implicit class ViewerStateMutableBuilder[Self <: ViewerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivePageIndex(value: Double): Self = StObject.set(x, "activePageIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageIndices(value: js.Array[Double]): Self = StObject.set(x, "currentPageIndices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageIndicesVarargs(value: Double*): Self = StObject.set(x, "currentPageIndices", js.Array(value :_*))
      
      @scala.inline
      def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPadding(value: Double): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialKeyScroll(value: Boolean): Self = StObject.set(x, "initialKeyScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSpaceScroll(value: Boolean): Self = StObject.set(x, "initialSpaceScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerElement(value: HTMLElement): Self = StObject.set(x, "innerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerObject(value: HTMLElement): Self = StObject.set(x, "innerObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveDiva(value: Boolean): Self = StObject.set(x, "isActiveDiva", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrollable(value: Boolean): Self = StObject.set(x, "isScrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsZooming(value: Boolean): Self = StObject.set(x, "isZooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifest(value: default): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileWebkit(value: Boolean): Self = StObject.set(x, "mobileWebkit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldZoomLevel(value: Double): Self = StObject.set(x, "oldZoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterElement(value: HTMLElement): Self = StObject.set(x, "outerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterObject(value: HTMLElement): Self = StObject.set(x, "outerObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOverlays(value: js.Object): Self = StObject.set(x, "pageOverlays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTools(value: js.Array[js.Object]): Self = StObject.set(x, "pageTools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageToolsVarargs(value: js.Object*): Self = StObject.set(x, "pageTools", js.Array(value :_*))
      
      @scala.inline
      def setParentObject(value: HTMLElement): Self = StObject.set(x, "parentObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingManifestRequest(value: js.Promise[Response]): Self = StObject.set(x, "pendingManifestRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginInstances(value: js.Array[js.Object]): Self = StObject.set(x, "pluginInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginInstancesVarargs(value: js.Object*): Self = StObject.set(x, "pluginInstances", js.Array(value :_*))
      
      @scala.inline
      def setRenderer(value: typings.divaJs.rendererMod.default): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeTimer(value: Double): Self = StObject.set(x, "resizeTimer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrobberTimeoutID(value: Double): Self = StObject.set(x, "throbberTimeoutID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbar(value: js.Object): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPadding(value: Double): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewHandler(value: ViewHandler): Self = StObject.set(x, "viewHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewport(value: typings.divaJs.viewportMod.default): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportElement(value: HTMLElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportObject(value: HTMLElement): Self = StObject.set(x, "viewportObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewportPosition extends StObject {
    
    var anchorPage: Boolean = js.native
    
    var horizontalOffset: Double = js.native
    
    var verticalOffset: Double = js.native
    
    var zoomLevel: Null | Double = js.native
  }
  object ViewportPosition {
    
    @scala.inline
    def apply(anchorPage: Boolean, horizontalOffset: Double, verticalOffset: Double): ViewportPosition = {
      val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportPosition]
    }
    
    @scala.inline
    implicit class ViewportPositionMutableBuilder[Self <: ViewportPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPage(value: Boolean): Self = StObject.set(x, "anchorPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomLevelNull: Self = StObject.set(x, "zoomLevel", null)
    }
  }
}
