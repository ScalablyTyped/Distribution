package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates and opens Presentations that can be edited.
  *
  *     // Open a presentation by ID.
  *     var preso = SlidesApp.openById('PRESENTATION_ID_GOES_HERE');
  *
  *     // Create and open a presentation.
  *     preso = SlidesApp.create('Presentation Name');
  */
@js.native
trait SlidesApp extends js.Object {
  
  var AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any = js.native
  
  var ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any = js.native
  
  var AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any = js.native
  
  var CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any = js.native
  
  var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any = js.native
  
  var ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any = js.native
  
  var DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any = js.native
  
  var FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any = js.native
  
  var LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any = js.native
  
  var LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any = js.native
  
  var LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any = js.native
  
  var LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any = js.native
  
  var ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any = js.native
  
  var PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any = js.native
  
  var PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any = js.native
  
  var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any = js.native
  
  var ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any = js.native
  
  var PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any = js.native
  
  var PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any = js.native
  
  var SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any = js.native
  
  var ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any = js.native
  
  var SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any = js.native
  
  var SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any = js.native
  
  var SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any = js.native
  
  var SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any = js.native
  
  var TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any = js.native
  
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any = js.native
  
  var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any = js.native
  
  var VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any = js.native
  
  def create(name: String): Presentation = js.native
  
  def getActivePresentation(): Presentation = js.native
  
  def getUi(): Ui = js.native
  
  def newAffineTransformBuilder(): AffineTransformBuilder = js.native
  
  def openById(id: String): Presentation = js.native
  
  def openByUrl(url: String): Presentation = js.native
}
object SlidesApp {
  
  @scala.inline
  def apply(
    AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any,
    ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any,
    AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any,
    CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any,
    ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any,
    ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any,
    DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any,
    FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any,
    LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any,
    LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any,
    LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any,
    LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any,
    ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any,
    PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any,
    PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any,
    PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any,
    ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any,
    PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any,
    PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any,
    SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any,
    ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any,
    SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any,
    SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any,
    SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any,
    SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any,
    TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any,
    TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any,
    ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any,
    VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any,
    create: String => Presentation,
    getActivePresentation: () => Presentation,
    getUi: () => Ui,
    newAffineTransformBuilder: () => AffineTransformBuilder,
    openById: String => Presentation,
    openByUrl: String => Presentation
  ): SlidesApp = {
    val __obj = js.Dynamic.literal(AlignmentPosition = AlignmentPosition.asInstanceOf[js.Any], ArrowStyle = ArrowStyle.asInstanceOf[js.Any], AutoTextType = AutoTextType.asInstanceOf[js.Any], CellMergeState = CellMergeState.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], ContentAlignment = ContentAlignment.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], FillType = FillType.asInstanceOf[js.Any], LineCategory = LineCategory.asInstanceOf[js.Any], LineFillType = LineFillType.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], LinkType = LinkType.asInstanceOf[js.Any], ListPreset = ListPreset.asInstanceOf[js.Any], PageBackgroundType = PageBackgroundType.asInstanceOf[js.Any], PageElementType = PageElementType.asInstanceOf[js.Any], PageType = PageType.asInstanceOf[js.Any], ParagraphAlignment = ParagraphAlignment.asInstanceOf[js.Any], PlaceholderType = PlaceholderType.asInstanceOf[js.Any], PredefinedLayout = PredefinedLayout.asInstanceOf[js.Any], SelectionType = SelectionType.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], SheetsChartEmbedType = SheetsChartEmbedType.asInstanceOf[js.Any], SlideLinkingMode = SlideLinkingMode.asInstanceOf[js.Any], SlidePosition = SlidePosition.asInstanceOf[js.Any], SpacingMode = SpacingMode.asInstanceOf[js.Any], TextBaselineOffset = TextBaselineOffset.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any], ThemeColorType = ThemeColorType.asInstanceOf[js.Any], VideoSourceType = VideoSourceType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), getActivePresentation = js.Any.fromFunction0(getActivePresentation), getUi = js.Any.fromFunction0(getUi), newAffineTransformBuilder = js.Any.fromFunction0(newAffineTransformBuilder), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
    __obj.asInstanceOf[SlidesApp]
  }
  
  @scala.inline
  implicit class SlidesAppOps[Self <: SlidesApp] (val x: Self) extends AnyVal {
    
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
    def setAlignmentPosition(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any
    ): Self = this.set("AlignmentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any): Self = this.set("ArrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any
    ): Self = this.set("AutoTextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellMergeState(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any
    ): Self = this.set("CellMergeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.ColorType */ js.Any
    ): Self = this.set("ColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any
    ): Self = this.set("ContentAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyle(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any): Self = this.set("DashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any): Self = this.set("FillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCategory(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any
    ): Self = this.set("LineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineFillType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any
    ): Self = this.set("LineFillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any): Self = this.set("LineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any): Self = this.set("LinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPreset(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any): Self = this.set("ListPreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBackgroundType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any
    ): Self = this.set("PageBackgroundType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageElementType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any
    ): Self = this.set("PageElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any): Self = this.set("PageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any
    ): Self = this.set("ParagraphAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any
    ): Self = this.set("PlaceholderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedLayout(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any
    ): Self = this.set("PredefinedLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any
    ): Self = this.set("SelectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any): Self = this.set("ShapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartEmbedType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any
    ): Self = this.set("SheetsChartEmbedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideLinkingMode(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any
    ): Self = this.set("SlideLinkingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidePosition(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any
    ): Self = this.set("SlidePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingMode(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any): Self = this.set("SpacingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaselineOffset(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any
    ): Self = this.set("TextBaselineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDirection(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any
    ): Self = this.set("TextDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any
    ): Self = this.set("ThemeColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSourceType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any
    ): Self = this.set("VideoSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate(value: String => Presentation): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetActivePresentation(value: () => Presentation): Self = this.set("getActivePresentation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUi(value: () => Ui): Self = this.set("getUi", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAffineTransformBuilder(value: () => AffineTransformBuilder): Self = this.set("newAffineTransformBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenById(value: String => Presentation): Self = this.set("openById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenByUrl(value: String => Presentation): Self = this.set("openByUrl", js.Any.fromFunction1(value))
  }
}
