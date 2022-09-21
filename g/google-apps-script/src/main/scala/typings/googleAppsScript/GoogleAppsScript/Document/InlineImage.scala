package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing an embedded image. An InlineImage can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineImage cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
trait InlineImage
  extends StObject
     with Element {
  
  def getAltDescription(): String
  
  def getAltTitle(): String
  
  def getAs(contentType: String): Blob
  
  def getBlob(): Blob
  
  def getHeight(): Integer
  
  def getLinkUrl(): String
  
  def getWidth(): Integer
  
  def setAltDescription(description: String): InlineImage
  
  def setAltTitle(title: String): InlineImage
  
  def setHeight(height: Integer): InlineImage
  
  def setLinkUrl(url: String): InlineImage
  
  def setWidth(width: Integer): InlineImage
}
object InlineImage {
  
  inline def apply(
    asBody: () => Body,
    asDate: () => Date,
    asEquation: () => Equation,
    asEquationFunction: () => EquationFunction,
    asEquationFunctionArgumentSeparator: () => EquationFunctionArgumentSeparator,
    asEquationSymbol: () => EquationSymbol,
    asFooterSection: () => FooterSection,
    asFootnote: () => Footnote,
    asFootnoteSection: () => FootnoteSection,
    asHeaderSection: () => HeaderSection,
    asHorizontalRule: () => HorizontalRule,
    asInlineDrawing: () => InlineDrawing,
    asInlineImage: () => InlineImage,
    asListItem: () => ListItem,
    asPageBreak: () => PageBreak,
    asParagraph: () => Paragraph,
    asPerson: () => Person,
    asRichLink: () => RichLink,
    asTable: () => Table,
    asTableCell: () => TableCell,
    asTableOfContents: () => TableOfContents,
    asTableRow: () => TableRow,
    asText: () => Text,
    copy: () => Element,
    getAltDescription: () => String,
    getAltTitle: () => String,
    getAs: String => Blob,
    getAttributes: () => Any,
    getBlob: () => Blob,
    getHeight: () => Integer,
    getLinkUrl: () => String,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    getWidth: () => Integer,
    isAtDocumentEnd: () => Boolean,
    merge: () => Element,
    removeFromParent: () => Element,
    setAltDescription: String => InlineImage,
    setAltTitle: String => InlineImage,
    setAttributes: Any => Element,
    setHeight: Integer => InlineImage,
    setLinkUrl: String => InlineImage,
    setWidth: Integer => InlineImage
  ): InlineImage = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asDate = js.Any.fromFunction0(asDate), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asPerson = js.Any.fromFunction0(asPerson), asRichLink = js.Any.fromFunction0(asRichLink), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAs = js.Any.fromFunction1(getAs), getAttributes = js.Any.fromFunction0(getAttributes), getBlob = js.Any.fromFunction0(getBlob), getHeight = js.Any.fromFunction0(getHeight), getLinkUrl = js.Any.fromFunction0(getLinkUrl), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes), setHeight = js.Any.fromFunction1(setHeight), setLinkUrl = js.Any.fromFunction1(setLinkUrl), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[InlineImage]
  }
  
  extension [Self <: InlineImage](x: Self) {
    
    inline def setGetAltDescription(value: () => String): Self = StObject.set(x, "getAltDescription", js.Any.fromFunction0(value))
    
    inline def setGetAltTitle(value: () => String): Self = StObject.set(x, "getAltTitle", js.Any.fromFunction0(value))
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: () => Blob): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
    
    inline def setGetHeight(value: () => Integer): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetLinkUrl(value: () => String): Self = StObject.set(x, "getLinkUrl", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Integer): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setSetAltDescription(value: String => InlineImage): Self = StObject.set(x, "setAltDescription", js.Any.fromFunction1(value))
    
    inline def setSetAltTitle(value: String => InlineImage): Self = StObject.set(x, "setAltTitle", js.Any.fromFunction1(value))
    
    inline def setSetHeight(value: Integer => InlineImage): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetLinkUrl(value: String => InlineImage): Self = StObject.set(x, "setLinkUrl", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => InlineImage): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}
