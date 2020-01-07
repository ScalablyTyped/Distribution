package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement describes content within a Paragraph.
  */
@js.native
trait Schema$ParagraphElement extends js.Object {
  /**
    * An auto text paragraph element.
    */
  var autoText: js.UndefOr[Schema$AutoText] = js.native
  /**
    * A column break paragraph element.
    */
  var columnBreak: js.UndefOr[Schema$ColumnBreak] = js.native
  /**
    * The zero-base end index of this paragraph element, exclusive, in UTF-16
    * code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * An equation paragraph element.
    */
  var equation: js.UndefOr[Schema$Equation] = js.native
  /**
    * A footnote reference paragraph element.
    */
  var footnoteReference: js.UndefOr[Schema$FootnoteReference] = js.native
  /**
    * A horizontal rule paragraph element.
    */
  var horizontalRule: js.UndefOr[Schema$HorizontalRule] = js.native
  /**
    * An inline object paragraph element.
    */
  var inlineObjectElement: js.UndefOr[Schema$InlineObjectElement] = js.native
  /**
    * A page break paragraph element.
    */
  var pageBreak: js.UndefOr[Schema$PageBreak] = js.native
  /**
    * The zero-based start index of this paragraph element, in UTF-16 code
    * units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * A text run paragraph element.
    */
  var textRun: js.UndefOr[Schema$TextRun] = js.native
}

object Schema$ParagraphElement {
  @scala.inline
  def apply(
    autoText: Schema$AutoText = null,
    columnBreak: Schema$ColumnBreak = null,
    endIndex: Int | Double = null,
    equation: Schema$Equation = null,
    footnoteReference: Schema$FootnoteReference = null,
    horizontalRule: Schema$HorizontalRule = null,
    inlineObjectElement: Schema$InlineObjectElement = null,
    pageBreak: Schema$PageBreak = null,
    startIndex: Int | Double = null,
    textRun: Schema$TextRun = null
  ): Schema$ParagraphElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (columnBreak != null) __obj.updateDynamic("columnBreak")(columnBreak.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (equation != null) __obj.updateDynamic("equation")(equation.asInstanceOf[js.Any])
    if (footnoteReference != null) __obj.updateDynamic("footnoteReference")(footnoteReference.asInstanceOf[js.Any])
    if (horizontalRule != null) __obj.updateDynamic("horizontalRule")(horizontalRule.asInstanceOf[js.Any])
    if (inlineObjectElement != null) __obj.updateDynamic("inlineObjectElement")(inlineObjectElement.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParagraphElement]
  }
}

