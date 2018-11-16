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

