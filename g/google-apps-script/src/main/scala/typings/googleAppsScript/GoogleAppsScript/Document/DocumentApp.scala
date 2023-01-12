package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document service creates and opens Documents that can be edited.
  *
  *     // Open a document by ID.
  *     var doc = DocumentApp.openById('DOCUMENT_ID_GOES_HERE');
  *
  *     // Create and open a document.
  *     doc = DocumentApp.create('Document Name');
  */
trait DocumentApp extends StObject {
  
  var Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ Any
  
  var ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ Any
  
  /** @deprecated DO NOT USE */ var FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ Any
  
  var GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ Any
  
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any
  
  var ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ Any
  
  var PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ Any
  
  var TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ Any
  
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ Any
  
  def create(name: String): typings.googleAppsScript.GoogleAppsScript.Document.Document
  
  def getActiveDocument(): typings.googleAppsScript.GoogleAppsScript.Document.Document
  
  def getUi(): Ui
  
  def openById(id: String): typings.googleAppsScript.GoogleAppsScript.Document.Document
  
  def openByUrl(url: String): typings.googleAppsScript.GoogleAppsScript.Document.Document
}
object DocumentApp {
  
  inline def apply(
    Attribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ Any,
    ElementType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ Any,
    FontFamily: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ Any,
    GlyphType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any,
    ParagraphHeading: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ Any,
    PositionedLayout: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ Any,
    TextAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ Any,
    VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ Any,
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
  implicit open class MutableBuilder[Self <: DocumentApp] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Attribute */ Any): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: String => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setElementType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ElementType */ Any): Self = StObject.set(x, "ElementType", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontFamily */ Any): Self = StObject.set(x, "FontFamily", value.asInstanceOf[js.Any])
    
    inline def setGetActiveDocument(value: () => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = StObject.set(x, "getActiveDocument", js.Any.fromFunction0(value))
    
    inline def setGetUi(value: () => Ui): Self = StObject.set(x, "getUi", js.Any.fromFunction0(value))
    
    inline def setGlyphType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GlyphType */ Any): Self = StObject.set(x, "GlyphType", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ Any
    ): Self = StObject.set(x, "HorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setOpenById(value: String => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = StObject.set(x, "openById", js.Any.fromFunction1(value))
    
    inline def setOpenByUrl(value: String => typings.googleAppsScript.GoogleAppsScript.Document.Document): Self = StObject.set(x, "openByUrl", js.Any.fromFunction1(value))
    
    inline def setParagraphHeading(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParagraphHeading */ Any
    ): Self = StObject.set(x, "ParagraphHeading", value.asInstanceOf[js.Any])
    
    inline def setPositionedLayout(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PositionedLayout */ Any
    ): Self = StObject.set(x, "PositionedLayout", value.asInstanceOf[js.Any])
    
    inline def setTextAlignment(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlignment */ Any): Self = StObject.set(x, "TextAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ Any
    ): Self = StObject.set(x, "VerticalAlignment", value.asInstanceOf[js.Any])
  }
}
