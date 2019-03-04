package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentApp extends js.Object {
  var Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any
  var ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any
  var FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any
  var GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any
  var ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any
  var PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any
  var TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any
  def create(name: java.lang.String): Document
  def getActiveDocument(): Document
  def getUi(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui
  def openById(id: java.lang.String): Document
  def openByUrl(url: java.lang.String): Document
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
    create: js.Function1[java.lang.String, Document],
    getActiveDocument: js.Function0[Document],
    getUi: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Ui],
    openById: js.Function1[java.lang.String, Document],
    openByUrl: js.Function1[java.lang.String, Document]
  ): DocumentApp = {
    val __obj = js.Dynamic.literal(Attribute = Attribute, ElementType = ElementType, FontFamily = FontFamily, GlyphType = GlyphType, HorizontalAlignment = HorizontalAlignment, ParagraphHeading = ParagraphHeading, PositionedLayout = PositionedLayout, TextAlignment = TextAlignment, VerticalAlignment = VerticalAlignment, create = create, getActiveDocument = getActiveDocument, getUi = getUi, openById = openById, openByUrl = openByUrl)
  
    __obj.asInstanceOf[DocumentApp]
  }
}

