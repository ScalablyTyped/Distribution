package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic element. Document contents are
  * represented as elements. For example, ListItem, Paragraph, and Table are
  * elements and inherit all of the methods defined by Element, such as getType().
  * Implementing classes
  *
  * NameBrief description
  *
  * BodyAn element representing a document body.
  *
  * ContainerElementA generic element that may contain other elements.
  *
  * EquationAn element representing a mathematical expression.
  *
  * EquationFunctionAn element representing a function in a mathematical Equation.
  *
  * EquationFunctionArgumentSeparatorAn element representing a function separator in a mathematical Equation.
  *
  * EquationSymbolAn element representing a symbol in a mathematical Equation.
  *
  * FooterSectionAn element representing a footer section.
  *
  * FootnoteAn element representing a footnote.
  *
  * FootnoteSectionAn element representing a footnote section.
  *
  * HeaderSectionAn element representing a header section.
  *
  * HorizontalRuleAn element representing an horizontal rule.
  *
  * InlineDrawingAn element representing an embedded drawing.
  *
  * InlineImageAn element representing an embedded image.
  *
  * ListItemAn element representing a list item.
  *
  * PageBreakAn element representing a page break.
  *
  * ParagraphAn element representing a paragraph.
  *
  * TableAn element representing a table.
  *
  * TableCellAn element representing a table cell.
  *
  * TableOfContentsAn element containing a table of contents.
  *
  * TableRowAn element representing a table row.
  *
  * TextAn element representing a rich text region.
  *
  * UnsupportedElementAn element representing a region that is unknown or cannot be affected by a script, such as a
  * page number.
  */
trait Element extends StObject {
  
  def asBody(): Body
  
  def asDate(): Date
  
  def asEquation(): Equation
  
  def asEquationFunction(): EquationFunction
  
  def asEquationFunctionArgumentSeparator(): EquationFunctionArgumentSeparator
  
  def asEquationSymbol(): EquationSymbol
  
  def asFooterSection(): FooterSection
  
  def asFootnote(): Footnote
  
  def asFootnoteSection(): FootnoteSection
  
  def asHeaderSection(): HeaderSection
  
  def asHorizontalRule(): HorizontalRule
  
  def asInlineDrawing(): InlineDrawing
  
  def asInlineImage(): InlineImage
  
  def asListItem(): ListItem
  
  def asPageBreak(): PageBreak
  
  def asParagraph(): Paragraph
  
  def asPerson(): Person
  
  def asRichLink(): RichLink
  
  def asTable(): Table
  
  def asTableCell(): TableCell
  
  def asTableOfContents(): TableOfContents
  
  def asTableRow(): TableRow
  
  def asText(): Text
  
  def copy(): Element
  
  def getAttributes(): Any
  
  def getNextSibling(): Element
  
  def getParent(): ContainerElement
  
  def getPreviousSibling(): Element
  
  def getType(): ElementType
  
  def isAtDocumentEnd(): Boolean
  
  def merge(): Element
  
  def removeFromParent(): Element
  
  def setAttributes(attributes: Any): Element
}
object Element {
  
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
    getAttributes: () => Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => Element,
    removeFromParent: () => Element,
    setAttributes: Any => Element
  ): Element = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asDate = js.Any.fromFunction0(asDate), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asPerson = js.Any.fromFunction0(asPerson), asRichLink = js.Any.fromFunction0(asRichLink), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setAsBody(value: () => Body): Self = StObject.set(x, "asBody", js.Any.fromFunction0(value))
    
    inline def setAsDate(value: () => Date): Self = StObject.set(x, "asDate", js.Any.fromFunction0(value))
    
    inline def setAsEquation(value: () => Equation): Self = StObject.set(x, "asEquation", js.Any.fromFunction0(value))
    
    inline def setAsEquationFunction(value: () => EquationFunction): Self = StObject.set(x, "asEquationFunction", js.Any.fromFunction0(value))
    
    inline def setAsEquationFunctionArgumentSeparator(value: () => EquationFunctionArgumentSeparator): Self = StObject.set(x, "asEquationFunctionArgumentSeparator", js.Any.fromFunction0(value))
    
    inline def setAsEquationSymbol(value: () => EquationSymbol): Self = StObject.set(x, "asEquationSymbol", js.Any.fromFunction0(value))
    
    inline def setAsFooterSection(value: () => FooterSection): Self = StObject.set(x, "asFooterSection", js.Any.fromFunction0(value))
    
    inline def setAsFootnote(value: () => Footnote): Self = StObject.set(x, "asFootnote", js.Any.fromFunction0(value))
    
    inline def setAsFootnoteSection(value: () => FootnoteSection): Self = StObject.set(x, "asFootnoteSection", js.Any.fromFunction0(value))
    
    inline def setAsHeaderSection(value: () => HeaderSection): Self = StObject.set(x, "asHeaderSection", js.Any.fromFunction0(value))
    
    inline def setAsHorizontalRule(value: () => HorizontalRule): Self = StObject.set(x, "asHorizontalRule", js.Any.fromFunction0(value))
    
    inline def setAsInlineDrawing(value: () => InlineDrawing): Self = StObject.set(x, "asInlineDrawing", js.Any.fromFunction0(value))
    
    inline def setAsInlineImage(value: () => InlineImage): Self = StObject.set(x, "asInlineImage", js.Any.fromFunction0(value))
    
    inline def setAsListItem(value: () => ListItem): Self = StObject.set(x, "asListItem", js.Any.fromFunction0(value))
    
    inline def setAsPageBreak(value: () => PageBreak): Self = StObject.set(x, "asPageBreak", js.Any.fromFunction0(value))
    
    inline def setAsParagraph(value: () => Paragraph): Self = StObject.set(x, "asParagraph", js.Any.fromFunction0(value))
    
    inline def setAsPerson(value: () => Person): Self = StObject.set(x, "asPerson", js.Any.fromFunction0(value))
    
    inline def setAsRichLink(value: () => RichLink): Self = StObject.set(x, "asRichLink", js.Any.fromFunction0(value))
    
    inline def setAsTable(value: () => Table): Self = StObject.set(x, "asTable", js.Any.fromFunction0(value))
    
    inline def setAsTableCell(value: () => TableCell): Self = StObject.set(x, "asTableCell", js.Any.fromFunction0(value))
    
    inline def setAsTableOfContents(value: () => TableOfContents): Self = StObject.set(x, "asTableOfContents", js.Any.fromFunction0(value))
    
    inline def setAsTableRow(value: () => TableRow): Self = StObject.set(x, "asTableRow", js.Any.fromFunction0(value))
    
    inline def setAsText(value: () => Text): Self = StObject.set(x, "asText", js.Any.fromFunction0(value))
    
    inline def setCopy(value: () => Element): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setGetAttributes(value: () => Any): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
    
    inline def setGetNextSibling(value: () => Element): Self = StObject.set(x, "getNextSibling", js.Any.fromFunction0(value))
    
    inline def setGetParent(value: () => ContainerElement): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    inline def setGetPreviousSibling(value: () => Element): Self = StObject.set(x, "getPreviousSibling", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => ElementType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIsAtDocumentEnd(value: () => Boolean): Self = StObject.set(x, "isAtDocumentEnd", js.Any.fromFunction0(value))
    
    inline def setMerge(value: () => Element): Self = StObject.set(x, "merge", js.Any.fromFunction0(value))
    
    inline def setRemoveFromParent(value: () => Element): Self = StObject.set(x, "removeFromParent", js.Any.fromFunction0(value))
    
    inline def setSetAttributes(value: Any => Element): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1(value))
  }
}
