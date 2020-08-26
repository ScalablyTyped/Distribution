package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document service creates and opens Documents that can be edited.
  *
  *     // Open a document by ID.
  *     var doc = DocumentApp.openById('DOCUMENT_ID_GOES_HERE');
  *
  *     // Create and open a document.
  *     doc = DocumentApp.create('Document Name');
  */
@js.native
trait DocumentApp extends js.Object {
  var Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any = js.native
  var ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any = js.native
  /** @deprecated DO NOT USE */ var FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any = js.native
  var GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any = js.native
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any = js.native
  var ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any = js.native
  var PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any = js.native
  var TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any = js.native
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any = js.native
  def create(name: String): typings.googleAppsScript.GoogleAppsScript.Document.Document = js.native
  def getActiveDocument(): typings.googleAppsScript.GoogleAppsScript.Document.Document = js.native
  def getUi(): Ui = js.native
  def openById(id: String): typings.googleAppsScript.GoogleAppsScript.Document.Document = js.native
  def openByUrl(url: String): typings.googleAppsScript.GoogleAppsScript.Document.Document = js.native
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
    create: String => typings.googleAppsScript.GoogleAppsScript.Document.Document,
    getActiveDocument: () => typings.googleAppsScript.GoogleAppsScript.Document.Document,
    getUi: () => Ui,
    openById: String => typings.googleAppsScript.GoogleAppsScript.Document.Document,
    openByUrl: String => typings.googleAppsScript.GoogleAppsScript.Document.Document
  ): DocumentApp = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FontFamily = FontFamily.asInstanceOf[js.Any], GlyphType = GlyphType.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], ParagraphHeading = ParagraphHeading.asInstanceOf[js.Any], PositionedLayout = PositionedLayout.asInstanceOf[js.Any], TextAlignment = TextAlignment.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), getActiveDocument = js.Any.fromFunction0(getActiveDocument), getUi = js.Any.fromFunction0(getUi), openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
    __obj.asInstanceOf[DocumentApp]
  }
  @scala.inline
  implicit class DocumentAppOps[Self <: DocumentApp] (val x: Self) extends AnyVal {
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
    def setAttribute(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ js.Any): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ js.Any): Self = this.set("ElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ js.Any): Self = this.set("FontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyphType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ js.Any): Self = this.set("GlyphType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any
    ): Self = this.set("HorizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraphHeading(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ js.Any
    ): Self = this.set("ParagraphHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionedLayout(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ js.Any
    ): Self = this.set("PositionedLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ js.Any
    ): Self = this.set("TextAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any
    ): Self = this.set("VerticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: String => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActiveDocument(value: () => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = this.set("getActiveDocument", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUi(value: () => Ui): Self = this.set("getUi", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenById(value: String => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = this.set("openById", js.Any.fromFunction1(value))
    @scala.inline
    def setOpenByUrl(value: String => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = this.set("openByUrl", js.Any.fromFunction1(value))
  }
  
}

