package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.undefined
  var columnBreak: js.UndefOr[ColumnBreak] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var equation: js.UndefOr[Equation] = js.undefined
  var footnoteReference: js.UndefOr[FootnoteReference] = js.undefined
  var horizontalRule: js.UndefOr[HorizontalRule] = js.undefined
  var inlineObjectElement: js.UndefOr[InlineObjectElement] = js.undefined
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var textRun: js.UndefOr[TextRun] = js.undefined
}

object ParagraphElement {
  @scala.inline
  def apply(
    autoText: AutoText = null,
    columnBreak: ColumnBreak = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    equation: Equation = null,
    footnoteReference: FootnoteReference = null,
    horizontalRule: HorizontalRule = null,
    inlineObjectElement: InlineObjectElement = null,
    pageBreak: PageBreak = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    textRun: TextRun = null
  ): ParagraphElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (columnBreak != null) __obj.updateDynamic("columnBreak")(columnBreak.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (equation != null) __obj.updateDynamic("equation")(equation.asInstanceOf[js.Any])
    if (footnoteReference != null) __obj.updateDynamic("footnoteReference")(footnoteReference.asInstanceOf[js.Any])
    if (horizontalRule != null) __obj.updateDynamic("horizontalRule")(horizontalRule.asInstanceOf[js.Any])
    if (inlineObjectElement != null) __obj.updateDynamic("inlineObjectElement")(inlineObjectElement.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphElement]
  }
}

