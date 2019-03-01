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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attribute")(Attribute)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("FontFamily")(FontFamily)
    __obj.updateDynamic("GlyphType")(GlyphType)
    __obj.updateDynamic("HorizontalAlignment")(HorizontalAlignment)
    __obj.updateDynamic("ParagraphHeading")(ParagraphHeading)
    __obj.updateDynamic("PositionedLayout")(PositionedLayout)
    __obj.updateDynamic("TextAlignment")(TextAlignment)
    __obj.updateDynamic("VerticalAlignment")(VerticalAlignment)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getActiveDocument")(getActiveDocument)
    __obj.updateDynamic("getUi")(getUi)
    __obj.updateDynamic("openById")(openById)
    __obj.updateDynamic("openByUrl")(openByUrl)
    __obj.asInstanceOf[DocumentApp]
  }
}

