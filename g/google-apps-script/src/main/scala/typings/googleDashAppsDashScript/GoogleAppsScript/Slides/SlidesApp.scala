package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidesApp extends js.Object {
  var AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any
  var ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any
  var AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any
  var CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any
  var ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorType */ js.Any
  var ContentAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentAlignment */ js.Any
  var DashStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DashStyle */ js.Any
  var FillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FillType */ js.Any
  var LineCategory: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineCategory */ js.Any
  var LineFillType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineFillType */ js.Any
  var LineType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LineType */ js.Any
  var LinkType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LinkType */ js.Any
  var ListPreset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListPreset */ js.Any
  var PageBackgroundType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundType */ js.Any
  var PageElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageElementType */ js.Any
  var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any
  var ParagraphAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphAlignment */ js.Any
  var PlaceholderType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaceholderType */ js.Any
  var PredefinedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PredefinedLayout */ js.Any
  var SelectionType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionType */ js.Any
  var ShapeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ShapeType */ js.Any
  var SheetsChartEmbedType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SheetsChartEmbedType */ js.Any
  var SlideLinkingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlideLinkingMode */ js.Any
  var SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any
  var SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any
  var TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any
  var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any
  var VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any
  def create(name: String): Presentation
  def getActivePresentation(): Presentation
  def getUi(): Ui
  def newAffineTransformBuilder(): AffineTransformBuilder
  def openById(id: String): Presentation
  def openByUrl(url: String): Presentation
}

object SlidesApp {
  @scala.inline
  def apply(
    AlignmentPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AlignmentPosition */ js.Any,
    ArrowStyle: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ArrowStyle */ js.Any,
    AutoTextType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutoTextType */ js.Any,
    CellMergeState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CellMergeState */ js.Any,
    ColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorType */ js.Any,
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
    val __obj = js.Dynamic.literal(AlignmentPosition = AlignmentPosition, ArrowStyle = ArrowStyle, AutoTextType = AutoTextType, CellMergeState = CellMergeState, ColorType = ColorType, ContentAlignment = ContentAlignment, DashStyle = DashStyle, FillType = FillType, LineCategory = LineCategory, LineFillType = LineFillType, LineType = LineType, LinkType = LinkType, ListPreset = ListPreset, PageBackgroundType = PageBackgroundType, PageElementType = PageElementType, PageType = PageType, ParagraphAlignment = ParagraphAlignment, PlaceholderType = PlaceholderType, PredefinedLayout = PredefinedLayout, SelectionType = SelectionType, ShapeType = ShapeType, SheetsChartEmbedType = SheetsChartEmbedType, SlideLinkingMode = SlideLinkingMode, SlidePosition = SlidePosition, SpacingMode = SpacingMode, TextBaselineOffset = TextBaselineOffset, TextDirection = TextDirection, ThemeColorType = ThemeColorType, VideoSourceType = VideoSourceType, create = js.Any.fromFunction1(create), getActivePresentation = js.Any.fromFunction0(getActivePresentation), getUi = js.Any.fromFunction0(getUi), newAffineTransformBuilder = js.Any.fromFunction0(newAffineTransformBuilder), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
  
    __obj.asInstanceOf[SlidesApp]
  }
}

