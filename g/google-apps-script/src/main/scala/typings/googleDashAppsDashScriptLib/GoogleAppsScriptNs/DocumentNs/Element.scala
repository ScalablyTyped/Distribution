package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  def asBody(): Body
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
  def asTable(): Table
  def asTableCell(): TableCell
  def asTableOfContents(): TableOfContents
  def asTableRow(): TableRow
  def asText(): Text
  def copy(): Element
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): Element
  def removeFromParent(): Element
  def setAttributes(attributes: js.Object): Element
}

object Element {
  @scala.inline
  def apply(
    asBody: js.Function0[Body],
    asEquation: js.Function0[Equation],
    asEquationFunction: js.Function0[EquationFunction],
    asEquationFunctionArgumentSeparator: js.Function0[EquationFunctionArgumentSeparator],
    asEquationSymbol: js.Function0[EquationSymbol],
    asFooterSection: js.Function0[FooterSection],
    asFootnote: js.Function0[Footnote],
    asFootnoteSection: js.Function0[FootnoteSection],
    asHeaderSection: js.Function0[HeaderSection],
    asHorizontalRule: js.Function0[HorizontalRule],
    asInlineDrawing: js.Function0[InlineDrawing],
    asInlineImage: js.Function0[InlineImage],
    asListItem: js.Function0[ListItem],
    asPageBreak: js.Function0[PageBreak],
    asParagraph: js.Function0[Paragraph],
    asTable: js.Function0[Table],
    asTableCell: js.Function0[TableCell],
    asTableOfContents: js.Function0[TableOfContents],
    asTableRow: js.Function0[TableRow],
    asText: js.Function0[Text],
    copy: js.Function0[Element],
    getAttributes: js.Function0[js.Object],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    merge: js.Function0[Element],
    removeFromParent: js.Function0[Element],
    setAttributes: js.Function1[js.Object, Element]
  ): Element = {
    val __obj = js.Dynamic.literal(asBody = asBody, asEquation = asEquation, asEquationFunction = asEquationFunction, asEquationFunctionArgumentSeparator = asEquationFunctionArgumentSeparator, asEquationSymbol = asEquationSymbol, asFooterSection = asFooterSection, asFootnote = asFootnote, asFootnoteSection = asFootnoteSection, asHeaderSection = asHeaderSection, asHorizontalRule = asHorizontalRule, asInlineDrawing = asInlineDrawing, asInlineImage = asInlineImage, asListItem = asListItem, asPageBreak = asPageBreak, asParagraph = asParagraph, asTable = asTable, asTableCell = asTableCell, asTableOfContents = asTableOfContents, asTableRow = asTableRow, asText = asText, copy = copy, getAttributes = getAttributes, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, merge = merge, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[Element]
  }
}

