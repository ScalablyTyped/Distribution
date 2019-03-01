package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

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
  var SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any
  var SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any
  var TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any
  var TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any
  var ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any
  var VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any
  def create(name: java.lang.String): Presentation
  def getActivePresentation(): Presentation
  def getUi(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui
  def newAffineTransformBuilder(): AffineTransformBuilder
  def openById(id: java.lang.String): Presentation
  def openByUrl(url: java.lang.String): Presentation
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
    SlidePosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SlidePosition */ js.Any,
    SpacingMode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpacingMode */ js.Any,
    TextBaselineOffset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextBaselineOffset */ js.Any,
    TextDirection: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection */ js.Any,
    ThemeColorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThemeColorType */ js.Any,
    VideoSourceType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VideoSourceType */ js.Any,
    create: js.Function1[java.lang.String, Presentation],
    getActivePresentation: js.Function0[Presentation],
    getUi: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui],
    newAffineTransformBuilder: js.Function0[AffineTransformBuilder],
    openById: js.Function1[java.lang.String, Presentation],
    openByUrl: js.Function1[java.lang.String, Presentation]
  ): SlidesApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AlignmentPosition")(AlignmentPosition)
    __obj.updateDynamic("ArrowStyle")(ArrowStyle)
    __obj.updateDynamic("AutoTextType")(AutoTextType)
    __obj.updateDynamic("CellMergeState")(CellMergeState)
    __obj.updateDynamic("ColorType")(ColorType)
    __obj.updateDynamic("ContentAlignment")(ContentAlignment)
    __obj.updateDynamic("DashStyle")(DashStyle)
    __obj.updateDynamic("FillType")(FillType)
    __obj.updateDynamic("LineCategory")(LineCategory)
    __obj.updateDynamic("LineFillType")(LineFillType)
    __obj.updateDynamic("LineType")(LineType)
    __obj.updateDynamic("LinkType")(LinkType)
    __obj.updateDynamic("ListPreset")(ListPreset)
    __obj.updateDynamic("PageBackgroundType")(PageBackgroundType)
    __obj.updateDynamic("PageElementType")(PageElementType)
    __obj.updateDynamic("PageType")(PageType)
    __obj.updateDynamic("ParagraphAlignment")(ParagraphAlignment)
    __obj.updateDynamic("PlaceholderType")(PlaceholderType)
    __obj.updateDynamic("PredefinedLayout")(PredefinedLayout)
    __obj.updateDynamic("SelectionType")(SelectionType)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("SheetsChartEmbedType")(SheetsChartEmbedType)
    __obj.updateDynamic("SlidePosition")(SlidePosition)
    __obj.updateDynamic("SpacingMode")(SpacingMode)
    __obj.updateDynamic("TextBaselineOffset")(TextBaselineOffset)
    __obj.updateDynamic("TextDirection")(TextDirection)
    __obj.updateDynamic("ThemeColorType")(ThemeColorType)
    __obj.updateDynamic("VideoSourceType")(VideoSourceType)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getActivePresentation")(getActivePresentation)
    __obj.updateDynamic("getUi")(getUi)
    __obj.updateDynamic("newAffineTransformBuilder")(newAffineTransformBuilder)
    __obj.updateDynamic("openById")(openById)
    __obj.updateDynamic("openByUrl")(openByUrl)
    __obj.asInstanceOf[SlidesApp]
  }
}

