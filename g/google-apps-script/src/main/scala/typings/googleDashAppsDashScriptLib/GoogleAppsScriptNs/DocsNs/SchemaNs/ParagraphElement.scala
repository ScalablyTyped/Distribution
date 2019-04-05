package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.undefined
  var columnBreak: js.UndefOr[ColumnBreak] = js.undefined
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  var equation: js.UndefOr[Equation] = js.undefined
  var footnoteReference: js.UndefOr[FootnoteReference] = js.undefined
  var horizontalRule: js.UndefOr[HorizontalRule] = js.undefined
  var inlineObjectElement: js.UndefOr[InlineObjectElement] = js.undefined
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var textRun: js.UndefOr[TextRun] = js.undefined
}

object ParagraphElement {
  @scala.inline
  def apply(
    autoText: AutoText = null,
    columnBreak: ColumnBreak = null,
    endIndex: scala.Int | scala.Double = null,
    equation: Equation = null,
    footnoteReference: FootnoteReference = null,
    horizontalRule: HorizontalRule = null,
    inlineObjectElement: InlineObjectElement = null,
    pageBreak: PageBreak = null,
    startIndex: scala.Int | scala.Double = null,
    textRun: TextRun = null
  ): ParagraphElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText)
    if (columnBreak != null) __obj.updateDynamic("columnBreak")(columnBreak)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (equation != null) __obj.updateDynamic("equation")(equation)
    if (footnoteReference != null) __obj.updateDynamic("footnoteReference")(footnoteReference)
    if (horizontalRule != null) __obj.updateDynamic("horizontalRule")(horizontalRule)
    if (inlineObjectElement != null) __obj.updateDynamic("inlineObjectElement")(inlineObjectElement)
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun)
    __obj.asInstanceOf[ParagraphElement]
  }
}

