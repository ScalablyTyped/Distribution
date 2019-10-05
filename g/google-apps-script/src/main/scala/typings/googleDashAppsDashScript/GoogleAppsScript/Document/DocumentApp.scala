package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentApp extends js.Object {
  var Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any
  var ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any
  /** @deprecated DO NOT USE */
  var FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any
  var GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any
  var ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any
  var PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any
  var TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any
  def create(name: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document
  def getActiveDocument(): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document
  def getUi(): Ui
  def openById(id: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document
  def openByUrl(url: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document
}

object DocumentApp {
  @scala.inline
  def apply(
    Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any,
    ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any,
    FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any,
    GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any,
    ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any,
    PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any,
    TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any,
    VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any,
    create: String => typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document,
    getActiveDocument: () => typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document,
    getUi: () => Ui,
    openById: String => typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document,
    openByUrl: String => typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document
  ): DocumentApp = {
    val __obj = js.Dynamic.literal(Attribute = Attribute, ElementType = ElementType, FontFamily = FontFamily, GlyphType = GlyphType, HorizontalAlignment = HorizontalAlignment, ParagraphHeading = ParagraphHeading, PositionedLayout = PositionedLayout, TextAlignment = TextAlignment, VerticalAlignment = VerticalAlignment, create = js.Any.fromFunction1(create), getActiveDocument = js.Any.fromFunction0(getActiveDocument), getUi = js.Any.fromFunction0(getUi), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
  
    __obj.asInstanceOf[DocumentApp]
  }
}

