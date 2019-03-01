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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBody")(asBody)
    __obj.updateDynamic("asEquation")(asEquation)
    __obj.updateDynamic("asEquationFunction")(asEquationFunction)
    __obj.updateDynamic("asEquationFunctionArgumentSeparator")(asEquationFunctionArgumentSeparator)
    __obj.updateDynamic("asEquationSymbol")(asEquationSymbol)
    __obj.updateDynamic("asFooterSection")(asFooterSection)
    __obj.updateDynamic("asFootnote")(asFootnote)
    __obj.updateDynamic("asFootnoteSection")(asFootnoteSection)
    __obj.updateDynamic("asHeaderSection")(asHeaderSection)
    __obj.updateDynamic("asHorizontalRule")(asHorizontalRule)
    __obj.updateDynamic("asInlineDrawing")(asInlineDrawing)
    __obj.updateDynamic("asInlineImage")(asInlineImage)
    __obj.updateDynamic("asListItem")(asListItem)
    __obj.updateDynamic("asPageBreak")(asPageBreak)
    __obj.updateDynamic("asParagraph")(asParagraph)
    __obj.updateDynamic("asTable")(asTable)
    __obj.updateDynamic("asTableCell")(asTableCell)
    __obj.updateDynamic("asTableOfContents")(asTableOfContents)
    __obj.updateDynamic("asTableRow")(asTableRow)
    __obj.updateDynamic("asText")(asText)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getNextSibling")(getNextSibling)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isAtDocumentEnd")(isAtDocumentEnd)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("removeFromParent")(removeFromParent)
    __obj.updateDynamic("setAttributes")(setAttributes)
    __obj.asInstanceOf[Element]
  }
}

