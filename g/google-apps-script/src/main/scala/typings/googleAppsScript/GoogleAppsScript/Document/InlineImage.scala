package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing an embedded image. An InlineImage can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineImage cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
@js.native
trait InlineImage extends Element {
  def getAltDescription(): String = js.native
  def getAltTitle(): String = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getHeight(): Integer = js.native
  def getLinkUrl(): String = js.native
  def getWidth(): Integer = js.native
  def setAltDescription(description: String): InlineImage = js.native
  def setAltTitle(title: String): InlineImage = js.native
  def setHeight(height: Integer): InlineImage = js.native
  def setLinkUrl(url: String): InlineImage = js.native
  def setWidth(width: Integer): InlineImage = js.native
}

object InlineImage {
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
    getAltDescription: () => String,
    getAltTitle: () => String,
    getAs: String => Blob,
    getAttributes: () => js.Any,
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
    setAttributes: js.Any => Element,
    setHeight: Integer => InlineImage,
    setLinkUrl: String => InlineImage,
    setWidth: Integer => InlineImage
  ): InlineImage = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAs = js.Any.fromFunction1(getAs), getAttributes = js.Any.fromFunction0(getAttributes), getBlob = js.Any.fromFunction0(getBlob), getHeight = js.Any.fromFunction0(getHeight), getLinkUrl = js.Any.fromFunction0(getLinkUrl), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), getWidth = js.Any.fromFunction0(getWidth), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes), setHeight = js.Any.fromFunction1(setHeight), setLinkUrl = js.Any.fromFunction1(setLinkUrl), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[InlineImage]
  }
  @scala.inline
  implicit class InlineImageOps[Self <: InlineImage] (val x: Self) extends AnyVal {
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
    def setGetAltDescription(value: () => String): Self = this.set("getAltDescription", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAltTitle(value: () => String): Self = this.set("getAltTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAs(value: String => Blob): Self = this.set("getAs", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBlob(value: () => Blob): Self = this.set("getBlob", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeight(value: () => Integer): Self = this.set("getHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLinkUrl(value: () => String): Self = this.set("getLinkUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWidth(value: () => Integer): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAltDescription(value: String => InlineImage): Self = this.set("setAltDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAltTitle(value: String => InlineImage): Self = this.set("setAltTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeight(value: Integer => InlineImage): Self = this.set("setHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLinkUrl(value: String => InlineImage): Self = this.set("setLinkUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWidth(value: Integer => InlineImage): Self = this.set("setWidth", js.Any.fromFunction1(value))
  }
  
}

