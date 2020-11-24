package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait Element extends js.Object {
  
  def asBody(): Body = js.native
  
  def asEquation(): Equation = js.native
  
  def asEquationFunction(): EquationFunction = js.native
  
  def asEquationFunctionArgumentSeparator(): EquationFunctionArgumentSeparator = js.native
  
  def asEquationSymbol(): EquationSymbol = js.native
  
  def asFooterSection(): FooterSection = js.native
  
  def asFootnote(): Footnote = js.native
  
  def asFootnoteSection(): FootnoteSection = js.native
  
  def asHeaderSection(): HeaderSection = js.native
  
  def asHorizontalRule(): HorizontalRule = js.native
  
  def asInlineDrawing(): InlineDrawing = js.native
  
  def asInlineImage(): InlineImage = js.native
  
  def asListItem(): ListItem = js.native
  
  def asPageBreak(): PageBreak = js.native
  
  def asParagraph(): Paragraph = js.native
  
  def asTable(): Table = js.native
  
  def asTableCell(): TableCell = js.native
  
  def asTableOfContents(): TableOfContents = js.native
  
  def asTableRow(): TableRow = js.native
  
  def asText(): Text = js.native
  
  def copy(): Element = js.native
  
  def getAttributes(): js.Any = js.native
  
  def getNextSibling(): Element = js.native
  
  def getParent(): ContainerElement = js.native
  
  def getPreviousSibling(): Element = js.native
  
  def getType(): ElementType = js.native
  
  def isAtDocumentEnd(): Boolean = js.native
  
  def merge(): Element = js.native
  
  def removeFromParent(): Element = js.native
  
  def setAttributes(attributes: js.Any): Element = js.native
}
object Element {
  
  @scala.inline
  def apply(
    asBody: () => Body,
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
    asTable: () => Table,
    asTableCell: () => TableCell,
    asTableOfContents: () => TableOfContents,
    asTableRow: () => TableRow,
    asText: () => Text,
    copy: () => Element,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => Element,
    removeFromParent: () => Element,
    setAttributes: js.Any => Element
  ): Element = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setAsBody(value: () => Body): Self = this.set("asBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsEquation(value: () => Equation): Self = this.set("asEquation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsEquationFunction(value: () => EquationFunction): Self = this.set("asEquationFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsEquationFunctionArgumentSeparator(value: () => EquationFunctionArgumentSeparator): Self = this.set("asEquationFunctionArgumentSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsEquationSymbol(value: () => EquationSymbol): Self = this.set("asEquationSymbol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsFooterSection(value: () => FooterSection): Self = this.set("asFooterSection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsFootnote(value: () => Footnote): Self = this.set("asFootnote", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsFootnoteSection(value: () => FootnoteSection): Self = this.set("asFootnoteSection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsHeaderSection(value: () => HeaderSection): Self = this.set("asHeaderSection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsHorizontalRule(value: () => HorizontalRule): Self = this.set("asHorizontalRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsInlineDrawing(value: () => InlineDrawing): Self = this.set("asInlineDrawing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsInlineImage(value: () => InlineImage): Self = this.set("asInlineImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsListItem(value: () => ListItem): Self = this.set("asListItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsPageBreak(value: () => PageBreak): Self = this.set("asPageBreak", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsParagraph(value: () => Paragraph): Self = this.set("asParagraph", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTable(value: () => Table): Self = this.set("asTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTableCell(value: () => TableCell): Self = this.set("asTableCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTableOfContents(value: () => TableOfContents): Self = this.set("asTableOfContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTableRow(value: () => TableRow): Self = this.set("asTableRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsText(value: () => Text): Self = this.set("asText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => Element): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttributes(value: () => js.Any): Self = this.set("getAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNextSibling(value: () => Element): Self = this.set("getNextSibling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => ContainerElement): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousSibling(value: () => Element): Self = this.set("getPreviousSibling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ElementType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAtDocumentEnd(value: () => Boolean): Self = this.set("isAtDocumentEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMerge(value: () => Element): Self = this.set("merge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveFromParent(value: () => Element): Self = this.set("removeFromParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAttributes(value: js.Any => Element): Self = this.set("setAttributes", js.Any.fromFunction1(value))
  }
}
