package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SlidesApp extends js.Object {
  var AlignmentPosition: js.Any
  var ArrowStyle: js.Any
  var AutoTextType: js.Any
  var CellMergeState: js.Any
  var ColorType: js.Any
  var ContentAlignment: js.Any
  var DashStyle: js.Any
  var FillType: js.Any
  var LineCategory: js.Any
  var LineFillType: js.Any
  var LineType: js.Any
  var LinkType: js.Any
  var ListPreset: js.Any
  var PageBackgroundType: js.Any
  var PageElementType: js.Any
  var PageType: js.Any
  var ParagraphAlignment: js.Any
  var PlaceholderType: js.Any
  var PredefinedLayout: js.Any
  var SelectionType: js.Any
  var ShapeType: js.Any
  var SheetsChartEmbedType: js.Any
  var SlidePosition: js.Any
  var SpacingMode: js.Any
  var TextBaselineOffset: js.Any
  var TextDirection: js.Any
  var ThemeColorType: js.Any
  var VideoSourceType: js.Any
  def create(name: java.lang.String): Presentation
  def getActivePresentation(): Presentation
  def getUi(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui
  def newAffineTransformBuilder(): AffineTransformBuilder
  def openById(id: java.lang.String): Presentation
  def openByUrl(url: java.lang.String): Presentation
}

